package br.com.estatistica.view;

import br.com.estatistica.controller.TabelaDiscreta;
import java.awt.BorderLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author Felipe Sartori
 */
public class TabelaDiscretaGUI extends javax.swing.JFrame {
    TabelaDiscreta tabela;

    DistGUI DistG;
    
    public TabelaDiscretaGUI() {
        initComponents();
        URL iconURL = getClass().getResource("/br/com/estatistica/img/chart_bar.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        
        DistG = new DistGUI();
    }
    
    public void geraDados(){
        txtMedia_Discreta.setText(Double.toString(tabela.getMedia()));
        txtMediana_Discreta.setText(Double.toString(tabela.getMediana()));
        txtModa_Discreta.setText((((tabela.getModa()).toString()).replace("[", "")).replace("]", ""));
        txtCoefVariacao_Discreta.setText(Double.toString(tabela.getCoeficienteVariacao()));
        txtVariancia_Discreta.setText(Double.toString(tabela.getVariancia()));
        txtDesvioPadrao_Discreta.setText(Double.toString(tabela.getDesvioPadrao()));
    }
    public void setGrafico(ChartPanel grafico){
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel4.add(grafico, BorderLayout.CENTER);
        jPanel4.validate();
        
    }
    
    public void setTabela(TabelaDiscreta tabela){
        this.tabela = tabela;
    }
    public void addLinhas(List lista1, List lista2, List lista3, List lista4, List lista5, List lista6, List lista7){
        
        DefaultTableModel model = (DefaultTableModel) TabelaDiscreta.getModel();
        
        for(int count = 0; count < lista2.size(); count++){
            ArrayList<Object> listas = new ArrayList<>();
            listas.add(lista1.get(count));
            listas.add(lista2.get(count));
            listas.add(lista3.get(count));
            listas.add(lista4.get(count) + "%");
            listas.add(lista5.get(count) + "%");
            listas.add(lista6.get(count));
            listas.add(lista7.get(count));
            Object[] linha = listas.toArray();
            model.addRow(linha);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDiscreta = new javax.swing.JTable();
        txtModa_Discreta = new javax.swing.JTextField();
        txtMedia_Discreta = new javax.swing.JTextField();
        txtMediana_Discreta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCoefVariacao_Discreta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGerarGrafico = new javax.swing.JButton();
        txtVariancia_Discreta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDesvioPadrao_Discreta = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnDist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela - Variável Quantitativa Discreta");
        setResizable(false);

        TabelaDiscreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TabelaDiscreta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "xi", "fi", "F", "Fr%", "F%", "xi.fi", "(xi-X)².fi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDiscreta.setToolTipText("Tabela Discreta");
        TabelaDiscreta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaDiscreta.setGridColor(new java.awt.Color(153, 153, 153));
        TabelaDiscreta.setSelectionBackground(new java.awt.Color(153, 255, 153));
        TabelaDiscreta.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TabelaDiscreta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaDiscreta.setShowHorizontalLines(true);
        TabelaDiscreta.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TabelaDiscreta);

        txtModa_Discreta.setEditable(false);
        txtModa_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtModa_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        txtMedia_Discreta.setEditable(false);
        txtMedia_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMedia_Discreta.setForeground(new java.awt.Color(0, 0, 0));
        txtMedia_Discreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedia_DiscretaActionPerformed(evt);
            }
        });

        txtMediana_Discreta.setEditable(false);
        txtMediana_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMediana_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CV");

        txtCoefVariacao_Discreta.setEditable(false);
        txtCoefVariacao_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCoefVariacao_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Variância");

        btnGerarGrafico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGerarGrafico.setForeground(new java.awt.Color(0, 0, 0));
        btnGerarGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/chart_column.png"))); // NOI18N
        btnGerarGrafico.setText("Gerar gráfico");
        btnGerarGrafico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGerarGrafico.setIconTextGap(12);

        txtVariancia_Discreta.setEditable(false);
        txtVariancia_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtVariancia_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Média");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DP");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Moda");

        txtDesvioPadrao_Discreta.setEditable(false);
        txtDesvioPadrao_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDesvioPadrao_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setName("jPanel4"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mediana");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tendência Central");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dispersão");

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
                                    .addComponent(txtVariancia_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtModa_Discreta)
                                        .addComponent(txtMedia_Discreta)
                                        .addComponent(txtMediana_Discreta)
                                        .addComponent(txtCoefVariacao_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDesvioPadrao_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel9))
                            .addComponent(btnGerarGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMedia_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModa_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMediana_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCoefVariacao_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVariancia_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesvioPadrao_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerarGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDist, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        while (TabelaDiscreta.getModel().getRowCount() > 0)
            {  
                ((DefaultTableModel) TabelaDiscreta.getModel()).removeRow(0);  
            } 
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistActionPerformed
        DistG.setVisible(true);
    }//GEN-LAST:event_btnDistActionPerformed

    private void txtMedia_DiscretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedia_DiscretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedia_DiscretaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TabelaDiscretaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaDiscretaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaDiscretaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaDiscretaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaDiscretaGUI().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCoefVariacao_Discreta;
    private javax.swing.JTextField txtDesvioPadrao_Discreta;
    private javax.swing.JTextField txtMedia_Discreta;
    private javax.swing.JTextField txtMediana_Discreta;
    private javax.swing.JTextField txtModa_Discreta;
    private javax.swing.JTextField txtVariancia_Discreta;
    // End of variables declaration//GEN-END:variables
}
