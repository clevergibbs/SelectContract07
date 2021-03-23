/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectcontract07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cat Panetta
 */
public class NewContract extends javax.swing.JDialog {

//     * Creates new form newContract
    ArrayList <String> contID = ContractModel.getContractIDList(); 
    
    private final String filename = "C:\\Users\\Cat Panetta\\Documents\\CAMOSUN\\2021\\Software_Engineering\\SelectContract07\\src\\selectcontract07\\contracts.txt";

    public NewContract(JFrame f, boolean modal) {
        super(f, modal);
        initComponents();
        

        this.jTextContractID.setText("");
        this.jComboBoxOriginCity.setSelectedIndex(0); 
        this.jComboBoxDestCity.setSelectedIndex(0); 
        this.jTextOrderItems.setText(""); 
    }

    
    
//    ContractView theView, ContractModel theModel) {
//        this.theView = theView; 
//        this.theModel = theModel; 

    
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelContractID = new javax.swing.JLabel();
        jLabelOriginCity = new javax.swing.JLabel();
        jLabelDestCity = new javax.swing.JLabel();
        jLabelOrderItems = new javax.swing.JLabel();
        jTextContractID = new javax.swing.JTextField();
        jTextOrderItems = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jComboBoxDestCity = new javax.swing.JComboBox<>();
        jComboBoxOriginCity = new javax.swing.JComboBox<>();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JMenuNewContract");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabelContractID.setText("Contract ID");

        jLabelOriginCity.setText("Origin City");

        jLabelDestCity.setText("Destination City");

        jLabelOrderItems.setText("Order Items ");

        jTextContractID.setText("jTextField1");

        jTextOrderItems.setText("jTextField2");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jComboBoxDestCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Victoria", "Vancouver", "Seattle", "Nanaimo", "Price George" }));

        jComboBoxOriginCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Victoria", "Vancouver", "Seattle", "Nanaimo", "Price George" }));
        jComboBoxOriginCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOriginCityActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelOrderItems, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDestCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelOriginCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelContractID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextContractID)
                    .addComponent(jComboBoxDestCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxOriginCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextOrderItems))
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextContractID)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelContractID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOriginCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDestCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDestCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrderItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextOrderItems))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonReset))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        ArrayList <String> allContractID = new ArrayList<String>();
        String contractID = jTextContractID.getText().toUpperCase(); 
        String originCity = (String)jComboBoxOriginCity.getSelectedItem();
        String destCity = (String)jComboBoxDestCity.getSelectedItem();
        String orderItems = jTextOrderItems.getText().toUpperCase(); 
        Pattern contract = Pattern.compile("[0-9][a-zA-Z]{3}"); // testing for valid contract pattern 
        Matcher matchContractID = contract.matcher(contractID); 
        Pattern order = Pattern.compile("(.)*[a-zA-Z]+(.)*");
        Matcher matchOrder = order.matcher(orderItems);
        boolean correct = true; //if everything matches 
        
        
        if (contractID.isEmpty() || originCity.isEmpty() || destCity.isEmpty() || orderItems.isEmpty()){
            JOptionPane.showMessageDialog(null, "There cannot be any empty fields, please fill in everything");
            correct = false; 
        }
        else{ 
            if (!matchContractID.matches()){ // if it doesn't match the pattern 
                JOptionPane.showMessageDialog(null, "ID needs to have one number (1-9) followed by 3 letters");
                correct = false; 
            }
            else if (!matchOrder.matches()){ 
                JOptionPane.showMessageDialog(null, "Order Items cannot be fully numbers, contain a comma, and must be 1 or more letters"); 
                correct = false; 
            }
            else if (originCity.equals(destCity)){
                JOptionPane.showMessageDialog(null, "Origin City cannot match Destination City"); 
                correct = false; 
            }
            else if (contID.contains(contractID)){ 
                JOptionPane.showMessageDialog(null, "The contract id of " + contractID + " is already in use"); 
                correct = false; 
            }
        }
        if (correct){
                try {
                    allContractID.add(contractID); 
                    FileWriter fileWriter = new FileWriter (filename,true);
                    try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                        String newContractInput = contractID + "," + originCity + "," +destCity + "," + orderItems;
                        bufferedWriter.newLine();
                        bufferedWriter.write(newContractInput);
                        jTextContractID.setText("");
                        jComboBoxOriginCity.setSelectedIndex(0);
                        jComboBoxDestCity.setSelectedIndex(0);
                        jTextOrderItems.setText("");
                    }
                }catch (IOException ex) {
                    System.out.println(ex.getMessage()); 
                }
                 
        }
                        





//                    if ((jTextName.getText().equals(""))||(jTextName.getText().equals("null")) || (!jTextName.getText().chars().allMatch(Character::isLetter))) {
//                        String messageFailure = "Please input your name.  No non-alphabetics please"; 
//                        JOptionPane.showMessageDialog(null, messageFailure); 
//                    } else{
//                    String theBid = jTextName.getText() + ", " + jLabelContractID.getText() + ", " + jSpinner1.getValue() +", "
//                            + currentDate; 
//                    pw.println("");
//
//                    pw.append(theBid);
//                    pw.println(""); 
//                    String messageSuccess = "Your name as " + jTextName.getText() + " with bid amount $" + jSpinner1.getValue() + " has been successfully saved."; 
//                    JOptionPane.showMessageDialog(null, messageSuccess);
//            }
        
    }//GEN-LAST:event_jButtonSaveActionPerformed
     
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jComboBoxOriginCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOriginCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOriginCityActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jTextContractID.setText("");
        jComboBoxOriginCity.setSelectedIndex(0);
        jComboBoxDestCity.setSelectedIndex(0);
        jTextOrderItems.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(newContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(newContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(newContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(newContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                NewContract dialog = new newContract(new javax.swingjLabelContractID(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxDestCity;
    private javax.swing.JComboBox<String> jComboBoxOriginCity;
    private javax.swing.JLabel jLabelContractID;
    private javax.swing.JLabel jLabelDestCity;
    private javax.swing.JLabel jLabelOrderItems;
    private javax.swing.JLabel jLabelOriginCity;
    private javax.swing.JTextField jTextContractID;
    private javax.swing.JTextField jTextOrderItems;
    // End of variables declaration//GEN-END:variables
}