/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdmin;

import Business.EcoSystem;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivibhatt
 */
public class ManageRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;

    public ManageRestaurantJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateTable();
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
        tblRestaurantAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhnNum = new javax.swing.JTextField();

        setBackground(new java.awt.Color(182, 216, 242));

        tblRestaurantAdmin.setForeground(new java.awt.Color(87, 132, 186));
        tblRestaurantAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant name", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantAdmin);

        jLabel1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create/Update Restaurant Partner Profiles");

        jLabel2.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Username                             :");

        jLabel3.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Password                              :");

        jLabel5.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Restaurant Name                 :");

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(87, 132, 186));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(255, 255, 255));
        btnModify.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        btnModify.setForeground(new java.awt.Color(87, 132, 186));
        btnModify.setText("Update");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(87, 132, 186));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Restaurant Address              :");

        jLabel6.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Contact Number                   :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress)
                            .addComponent(txtPhnNum)))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreate, btnDelete, btnModify});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhnNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModify)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreate, btnDelete, btnModify});

    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty() || txtName.getText().isEmpty() || txtAddress.getText().isEmpty()
              || txtPhnNum.getText().isEmpty()  ) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        Pattern TelNumpattern = Pattern.compile("^\\d{10}$");
        Matcher TelNummatcher = TelNumpattern.matcher(txtPhnNum.getText());
        if (TelNummatcher.matches()==false)
        {
                JOptionPane.showMessageDialog(this, "Phone Number format Invalid!"); 
                return;
        }

        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())) {
            Restaurant restaurant = new Restaurant(txtUserName.getText(),
                    txtPassword.getText(), txtName.getText(),
                    txtAddress.getText(),txtPhnNum.getText());
            ecosystem.getUserAccountDirectory().addUserAccount(restaurant);
            ecosystem.getRestaurantDirectory().addRestaurant(restaurant);
            populateTable();
            txtUserName.setText("");
            txtPassword.setText("");
            txtName.setText("");
            txtAddress.setText("");
            txtPhnNum.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Username " + txtUserName.getText() + " already exists !!!, Please try a new one");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
       

        int selectedRow = tblRestaurantAdmin.getSelectedRow();
        if (selectedRow >= 0) {
          
            Restaurant restaurant = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
           if (txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty() || txtName.getText().isEmpty() || txtAddress.getText().isEmpty()
              || txtPhnNum.getText().isEmpty()  ) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        Pattern TelNumpattern = Pattern.compile("^\\d{10}$");
        Matcher TelNummatcher = TelNumpattern.matcher(txtPhnNum.getText());
        if (TelNummatcher.matches()==false)
        {
                JOptionPane.showMessageDialog(this, "Phone Number format Invalid!"); 
                return;
        }
        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())  || (restaurant.getUsername().equals(txtUserName.getText()))) {
            restaurant.setUsername(txtUserName.getText());
            restaurant.setPassword(txtPassword.getText());
            restaurant.setName(txtName.getText());
            restaurant.setAddress(txtAddress.getText());
            restaurant.setPhone(txtPhnNum.getText());
            populateTable();
            txtUserName.setText("");
            txtPassword.setText("");
            txtName.setText("");
            txtAddress.setText("");
            txtPhnNum.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Username " + txtUserName.getText() + " already exists !!!, Please try a new one");
        }
        

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
           int selectedRow = tblRestaurantAdmin.getSelectedRow();

        if (selectedRow >= 0) {
            Restaurant restaurant = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
            RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
            restaurantDirectory.removeRestaurant(restaurant);
            JOptionPane.showMessageDialog(null, "Restaurant"  + txtUserName.getText() + " deleted");
            populateTable();
            txtUserName.setText("");
            txtPassword.setText("");
            txtName.setText("");
            txtAddress.setText("");
            txtPhnNum.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
           
      
    }//GEN-LAST:event_btnDeleteActionPerformed
    private void populateTable() {
        RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
        DefaultTableModel model = (DefaultTableModel) tblRestaurantAdmin.getModel();
        model.setRowCount(0);
        for (Restaurant restaurant : restaurantDirectory.getRestaurantList()) {
            Object[] row = new Object[3];
            row[0] = restaurant;
            row[1] = restaurant.getUsername();
            row[2] = restaurant.getPassword();
            model.addRow(row);
        }
    }

   
    private void initListners() {
       tblRestaurantAdmin.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblRestaurantAdmin.getSelectedRow();
             if (selectedRow >= 0) {
                  Restaurant  restaurant  = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
                 if(restaurant!=null){
                     display(restaurant);
                 }
             }
        }
    });
    }

    private void display(Restaurant restaurant) {
      
        txtUserName.setText(restaurant.getUsername());
        txtPassword.setText(restaurant.getPassword());
        txtName.setText(restaurant.getName());
        txtAddress.setText(restaurant.getAddress());
        txtPhnNum.setText(restaurant.getPhone());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurantAdmin;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhnNum;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}