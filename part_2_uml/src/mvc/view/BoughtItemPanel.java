/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view;

import javax.swing.ImageIcon;
import mvc.model.basicTypes.Product;
import mvc.model.basicTypes.BoughtItem;

/**
 *
 * @author bohao
 */
public class BoughtItemPanel extends javax.swing.JPanel {

	private final BoughtItem boughtItem;

	public BoughtItemPanel(BoughtItem boughtItem) {
		this.boughtItem = boughtItem;
		initComponents();
		init();
	}

	private void init() {
		Product product = boughtItem.getProduct();
		ImageIcon img = new ImageIcon(getClass().getResource(
				product.getSmallImageUrl()));
		imageLabel.setIcon(img);
		nameLabel.setText("<html>" + product.getName() + "</html>");
		quantityLabel.setText(""+boughtItem.getQuantity());
		weightLabel.setText(boughtItem.getWeight() + "  grams");
		moneyLabel.setText(String.format("%.2f  GBP", 
				boughtItem.getPrice()).replaceAll(",", "."));
		dateLabel.setText(boughtItem.getDate().toString());		
	}
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateOfPurchaseLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        moneyLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        imageLabel.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Weight:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Quantity:");

        dateOfPurchaseLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        dateOfPurchaseLabel.setText("Date of purchase:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setText("Money paid:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Name of product:");

        nameLabel.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        nameLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nameLabel.setBorder(null);

        weightLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        weightLabel.setBorder(null);

        quantityLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        quantityLabel.setBorder(null);

        dateLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        dateLabel.setBorder(null);

        moneyLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        moneyLabel.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(dateOfPurchaseLabel))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(weightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateOfPurchaseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateOfPurchaseLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
