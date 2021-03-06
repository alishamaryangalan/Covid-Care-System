/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;


import Business.EcoSystem;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shshyam
 */
public class MenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    Restaurant restaurant;

    public MenuJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        restaurant = (Restaurant) account;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        itemPrice = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();

        setBackground(new java.awt.Color(182, 216, 242));

        jLabel1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create or Update Menu");

        tblMenu.setFont(new java.awt.Font("Optima", 0, 12)); // NOI18N
        tblMenu.setForeground(new java.awt.Color(87, 132, 186));
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        jLabel2.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel3.setText("Item Price");

        btnAddItem.setBackground(new java.awt.Color(255, 255, 255));
        btnAddItem.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(87, 132, 186));
        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
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

        btnUpdateItem.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateItem.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        btnUpdateItem.setForeground(new java.awt.Color(87, 132, 186));
        btnUpdateItem.setText("Update");
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                    .addComponent(itemPrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddItem, btnDelete, btnUpdateItem});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(itemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateItem))
                .addGap(101, 101, 101))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddItem, btnDelete, btnUpdateItem});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        if (itemName.getText().isEmpty() || itemPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both Item name and Price");
            return;
        }
        for (Item item : restaurant.getMenu().getItemList()) {
            if (itemName.getText().equals(item.getName())) {
                JOptionPane.showMessageDialog(null, " Duplicate Items not allowed");
                return;
            }
        }
        double price = 0.0;
        try {
            price = Double.valueOf(itemPrice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Please enter a decimal number for Item Price!!");
            return;
        }

        Item item = new Item(itemName.getText(), Double.valueOf(itemPrice.getText()));

        // ecosystem.getItemList().addItem(item);
        restaurant.getMenu().addItem(item);
        populateTable();
        itemName.setText("");
        itemPrice.setText("");

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblMenu.getSelectedRow();
        if (selectedRow >= 0) {
            Item Selecteditem = (Item) tblMenu.getValueAt(selectedRow, 0);
            for (Item item : restaurant.getMenu().getItemList()) {
                if(item==Selecteditem)
                    restaurant.getMenu().removeItem(item);
            }
           
            populateTable();
            itemName.setText("");
            itemPrice.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed

        int selectedRow = tblMenu.getSelectedRow();
        if (selectedRow >= 0) {
            Item item = (Item) tblMenu.getValueAt(selectedRow, 0);
            item.setName(itemName.getText());
            item.setPrice(Double.valueOf(itemPrice.getText()));
            populateTable();
            itemName.setText("");
            itemPrice.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed
    private void populateTable() {
        Menu menu = restaurant.getMenu();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);
        for (Item item : menu.getItemList()) {

            Object[] row = new Object[2];
            row[0] = item;
            row[1] = item.getPrice();
            model.addRow(row);

        }
    }

    private void display(Item item) {
        
        itemName.setText(item.getName());
        itemPrice.setText(Double.valueOf(item.getPrice()) + "");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenu;
    // End of variables declaration//GEN-END:variables

    private void initListners() {
        tblMenu.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblMenu.getSelectedRow();
                if (selectedRow >= 0) {
                    Item item = (Item) tblMenu.getValueAt(selectedRow, 0);
                    if (item != null) {
                        display(item);
                    }
                }
            }
        });
    }

}
