/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJava;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author akshay
 */
public class Rent_Search_Win extends javax.swing.JFrame {

    /**
     * Creates new form Rent_Search_Win
     */
    public Rent_Search_Win() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        FeePaymentPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("FeePaymentPU").createEntityManager();
        rentManagementQuery = java.beans.Beans.isDesignTime() ? null : FeePaymentPUEntityManager.createQuery("SELECT r FROM RentManagement r");
        rentManagementList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : rentManagementQuery.getResultList();
        rentManagementQuery1 = java.beans.Beans.isDesignTime() ? null : FeePaymentPUEntityManager.createQuery("SELECT r FROM RentManagement r");
        rentManagementList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : rentManagementQuery1.getResultList();
        rentManagementQuery2 = java.beans.Beans.isDesignTime() ? null : FeePaymentPUEntityManager.createQuery("SELECT r FROM RentManagement r");
        rentManagementList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : rentManagementQuery2.getResultList();
        rentManagementQuery3 = java.beans.Beans.isDesignTime() ? null : FeePaymentPUEntityManager.createQuery("SELECT r FROM RentManagement r");
        rentManagementList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : rentManagementQuery3.getResultList();
        rentManagementQuery4 = java.beans.Beans.isDesignTime() ? null : FeePaymentPUEntityManager.createQuery("SELECT r FROM RentManagement r");
        rentManagementList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : rentManagementQuery4.getResultList();
        rentManagementQuery5 = java.beans.Beans.isDesignTime() ? null : FeePaymentPUEntityManager.createQuery("SELECT r FROM RentManagement r");
        rentManagementList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : rentManagementQuery5.getResultList();
        rentManagementQuery6 = java.beans.Beans.isDesignTime() ? null : FeePaymentPUEntityManager.createQuery("SELECT r FROM RentManagement r");
        rentManagementList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : rentManagementQuery6.getResultList();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        rentby = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        returned = new javax.swing.JComboBox();
        renttodate = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(255, 153, 153));
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RENT");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SEARCH WINDOW");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Type");

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        table1.setColumnSelectionAllowed(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, rentManagementList6, table1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${type}"));
        columnBinding.setColumnName("Type");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rentText}"));
        columnBinding.setColumnName("Rent Text");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rentTo}"));
        columnBinding.setColumnName("Rent To");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rentBy}"));
        columnBinding.setColumnName("Rent By");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rentByAddress}"));
        columnBinding.setColumnName("Rent By Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${chargePerDay}"));
        columnBinding.setColumnName("Charge Per Day");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalCharges}"));
        columnBinding.setColumnName("Total Charges");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${returned}"));
        columnBinding.setColumnName("Returned");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${damageCharges}"));
        columnBinding.setColumnName("Damage Charges");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lateFeeReturn}"));
        columnBinding.setColumnName("Late Fee Return");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tax}"));
        columnBinding.setColumnName("Tax");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);
        table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Rent By");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Returned");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rent To Date");

        returned.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        returned.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes" }));
        returned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnedActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel1.setText("DELETE");
        btnCancel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(renttodate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returned, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rentby, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rentby, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(returned, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(2, 2, 2)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renttodate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        id.setText(" ");
        type.setText(" ");
        rentby.setText(" ");
        returned.setSelectedItem(0);
        renttodate.setText(" ");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         try{
            String usr="sa";
            String password="sasa";
              String url = "jdbc:derby://localhost:1527/FeePayment";
        Connection c = DriverManager.getConnection(url,usr,password);
        String sql = "update RENT_MANAGEMENT set TYPE=?,RENT_BY=?,RETURNED=?,RENT_TO=? where ID=?";
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, type.getText());
        pst.setString(2, rentby.getText());
        String ret;
        ret=returned.getSelectedItem().toString();
        pst.setString(3, ret);
        pst.setString(4, renttodate.getText());
         pst.setString(5, id.getText());
      
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, "updated");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void returnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnedActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dispose();
        Rent_Add_Update rau = new Rent_Add_Update();
        rau.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
         try{
             String user = "sa";
            String password = "sasa";
            String url = "jdbc:derby://localhost:1527/FeePayment";
        Connection c = DriverManager.getConnection(url,user,password);
            
            int row = table1.getSelectedRow();
            String Table_click = (table1.getModel().getValueAt(row, 0).toString());
            String sql = "select * from RENT_MANAGEMENT where ID ='"+ Table_click+"'";
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String val1 = rs.getString("ID");
                id.setText(val1);
                String val2 = rs.getString("TYPE");
                type.setText(val2);
                 String val4 = rs.getString("RENT_BY");
                rentby.setText(val4);
                String val5 = rs.getString("RETURNED");
                returned.setSelectedItem(val5);
                String val6 = rs.getString("RENT_TO");
                renttodate.setText(val6);
            
            }
    }                                   
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
    }//GEN-LAST:event_table1MouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
       int a = JOptionPane.showConfirmDialog((Component)null,"Do you want delete ?","DELETE",JOptionPane.YES_NO_OPTION);
        if (a == 0) {
//            int r = table1.getSelectedRow();
//            String cell = table1.getModel().getValueAt(r, 0).toString();
            try{
                  String user = "sa";
            String password = "sasa";
            String url = "jdbc:derby://localhost:1527/FeePayment";
            Connection c = DriverManager.getConnection(url, user, password);
                String q = "DELETE from RENT_MANAGEMENT where ID = ?";
                PreparedStatement pst = c.prepareStatement(q);
                pst.setString(1, id.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "deleted successfully");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
          if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            try{
             String user = "sa";
            String password = "sasa";
            String url = "jdbc:derby://localhost:1527/FeePayment";
                String sql = "select * from RENT_MANAGEMENT where ID=?";
            Connection c = DriverManager.getConnection(url,user,password);
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, id.getText());
        ResultSet rs = pst.executeQuery();
        table1.setModel(DbUtils.resultSetToTableModel(rs));   
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }                                  
    }//GEN-LAST:event_idKeyPressed

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
            java.util.logging.Logger.getLogger(Rent_Search_Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rent_Search_Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rent_Search_Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rent_Search_Win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rent_Search_Win().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager FeePaymentPUEntityManager;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField id;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.util.List<CoreJava.RentManagement> rentManagementList;
    private java.util.List<CoreJava.RentManagement> rentManagementList1;
    private java.util.List<CoreJava.RentManagement> rentManagementList2;
    private java.util.List<CoreJava.RentManagement> rentManagementList3;
    private java.util.List<CoreJava.RentManagement> rentManagementList4;
    private java.util.List<CoreJava.RentManagement> rentManagementList5;
    private java.util.List<CoreJava.RentManagement> rentManagementList6;
    private javax.persistence.Query rentManagementQuery;
    private javax.persistence.Query rentManagementQuery1;
    private javax.persistence.Query rentManagementQuery2;
    private javax.persistence.Query rentManagementQuery3;
    private javax.persistence.Query rentManagementQuery4;
    private javax.persistence.Query rentManagementQuery5;
    private javax.persistence.Query rentManagementQuery6;
    private javax.swing.JTextField rentby;
    private javax.swing.JTextField renttodate;
    private javax.swing.JComboBox returned;
    private javax.swing.JTable table1;
    private javax.swing.JTextField type;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
