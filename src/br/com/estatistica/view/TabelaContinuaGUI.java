package br.com.estatistica.view;

import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Sartori
 */
public class TabelaContinuaGUI extends javax.swing.JFrame {

    DistGUI DistG;
    
    public TabelaContinuaGUI() {
        initComponents();
        URL iconURL = getClass().getResource("/br/com/estatistica/img/chart_bar.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        
        DistG = new DistGUI();
    }
    
    public void addLinhas(ArrayList lista1, ArrayList lista2, ArrayList lista3, ArrayList lista4, ArrayList lista5){
        
        DefaultTableModel model = (DefaultTableModel) TabelaDiscreta.getModel();
        
        for(int count = 0; count < lista2.size(); count++){
            ArrayList<Object> listas = new ArrayList<>();
            listas.add(lista1.get(count));
            listas.add(lista2.get(count));
            listas.add(lista3.get(count));
            listas.add(lista4.get(count));
            listas.add(lista5.get(count));
            Object[] linha = listas.toArray();
            model.addRow(linha);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDiscreta = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnGerarGrafico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMedia_Continua = new javax.swing.JTextField();
        txtModa_Continua = new javax.swing.JTextField();
        txtMediana_Continua = new javax.swing.JTextField();
        txtCoefVariacao_Continua = new javax.swing.JTextField();
        txtVariancia_Continua = new javax.swing.JTextField();
        txtDesvioPadrao_Continua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnDist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela - Variável Quantitativa Contínua");
        setResizable(false);

        btnFechar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(0, 0, 0));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/close.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFechar.setPreferredSize(new java.awt.Dimension(51, 30));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        TabelaDiscreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TabelaDiscreta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Classes", "Intervalos", "xi", "fi", "F", "Fr%", "F%", "xi.fi", "Variância"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDiscreta.setToolTipText("");
        jScrollPane1.setViewportView(TabelaDiscreta);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Gráfico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(266, 266, 266))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(156, 156, 156))
        );

        btnGerarGrafico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGerarGrafico.setForeground(new java.awt.Color(0, 0, 0));
        btnGerarGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/chart_column.png"))); // NOI18N
        btnGerarGrafico.setText("Gerar gráfico");
        btnGerarGrafico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGerarGrafico.setIconTextGap(12);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Média");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Moda");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mediana");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CV");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Variância");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DP");

        txtMedia_Continua.setEditable(false);
        txtMedia_Continua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMedia_Continua.setForeground(new java.awt.Color(0, 0, 0));

        txtModa_Continua.setEditable(false);
        txtModa_Continua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtModa_Continua.setForeground(new java.awt.Color(0, 0, 0));

        txtMediana_Continua.setEditable(false);
        txtMediana_Continua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMediana_Continua.setForeground(new java.awt.Color(0, 0, 0));

        txtCoefVariacao_Continua.setEditable(false);
        txtCoefVariacao_Continua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCoefVariacao_Continua.setForeground(new java.awt.Color(0, 0, 0));

        txtVariancia_Continua.setEditable(false);
        txtVariancia_Continua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtVariancia_Continua.setForeground(new java.awt.Color(0, 0, 0));

        txtDesvioPadrao_Continua.setEditable(false);
        txtDesvioPadrao_Continua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDesvioPadrao_Continua.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tendência Central");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dispersão");

        btnDist.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDist.setForeground(new java.awt.Color(0, 0, 0));
        btnDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/switch.png"))); // NOI18N
        btnDist.setText("Distribuições");
        btnDist.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDist.setIconTextGap(12);
        btnDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVariancia_Continua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtModa_Continua, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(txtMedia_Continua)
                                        .addComponent(txtMediana_Continua)
                                        .addComponent(txtCoefVariacao_Continua))
                                    .addComponent(txtDesvioPadrao_Continua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnGerarGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMedia_Continua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModa_Continua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMediana_Continua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCoefVariacao_Continua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVariancia_Continua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesvioPadrao_Continua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGerarGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnDist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistActionPerformed
        DistG.setVisible(true);
    }//GEN-LAST:event_btnDistActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TabelaContinuaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaContinuaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaContinuaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaContinuaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaContinuaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDiscreta;
    private javax.swing.JButton btnDist;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGerarGrafico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCoefVariacao_Continua;
    private javax.swing.JTextField txtDesvioPadrao_Continua;
    private javax.swing.JTextField txtMedia_Continua;
    private javax.swing.JTextField txtMediana_Continua;
    private javax.swing.JTextField txtModa_Continua;
    private javax.swing.JTextField txtVariancia_Continua;
    // End of variables declaration//GEN-END:variables
}
