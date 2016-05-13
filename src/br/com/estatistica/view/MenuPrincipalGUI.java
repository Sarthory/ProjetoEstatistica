
package br.com.estatistica.view;



public class MenuPrincipalGUI extends javax.swing.JFrame {
    
    SeriesEstatisticasGUI SeriesEstatisticasG;
    TecnicasAmostragemGUI TecnicasAmostragemG;
    TelaMedidasDeDispersaoDiscretaGUI TelaMedidasDeDispersaoDiscretaG;
    TelaMedidasDeDispersaoContinuaGUI TelaMedidasDeDispersaoContinuaG;
    
    public MenuPrincipalGUI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        SeriesEstatisticasG = new SeriesEstatisticasGUI();
        TecnicasAmostragemG  = new TecnicasAmostragemGUI();
        TelaMedidasDeDispersaoContinuaG= new TelaMedidasDeDispersaoContinuaGUI();
        TelaMedidasDeDispersaoDiscretaG = new TelaMedidasDeDispersaoDiscretaGUI();
        
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnTAmostragem = new javax.swing.JButton();
        btnSEstatisticas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnMedidasDispersaoDiscreta = new javax.swing.JButton();
        btnMedidasDispersaoContinua = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Estatística");
        setName("MenuPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        BtnTAmostragem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnTAmostragem.setText("Técnicas de Amostragem");
        BtnTAmostragem.setPreferredSize(new java.awt.Dimension(150, 50));
        BtnTAmostragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTAmostragemActionPerformed(evt);
            }
        });

        btnSEstatisticas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSEstatisticas.setText("Séries Estatisticas");
        btnSEstatisticas.setPreferredSize(new java.awt.Dimension(150, 50));
        btnSEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEstatisticasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Desenvolvido em Java Swing -  Aplicando conceitos de estatística");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Leonardo Moreira Balduino");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Helder Souza Cruvinel");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Felipe Sartori");

        btnMedidasDispersaoDiscreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMedidasDispersaoDiscreta.setText("Medidas de Dispersão ( D )");
        btnMedidasDispersaoDiscreta.setPreferredSize(new java.awt.Dimension(150, 50));
        btnMedidasDispersaoDiscreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedidasDispersaoDiscretaActionPerformed(evt);
            }
        });

        btnMedidasDispersaoContinua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMedidasDispersaoContinua.setText("Medidas de Dispersão ( C )");
        btnMedidasDispersaoContinua.setPreferredSize(new java.awt.Dimension(150, 50));
        btnMedidasDispersaoContinua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedidasDispersaoContinuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMedidasDispersaoDiscreta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMedidasDispersaoContinua, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnTAmostragem, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnTAmostragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMedidasDispersaoContinua, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnMedidasDispersaoDiscreta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        BtnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSair.setText("     Sair");
        BtnSair.setPreferredSize(new java.awt.Dimension(150, 50));
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(324, 324, 324)
                .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSairActionPerformed

    private void btnMedidasDispersaoContinuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedidasDispersaoContinuaActionPerformed
        TelaMedidasDeDispersaoContinuaG.setVisible(true);
    }//GEN-LAST:event_btnMedidasDispersaoContinuaActionPerformed

    private void btnMedidasDispersaoDiscretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedidasDispersaoDiscretaActionPerformed
        TelaMedidasDeDispersaoDiscretaG.setVisible(true);
    }//GEN-LAST:event_btnMedidasDispersaoDiscretaActionPerformed

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
            public void run() {
                new MenuPrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnTAmostragem;
    private javax.swing.JButton btnMedidasDispersaoContinua;
    private javax.swing.JButton btnMedidasDispersaoDiscreta;
    private javax.swing.JButton btnSEstatisticas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
