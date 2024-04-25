/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ood.finalproject.daycare.userinterface;

import javax.swing.JPanel;
import javax.swing.JTextField;

import ood.finalproject.daycare.model.Teacher;

/**
 *
 * @author karthik
 */
public class TeacherProfileJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Teacher teacher;

    /**
     * Creates new form TeacherProfileJPanel
     */


    public TeacherProfileJPanel(JPanel userProcessContainer, Teacher teacher) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
         this.teacher = teacher;
         setFields(teacher);
         
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldTeacherID = new javax.swing.JTextField();
        jTextFieldCredit = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldClassAssigned = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Last Name :");
        add(jLabel1);
        jLabel1.setBounds(440, 190, 104, 17);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("First Name : ");
        add(jLabel2);
        jLabel2.setBounds(440, 150, 100, 17);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Teacher ID :  ");
        add(jLabel3);
        jLabel3.setBounds(440, 230, 100, 17);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Credit : ");
        add(jLabel4);
        jLabel4.setBounds(470, 260, 60, 17);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Email : ");
        add(jLabel5);
        jLabel5.setBounds(470, 290, 60, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pro.jpeg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(110, 120, 260, 380);

        jTextFieldFirstName.setEditable(false);
        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });
        add(jTextFieldFirstName);
        jTextFieldFirstName.setBounds(550, 150, 130, 26);

        jTextFieldLastName.setEditable(false);
        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });
        add(jTextFieldLastName);
        jTextFieldLastName.setBounds(550, 190, 130, 26);

        jTextFieldTeacherID.setEditable(false);
        jTextFieldTeacherID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeacherIDActionPerformed(evt);
            }
        });
        add(jTextFieldTeacherID);
        jTextFieldTeacherID.setBounds(550, 230, 130, 26);

        jTextFieldCredit.setEditable(false);
        jTextFieldCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreditActionPerformed(evt);
            }
        });
        add(jTextFieldCredit);
        jTextFieldCredit.setBounds(550, 260, 130, 26);

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        add(jTextFieldEmail);
        jTextFieldEmail.setBounds(550, 290, 130, 26);

        jTextFieldClassAssigned.setEditable(false);
        jTextFieldClassAssigned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassAssignedActionPerformed(evt);
            }
        });
        add(jTextFieldClassAssigned);
        jTextFieldClassAssigned.setBounds(550, 330, 130, 26);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setText("Class Assigned :");
        add(jLabel8);
        jLabel8.setBounds(400, 330, 118, 17);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel9.setText("Teacher Profile");
        add(jLabel9);
        jLabel9.setBounds(200, 20, 420, 58);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tea.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, 0, 790, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jTextFieldTeacherIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeacherIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeacherIDActionPerformed

    private void jTextFieldCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreditActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldClassAssignedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassAssignedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassAssignedActionPerformed

    public JTextField getjTextFieldTeacherID() {
        return jTextFieldTeacherID;
    }

    public void setjTextFieldTeacherID(JTextField jTextFieldTeacherID) {
        this.jTextFieldTeacherID = jTextFieldTeacherID;
    }



    public JTextField getjTextFieldClassAssigned() {
        return jTextFieldClassAssigned;
    }

    public void setjTextFieldClassAssigned(JTextField jTextFieldClassAssigned) {
        this.jTextFieldClassAssigned = jTextFieldClassAssigned;
    }

    public JTextField getjTextFieldCredit() {
        return jTextFieldCredit;
    }

    public void setjTextFieldCredit(JTextField jTextFieldCredit) {
        this.jTextFieldCredit = jTextFieldCredit;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldFirstName() {
        return jTextFieldFirstName;
    }

    public void setjTextFieldFirstName(JTextField jTextFieldFirstName) {
        this.jTextFieldFirstName = jTextFieldFirstName;
    }

    public JTextField getjTextFieldLastName() {
        return jTextFieldLastName;
    }

    public void setjTextFieldLastName(JTextField jTextFieldLastName) {
        this.jTextFieldLastName = jTextFieldLastName;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldClassAssigned;
    private javax.swing.JTextField jTextFieldCredit;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldTeacherID;
    // End of variables declaration//GEN-END:variables

    private void setFields(Teacher teacher) {
        getjTextFieldFirstName().setText(teacher.getFirstName());
        getjTextFieldLastName().setText(teacher.getLastName());
        getjTextFieldTeacherID().setText(String.valueOf(teacher.getTeachID()));
        getjTextFieldEmail().setText(teacher.getEmailid());
        getjTextFieldCredit().setText(String.valueOf(teacher.getCredits()));
        getjTextFieldClassAssigned().setText(String.valueOf(teacher.getIsAssigned()));
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
