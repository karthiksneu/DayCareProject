/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ood.finalproject.daycare.userinterface;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import ood.finalproject.daycare.model.Student;
import ood.finalproject.daycare.model.Teacher;


/**
 *
 * @author karthik
 */
public class DisplayStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayStudentJPanel
     */

    private JPanel userProcessContainer;
    private Teacher teacher;
    
    
    public DisplayStudentJPanel(JPanel userProcessContainer, Teacher teacher) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.teacher = teacher;
        refreshTable(teacher);
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDisplayStudent = new javax.swing.JTable();
        jButtonUpdateGPA = new javax.swing.JButton();
        jTextFieldUpdateGPA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTableDisplayStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableDisplayStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First name", "Last Name", "Student ID", "GPA"
            }
        ));
        jScrollPane1.setViewportView(jTableDisplayStudent);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 130, 490, 234);

        jButtonUpdateGPA.setText("Update");
        jButtonUpdateGPA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonUpdateGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateGPAActionPerformed(evt);
            }
        });
        add(jButtonUpdateGPA);
        jButtonUpdateGPA.setBounds(290, 450, 250, 30);
        add(jTextFieldUpdateGPA);
        jTextFieldUpdateGPA.setBounds(290, 396, 250, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel3.setText("Update GPA");
        add(jLabel3);
        jLabel3.setBounds(70, 10, 460, 80);
        add(jSeparator1);
        jSeparator1.setBounds(-40, 90, 1050, 20);

        jLabel4.setText("Enter the updated GPA:");
        add(jLabel4);
        jLabel4.setBounds(50, 400, 144, 16);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/studensmall.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(-1480, -110, 2560, 1170);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateGPAActionPerformed
        // TODO add your handling code here:
        
       
        int selectedRowIndex = jTableDisplayStudent.getSelectedRow();
        
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select the record");
            return; 
        }
        
        TeacherController tt = new TeacherController();
        Student ss = (Student) tt.getTeacherStudents(teacher).get(selectedRowIndex);
        
        double GPA = (Double.parseDouble(jTextFieldUpdateGPA.getText()));
        ss.setGPA(GPA);
        
        StudentDataMangementFactory.getFactoryInstance().getObject().updateOneObject(ss);
        JOptionPane.showMessageDialog(null, "Updated Successfully!");
        refreshTable(teacher);
        
        
        
    }//GEN-LAST:event_jButtonUpdateGPAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUpdateGPA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDisplayStudent;
    private javax.swing.JTextField jTextFieldUpdateGPA;
    // End of variables declaration//GEN-END:variables

    
     public void refreshTable(Teacher t){
    int rowCount = jTableDisplayStudent.getRowCount();
         
    DefaultTableModel model = (DefaultTableModel) jTableDisplayStudent.getModel();
    for(int i=rowCount-1;i>=0;i--){
        model.removeRow(i);
    }
        TeacherController teacher = new TeacherController();
        
    for (Student s : teacher.getTeacherStudents(t)) {
        
        System.out.print(s);
        Object row[] = new Object[4];
        row[0] = s.getFirstName();
        row[1] = s.getLastName();
        row[2] = s.getStuId();
        row[3] = s.getGPA();
//        row[4] = s.getPerson().getHouse().getCommunity();
//        row[5] = s.getEncounterHistory().get(s.getEncounterHistory().size()-1).getVitalSigns().isIsNormal()?"Normal":"AbNormal";

       model.addRow(row);
    }
}
}
