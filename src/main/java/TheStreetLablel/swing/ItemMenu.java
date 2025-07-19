package TheStreetLablel.swing;

import TheStreetLablel.model.Model_Menu1;
import java.awt.Color;
import java.awt.Font;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class ItemMenu extends javax.swing.JPanel {


    private boolean over;
    private boolean selected;

    public ItemMenu(Model_Menu1 data) {
        initComponents();
        setOpaque(false);
        if (data.getType() == Model_Menu1.MenuType.MENU) {
            lbText.setText(data.getName());
        } else if (data.getType() == Model_Menu1.MenuType.TITLE) {
            lbText.setText(data.getName());
            lbText.setVisible(false);
        } else {
            lbText.setText(" ");
        }
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
        public void setOver(boolean over) {
        this.over = over;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (selected || over) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setBackground(getBackground());
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if(selected){
            g2.setColor(new Color(255, 255, 255, 80));
            }
            else{
            g2.setColor(new Color(255, 255, 255, 20));
            }
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
        }
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbText = new javax.swing.JLabel();

        lbText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbText.setForeground(new java.awt.Color(255, 255, 255));
        lbText.setText("Icon Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbText, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbText, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbText;
    // End of variables declaration//GEN-END:variables
}
