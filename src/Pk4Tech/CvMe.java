/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pk4Tech;

/**
 *
 * @author kaka
 */
public class CvMe extends javax.swing.JFrame {

    /**
     * Creates new form CvMe
     */
    public CvMe() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PersonalPanel = new javax.swing.JPanel();
        AcademicPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        TrainingPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        ExpPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        XExit = new javax.swing.JLabel();
        PersonalLbl = new javax.swing.JLabel();
        AcademicLbl = new javax.swing.JLabel();
        TrainingLbl = new javax.swing.JLabel();
        ExpLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.CardLayout());

        PersonalPanel.setBackground(new java.awt.Color(0, 0, 153));
        PersonalPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PersonalPanelLayout = new javax.swing.GroupLayout(PersonalPanel);
        PersonalPanel.setLayout(PersonalPanelLayout);
        PersonalPanelLayout.setHorizontalGroup(
            PersonalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );
        PersonalPanelLayout.setVerticalGroup(
            PersonalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        jPanel2.add(PersonalPanel, "card3");

        AcademicPanel.setBackground(new java.awt.Color(0, 0, 153));

        jButton2.setText("Academic");

        javax.swing.GroupLayout AcademicPanelLayout = new javax.swing.GroupLayout(AcademicPanel);
        AcademicPanel.setLayout(AcademicPanelLayout);
        AcademicPanelLayout.setHorizontalGroup(
            AcademicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcademicPanelLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jButton2)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        AcademicPanelLayout.setVerticalGroup(
            AcademicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcademicPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jButton2)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jPanel2.add(AcademicPanel, "card3");

        TrainingPanel.setBackground(new java.awt.Color(0, 0, 153));

        jButton3.setText("Training");

        javax.swing.GroupLayout TrainingPanelLayout = new javax.swing.GroupLayout(TrainingPanel);
        TrainingPanel.setLayout(TrainingPanelLayout);
        TrainingPanelLayout.setHorizontalGroup(
            TrainingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrainingPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton3)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        TrainingPanelLayout.setVerticalGroup(
            TrainingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrainingPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton3)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jPanel2.add(TrainingPanel, "card4");

        ExpPanel.setBackground(new java.awt.Color(0, 0, 153));

        jButton4.setText("Exp");

        javax.swing.GroupLayout ExpPanelLayout = new javax.swing.GroupLayout(ExpPanel);
        ExpPanel.setLayout(ExpPanelLayout);
        ExpPanelLayout.setHorizontalGroup(
            ExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExpPanelLayout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(250, 250, 250))
        );
        ExpPanelLayout.setVerticalGroup(
            ExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButton4)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jPanel2.add(ExpPanel, "card5");

        XExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        XExit.setForeground(new java.awt.Color(255, 255, 255));
        XExit.setText("X");
        XExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XExitMouseClicked(evt);
            }
        });

        PersonalLbl.setForeground(new java.awt.Color(240, 240, 240));
        PersonalLbl.setText("Personal");
        PersonalLbl.setToolTipText("");
        PersonalLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonalLblMouseClicked(evt);
            }
        });

        AcademicLbl.setForeground(new java.awt.Color(240, 240, 240));
        AcademicLbl.setText("Academic");
        AcademicLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcademicLblMouseClicked(evt);
            }
        });

        TrainingLbl.setForeground(new java.awt.Color(240, 240, 240));
        TrainingLbl.setText("Training");
        TrainingLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrainingLblMouseClicked(evt);
            }
        });

        ExpLbl.setForeground(new java.awt.Color(240, 240, 240));
        ExpLbl.setText("Experience");
        ExpLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExpLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PersonalLbl)
                .addGap(26, 26, 26)
                .addComponent(AcademicLbl)
                .addGap(18, 18, 18)
                .addComponent(TrainingLbl)
                .addGap(18, 18, 18)
                .addComponent(ExpLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(XExit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XExit)
                    .addComponent(PersonalLbl)
                    .addComponent(AcademicLbl)
                    .addComponent(TrainingLbl)
                    .addComponent(ExpLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XExitMouseClicked
        System.exit(0);
    // TODO add your handling code here:
    }//GEN-LAST:event_XExitMouseClicked

    private void PersonalLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonalLblMouseClicked
        // TODO add your handling code here:
        PersonalPanel.show();
        AcademicPanel.hide();
        TrainingPanel.hide();
        ExpPanel.hide();
    }//GEN-LAST:event_PersonalLblMouseClicked

    private void AcademicLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcademicLblMouseClicked
        // TODO add your handling code here:
        PersonalPanel.hide();
        AcademicPanel.show();
        TrainingPanel.hide();
        ExpPanel.hide();
    }//GEN-LAST:event_AcademicLblMouseClicked

    private void TrainingLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainingLblMouseClicked
        // TODO add your handling code here:
        PersonalPanel.hide();
        AcademicPanel.hide();
        TrainingPanel.show();
        ExpPanel.hide();
    }//GEN-LAST:event_TrainingLblMouseClicked

    private void ExpLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpLblMouseClicked
        // TODO add your handling code here:
        PersonalPanel.hide();
        AcademicPanel.hide();
        TrainingPanel.hide();
        ExpPanel.show();
    }//GEN-LAST:event_ExpLblMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CvMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CvMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CvMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CvMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CvMe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcademicLbl;
    private javax.swing.JPanel AcademicPanel;
    private javax.swing.JLabel ExpLbl;
    private javax.swing.JPanel ExpPanel;
    private javax.swing.JLabel PersonalLbl;
    private javax.swing.JPanel PersonalPanel;
    private javax.swing.JLabel TrainingLbl;
    private javax.swing.JPanel TrainingPanel;
    private javax.swing.JLabel XExit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
