/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author lorenzobengzon
 */
public class ViewController extends javax.swing.JFrame {
    Model model;
    

    /**
     * Creates new form ViewController
     */
    public ViewController(Model model) {
        initComponents();
        //keep a global model that was passed in.
        this.model = model;
        //this is where i will call the models newGame() method.
        model.newGame();
        //set the intial status message..
        lblStatus.setText(model.getStatus());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtGuess = new javax.swing.JTextField();
        btnGuess = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("Guess!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Guess a number:");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setText("Guess a number from 1 - 100:");

        txtGuess.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        txtGuess.setText("**input**");
        txtGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuessActionPerformed(evt);
            }
        });

        btnGuess.setBackground(new java.awt.Color(0, 0, 0));
        btnGuess.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        btnGuess.setForeground(new java.awt.Color(255, 255, 255));
        btnGuess.setText("Guess");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        lblStatus.setText("**This Label will be used to send messages to the user**");

        btnNewGame.setBackground(new java.awt.Color(255, 255, 255));
        btnNewGame.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        btnNewGame.setText("New game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Quit");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGuess)
                            .addComponent(btnGuess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNewGame)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewGame)
                    .addComponent(jButton4))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void txtGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuessActionPerformed

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        // TODO add your handling code here:
        try {
        int guess = Integer.parseInt(txtGuess.getText());
        //give the guess to  the model..
        model.processUserGuesss(guess);
        lblStatus.setText(model.getStatus());
        //update stauts
        } catch (NumberFormatException e){
            lblStatus.setText("Please enter a number");
        } finally {
        txtGuess.setText("");
    }//GEN-LAST:event_btnGuessActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuess;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtGuess;
    // End of variables declaration//GEN-END:variables
}
