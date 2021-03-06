/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryPartner;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shshyam
 */
public class DelPartnerWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    private List<WorkRequest> workRequestList;
    private WorkRequest workRequest;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DelPartnerWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        //initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        initializeDelivery();
    }
    private void initializeDelivery()
    {
        populatDeliveryRequestTable();
        btnPickUp.setVisible(false);
        btnDeliver.setVisible(false);
    }
      private void populatDeliveryRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblDeliveryManWorkRequest.getModel();
        model.setRowCount(0);
        workRequestList = ecosystem.getWorkQueue().getWorkRequestListDeliveryMan(userAccount);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblDeliveryManWorkRequest.getColumnCount()];
            row[0] = request;
            row[1] = request.getRestaurant();
            row[2] = request.getCustomer();
            row[3] = request.getStatus();
            row[4] = request.getRequestDate();
            model.addRow(row);
        }
        }
        
      private void displayOrderDetails()
      {
          int SelectedRowIndex = tblDeliveryManWorkRequest.getSelectedRow();

        if(SelectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a order to deliver");
            return;
        }
       
        DefaultTableModel model = (DefaultTableModel) tblDeliveryManWorkRequest.getModel();
        WorkRequest selectedRequest = (WorkRequest) model.getValueAt(SelectedRowIndex,0); 
        this.workRequest=selectedRequest;
        txtRestName.setText(selectedRequest.getRestaurant().getName());
        txtRestAddr.setText(selectedRequest.getRestaurant().getAddress());
        txtCustName.setText(selectedRequest.getCustomer().getName());
        txtCustAddr.setText(selectedRequest.getCustomer().getAddress());
        txtOrderStatus.setText(selectedRequest.getStatus());
        if (workRequest.getStatus().equals("Prepared")) {
            btnPickUp.setVisible(true);}
        else if (workRequest.getStatus().equals("Out for delivery")) {
            btnDeliver.setVisible(true);}
        
      }
        /*   private void initListners() {
        tblDeliveryManWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblDeliveryManWorkRequest.getSelectedRow();
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                    if (request instanceof OrderWorkRequest) {
                        OrderWorkRequest orderWorkRequest = (OrderWorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                           ProcessOrderJPanel processOrderJPanel = new ProcessOrderJPanel(userProcessContainer,ecosystem,userAccount,orderWorkRequest);
                           userProcessContainer.add("ProcessOrderJPanel", processOrderJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
                        }
      }

                }
            }
        });
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryManWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblRestName = new javax.swing.JLabel();
        lblRestAddr = new javax.swing.JLabel();
        lblCustName = new javax.swing.JLabel();
        lblCustAddr = new javax.swing.JLabel();
        txtCustAddr = new javax.swing.JTextField();
        txtRestName = new javax.swing.JTextField();
        txtRestAddr = new javax.swing.JTextField();
        txtCustName = new javax.swing.JTextField();
        lblOrdStatus = new javax.swing.JLabel();
        txtOrderStatus = new javax.swing.JTextField();
        btnDeliver = new javax.swing.JButton();
        btnPickUp = new javax.swing.JButton();
        btnChooseOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(182, 216, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryManWorkRequest.setFont(new java.awt.Font("Optima", 0, 12)); // NOI18N
        tblDeliveryManWorkRequest.setForeground(new java.awt.Color(87, 132, 186));
        tblDeliveryManWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Request Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDeliveryManWorkRequest);
        if (tblDeliveryManWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblDeliveryManWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblDeliveryManWorkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblDeliveryManWorkRequest.getColumnModel().getColumn(2).setResizable(false);
            tblDeliveryManWorkRequest.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 760, 160));

        jLabel1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Queue for Delivery");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 790, -1));

        lblRestName.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblRestName.setForeground(new java.awt.Color(0, 51, 51));
        lblRestName.setText("Restaurant Name         : ");
        add(lblRestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, 20));

        lblRestAddr.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblRestAddr.setForeground(new java.awt.Color(0, 51, 51));
        lblRestAddr.setText("Restaurant Address     :");
        add(lblRestAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        lblCustName.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblCustName.setForeground(new java.awt.Color(0, 51, 51));
        lblCustName.setText("Customer Name          :");
        add(lblCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        lblCustAddr.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblCustAddr.setForeground(new java.awt.Color(0, 51, 51));
        lblCustAddr.setText("Customer Address      :");
        add(lblCustAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        txtCustAddr.setEditable(false);
        txtCustAddr.setForeground(new java.awt.Color(0, 51, 51));
        add(txtCustAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 600, 30));

        txtRestName.setEditable(false);
        txtRestName.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 600, 30));

        txtRestAddr.setEditable(false);
        txtRestAddr.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 600, 30));

        txtCustName.setEditable(false);
        txtCustName.setForeground(new java.awt.Color(0, 51, 51));
        add(txtCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 600, 30));

        lblOrdStatus.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblOrdStatus.setForeground(new java.awt.Color(0, 51, 51));
        lblOrdStatus.setText("Order Status                : ");
        add(lblOrdStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        txtOrderStatus.setEditable(false);
        txtOrderStatus.setForeground(new java.awt.Color(0, 51, 51));
        add(txtOrderStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 600, 30));

        btnDeliver.setBackground(new java.awt.Color(255, 255, 255));
        btnDeliver.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        btnDeliver.setForeground(new java.awt.Color(87, 132, 186));
        btnDeliver.setText("Deliver Order");
        btnDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverActionPerformed(evt);
            }
        });
        add(btnDeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 280, 40));

        btnPickUp.setBackground(new java.awt.Color(255, 255, 255));
        btnPickUp.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        btnPickUp.setForeground(new java.awt.Color(87, 132, 186));
        btnPickUp.setText("Pick up order");
        btnPickUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickUpActionPerformed(evt);
            }
        });
        add(btnPickUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 280, 40));

        btnChooseOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnChooseOrder.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        btnChooseOrder.setForeground(new java.awt.Color(87, 132, 186));
        btnChooseOrder.setText("View Order Details");
        btnChooseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseOrderActionPerformed(evt);
            }
        });
        add(btnChooseOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverActionPerformed
       workRequest.setStatus("Delivered");
       JOptionPane.showMessageDialog(null, "Thank you for delivering the order!");
       btnPickUp.setVisible(false);
       btnDeliver.setVisible(false);
       clearFields();
       initializeDelivery();
    }//GEN-LAST:event_btnDeliverActionPerformed

    private void btnPickUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickUpActionPerformed
       
           workRequest.setStatus("Out for delivery");
           JOptionPane.showMessageDialog(null, "Thank you for picking up order!");
           btnDeliver.setVisible(true);
           btnPickUp.setVisible(false);
           populatDeliveryRequestTable();
        
    }//GEN-LAST:event_btnPickUpActionPerformed

    private void btnChooseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseOrderActionPerformed
        // TODO add your handling code here:
        displayOrderDetails();
    }//GEN-LAST:event_btnChooseOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseOrder;
    private javax.swing.JButton btnDeliver;
    private javax.swing.JButton btnPickUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCustAddr;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblOrdStatus;
    private javax.swing.JLabel lblRestAddr;
    private javax.swing.JLabel lblRestName;
    private javax.swing.JTable tblDeliveryManWorkRequest;
    private javax.swing.JTextField txtCustAddr;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtOrderStatus;
    private javax.swing.JTextField txtRestAddr;
    private javax.swing.JTextField txtRestName;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
            txtRestName.setText("");
        txtRestAddr.setText("");
        txtCustName.setText("");
        txtCustAddr.setText("");
        txtOrderStatus.setText("");
    }
}
