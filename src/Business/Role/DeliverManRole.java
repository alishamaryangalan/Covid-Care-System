/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryPartner.DelPartnerWorkArea;

/**
 *
 * @author shshyam
 */
public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new DelPartnerWorkArea(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}
