package br.com.estatistica.view;

import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import br.com.estatistica.controller.TabelaContinua;
import java.awt.BorderLayout;
import java.util.List;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author Felipe Sartori
 */
public class TabelaContinuaGUI extends javax.swing.JFrame {
    TabelaContinua tabela;
    
    DistGUI DistG;
    
    public TabelaContinuaGUI() {
        initComponents();
        URL iconURL = getClass().getResource("/br/com/estatistica/img/chart_bar.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        
        DistG = new DistGUI();
        chartContinua.removeAll();
        chartContinua.revalidate();
        chartContinua.setVisible(false);
    }
    
    public void setTabela(TabelaContinua tabela){
        this.tabela = tabela;
        
    }
    
    public void setGrafico(ChartPanel grafico){
        chartContinua.setLayout(new java.awt.BorderLayout());
        chartContinua.add(grafico, BorderLayout.CENTER);
        chartContinua.validate();
        
    }
    
    public void geraDados(){
        txtMedia_Continua.setText(Double.toString(tabela.getMedia()));
        txtMediana_Continua.setText(Double.toString(tabela.getMediana()));
        txtModa_Continua.setText((((tabela.getModa()).toString()).replace("[", "")).replace("]", ""));
        txtCoefVariacao_Continua.setText(Double.toString(tabela.getCoeficienteVariacao()));
        txtVariancia_Continua.setText(Double.toString(tabela.getVariancia()));
        txtDesvioPadrao_Continua.setText(Double.toString(tabela.getDesvioPadrao()));
    }
    
    public void addLinhas(List lista1, List lista2, List lista3, List lista4, List lista5, List lista6, List lista7, List lista8, List lista9){
        
        DefaultTableModel model = (DefaultTableModel) TabelaContinua.getModel();
        
        for(int count = 0; count < lista2.size(); count++){
            ArrayList<Object> listas = new ArrayList<>();
            listas.add(lista1.get(count));
            listas.add(lista2.get(count));
            listas.add(lista3.get(count));
            listas.add(lista4.get(count));
            listas.add(lista5.get(count) + " %");
            listas.add(lista6.get(count) + " %");
            listas.add(lista7.get(count));
            listas.add(lista8.get(count));
            listas.add(lista9.get(count));
            Object[] linha = listas.toArray();
            model.addRow(linha);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaContinua = new javax.swing.JTable();
        chartPanel = new javax.swing.JPanel();
        chartContinua = new javax.swing.JLabel();
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

        TabelaContinua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TabelaContinua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Classes", "Períodos", "fi", "F", "Fr%", "F%", "xi", "xi.fi", "(xi-X)².fi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaContinua.setToolTipText("Tabela Contínua");
        TabelaContinua.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaContinua.setGridColor(new java.awt.Color(153, 153, 153));
        TabelaContinua.setSelectionBackground(new java.awt.Color(153, 255, 153));
        TabelaContinua.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TabelaContinua.setShowHorizontalLines(true);
        TabelaContinua.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TabelaContinua);

        chartPanel.setBackground(new java.awt.Color(153, 153, 153));
        chartPanel.setName("chartPanel"); // NOI18N

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chartContinua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chartContinua, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        btnGerarGrafico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGerarGrafico.setForeground(new java.awt.Color(0, 0, 0));
        btnGerarGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/chart_column.png"))); // NOI18N
        btnGerarGrafico.setText("Gerar gráfico");
        btnGerarGrafico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGerarGrafico.setIconTextGap(12);
        btnGerarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarGraficoActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
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
                            .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        while (TabelaContinua.getModel().getRowCount() > 0)
            {  
                ((DefaultTableModel) TabelaContinua.getModel()).removeRow(0);  
            } 
        chartContinua.removeAll();
        chartContinua.revalidate();
        chartContinua.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistActionPerformed
        DistG.setVisible(true);
    }//GEN-LAST:event_btnDistActionPerformed

    private void btnGerarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarGraficoActionPerformed
        long i = 0;
        while (i < 999999999)
        {
            i++;
        }
        chartContinua.setVisible(true);
    }//GEN-LAST:event_btnGerarGraficoActionPerformed

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
    private javax.swing.JTable TabelaContinua;
    private javax.swing.JButton btnDist;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGerarGrafico;
    private javax.swing.JLabel chartContinua;
    private javax.swing.JPanel chartPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCoefVariacao_Continua;
    private javax.swing.JTextField txtDesvioPadrao_Continua;
    private javax.swing.JTextField txtMedia_Continua;
    private javax.swing.JTextField txtMediana_Continua;
    private javax.swing.JTextField txtModa_Continua;
    private javax.swing.JTextField txtVariancia_Continua;
    // End of variables declaration//GEN-END:variables
}
