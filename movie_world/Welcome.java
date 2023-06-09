package movie_world;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Welcome extends javax.swing.JFrame {

    boolean photoes = false;
    boolean Settingopen = false;
    Thread old;

    public Welcome() {
        initComponents();
        setSize(1000, 650);
        jProgressBar1.setVisible(false);

        loadinglb.setVisible(false);
        jScrollPane1.setVisible(false);
        catagoryPannel.setVisible(false);
        if (dump.render) {
            loadPhotoesCheckBox.setSelected(true);
        } else {
            loadPhotoesCheckBox.setSelected(false);
        }
        setUpcomingPannel();
        setTrendingPannel();

        usernameLb.setText(dump.user.toUpperCase());
        setFocusable(true);
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void setUpcomingPannel() {
        for (int i = 1; i <= 6; i++) {
            ImageIcon ic = new ImageIcon(getClass().getResource("/upcoming/" + i + ".jpg"));
            Image img = ic.getImage().getScaledInstance(upcoming_1.getWidth(), upcoming_1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic1 = new ImageIcon(img);
            if (i == 1) {
                upcoming_1.setIcon(ic1);
            } else if (i == 2) {
                upcoming_2.setIcon(ic1);

            } else if (i == 3) {
                upcoming_3.setIcon(ic1);

            } else if (i == 4) {
                upcoming_4.setIcon(ic1);

            } else if (i == 5) {
                upcoming_5.setIcon(ic1);

            } else if (i == 6) {
                upcoming_6.setIcon(ic1);

            }
        }
    }

    public void setTrendingPannel() {
        for (int i = 1; i <= 6; i++) {
            ImageIcon ic = new ImageIcon(getClass().getResource("/trending/" + i + ".jpg"));
            Image img = ic.getImage().getScaledInstance(tending_1.getWidth(), tending_1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic1 = new ImageIcon(img);
            if (i == 1) {
                tending_1.setIcon(ic1);
            } else if (i == 2) {
                tending_2.setIcon(ic1);

            } else if (i == 3) {
                tending_3.setIcon(ic1);

            } else if (i == 4) {
                tending_4.setIcon(ic1);

            } else if (i == 5) {
                tending_5.setIcon(ic1);

            } else if (i == 6) {
                tending_6.setIcon(ic1);

            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        upmvbt = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        loadinglb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        settingpannel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        loadPhotoesCheckBox = new javax.swing.JCheckBox();
        usernameLb = new javax.swing.JLabel();
        profilepannelClose = new javax.swing.JButton();
        searchbar = new javax.swing.JTextField();
        trendingBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchBt1 = new javax.swing.JButton();
        catagoryPannel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        asbt = new javax.swing.JButton();
        tsbt = new javax.swing.JButton();
        companybt = new javax.swing.JButton();
        catagoryBt = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        upcoming_2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        upcoming_3 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        upcoming_4 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        upcoming_5 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        upcoming_1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        upcoming_6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        tending_2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        tending_3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        tending_4 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        tending_5 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        tending_1 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        tending_6 = new javax.swing.JLabel();
        settingBt = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        upmvbt.setBackground(new java.awt.Color(0, 0, 0));
        upmvbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-30.png"))); // NOI18N
        upmvbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upmvbtActionPerformed(evt);
            }
        });
        getContentPane().add(upmvbt);
        upmvbt.setBounds(170, 390, 70, 40);

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(252, 196, 25));
        jProgressBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jProgressBar1.setOpaque(true);
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(320, 90, 380, 20);

        loadinglb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loadinglb.setForeground(new java.awt.Color(252, 196, 25));
        loadinglb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadinglb.setText("jLabel1");
        getContentPane().add(loadinglb);
        loadinglb.setBounds(390, 120, 250, 17);

        settingpannel.setBackground(new java.awt.Color(0, 0, 0));
        settingpannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        settingpannel.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/username.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        settingpannel.add(jButton1);
        jButton1.setBounds(80, 10, 60, 50);

        loadPhotoesCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        loadPhotoesCheckBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loadPhotoesCheckBox.setForeground(new java.awt.Color(252, 196, 25));
        loadPhotoesCheckBox.setSelected(true);
        loadPhotoesCheckBox.setText("Render photos");
        loadPhotoesCheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 196, 25)));
        loadPhotoesCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                loadPhotoesCheckBoxStateChanged(evt);
            }
        });
        loadPhotoesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPhotoesCheckBoxActionPerformed(evt);
            }
        });
        settingpannel.add(loadPhotoesCheckBox);
        loadPhotoesCheckBox.setBounds(0, 110, 220, 17);

        usernameLb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernameLb.setForeground(new java.awt.Color(252, 196, 25));
        usernameLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLb.setText("name");
        settingpannel.add(usernameLb);
        usernameLb.setBounds(50, 70, 120, 15);

        profilepannelClose.setBackground(new java.awt.Color(0, 0, 0));
        profilepannelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-multiply-30.png"))); // NOI18N
        profilepannelClose.setText("jButton3");
        profilepannelClose.setBorder(null);
        profilepannelClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilepannelCloseActionPerformed(evt);
            }
        });
        settingpannel.add(profilepannelClose);
        profilepannelClose.setBounds(190, 0, 40, 30);

        jScrollPane1.setViewportView(settingpannel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(750, 0, 230, 180);

        searchbar.setBackground(new java.awt.Color(0, 0, 0));
        searchbar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchbar.setForeground(new java.awt.Color(255, 255, 255));
        searchbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        searchbar.setCaretColor(new java.awt.Color(255, 255, 255));
        searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarActionPerformed(evt);
            }
        });
        getContentPane().add(searchbar);
        searchbar.setBounds(320, 10, 310, 40);

        trendingBt.setBackground(new java.awt.Color(0, 0, 0));
        trendingBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-30.png"))); // NOI18N
        trendingBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trendingBtActionPerformed(evt);
            }
        });
        getContentPane().add(trendingBt);
        trendingBt.setBounds(170, 160, 70, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 196, 25));
        jLabel1.setText("TOP UPCOMING");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 400, 120, 30);

        searchBt1.setBackground(new java.awt.Color(0, 0, 0));
        searchBt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-30.png"))); // NOI18N
        searchBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBt1ActionPerformed(evt);
            }
        });
        getContentPane().add(searchBt1);
        searchBt1.setBounds(630, 10, 70, 40);

        catagoryPannel.setBackground(new java.awt.Color(0, 0, 0));
        catagoryPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        catagoryPannel.setOpaque(false);
        catagoryPannel.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(252, 196, 25));
        jButton2.setText("MOVIE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        catagoryPannel.add(jButton2);
        jButton2.setBounds(20, 10, 150, 24);

        asbt.setBackground(new java.awt.Color(0, 0, 0));
        asbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        asbt.setForeground(new java.awt.Color(252, 196, 25));
        asbt.setText("ACTOR ");
        asbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asbtActionPerformed(evt);
            }
        });
        catagoryPannel.add(asbt);
        asbt.setBounds(20, 40, 150, 24);

        tsbt.setBackground(new java.awt.Color(0, 0, 0));
        tsbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tsbt.setForeground(new java.awt.Color(252, 196, 25));
        tsbt.setText("TV SHOW");
        tsbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsbtActionPerformed(evt);
            }
        });
        catagoryPannel.add(tsbt);
        tsbt.setBounds(20, 70, 150, 24);

        companybt.setBackground(new java.awt.Color(0, 0, 0));
        companybt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        companybt.setForeground(new java.awt.Color(252, 196, 25));
        companybt.setText("MOVIE HOUSES");
        companybt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companybtActionPerformed(evt);
            }
        });
        catagoryPannel.add(companybt);
        companybt.setBounds(20, 100, 150, 24);

        getContentPane().add(catagoryPannel);
        catagoryPannel.setBounds(80, 0, 180, 130);

        catagoryBt.setBackground(new java.awt.Color(0, 0, 0));
        catagoryBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-list-view-30.png"))); // NOI18N
        catagoryBt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                catagoryBtStateChanged(evt);
            }
        });
        getContentPane().add(catagoryBt);
        catagoryBt.setBounds(0, 0, 70, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 196, 25));
        jLabel2.setText("TOP TRENDING");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 160, 120, 40);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        jPanel9.setLayout(null);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel15.setOpaque(false);
        jPanel15.setLayout(null);

        upcoming_2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.add(upcoming_2);
        upcoming_2.setBounds(10, 10, 120, 120);

        jPanel9.add(jPanel15);
        jPanel15.setBounds(170, 10, 140, 140);

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel16.setOpaque(false);
        jPanel16.setLayout(null);

        upcoming_3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.add(upcoming_3);
        upcoming_3.setBounds(10, 10, 120, 120);

        jPanel9.add(jPanel16);
        jPanel16.setBounds(320, 10, 140, 140);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel17.setOpaque(false);
        jPanel17.setLayout(null);

        upcoming_4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.add(upcoming_4);
        upcoming_4.setBounds(10, 10, 120, 120);

        jPanel9.add(jPanel17);
        jPanel17.setBounds(470, 10, 140, 140);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel18.setOpaque(false);
        jPanel18.setLayout(null);

        upcoming_5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel18.add(upcoming_5);
        upcoming_5.setBounds(10, 10, 120, 120);

        jPanel9.add(jPanel18);
        jPanel18.setBounds(620, 10, 140, 140);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel19.setOpaque(false);
        jPanel19.setLayout(null);

        upcoming_1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel19.add(upcoming_1);
        upcoming_1.setBounds(10, 10, 120, 120);

        jPanel9.add(jPanel19);
        jPanel19.setBounds(20, 10, 140, 140);

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel20.setOpaque(false);
        jPanel20.setLayout(null);

        upcoming_6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel20.add(upcoming_6);
        upcoming_6.setBounds(10, 10, 120, 120);

        jPanel9.add(jPanel20);
        jPanel20.setBounds(770, 10, 140, 140);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(20, 440, 930, 160);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        jPanel10.setLayout(null);

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel21.setOpaque(false);
        jPanel21.setLayout(null);

        tending_2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel21.add(tending_2);
        tending_2.setBounds(10, 10, 120, 120);

        jPanel10.add(jPanel21);
        jPanel21.setBounds(170, 10, 140, 140);

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel22.setOpaque(false);
        jPanel22.setLayout(null);

        tending_3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel22.add(tending_3);
        tending_3.setBounds(10, 10, 120, 120);

        jPanel10.add(jPanel22);
        jPanel22.setBounds(320, 10, 140, 140);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel23.setOpaque(false);
        jPanel23.setLayout(null);

        tending_4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel23.add(tending_4);
        tending_4.setBounds(10, 10, 120, 120);

        jPanel10.add(jPanel23);
        jPanel23.setBounds(470, 10, 140, 140);

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel24.setOpaque(false);
        jPanel24.setLayout(null);

        tending_5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel24.add(tending_5);
        tending_5.setBounds(10, 10, 120, 120);

        jPanel10.add(jPanel24);
        jPanel24.setBounds(620, 10, 140, 140);

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel25.setOpaque(false);
        jPanel25.setLayout(null);

        tending_1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel25.add(tending_1);
        tending_1.setBounds(10, 10, 120, 120);

        jPanel10.add(jPanel25);
        jPanel25.setBounds(20, 10, 140, 140);

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel26.setOpaque(false);
        jPanel26.setLayout(null);

        tending_6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel26.add(tending_6);
        tending_6.setBounds(10, 10, 120, 120);

        jPanel10.add(jPanel26);
        jPanel26.setBounds(770, 10, 140, 140);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(20, 210, 930, 160);

        settingBt.setBackground(new java.awt.Color(0, 0, 0));
        settingBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-gear-30 (1).png"))); // NOI18N
        settingBt.setBorder(null);
        settingBt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                settingBtStateChanged(evt);
            }
        });
        settingBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingBtActionPerformed(evt);
            }
        });
        getContentPane().add(settingBt);
        settingBt.setBounds(920, 0, 60, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void st(Thread thread) {

    }
    private void upmvbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upmvbtActionPerformed
        // TODO add your handling code here:

        loadinglb.setVisible(true);
        jProgressBar1.setMaximum(1000000000);
        jProgressBar1.setVisible(true);
//        upmvbt.setEnabled(false);
//        trendingBt.setEnabled(false);
        setEnabled(false);
        companybt.setVisible(false);
        Thread newfun = new Thread(new Runnable() {
            @Override
            public void run() {

                new Upcoming_Movies("upcoming");

                jProgressBar1.setValue(1000000000);

                dispose();
            }

        });

        Thread old = new Thread(new Runnable() {

            @Override
            public void run() {
                repaint();

                for (int i = 0; i < jProgressBar1.getMaximum(); i++) {
                    jProgressBar1.setValue(i);
                    if (i < jProgressBar1.getMaximum() / 10) {
                        loadinglb.setText("Connecting to server");
                    } else if (i < jProgressBar1.getMaximum() / 2) {
                        loadinglb.setText("Getting Data");
                    } else {
                        loadinglb.setText("Taking a while check internet speed please wait");
                    }
                }
                try {
                    Thread.sleep(10000);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                dispose();
            }
        });

        newfun.setPriority(Thread.MAX_PRIORITY);
        newfun.start();
        old.start();

    }//GEN-LAST:event_upmvbtActionPerformed

    private void asbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asbtActionPerformed
        // TODO add your handling code here:
        new Actor_Search("movies");
        dispose();

    }//GEN-LAST:event_asbtActionPerformed

    private void settingBtStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_settingBtStateChanged
        // TODO add your handling code here:
        // settingpannel.setVisible(true);
    }//GEN-LAST:event_settingBtStateChanged

    private void loadPhotoesCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_loadPhotoesCheckBoxStateChanged
        // TODO add your handling code here:

        if (loadPhotoesCheckBox.isSelected()) {
            photoes = true;
            dump.render = true;
        } else {
            photoes = false;
            dump.render = true;

        }

    }//GEN-LAST:event_loadPhotoesCheckBoxStateChanged

    private void settingBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingBtActionPerformed
        // TODO add your handling code here:

        jScrollPane1.setVisible(true);
        Settingopen = true;

    }//GEN-LAST:event_settingBtActionPerformed

    private void loadPhotoesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPhotoesCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadPhotoesCheckBoxActionPerformed

    private void tsbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsbtActionPerformed
        // TODO add your handling code here:

        upmvbt.setVisible(false);
        asbt.setEnabled(false);
        tsbt.setVisible(false);
        new Actor_Search("tv");
        dispose();


    }//GEN-LAST:event_tsbtActionPerformed

    private void companybtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companybtActionPerformed
        // TODO add your handling code here:
        new Actor_Search("company");
        dispose();

    }//GEN-LAST:event_companybtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserDetails us = new UserDetails();
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Actor_Search("movie_name");
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void catagoryBtStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_catagoryBtStateChanged
        // TODO add your handling code here:
        if (catagoryBt.isSelected()) {
            catagoryPannel.setVisible(true);
        } else {
            catagoryPannel.setVisible(false);
        }
    }//GEN-LAST:event_catagoryBtStateChanged

    private void trendingBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trendingBtActionPerformed
        // TODO add your handling code here:
        loadinglb.setVisible(true);
        jProgressBar1.setMaximum(1000000000);
        jProgressBar1.setVisible(true);
