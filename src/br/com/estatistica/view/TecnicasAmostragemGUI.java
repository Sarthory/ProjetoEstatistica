
package br.com.estatistica.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import br.com.estatistica.util.LimiteDigitos;

public class TecnicasAmostragemGUI extends javax.swing.JFrame {

    ArrayList<Integer> aleatSimples = new ArrayList<>();

    int QtdPopulacao = 0;
    int QtdAmostra = 0;
    int NumeroInicial = 0;
    int estrat = 0;


    public TecnicasAmostragemGUI() {
       initComponents();
       URL iconURL = getClass().getResource("/br/com/estatistica/img/chart_bar.png");
       ImageIcon icon = new ImageIcon(iconURL);
       this.setIconImage(icon.getImage());
       limitaDigitos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        CbTAmostragem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        BtnCalcular = new javax.swing.JButton();
        txtQuantAmostra = new javax.swing.JTextField();
        LblQtdAmostra = new javax.swing.JLabel();
        txtQuantPopulacao = new javax.swing.JTextField();
        LblQtdPopulacao = new javax.swing.JLabel();
        LblQtdEstratos = new javax.swing.JLabel();
        txtQuantEstratos = new javax.swing.JTextField();
        txtNumInicial = new javax.swing.JTextField();
        LblNumeroInicial = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Técnicas de Amostragem");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 650));

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/close.png"))); // NOI18N
        jButton3.setText("Fechar");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setPreferredSize(new java.awt.Dimension(51, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CbTAmostragem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CbTAmostragem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Aleatória Simples", "Estratificada Proporcional", "Estratificada Uniforme", "Sistemática" }));
        CbTAmostragem.setPreferredSize(new java.awt.Dimension(56, 30));
        CbTAmostragem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTAmostragemItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Resultado:");

        BtnCalcular.setBackground(new java.awt.Color(153, 255, 153));
        BtnCalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCalcular.setForeground(new java.awt.Color(0, 102, 0));
        BtnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/OK.png"))); // NOI18N
        BtnCalcular.setText("Calcular");
        BtnCalcular.setEnabled(false);
        BtnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnCalcular.setIconTextGap(20);
        BtnCalcular.setPreferredSize(new java.awt.Dimension(51, 30));
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        txtQuantAmostra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtQuantAmostra.setToolTipText("se refere a quantidade  de uma parcela de um todo");
        txtQuantAmostra.setEnabled(false);
        txtQuantAmostra.setPreferredSize(new java.awt.Dimension(6, 30));

        LblQtdAmostra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblQtdAmostra.setForeground(new java.awt.Color(0, 0, 0));
        LblQtdAmostra.setText("Quantidade da Amostra:");
        LblQtdAmostra.setEnabled(false);

        txtQuantPopulacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtQuantPopulacao.setToolTipText("Se refere a quantidade  total e não a uma parcela");
        txtQuantPopulacao.setEnabled(false);
        txtQuantPopulacao.setPreferredSize(new java.awt.Dimension(6, 30));

        LblQtdPopulacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblQtdPopulacao.setForeground(new java.awt.Color(0, 0, 0));
        LblQtdPopulacao.setText("Quantidade da População:");
        LblQtdPopulacao.setEnabled(false);

        LblQtdEstratos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblQtdEstratos.setForeground(new java.awt.Color(0, 0, 0));
        LblQtdEstratos.setText("Quantidade de Estratos:");
        LblQtdEstratos.setEnabled(false);

        txtQuantEstratos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtQuantEstratos.setToolTipText("Se refere a quantidade  total e não a uma parcela");
        txtQuantEstratos.setEnabled(false);
        txtQuantEstratos.setPreferredSize(new java.awt.Dimension(6, 30));

        txtNumInicial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNumInicial.setToolTipText("Se refere a quantidade  total e não a uma parcela");
        txtNumInicial.setEnabled(false);
        txtNumInicial.setPreferredSize(new java.awt.Dimension(6, 30));

        LblNumeroInicial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblNumeroInicial.setForeground(new java.awt.Color(0, 0, 0));
        LblNumeroInicial.setText("Número inicial:");
        LblNumeroInicial.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Escolha o tipo de Amostragem:");

        txtResultados.setEditable(false);
        txtResultados.setColumns(20);
        txtResultados.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtResultados.setLineWrap(true);
        txtResultados.setRows(5);
        jScrollPane1.setViewportView(txtResultados);

        btnLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/renew.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpar.setPreferredSize(new java.awt.Dimension(51, 30));
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblNumeroInicial)
                    .addComponent(LblQtdEstratos)
                    .addComponent(LblQtdAmostra)
                    .addComponent(LblQtdPopulacao)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantEstratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantPopulacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantAmostra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CbTAmostragem, 0, 250, Short.MAX_VALUE)
                    .addComponent(txtNumInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addGap(445, 445, 445)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CbTAmostragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblQtdAmostra)
                        .addGap(5, 5, 5)
                        .addComponent(txtQuantAmostra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblQtdPopulacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantPopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblQtdEstratos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantEstratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblNumeroInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        if (CbTAmostragem.getSelectedIndex()== 1)
        {
            aleatoriaSimples();
        }
        if (CbTAmostragem.getSelectedIndex()== 2)
        {
            estratificadaProporcional();
        }
        if (CbTAmostragem.getSelectedIndex()== 3)
        {
            estratificadaUniforme();
        }
        if (CbTAmostragem.getSelectedIndex()== 4)
        {
            sistematica();
        }
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void CbTAmostragemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTAmostragemItemStateChanged

         if(CbTAmostragem.getSelectedIndex()== 0){

          // desabilita
          txtQuantAmostra.setEnabled(false);
          txtQuantPopulacao.setEnabled(false);
          LblQtdAmostra.setEnabled(false);
          LblQtdPopulacao.setEnabled(false);
          txtQuantEstratos.setEnabled(false);
          LblQtdEstratos.setEnabled(false);
          txtNumInicial.setEnabled(false);
          LblNumeroInicial.setEnabled(false);
          BtnCalcular.setEnabled(false);
        }

        if(CbTAmostragem.getSelectedIndex()== 1){

          // habilita
          txtQuantAmostra.setEnabled(true);
          txtQuantPopulacao.setEnabled(true);
          LblQtdAmostra.setEnabled(true);
          LblQtdPopulacao.setEnabled(true);
          txtQuantAmostra.requestFocus();
          BtnCalcular.setEnabled(true);

          // desabilita
          txtQuantEstratos.setEnabled(false);
          LblQtdEstratos.setEnabled(false);
          txtNumInicial.setEnabled(false);
          LblNumeroInicial.setEnabled(false);
        }

        if(CbTAmostragem.getSelectedIndex()== 2){
         // habilita
          txtQuantAmostra.setEnabled(true);
          txtQuantPopulacao.setEnabled(true);
          txtQuantEstratos.setEnabled(true);
          LblQtdAmostra.setEnabled(true);
          LblQtdPopulacao.setEnabled(true);
          LblQtdEstratos.setEnabled(true);
          txtQuantAmostra.requestFocus();
          BtnCalcular.setEnabled(true);

           // desabilita

          txtNumInicial.setEnabled(false);
          LblNumeroInicial.setEnabled(false);

        }
        if(CbTAmostragem.getSelectedIndex()== 3){
          txtQuantAmostra.setEnabled(true);
          txtQuantEstratos.setEnabled(true);
          LblQtdAmostra.setEnabled(true);
          LblQtdEstratos.setEnabled(true);
          txtQuantAmostra.requestFocus();
          BtnCalcular.setEnabled(true);

           // desabilita
          txtQuantPopulacao.setEnabled(false);
          LblQtdPopulacao.setEnabled(false);
          txtNumInicial.setEnabled(false);
          LblNumeroInicial.setEnabled(false);
        }


         if(CbTAmostragem.getSelectedIndex()== 4){
          //habilita
          txtQuantAmostra.setEnabled(true);
          txtQuantPopulacao.setEnabled(true);
          txtNumInicial.setEnabled(true);
          LblQtdAmostra.setEnabled(true);
          LblQtdPopulacao.setEnabled(true);
          LblNumeroInicial.setEnabled(true);
          txtQuantAmostra.requestFocus();
          BtnCalcular.setEnabled(true);

           // desabilita
          txtQuantEstratos.setEnabled(false);
          LblQtdEstratos.setEnabled(false);



        }

    }//GEN-LAST:event_CbTAmostragemItemStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtResultados.setText("");
        txtQuantAmostra.setText("");
        txtQuantPopulacao.setText("");
        txtQuantEstratos.setText("");
        txtNumInicial.setText("");
        CbTAmostragem.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TecnicasAmostragemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TecnicasAmostragemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TecnicasAmostragemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TecnicasAmostragemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecnicasAmostragemGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JComboBox CbTAmostragem;
    private javax.swing.JLabel LblNumeroInicial;
    private javax.swing.JLabel LblQtdAmostra;
    private javax.swing.JLabel LblQtdEstratos;
    private javax.swing.JLabel LblQtdPopulacao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumInicial;
    private javax.swing.JTextField txtQuantAmostra;
    private javax.swing.JTextField txtQuantEstratos;
    private javax.swing.JTextField txtQuantPopulacao;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables

    public void aleatoriaSimples()
    {
        txtResultados.setText("");
        aleatSimples.clear();

        NumeroInicial = Integer.parseInt(txtQuantAmostra.getText());
        QtdPopulacao = Integer.parseInt(txtQuantPopulacao.getText());

        Random rand = new Random();

        for (int i = 0; i < NumeroInicial; i++)
        {
            int r = rand.nextInt(QtdPopulacao);
            aleatSimples.add(r+1);
        }

        txtResultados.setText(aleatSimples.toString());
    }

    public void estratificadaProporcional()
    {
       txtResultados.setText("");

       int i, x;
       float calcPorcent;
       int dividir;

       String quantEstrato;

       String amos = txtQuantAmostra.getText();
       String estrato = txtQuantEstratos.getText();
       String popul = txtQuantPopulacao.getText();

       float amostFloat = Float.parseFloat(amos);
       float estratFloat = Float.parseFloat(estrato);
       float populFloat = Float.parseFloat(popul);

       int estratosProporcional[] = new int [(int)estratFloat+1];
       int porcentagemPesquisar[] = new int [(int)estratFloat+1];

       float calc = (amostFloat / populFloat) * 100;

       String quantCalculada = Float.toString(calc);

       for (i = 1; i < estratFloat+1; i++)
       {
           quantEstrato = JOptionPane.showInputDialog(null, "Qual a quantidade de itens do " + i + "º estrato?" , "QUANTIDADE DO " + i + "º ESTRATO", JOptionPane.PLAIN_MESSAGE);

           estratosProporcional[i] = Integer.parseInt(quantEstrato);

           txtResultados.setText(txtResultados.getText() + i +  "º Estrato: " + Integer.toString(estratosProporcional[i]) + " itens de pesquisa.\n");
       }

       for (x = 1; x < estratFloat+1; x++)
       {
           dividir = estratosProporcional[x];
           calcPorcent = dividir / calc;
           porcentagemPesquisar[x] = (int)calcPorcent;

           txtResultados.setText(txtResultados.getText() + "\n O " + x +  "º Estrato deverá ter: " + (porcentagemPesquisar[x]) + " itens de pesquisa.");
       }
    }

    public void estratificadaUniforme()
    {
        txtResultados.setText("");

        QtdAmostra = Integer.parseInt(txtQuantAmostra.getText());
        estrat = Integer.parseInt(txtQuantEstratos.getText());

        int result = QtdAmostra / estrat;

        txtResultados.setText(result + " itens de pesquisa por estrato.");
    }

    public void sistematica()
    {
       txtResultados.setText("");
       int i;

       String amos = txtQuantAmostra.getText();
       String popul = txtQuantPopulacao.getText();
       String numInic = txtNumInicial.getText();

       float amostFloat = Float.parseFloat(amos);
       float populFloat = Float.parseFloat(popul);
       float numInicFloat = Float.parseFloat(numInic);
       
       float indice = (populFloat / amostFloat);
       
       int caso = (int)numInicFloat;
       
       txtResultados.setText(Float.toString(numInicFloat));
       
       for (i = 0; i < amostFloat; i++)
       {
           caso += (int)indice;
           
           if (caso < populFloat)
           {
               txtResultados.setText(txtResultados.getText() + ", " + caso);
           }
       }
    }
    
    private void limitaDigitos()
    {
        txtNumInicial.setDocument(new LimiteDigitos(30));
        txtQuantAmostra.setDocument(new LimiteDigitos(30));
        txtQuantEstratos.setDocument(new LimiteDigitos(30));
        txtQuantPopulacao.setDocument(new LimiteDigitos(30));
    }
}
