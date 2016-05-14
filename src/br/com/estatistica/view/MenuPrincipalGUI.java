
package br.com.estatistica.view;

import java.net.URL;
import javax.swing.ImageIcon;

public class MenuPrincipalGUI extends javax.swing.JFrame {
    AboutGUI AboutG;
    SeriesEstatisticasGUI SeriesEstatisticasG;
    TecnicasAmostragemGUI TecnicasAmostragemG;
    
    public MenuPrincipalGUI() {
        initComponents();
        URL iconURL = getClass().getResource("/br/com/estatistica/img/chart_bar.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        setExtendedState(MAXIMIZED_BOTH);
        AboutG = new AboutGUI();
        SeriesEstatisticasG = new SeriesEstatisticasGUI();
        TecnicasAmostragemG  = new TecnicasAmostragemGUI();
        
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSobre = new javax.swing.JButton();
        btnSEstatisticas = new javax.swing.JButton();
        BtnTAmostragem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Estatística");
        setBackground(new java.awt.Color(153, 153, 153));
        setName("MenuPrincipal"); // NOI18N
        setSize(new java.awt.Dimension(1024, 768));

        BtnSair.setBackground(new java.awt.Color(255, 102, 102));
        BtnSair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnSair.setForeground(new java.awt.Color(0, 0, 0));
        BtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/turn off.png"))); // NOI18N
        BtnSair.setText("     Sair");
        BtnSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnSair.setIconTextGap(8);
        BtnSair.setPreferredSize(new java.awt.Dimension(150, 50));
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        btnSobre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSobre.setForeground(new java.awt.Color(0, 0, 0));
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/information.png"))); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnSEstatisticas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSEstatisticas.setForeground(new java.awt.Color(0, 0, 0));
        btnSEstatisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/article.png"))); // NOI18N
        btnSEstatisticas.setText("Séries Estatisticas");
        btnSEstatisticas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSEstatisticas.setIconTextGap(20);
        btnSEstatisticas.setPreferredSize(new java.awt.Dimension(150, 50));
        btnSEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEstatisticasActionPerformed(evt);
            }
        });

        BtnTAmostragem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnTAmostragem.setForeground(new java.awt.Color(0, 0, 0));
        BtnTAmostragem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/article.png"))); // NOI18N
        BtnTAmostragem.setText("Técnicas de Amostragem");
        BtnTAmostragem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnTAmostragem.setPreferredSize(new java.awt.Dimension(150, 50));
        BtnTAmostragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTAmostragemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSobre)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(BtnTAmostragem, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnSEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTAmostragem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnSobre)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSairActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        AboutG.setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnSEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEstatisticasActionPerformed
        SeriesEstatisticasG.setVisible(true);
    }//GEN-LAST:event_btnSEstatisticasActionPerformed

    private void BtnTAmostragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTAmostragemActionPerformed
        TecnicasAmostragemG.setVisible(true);
    }//GEN-LAST:event_BtnTAmostragemActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnTAmostragem;
    private javax.swing.JButton btnSEstatisticas;
    private javax.swing.JButton btnSobre;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
