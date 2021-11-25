
package gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class VFondo extends javax.swing.JPanel {

    
    public VFondo(int w, int h) {
        initComponents();
        
        setSize(w, h);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Image im = new ImageIcon(getClass().getResource("/imagenes/fondo.JPEG")).getImage();
        g.drawImage(im, 0, 0, getWidth(), getHeight(), null);
        setOpaque(false);
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
