
package br.com.estatistica.view;

import java.util.ArrayList;
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
        ListaDeNumeros = new ArrayList<>(); //LISTA GERAL DOS NUMEROS COM REPETIÇÕES
        ListaDeNumerosXI = new ArrayList<>();//LISTA GERAL DOS NUMEROS SEM REPETIÇÕES
        ListaQtdNumerosFI = new ArrayList<>(); //LISTA COM A FREQUENCIA DE CADA NUMERO DIGITADO
        ListaQtdNumerosFrPerc = new ArrayList<>();//LISTA COM A FREQUENCIA EM PERCENTUAL DE CADA NUMERO DIGITADO
        ListaQtdNumerosF = new ArrayList<>();//LISTA COM F DE CADA NUMERO DIGITADO
        ListaQtdNumerosFPerc = new ArrayList<>();//LISTA COM A F PERCENTUAL DE CADA NUMERO DIGITADO
        TabelaContinuaG = new TabelaContinuaGUI();
        TabelaDiscretaG = new TabelaDiscretaGUI();
        
        //habilitaCampos(true);
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
        TextNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextRecebe = new javax.swing.JTextPane();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Séries Estaíisticas");
        setExtendedState(6);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(600, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 650));

        BtnContinuar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnContinuar.setText("Continuar");
        BtnContinuar.setToolTipText("Inserir número digitado");
        BtnContinuar.setEnabled(false);
        BtnContinuar.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinuarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setText("  Sair");
        btnSair.setToolTipText("Fechar janela");
        btnSair.setPreferredSize(new java.awt.Dimension(51, 30));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        TextNumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextNumero.setToolTipText("Entre os valores do rol 1 a 1 teclando Enter ou clicando em Continuar");
        TextNumero.setEnabled(false);
        TextNumero.setPreferredSize(new java.awt.Dimension(6, 30));
        TextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNumeroActionPerformed(evt);
            }
        });

        TextRecebe.setEditable(false);
        TextRecebe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(TextRecebe);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Rol:");

        BtnGerarFrenquencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnGerarFrenquencia.setText("Gerar Frequência");
        BtnGerarFrenquencia.setEnabled(false);
        BtnGerarFrenquencia.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnGerarFrenquencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarFrenquenciaActionPerformed(evt);
            }
        });

        btnProcessar.setBackground(new java.awt.Color(204, 255, 204));
        btnProcessar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnProcessar.setForeground(new java.awt.Color(0, 102, 0));
        btnProcessar.setText("Processar");
        btnProcessar.setToolTipText("Processar dados e gerar tabela.");
        btnProcessar.setEnabled(false);
        btnProcessar.setPreferredSize(new java.awt.Dimension(51, 30));
        btnProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Digite os valores:");

        LblResult.setBackground(new java.awt.Color(204, 204, 204));
        LblResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblResult.setText("0");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Quantidade:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Tipo de Variável:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Tipo de Coleta:");

        ComboVariavel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComboVariavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Discreta", "Contínua" }));
        ComboVariavel.setToolTipText("Selecione o tipo de variável Discreta ou Contínua");
        ComboVariavel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboVariavelItemStateChanged(evt);
            }
        });
        ComboVariavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboVariavelActionPerformed(evt);
            }
        });

        ComboColeta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComboColeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Amostra", "População" }));
        ComboColeta.setToolTipText("Selecione o tipo de coleta População ou Amostra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ComboVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnGerarFrenquencia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(TextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(213, 213, 213)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(ComboColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                            .addComponent(TextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGerarFrenquencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227))
        );

        setSize(new java.awt.Dimension(616, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
       
        //CHECA SE O NUMERO DIGITADO É MENOR OU IGUAL A 0
        if((Double.parseDouble(TextNumero.getText())) <= 0){
            TextNumero.setText("");
            return;
        }
        else{
            i+= 1;
            LblResult.setText(Integer.toString(i));
        }
        
        //HABILITA BOTÃO ORDENAR
        BtnGerarFrenquencia.setEnabled(true);
        
        //ACRESCENTA NUMERO DIGITADO CASO VALIDO NA LISTA ListaDeNumeros
        ListaDeNumeros.add(Double.parseDouble(TextNumero.getText()));
               
       //ADICIONA AS LISTA NO PAINEL DE TEXTO
       TextRecebe.setText(ListaDeNumeros.toString() + "\n\n" + ListaDeNumerosXI.toString());
       TextNumero.setText("");
       TextNumero.requestFocus();
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void TextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNumeroActionPerformed
        //CHAMA O EVENTO DO BOTÃO CONTINUAR (BtnContinuar)
        BtnContinuarActionPerformed(evt);
    }//GEN-LAST:event_TextNumeroActionPerformed

    private void btnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessarActionPerformed
        if (ComboColeta.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Por favor selecione o tipo de coleta!", "Tipo de Coleta", 2);
        }
        else
        {
            if(ComboVariavel.getSelectedIndex() == 2){
               TabelaContinuaG.setVisible(true);
               //TabelaContinuaG.addLinhas(ListaDeNumeros);
           }
            else if(ComboVariavel.getSelectedIndex()== 1){
               TabelaDiscretaG.setVisible(true);
              // TabelaDiscretaG.addLinhas(ListaDeNumerosXI, ListaQtdNumerosFI, ListaQtdNumerosFrPerc, ListaQtdNumerosF, ListaQtdNumerosFPerc);
           }
        }
    }//GEN-LAST:event_btnProcessarActionPerformed

    private void BtnGerarFrenquenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarFrenquenciaActionPerformed

        TextRecebe.setText(TextRecebe.getText() + "\n\n" + 
        ListaQtdNumerosFI.toString() + "\n\n FR% - " + 
        ListaQtdNumerosFrPerc.toString() + "\n\n F - " +
        ListaQtdNumerosF.toString() + "\n\n F% - " +
        ListaQtdNumerosFPerc.toString());
        btnProcessar.setEnabled(true);
    }//GEN-LAST:event_BtnGerarFrenquenciaActionPerformed

    private void ComboVariavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboVariavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboVariavelActionPerformed

    private void ComboVariavelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboVariavelItemStateChanged
        
        if (ComboVariavel.getSelectedIndex() != 0)
        {
            TextNumero.setEnabled(true);
            BtnContinuar.setEnabled(true);
            BtnGerarFrenquencia.setEnabled(true);
            
        }
    }//GEN-LAST:event_ComboVariavelItemStateChanged

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
    private javax.swing.JTextField TextNumero;
    private javax.swing.JTextPane TextRecebe;
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
    // End of variables declaration//GEN-END:variables

}
