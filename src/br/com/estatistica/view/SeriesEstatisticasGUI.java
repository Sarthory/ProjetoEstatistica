
package br.com.estatistica.view;

import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SeriesEstatisticasGUI extends javax.swing.JFrame {
    
    ArrayList<Double> ListaDeNumeros; //LISTA DE NUMEROS
    ArrayList<Double> ListaDeNumerosXI; //LISTA DE NUMEROS SEM REPETIÇÃO
    ArrayList<Integer> ListaQtdNumerosFI; //LISTA DA FREQUÊNCIA DOS NUMEROS DA ListaDeNumeros
    ArrayList<Double> ListaQtdNumerosFrPerc;//LISTA COM A FREQUENCIA EM PERCENTUAL DE CADA NUMERO DIGITADO
    ArrayList<Integer> ListaQtdNumerosF;//LISTA COM F DE CADA NUMERO DIGITADO
    ArrayList<Double> ListaQtdNumerosFPerc;//LISTA COM A F PERCENTUAL DE CADA NUMERO DIGITADO
    TabelaContinuaGUI TabelaContinuaG;
    TabelaDiscretaGUI TabelaDiscretaG;
    
    int soma = 0;
    double somaperc = 0;
    int i = 0;
    
    public SeriesEstatisticasGUI() {
        initComponents();
        URL iconURL = getClass().getResource("/br/com/estatistica/img/chart_bar.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        ListaDeNumeros = new ArrayList<>(); //LISTA GERAL DOS NUMEROS COM REPETIÇÕES
        ListaDeNumerosXI = new ArrayList<>();//LISTA GERAL DOS NUMEROS SEM REPETIÇÕES
        ListaQtdNumerosFI = new ArrayList<>(); //LISTA COM A FREQUENCIA DE CADA NUMERO DIGITADO
        ListaQtdNumerosFrPerc = new ArrayList<>();//LISTA COM A FREQUENCIA EM PERCENTUAL DE CADA NUMERO DIGITADO
        ListaQtdNumerosF = new ArrayList<>();//LISTA COM F DE CADA NUMERO DIGITADO
        ListaQtdNumerosFPerc = new ArrayList<>();//LISTA COM A F PERCENTUAL DE CADA NUMERO DIGITADO
        TabelaContinuaG = new TabelaContinuaGUI();
       TabelaDiscretaG = new TabelaDiscretaGUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        BtnContinuar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtEntrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSaida = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        BtnGerarFrenquencia = new javax.swing.JButton();
        btnProcessar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LblResult = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ComboVariavel = new javax.swing.JComboBox<>();
        ComboColeta = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Séries Estaíisticas");
        setExtendedState(6);
        setFocusable(false);
        setResizable(false);

        BtnContinuar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnContinuar.setForeground(new java.awt.Color(0, 0, 0));
        BtnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/accept.png"))); // NOI18N
        BtnContinuar.setText("Adicionar");
        BtnContinuar.setToolTipText("Inserir número digitado");
        BtnContinuar.setEnabled(false);
        BtnContinuar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnContinuar.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinuarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/close.png"))); // NOI18N
        btnSair.setText("Fechar");
        btnSair.setToolTipText("Fechar janela");
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair.setPreferredSize(new java.awt.Dimension(51, 30));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtEntrada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntrada.setForeground(new java.awt.Color(0, 0, 0));
        txtEntrada.setToolTipText("Entre os valores do rol 1 a 1 teclando Enter ou clicando em Continuar");
        txtEntrada.setEnabled(false);
        txtEntrada.setPreferredSize(new java.awt.Dimension(6, 30));
        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });

        txtSaida.setEditable(false);
        txtSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(txtSaida);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rol:");

        BtnGerarFrenquencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnGerarFrenquencia.setForeground(new java.awt.Color(0, 0, 0));
        BtnGerarFrenquencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/application.png"))); // NOI18N
        BtnGerarFrenquencia.setText("Gerar Frequência");
        BtnGerarFrenquencia.setToolTipText("Ordenar o rol e gerar as frequências");
        BtnGerarFrenquencia.setEnabled(false);
        BtnGerarFrenquencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnGerarFrenquencia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnGerarFrenquencia.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnGerarFrenquencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarFrenquenciaActionPerformed(evt);
            }
        });

        btnProcessar.setBackground(new java.awt.Color(153, 255, 153));
        btnProcessar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnProcessar.setForeground(new java.awt.Color(0, 102, 0));
        btnProcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/system.png"))); // NOI18N
        btnProcessar.setText("Processar");
        btnProcessar.setToolTipText("Processar dados e gerar tabela.");
        btnProcessar.setEnabled(false);
        btnProcessar.setHideActionText(true);
        btnProcessar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProcessar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProcessar.setPreferredSize(new java.awt.Dimension(51, 30));
        btnProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite os valores:");

        LblResult.setBackground(new java.awt.Color(204, 204, 204));
        LblResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblResult.setForeground(new java.awt.Color(0, 0, 0));
        LblResult.setText("0");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Quantidade:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo de Variável:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo de Coleta:");

        ComboVariavel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComboVariavel.setForeground(new java.awt.Color(0, 0, 0));
        ComboVariavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Discreta", "Contínua" }));
        ComboVariavel.setToolTipText("Selecione o tipo de variável Discreta ou Contínua");
        ComboVariavel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboVariavelItemStateChanged(evt);
            }
        });

        ComboColeta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComboColeta.setForeground(new java.awt.Color(0, 0, 0));
        ComboColeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amostra", "População" }));
        ComboColeta.setToolTipText("Selecione o tipo de coleta População ou Amostra");
        ComboColeta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboColetaItemStateChanged(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/renew.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnGerarFrenquencia, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(213, 213, 213))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ComboColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ComboVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(LblResult))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnGerarFrenquencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227))
        );

        setSize(new java.awt.Dimension(616, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
       
        //CHECA SE O NUMERO DIGITADO É MENOR OU IGUAL A 0
        if((Double.parseDouble(txtEntrada.getText())) <= 0){
            txtEntrada.setText("");
        }
        else{
            i+= 1;
            LblResult.setText(Integer.toString(i));
        }
        
        //HABILITA BOTÃO ORDENAR
        BtnGerarFrenquencia.setEnabled(true);
        
        //ACRESCENTA NUMERO DIGITADO CASO VALIDO NA LISTA ListaDeNumeros
        ListaDeNumeros.add(Double.parseDouble(txtEntrada.getText()));
               
       //ADICIONA AS LISTA NO PAINEL DE TEXTO
       txtSaida.setText(ListaDeNumeros.toString() + "\n\n" + ListaDeNumerosXI.toString());
       txtEntrada.setText("");
       txtEntrada.requestFocus();
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        //CHAMA O EVENTO DO BOTÃO CONTINUAR (BtnContinuar)
        BtnContinuarActionPerformed(evt);
    }//GEN-LAST:event_txtEntradaActionPerformed

    private void btnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessarActionPerformed
        
        if(ComboVariavel.getSelectedIndex() == 2){
           TabelaContinuaG.setVisible(true);
           //TabelaContinuaG.addLinhas(ListaDeNumeros);
       }
        else if(ComboVariavel.getSelectedIndex()== 1){
            TabelaDiscretaG.setVisible(true);
            //TabelaDiscretaG.addLinhas(ListaDeNumerosXI, ListaQtdNumerosFI, ListaQtdNumerosFrPerc, ListaQtdNumerosF, ListaQtdNumerosFPerc);
       }
    }//GEN-LAST:event_btnProcessarActionPerformed

    private void BtnGerarFrenquenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarFrenquenciaActionPerformed

        if (ComboColeta.getSelectedIndex() == 0 || ComboVariavel.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Por favor selecione o tipo de variável e coleta!", "Tipos de Coleta", 2);
        }
        else
        {
        txtSaida.setText(txtSaida.getText() + "\n\n" + 
        ListaQtdNumerosFI.toString() + "\n\n FR% - " + 
        ListaQtdNumerosFrPerc.toString() + "\n\n F - " +
        ListaQtdNumerosF.toString() + "\n\n F% - " +
        ListaQtdNumerosFPerc.toString());
        btnProcessar.setEnabled(true);
        BtnGerarFrenquencia.setEnabled(false);
        btnProcessar.requestFocus();
        }
    }//GEN-LAST:event_BtnGerarFrenquenciaActionPerformed

    private void ComboVariavelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboVariavelItemStateChanged
        
        if (ComboVariavel.getSelectedIndex() != 0)
        {
            txtEntrada.setEnabled(true);
            BtnContinuar.setEnabled(true);
            txtEntrada.requestFocus();
            
        }
    }//GEN-LAST:event_ComboVariavelItemStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        ComboVariavel.setSelectedIndex(0);
        ComboColeta.setSelectedIndex(0);
        txtSaida.setText("");
        LblResult.setText("0");
        i = 0;
        BtnContinuar.setEnabled(false);
        BtnGerarFrenquencia.setEnabled(false);
        btnProcessar.setEnabled(false);
        txtEntrada.setEnabled(false);
        ListaDeNumeros.clear();
        ListaDeNumerosXI.clear();
        ListaQtdNumerosF.clear();
        ListaQtdNumerosFI.clear();
        ListaQtdNumerosFPerc.clear();
        ListaQtdNumerosFrPerc.clear();        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void ComboColetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboColetaItemStateChanged
        if (ComboColeta.getSelectedIndex() != 0)
        {
            txtEntrada.requestFocus();
        }
    }//GEN-LAST:event_ComboColetaItemStateChanged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeriesEstatisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeriesEstatisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeriesEstatisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeriesEstatisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeriesEstatisticasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JButton BtnGerarFrenquencia;
    private javax.swing.JComboBox<String> ComboColeta;
    private javax.swing.JComboBox<String> ComboVariavel;
    private javax.swing.JLabel LblResult;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnProcessar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextPane txtSaida;
    // End of variables declaration//GEN-END:variables

}
