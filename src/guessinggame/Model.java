/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import java.util.Random;
/**
 *
 * @author lorenzobengzon
 */
public class Model {
    //this is the area where i declar my global vriables
    // i guess ill definitley need one for the nu,ner im thinkging off..
   private int theNumber;
    //this will be my status message..
   private String status;
    //what do i want my modelto be able to do?
    void newGame(){
        //where i will think up random sshit
        Random r = new Random();
        theNumber = r.nextInt(100) + 1;
        //Now i guess ill set my status message so that the GUI can
        //display it. first I need to declare a global stuats variable
        //oof the type string...
        status = "Welcome! enter your guess";
        
    }
    void processUserGuesss(int guess){
        //where i will see what hte users guess is
        //and decide on what message to give them
        //notice that this method caccepts an int
        status = "you guessed" + guess;
        if (guess > theNumber){
            status = "your guess is too high";
        }
        else if (guess<theNumber){
            status = "your guess is too low";
        }
        else{
            status = "you got it";

        }
    }
    String getStatus(){
        // this metho will be called by the view controller
        // it will return a string with a current status
        // message in it, like "thats guess is too high"
        //or some shit like that
        return status;
    }
}
    
  