//        trendingBt.setEnabled(false);
//        companybt.setVisible(false);
        setEnabled(false);
        Thread newfun = new Thread(new Runnable() {
            @Override
            public void run() {

                new Upcoming_Movies("trending");

                jProgressBar1.setValue(1000000000);

                dispose();
            }

        });

        Thread old = new Thread(new Runnable() {

            @Override
            public void run() {
                repaint();

                for (int i = 0; i < jProgressBar1.getMaximum(); i++) {
                    jProgressBar1.setValue(i);
                    if (i < jProgressBar1.getMaximum() / 10) {
                        loadinglb.setText("Connecting to server");
                    } else if (i < jProgressBar1.getMaximum() / 2) {
                        loadinglb.setText("Getting Data");
                    } else {
                        loadinglb.setText("Taking a while check internet speed please wait");
                    }
                }
                try {
                    Thread.sleep(10000);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                dispose();
            }
        });

        newfun.setPriority(Thread.MAX_PRIORITY);
        newfun.start();
        old.start();
    }//GEN-LAST:event_trendingBtActionPerformed

    private void searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbarActionPerformed

    private void profilepannelCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilepannelCloseActionPerformed
        // TODO add your handling code here:
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_profilepannelCloseActionPerformed

    @Override
    public void pack() {
        super.pack(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    private void searchBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBt1ActionPerformed
        // TODO add your handling code here:
        String search = searchbar.getText().replace(" ", "%20");

        jProgressBar1.setMaximum(1000000000);
        jProgressBar1.setVisible(true);
        loadinglb.setVisible(true);

        setEnabled(false);
        companybt.setVisible(false);

        old = new Thread(new Runnable() {

            @Override
            public void run() {
                repaint();

                for (int i = 0; i < jProgressBar1.getMaximum(); i++) {

                    jProgressBar1.setValue(i);
                    if (i < jProgressBar1.getMaximum() / 10) {
                        loadinglb.setText("Connecting to server");
                    } else if (i < jProgressBar1.getMaximum() / 2) {
                        loadinglb.setText("Getting Data");
                    } else {
                        loadinglb.setText("Taking a while check internet speed please wait");
                    }
                }
                try {
                    Thread.sleep(10000);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                // dispose();

            }
        });

        Thread newfun = new Thread(new Runnable() {
            @Override
            public void run() {

                AllCatagory al = new AllCatagory(search);
                if (al.hasResult()) {

                    jProgressBar1.setValue(1000000000);
                    al.setVisible(true);
                    dispose();

                } else {
                    jProgressBar1.setVisible(false);
                    loadinglb.setVisible(false);
                    setEnabled(true);
                    JOptionPane.showMessageDialog(getContentPane(), "no result found");

                    al.dispose();
//                remove(jProgressBar1);
//                remove(loadinglb);
//                tc.changeState(false);
//                searchBt1.setEnabled(true);
//               setEnabled(true);
                    old.stop();

                }

            }

        });

        newfun.setPriority(Thread.MAX_PRIORITY);
        newfun.start();
        old.start();

    }//GEN-LAST:event_searchBt1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asbt;
    private javax.swing.JToggleButton catagoryBt;
    private javax.swing.JPanel catagoryPannel;
    private javax.swing.JButton companybt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox loadPhotoesCheckBox;
    private javax.swing.JLabel loadinglb;
    private javax.swing.JButton profilepannelClose;
    private javax.swing.JButton searchBt1;
    private javax.swing.JTextField searchbar;
    private javax.swing.JButton settingBt;
    private javax.swing.JPanel settingpannel;
    private javax.swing.JLabel tending_1;
    private javax.swing.JLabel tending_2;
    private javax.swing.JLabel tending_3;
    private javax.swing.JLabel tending_4;
    private javax.swing.JLabel tending_5;
    private javax.swing.JLabel tending_6;
    private javax.swing.JButton trendingBt;
    private javax.swing.JButton tsbt;
    private javax.swing.JLabel upcoming_1;
    private javax.swing.JLabel upcoming_2;
    private javax.swing.JLabel upcoming_3;
    private javax.swing.JLabel upcoming_4;
    private javax.swing.JLabel upcoming_5;
    private javax.swing.JLabel upcoming_6;
    private javax.swing.JButton upmvbt;
    private javax.swing.JLabel usernameLb;
    // End of variables declaration//GEN-END:variables
}