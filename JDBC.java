package Student_Databsse_Mnagement_System;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class JDBC extends javax.swing.JFrame {

    Connection datacon;
    PreparedStatement prestm;
    ResultSet result;

    public JDBC() {
        initComponents();
        insert_into_Jtable();

    }

    public void insert_into_Jtable() {
        int J_table;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            datacon = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");

            prestm = datacon.prepareStatement("select * from student");
            result = prestm.executeQuery();

            ResultSetMetaData rsmd = result.getMetaData();
            J_table = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);

            while (result.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= J_table; i++) {

                    v.add(result.getString("id"));
                    v.add(result.getString("name"));
                    v.add(result.getString("roll"));
                    v.add(result.getString("batch"));
                    v.add(result.getString("department"));
                    v.add(result.getString("university"));
                    v.add(result.getString("phone"));
                }
                dtm.addRow(v);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        stbatch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stname = new javax.swing.JTextField();
        stroll = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnreset1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stuni = new javax.swing.JTextField();
        stdep = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stphone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Database");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 255));
        jDesktopPane1.setForeground(new java.awt.Color(102, 102, 102));

        stbatch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDesktopPane1.add(stbatch);
        stbatch.setBounds(190, 290, 200, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(100, 170, 120, 35);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Roll");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(100, 230, 120, 35);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Batch");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(100, 290, 120, 35);

        stname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDesktopPane1.add(stname);
        stname.setBounds(190, 170, 200, 35);

        stroll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDesktopPane1.add(stroll);
        stroll.setBounds(190, 230, 200, 35);

        btninsert.setBackground(new java.awt.Color(204, 204, 204));
        btninsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btninsert.setForeground(new java.awt.Color(44, 62, 80));
        btninsert.setText("Add");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btninsert);
        btninsert.setBounds(190, 390, 100, 35);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student Information");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(330, 60, 380, 44);

        btnupdate.setBackground(new java.awt.Color(204, 204, 204));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(44, 62, 80));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnupdate);
        btnupdate.setBounds(360, 390, 100, 35);

        btndelete.setBackground(new java.awt.Color(204, 204, 204));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(44, 62, 80));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btndelete);
        btndelete.setBounds(550, 390, 100, 35);

        btnreset1.setBackground(new java.awt.Color(204, 204, 204));
        btnreset1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreset1.setForeground(new java.awt.Color(44, 62, 80));
        btnreset1.setText("Clear");
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnreset1);
        btnreset1.setBounds(740, 390, 100, 35);

        table.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Roll", "Batch", "Department", "University", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(10);
            table.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jDesktopPane1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 470, 1000, 190);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("University");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(550, 230, 120, 35);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact ");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(550, 290, 120, 35);

        stuni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDesktopPane1.add(stuni);
        stuni.setBounds(700, 230, 200, 35);

        stdep.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDesktopPane1.add(stdep);
        stdep.setBounds(700, 170, 200, 35);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(550, 170, 120, 35);

        stphone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDesktopPane1.add(stphone);
        stphone.setBounds(700, 290, 200, 35);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        try {
            DefaultTableModel update = (DefaultTableModel) table.getModel();

            int selectedindex = table.getSelectedRow();

            stname.setText(update.getValueAt(selectedindex, 1).toString());
            stroll.setText(update.getValueAt(selectedindex, 2).toString());
            stbatch.setText(update.getValueAt(selectedindex, 3).toString());
            stdep.setText(update.getValueAt(selectedindex, 4).toString());
            stuni.setText(update.getValueAt(selectedindex, 5).toString());
            stphone.setText(update.getValueAt(selectedindex, 6).toString());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed

        stname.setText(null);
        stroll.setText(null);
        stbatch.setText(null);
        stdep.setText(null);
        stuni.setText(null);
        stphone.setText(null);

    }//GEN-LAST:event_btnreset1ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

        DefaultTableModel update = (DefaultTableModel) table.getModel();
        int selectedindex = table.getSelectedRow();

        int id = Integer.parseInt(update.getValueAt(selectedindex, 0).toString());

        int showresult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the record ? ", "Warring", JOptionPane.YES_NO_OPTION);

        if (showresult == JOptionPane.YES_NO_OPTION) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                datacon = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
                prestm = datacon.prepareStatement("delete from student where ID =? ");

                prestm.setInt(1, id);
                prestm.executeUpdate();

                JOptionPane.showMessageDialog(this, "Data has been Deleted");
                insert_into_Jtable();

                stname.setText("");
                stroll.setText("");
                stbatch.setText("");
                stdep.setText("");
                stuni.setText("");
                stphone.setText("");
                stname.requestFocus();

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        DefaultTableModel update = (DefaultTableModel) table.getModel();
        int selectedindex = table.getSelectedRow();

        int id = Integer.parseInt(update.getValueAt(selectedindex, 0).toString());

        String name, roll, batch, department, university, phone;

        name = stname.getText();
        roll = stroll.getText();
        batch = stbatch.getText();
        department = stdep.getText();
        university = stuni.getText();
        phone = stphone.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            datacon = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");

            prestm = datacon.prepareStatement("update student set Name=?,Roll=?,Batch=?,Department=?,University=?,Phone=? where id =? ");
            prestm.setString(1, name);
            prestm.setString(2, roll);
            prestm.setString(3, batch);
            prestm.setString(4, department);
            prestm.setString(5, university);
            prestm.setString(6, phone);
            prestm.setInt(7, id);
            prestm.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data has been Updated");

            stname.setText("");
            stroll.setText("");
            stbatch.setText("");
            stdep.setText("");
            stuni.setText("");
            stphone.setText("");
            stname.requestFocus();

            insert_into_Jtable();

        } catch (ClassNotFoundException | SQLException ex) {

            JOptionPane.showMessageDialog(this, ex);

        }


    }//GEN-LAST:event_btnupdateActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed

        String id, name, roll, batch, department, university, phone;

        name = stname.getText();
        roll = stroll.getText();
        batch = stbatch.getText();
        department = stdep.getText();
        university = stuni.getText();
        phone = stphone.getText();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            datacon = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");

            prestm = datacon.prepareStatement("Insert into student(Name,Roll,Batch,Department,University,Phone)values(?,?,?,?,?,?) ");

            prestm.setString(1, name);
            prestm.setString(2, roll);
            prestm.setString(3, batch);
            prestm.setString(4, department);
            prestm.setString(5, university);
            prestm.setString(6, phone);
            prestm.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data has been Inserted");

            stname.setText("");
            stroll.setText("");
            stbatch.setText("");
            stdep.setText("");
            stuni.setText("");
            stphone.setText("");
            stname.requestFocus();

            insert_into_Jtable();

        } catch (ClassNotFoundException | SQLException ex) {

            JOptionPane.showMessageDialog(this, ex);

        }

    }//GEN-LAST:event_btninsertActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new JDBC().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnreset1;
    private javax.swing.JButton btnupdate;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField stbatch;
    private javax.swing.JTextField stdep;
    private javax.swing.JTextField stname;
    private javax.swing.JTextField stphone;
    private javax.swing.JTextField stroll;
    private javax.swing.JTextField stuni;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
