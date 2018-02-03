/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view;

import java.awt.Color;
import java.util.ArrayList;
import mvc.model.basicTypes.Address;
import mvc.model.basicTypes.SimpleCustomer;

/**
 *
 * @author bohao
 */
public class UserInfoPanel extends javax.swing.JPanel {

	private final SimpleCustomer simpleCustomer;
	
	/**
	 * Creates new form UserInfo
	 */
	public UserInfoPanel(SimpleCustomer simpleCustomer) {
		this.simpleCustomer = simpleCustomer;
		initComponents();
		init();
	}

	private void init() {
		userNameValueLabel.setText(simpleCustomer.getUserName());
		firstNameValueLabel.setText(simpleCustomer.getFirstName());
		lastNameValueLabel.setText(simpleCustomer.getLastName());
		emailValueLabel.setText(simpleCustomer.getEmailAddress());
		phoneValueLabel.setText(simpleCustomer.getPhoneNumber());
	
		
		
		//**********************************************************************
		if (simpleCustomer.getDefaultAddress() != null) {
			addressTextArea.setText("\tDefault address:\n"
					+ simpleCustomer.getDefaultAddress().toString());
		} else { // if no default address, there can't be any other addresses
			return;
		}
		ArrayList<Address> otherAddresses = simpleCustomer.getOtherAddresses();
		if (otherAddresses != null) {
			otherAddresses.stream().forEach((address) -> {
				addressTextArea.append("\n\tAnother address:\n"
						+ address.toString());
			});
		}
		
		addressTextArea.setEditable(false);
		addressTextArea.setBackground(new Color(242,241,240, 1));
		//**********************************************************************	
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailedInfoScroll = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        addressLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phoneValueLabel = new javax.swing.JLabel();
        emailValueLabel = new javax.swing.JLabel();
        lastNameValueLabel = new javax.swing.JLabel();
        firstNameValueLabel = new javax.swing.JLabel();
        userNameValueLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        detailedInfoScroll.setViewportView(addressTextArea);

        addressLabel.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        addressLabel.setText("Address:");

        phoneLabel.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        phoneLabel.setText("Phone number:");

        phoneValueLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        phoneValueLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        emailValueLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        emailValueLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lastNameValueLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lastNameValueLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        firstNameValueLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        firstNameValueLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        userNameValueLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        userNameValueLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        firstNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        firstNameLabel.setText("First name:");

        userNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        userNameLabel.setText("User name: ");

        lastNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        lastNameLabel.setText("Last name:");

        emailLabel.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        emailLabel.setText("Email address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(userNameLabel)
                    .addComponent(emailLabel)
                    .addComponent(phoneLabel)
                    .addComponent(addressLabel))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailedInfoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(emailValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailedInfoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JScrollPane detailedInfoScroll;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailValueLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameValueLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lastNameValueLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneValueLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameValueLabel;
    // End of variables declaration//GEN-END:variables
}
