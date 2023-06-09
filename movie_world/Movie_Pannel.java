/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package movie_world;

import java.awt.Point;

/**
 *
 * @author DELL
 */
public class Movie_Pannel extends javax.swing.JPanel {

    /**
     * Creates new form Movie_Pannel
     */
    public Movie_Pannel() {
        initComponents();
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photoLb = new javax.swing.JLabel();
        movieName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        releaseDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OverviewLb = new javax.swing.JTextArea();
        popularity_progress = new javax.swing.JProgressBar();
        backBt = new javax.swing.JButton();
        aboutlb = new javax.swing.JLabel();
        favoriteaddBt = new javax.swing.JButton();
        delfavorite = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));
        setOpaque(false);
        setLayout(null);

        photoLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photoLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/broken_img.png"))); // NOI18N
        add(photoLb);
        photoLb.setBounds(80, 30, 140, 100);

        movieName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        movieName.setForeground(new java.awt.Color(252, 196, 25));
        movieName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movieName.setText("Movie_Name");
        add(movieName);
        movieName.setBounds(30, 10, 230, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 196, 25));
        jLabel3.setText("Release Date");
        add(jLabel3);
        jLabel3.setBounds(10, 130, 110, 17);

        releaseDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        releaseDate.setForeground(new java.awt.Color(252, 196, 25));
        releaseDate.setText("10-11-2001");
        add(releaseDate);
        releaseDate.setBounds(210, 130, 80, 15);

        OverviewLb.setBackground(new java.awt.Color(0, 0, 0));
        OverviewLb.setColumns(20);
        OverviewLb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OverviewLb.setForeground(new java.awt.Color(252, 196, 25));
        OverviewLb.setRows(5);
        OverviewLb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        OverviewLb.setDisabledTextColor(new java.awt.Color(252, 196, 25));
        OverviewLb.setEnabled(false);
        jScrollPane1.setViewportView(OverviewLb);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 280, 110);

        popularity_progress.setBackground(new java.awt.Color(0, 0, 0));
        popularity_progress.setForeground(new java.awt.Color(252, 196, 25));
        popularity_progress.setMaximum(1000);
        popularity_progress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        popularity_progress.setString("VOTE");
        popularity_progress.setStringPainted(true);
        add(popularity_progress);
        popularity_progress.setBounds(40, 270, 220, 20);

        backBt.setBackground(new java.awt.Color(0, 0, 0));
        backBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backbt (2).png"))); // NOI18N
        add(backBt);
        backBt.setBounds(10, 10, 50, 37);

        aboutlb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aboutlb.setForeground(new java.awt.Color(252, 196, 25));
        aboutlb.setText("About movie");
        add(aboutlb);
        aboutlb.setBounds(110, 140, 80, 15);

        favoriteaddBt.setBackground(new java.awt.Color(0, 0, 0));
        favoriteaddBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-hearts-20 (1).png"))); // NOI18N
        add(favoriteaddBt);
        favoriteaddBt.setBounds(240, 10, 50, 27);

        delfavorite.setBackground(new java.awt.Color(0, 0, 0));
        delfavorite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-hearts-20.png"))); // NOI18N
        delfavorite.setToolTipText("");
        add(delfavorite);
        delfavorite.setBounds(240, 10, 50, 27);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea OverviewLb;
    public javax.swing.JLabel aboutlb;
    public javax.swing.JButton backBt;
    public javax.swing.JButton delfavorite;
    public javax.swing.JButton favoriteaddBt;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel movieName;
    public javax.swing.JLabel photoLb;
    public javax.swing.JProgressBar popularity_progress;
    public javax.swing.JLabel releaseDate;
    // End of variables declaration//GEN-END:variables
}
