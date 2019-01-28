/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GUI;

import ec.edu.espe.utils.FileManager;
import ec.edu.espe.model.BarberShop;
import ec.edu.espe.model.Employee;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Miquely Calvopiña
 */
public class FrmFindEmployee extends javax.swing.JFrame {

    private char validate;
    ArrayList<Employee> employees = new ArrayList<>();
    File file = new File("Empleados.csv");
    
    /**
     * Creates new form FindEmployee
     */
    public FrmFindEmployee() throws IOException {
        
        FileManager filem = new FileManager();
        initComponents();
        employees = FileManager.readEmployee("Empleados.csv");
        
        showEmployeesFile(employees);
        this.setLocationRelativeTo(null);
    }
        
    public boolean validateEmptyIncome(String CI,String FullName,String Age,String PhoneNumber,String salary,String Address){
        boolean validate=false;
        if("".equals(CI)) validate = true;
        if("".equals(FullName)) validate = true;
        if("".equals(Age)) validate = true;
        if("".equals(salary)) validate = true;
        if("".equals(PhoneNumber)) validate = true;
        if("".equals(Address)) validate = true;
        
        return  validate;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        lblTittle = new javax.swing.JLabel();
        lblsubtitle = new javax.swing.JLabel();
        txtIc = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInfo = new javax.swing.JTextArea();
        btnRemove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTittle.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblTittle.setForeground(new java.awt.Color(255, 153, 0));
        lblTittle.setText("B�squeda de un empleado");
        getContentPane().add(lblTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        lblsubtitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsubtitle.setForeground(new java.awt.Color(255, 153, 0));
        lblsubtitle.setText("C�dula de Identidad:");
        getContentPane().add(lblsubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtIc.setBackground(new java.awt.Color(51, 51, 51));
        txtIc.setForeground(new java.awt.Color(255, 255, 255));
        txtIc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIcActionPerformed(evt);
            }
        });
        txtIc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIcKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIcKeyTyped(evt);
            }
        });
        getContentPane().add(txtIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 220, -1));

        btnsearch.setBackground(new java.awt.Color(51, 51, 51));
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Consultar");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        txaInfo.setBackground(new java.awt.Color(51, 51, 51));
        txaInfo.setColumns(20);
        txaInfo.setForeground(new java.awt.Color(204, 204, 204));
        txaInfo.setRows(5);
        jScrollPane1.setViewportView(txaInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 130, 280, 120));

        btnRemove.setBackground(new java.awt.Color(51, 51, 51));
        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Eliminar");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        tblEmployees.setBackground(new java.awt.Color(51, 51, 51));
        tblEmployees.setForeground(new java.awt.Color(255, 255, 255));
        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblEmployees);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 670, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/BarberShop/GUI/components/BarberShopWallpaperLoging_1.jpg"))); // NOI18N
        jLabel1.setText("Salir");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIcActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try{
            int i;
            file = new File("Empleados.csv");
            FileManager.readEmployee("Empleados.csv");
            i = numberOfElementsInArray(file, employees, txtIc.getText());
            if( i != -1 ){
                
                txaInfo.setText("Cédula de Identidad: "+employees.get(i).getIdentifyCardNumber()+"\n"+
                                "Nombre Completo: "+employees.get(i).getFullName()+"\n"+
                                "Edad: "+String.valueOf(employees.get(i).getAge())+"\n"+
                                "Salario: "+String.valueOf(employees.get(i).getSalary())+"\n"+
                                "Número de Celular: "+employees.get(i).getPhoneNumber()+"\n"+
                                "Dirección:"+employees.get(i).getAddress());
                employees.clear();
            }else{
                JOptionPane.showMessageDialog(null, "Lo sentimos. El empleado no se encuentra registrado","Empleado no registrado",JOptionPane.WARNING_MESSAGE);        
                employees.clear();
            }   
        
        }catch(Exception e){
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        BarberShop employee = new BarberShop();
        try {
            if(EmployeeDelete(employees, file, txtIc.getText())){
                employee.deleteEmployee("Empleados.csv", employees, txtIc.getText());   
                JOptionPane.showMessageDialog(null, "empleado eliminado del registro","Cliente Eliminado",JOptionPane.WARNING_MESSAGE);
                showEmployeesFile(employees);
            }
            else{
                JOptionPane.showMessageDialog(null, "empleado no registrado","Atención",JOptionPane.WARNING_MESSAGE);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(FrmFindEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtIcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIcKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIcKeyPressed

    private void txtIcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIcKeyTyped
        if(txtIc.getText().length()>9){
            evt.consume();
        }
    }//GEN-LAST:event_txtIcKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmFindEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFindEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFindEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFindEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmFindEmployee().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FrmFindEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void showEmployeesFile(ArrayList<Employee>employees){
       String matriz[][] = new String[employees.size()][10];
            for (int i = 0; i < employees.size(); i++) {

                matriz[i][0] = employees.get(i).getIdentifyCardNumber();
                matriz[i][1] = employees.get(i).getId();
                matriz[i][2] = employees.get(i).getFullName();
                matriz[i][3] = String.valueOf(employees.get(i).getAge());
                matriz[i][4] = employees.get(i).getPhoneNumber();
                matriz[i][5] = String.valueOf(employees.get(i).getSalary());
                matriz[i][6] = employees.get(i).getAddress();
                    
            }
     tblEmployees.setModel(new javax.swing.table.DefaultTableModel( matriz,new String []{"Cédula","ID","Nombre","Edad","Teléfono","Sueldo","Dirección"}));               
    }
    public static int numberOfElementsInArray(File file,ArrayList<Employee>employees,String txtCI){
        int j = -1;
        System.out.println(employees.get(0).getIdentifyCardNumber());
        for(int i=0;i < employees.size();i++){
            System.out.println(i);
            if(employees.get(i).getIdentifyCardNumber().equals(txtCI)){
                j = i;
                System.out.println("Empleado encontrado");
                return j;
            }
        }
        return j;
    }
    public static boolean EmployeeDelete(ArrayList<Employee>employees, File file, String ci) throws IOException {
        boolean validateCode = false;
	FileManager.readEmployee("Empleados.csv");
	for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getIdentifyCardNumber().equals(ci)) {
		validateCode = true;
            }
	}
	employees.clear();
	return validateCode;
    }
    public void validationOfNumbers(JTextField nameOfTheTextField)
    {
        String auxStringInput = nameOfTheTextField.getText();
        try
        {
            double auxForVerification = Double.parseDouble(auxStringInput);
            nameOfTheTextField.setBackground(Color.WHITE);
        }
        catch (NumberFormatException exc)
        {
            nameOfTheTextField.setBackground(Color.red);
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lblsubtitle;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextArea txaInfo;
    private javax.swing.JTextField txtIc;
    // End of variables declaration//GEN-END:variables
}