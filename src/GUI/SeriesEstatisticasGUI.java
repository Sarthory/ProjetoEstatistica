
package GUI;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import javax.accessibility.AccessibleRole;
import javax.swing.table.DefaultTableModel;



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
        jButton3 = new javax.swing.JButton();
        BtnConcluir = new javax.swing.JButton();
        TextNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextRecebe = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnGerarFrenquencia = new javax.swing.JButton();
        BtnGerarTabela = new javax.swing.JButton();
        RdDiscreta = new javax.swing.JRadioButton();
        RdContinua = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblResult = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Séries Estaíisticas");
        setExtendedState(6);
        setFocusable(false);
        setResizable(false);

        BtnContinuar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnContinuar.setText("Continuar");
        BtnContinuar.setEnabled(false);
        BtnContinuar.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinuarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("  Sair");
        jButton3.setPreferredSize(new java.awt.Dimension(51, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BtnConcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnConcluir.setText("Concluir");
        BtnConcluir.setEnabled(false);
        BtnConcluir.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConcluirActionPerformed(evt);
            }
        });

        TextNumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("1º ETAPA");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Números digitados:");

        BtnGerarFrenquencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnGerarFrenquencia.setText("Gerar Frequência");
        BtnGerarFrenquencia.setEnabled(false);
        BtnGerarFrenquencia.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnGerarFrenquencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarFrenquenciaActionPerformed(evt);
            }
        });

        BtnGerarTabela.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnGerarTabela.setText("Gerar Tabela");
        BtnGerarTabela.setEnabled(false);
        BtnGerarTabela.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnGerarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarTabelaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RdDiscreta);
        RdDiscreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RdDiscreta.setText("Discreta");
        RdDiscreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdDiscretaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RdContinua);
        RdContinua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RdContinua.setText("Contínua");
        RdContinua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdContinuaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Digite os valores:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("2º ETAPA - Ordenação de dados de entrada");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("3º ETAPA");

        LblResult.setBackground(new java.awt.Color(204, 204, 204));
        LblResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblResult.setText("0");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Quantidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(LblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(BtnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RdDiscreta)
                                .addGap(18, 18, 18)
                                .addComponent(RdContinua))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(BtnGerarFrenquencia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdDiscreta)
                    .addComponent(RdContinua))
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGerarFrenquencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(583, 639));
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
        
        //HABILITA BOTÕES DE GERAR TABEL E ORDENAR
        BtnGerarTabela.setEnabled(true);
        BtnGerarFrenquencia.setEnabled(false);
        
        //ACRESCENTA NUMERO DIGITADO CASO VALIDO NA LISTA ListaDeNumeros
        ListaDeNumeros.add(Double.parseDouble(TextNumero.getText()));
        
        //ORDENA ListaDeNumeros
        Collections.sort(ListaDeNumeros);
        Collections.sort(ListaDeNumerosXI);
        
        /*
        * VERIFICA SE O NUMERO DIGITADO JÁ EXISTE 
        * NA ListaDeNumeros2 E CASO NÃO EXISTA 
        * ACRESCENTA O NUMERO NESTA LISTA
        */
       if(!ListaDeNumerosXI.contains(Double.parseDouble(TextNumero.getText()))){
           ListaDeNumerosXI.add(Double.parseDouble(TextNumero.getText()));
       }
       
       //FUNÇÃO PARA HABILITAR CAMPOS
       habilitaCampos(true);
       
       //ADICIONA AS LISTA NO PAINEL DE TEXTO
       TextRecebe.setText(ListaDeNumeros.toString() + "\n\n" + 
               ListaDeNumerosXI.toString());
       TextNumero.setText("");
       TextNumero.requestFocus();
       
       
       
       
       
                
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //TEM QUE SER SYSTEM.EXIT SENÃO FICA O PROCESSO ATIVO
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConcluirActionPerformed
        
    }//GEN-LAST:event_BtnConcluirActionPerformed

    private void TextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNumeroActionPerformed
        //CHAMA O EVENTO DO BOTÃO CONTINUAR (BtnContinuar)
        BtnContinuarActionPerformed(evt);
    }//GEN-LAST:event_TextNumeroActionPerformed

    private void BtnGerarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarTabelaActionPerformed
        
        
        if(RdContinua.isSelected()){
           TabelaContinuaG.setVisible(true);
           TabelaContinuaG.addLinhas(ListaDeNumeros);
       }
       else{
           TabelaDiscretaG.setVisible(true);
           TabelaDiscretaG.addLinhas(ListaDeNumerosXI, ListaQtdNumerosFI, ListaQtdNumerosFrPerc, ListaQtdNumerosF, ListaQtdNumerosFPerc);
           
       }
        
    }//GEN-LAST:event_BtnGerarTabelaActionPerformed

    private void RdDiscretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdDiscretaActionPerformed
        TextNumero.setEnabled(true);
        TextNumero.requestFocus();
    }//GEN-LAST:event_RdDiscretaActionPerformed

    private void BtnGerarFrenquenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarFrenquenciaActionPerformed
        
        int total = ListaDeNumeros.size();
        
        
        //COMPARA NUMEROS DIGITADOS COM SUA FREQUÊNCIA
        for(int i = 0; i < ListaDeNumerosXI.size(); i++){
           int count = 0;
           for(int j = 0; j < ListaDeNumeros.size(); j++){
               if(ListaDeNumerosXI.get(i).equals(ListaDeNumeros.get(j))){
                   count++;
               }
           }
           
           ListaQtdNumerosFI.add(i, count);
           
       }
        
        //CALCULO DE FR%
        for(int count = 0; count < ListaQtdNumerosFI.size(); count++){
            double fr = Math.round((((double)ListaQtdNumerosFI.get(count))*100)/total);
            ListaQtdNumerosFrPerc.add(count, fr);
        }
        
        //CALCULO DE F
        soma = 0;
        for(int count = 0; count < ListaQtdNumerosFI.size(); count++){
            soma += ListaQtdNumerosFI.get(count);
            ListaQtdNumerosF.add(count, soma);
        }
        
        //CALCULO DE F%
        somaperc = 0;
        for(int count = 0; count < ListaQtdNumerosFrPerc.size(); count++){
            somaperc += ListaQtdNumerosFrPerc.get(count);
            ListaQtdNumerosFPerc.add(count, somaperc);
        }
        
        TextRecebe.setText(TextRecebe.getText() + "\n\n" + 
                ListaQtdNumerosFI.toString() + "\n\n FR% - " + 
                ListaQtdNumerosFrPerc.toString() + "\n\n F - " +
                ListaQtdNumerosF.toString() + "\n\n F% - " +
                ListaQtdNumerosFPerc.toString());
    }//GEN-LAST:event_BtnGerarFrenquenciaActionPerformed

    private void RdContinuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdContinuaActionPerformed
        TextNumero.setEnabled(true);
        TextNumero.requestFocus();
    }//GEN-LAST:event_RdContinuaActionPerformed

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
            java.util.logging.Logger.getLogger(SeriesEstatisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeriesEstatisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeriesEstatisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeriesEstatisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeriesEstatisticasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConcluir;
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JButton BtnGerarFrenquencia;
    private javax.swing.JButton BtnGerarTabela;
    private javax.swing.JLabel LblResult;
    private javax.swing.JRadioButton RdContinua;
    private javax.swing.JRadioButton RdDiscreta;
    private javax.swing.JTextField TextNumero;
    private javax.swing.JTextPane TextRecebe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    final void habilitaCampos (boolean Valor){
        
        TextNumero.setEnabled(Valor);
        BtnContinuar.setEnabled(Valor);
       BtnGerarFrenquencia.setEnabled(Valor);
       BtnConcluir.setEnabled(Valor);
        //BtnGerarTabela.setEnabled(Valor);
               
       
    }


}
