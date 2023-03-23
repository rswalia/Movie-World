
package movie_world;

import java.awt.Color;

public class ServerOnOff extends javax.swing.JFrame {
MyServer obj;
    public ServerOnOff() {
        initComponents();
        setSize(300,300);
        turnoff.setEnabled(false);
        
       
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turnon = new javax.swing.JButton();
        turnoff = new javax.swing.JButton();
        bgColorlb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        turnon.setBackground(new java.awt.Color(0, 0, 0));
        turnon.setForeground(new java.awt.Color(255, 255, 255));
        turnon.setText("TURN ON");
        turnon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnonActionPerformed(evt);
            }
        });
        getContentPane().add(turnon);
        turnon.setBounds(80, 100, 130, 23);

        turnoff.setBackground(new java.awt.Color(0, 0, 0));
        turnoff.setForeground(new java.awt.Color(255, 255, 255));
        turnoff.setText("TURN OFF");
        turnoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoffActionPerformed(evt);
            }
        });
        getContentPane().add(turnoff);
        turnoff.setBounds(80, 130, 130, 23);
        getContentPane().add(bgColorlb);
        bgColorlb.setBounds(0, 0, 300, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turnonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnonActionPerformed
        // TODO add your handling code here:
        turnon.setEnabled(false);
        turnoff.setEnabled(true);
        gturnon();
        try{
        obj= new MyServer(8000);
        
       
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_turnonActionPerformed

    private void turnoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoffActionPerformed
        // TODO add your handling code here:
        turnoff.setEnabled(false);
        turnon.setEnabled(true);
        gturnoff();
        try{
            obj.shutdown();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_turnoffActionPerformed
 
    public void gturnon(){
        turnon.setBackground(new Color(255,255,255));
        turnon.setForeground(Color.BLACK);
        turnoff.setBackground(Color.BLACK);
        turnoff.setForeground(Color.WHITE);
    }
    
    public void gturnoff(){
        turnoff.setBackground(Color.WHITE);
        turnoff.setForeground(Color.BLACK);
        turnon.setBackground(Color.BLACK);
        turnon.setForeground(Color.WHITE);
    }
    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerOnOff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgColorlb;
    private javax.swing.JButton turnoff;
    private javax.swing.JButton turnon;
    // End of variables declaration//GEN-END:variables
}
