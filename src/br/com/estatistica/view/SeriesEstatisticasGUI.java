
package br.com.estatistica.view;

import br.com.estatistica.controller.TabelaContinua;
import br.com.estatistica.controller.TabelaDiscreta;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import br.com.estatistica.util.LimiteDigitos;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class SeriesEstatisticasGUI extends javax.swing.JFrame {
    
    ArrayList<Double> ListaDeNumeros; //LISTA DE NUMEROS
    ArrayList<Double> ListaDeNumerosXI; //LISTA DE NUMEROS SEM REPETIÇÃO
    ArrayList<Integer> ListaQtdNumerosFI; //LISTA DA FREQUÊNCIA DOS NUMEROS DA ListaDeNumeros
    ArrayList<Double> ListaQtdNumerosFrPerc;//LISTA COM A FREQUENCIA EM PERCENTUAL DE CADA NUMERO DIGITADO
    ArrayList<Integer> ListaQtdNumerosF;//LISTA COM F DE CADA NUMERO DIGITADO
    ArrayList<Double> ListaQtdNumerosFPerc;//LISTA COM A F PERCENTUAL DE CADA NUMERO DIGITADO
    TabelaContinuaGUI TabelaContinuaG;
    TabelaDiscretaGUI TabelaDiscretaG;
    TabelaDiscreta tabelaDiscreta = new TabelaDiscreta();
    TabelaContinua tabelaContinua = new  TabelaContinua();
    
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
        limitaDigitos();
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

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
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntradaKeyTyped(evt);
            }
        });

        txtSaida.setEditable(false);
        txtSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSaida.setName("txtSaida"); // NOI18N
        jScrollPane1.setViewportView(txtSaida);

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
        ComboVariavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Discreta", "Contínua" }));
        ComboVariavel.setToolTipText("Selecione o tipo de variável Discreta ou Contínua");
        ComboVariavel.setName("selectVariable"); // NOI18N
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
        ComboColeta.setForeground(new java.awt.Color(0, 0, 0));
        ComboColeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Amostra", "População" }));
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
                        .addGap(20, 20, 20)
                        .addComponent(ComboVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(ComboColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LblResult)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGerarFrenquencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(616, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed

        i+= 1;
        LblResult.setText(Integer.toString(i));

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
           TabelaContinuaG.setTabela(tabelaContinua);
           TabelaContinuaG.geraDados();
           TabelaContinuaG.addLinhas(tabelaContinua.getClasses(), tabelaContinua.getPeriodo(), tabelaContinua.getLista_fi(), 
                   tabelaContinua.getLista_F(), tabelaContinua.getLista_frPorcentual(), tabelaContinua.getLista_FPorcentual(), 
                   tabelaContinua.getLista_xi(), tabelaContinua.getLista_XiFi(), tabelaContinua.getLista_xixfi());
           
           DefaultCategoryDataset pieDataSet = new DefaultCategoryDataset();
           
            for(int i = 0; i < tabelaContinua.getLista_xi().size(); i++){
                pieDataSet.addValue((Double)tabelaContinua.getLista_frPorcentual().get(i), (Double)tabelaContinua.getLista_xi().get(i), "Em Pocentagem (%)"/*(i+1) + "º"*/);
            }

            JFreeChart grafico = ChartFactory.createBarChart3D("Variáveis Continuas", null, null, pieDataSet);
            ChartPanel cp = new ChartPanel(grafico);
            
            TabelaContinuaG.setGrafico(cp);
           
           TabelaContinuaG.setVisible(true);
       }
        else if(ComboVariavel.getSelectedIndex()== 1){
            TabelaDiscretaG.setTabela(tabelaDiscreta);
            TabelaDiscretaG.geraDados();
            TabelaDiscretaG.addLinhas(tabelaDiscreta.getLista_xi(), tabelaDiscreta.getLista_fi(), 
                    tabelaDiscreta.getLista_F(), tabelaDiscreta.getLista_frPorcentual(), 
                    tabelaDiscreta.getLista_FPorcentual(), tabelaDiscreta.getLista_XiFi(), tabelaDiscreta.getLista_xixfi());
            
            DefaultCategoryDataset pieDataSet = new DefaultCategoryDataset();
        
            for(int i = 0; i < tabelaDiscreta.getLista_xi().size(); i++){
                pieDataSet.addValue((Double)tabelaDiscreta.getLista_frPorcentual().get(i), (Double)tabelaDiscreta.getLista_xi().get(i), "Em Pocentagem (%)"/*(i+1) + "º"*/);
            }
            
            JFreeChart grafico = ChartFactory.createBarChart3D("Variáveis Discretas", null, null, pieDataSet);
            ChartPanel cp = new ChartPanel(grafico);
            TabelaDiscretaG.setGrafico(cp);
            
            
            TabelaDiscretaG.setVisible(true);
       }
    }//GEN-LAST:event_btnProcessarActionPerformed

    private void BtnGerarFrenquenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarFrenquenciaActionPerformed

        if (ComboColeta.getSelectedIndex() == 0 || ComboVariavel.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Por favor selecione o tipo de variável e coleta!", "Tipos de Coleta", 2);
        }else{
            
            if((ComboVariavel.getSelectedItem()).equals("Discreta")){
                
                if((ComboColeta.getSelectedItem()).equals("Amostra")){
                    tabelaDiscreta.setAmostra(true);
                }else{
                    tabelaDiscreta.setPopulacao(false);
                }
                
                tabelaDiscreta.setLista_rol(ListaDeNumeros);
                tabelaDiscreta.geraDados();
                
                txtSaida.setText(                        
                "Rol: \n\n" + (((tabelaDiscreta.getLista_Rol()).toString()).replace("[", "")).replace("]", "") + "\n\n"/* +
                "xi = " + (((tabelaDiscreta.getLista_xi()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "fi = " + (((tabelaDiscreta.getLista_fi()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "fr% = " + (((tabelaDiscreta.getLista_frPorcentual()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "F = " + (((tabelaDiscreta.getLista_F()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "F% = " + (((tabelaDiscreta.getLista_FPorcentual()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "xi*fi = " + (((tabelaDiscreta.getLista_XiFi()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "Xi - media * fi = " + (((tabelaDiscreta.getLista_xixfi()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "Média = " + (((tabelaDiscreta.getMedia()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "Moda = " + (((tabelaDiscreta.getModa()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "Mediana = " + tabelaDiscreta.getMediana() + "\n" +                
                "Variância = " + tabelaDiscreta.getVariancia() + "\n" +
                "Desvio Padrão = " + tabelaDiscreta.getDesvioPadrao() + "\n" +
                "Coeficiente de variação = " + tabelaDiscreta.getCoeficienteVariacao()*/);
                
            }else{
                if((ComboColeta.getSelectedItem()).equals("Amostra")){
                    tabelaContinua.setAmostra(true);
                }else{
                    tabelaContinua.setPopulacao(false);
                }
                
                tabelaContinua.setLista_rol(ListaDeNumeros);
                tabelaContinua.geraDados();
                
                txtSaida.setText(                        
                "Rol: \n\n " + (((tabelaContinua.getLista_Rol()).toString()).replace("[", "")).replace("]", "") + "\n\n"/* +
                "classes = " + (((tabelaContinua.getClasses()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "periodos = " + (((tabelaContinua.getPeriodo()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "fi = " + (((tabelaContinua.getLista_fi()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "fr% = " + (((tabelaContinua.getLista_frPorcentual()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "F = " + (((tabelaContinua.getLista_F()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "F% = " + (((tabelaContinua.getLista_FPorcentual()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "xi = " + (((tabelaContinua.getLista_xi()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "xi*fi = " + (((tabelaContinua.getLista_XiFi()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "Xi - media * fi = " + (((tabelaContinua.getLista_xixfi()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "Média = " + (((tabelaContinua.getMedia()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "Moda = " + (((tabelaContinua.getModa()).toString()).replace("[", "")).replace("]", "") + "\n" +
                "Mediana = " + tabelaContinua.getMediana() + "\n" +                
                "Variância = " + tabelaContinua.getVariancia() + "\n" +
                "Desvio Padrão = " + tabelaContinua.getDesvioPadrao() + "\n" +
                "Coeficiente de variação = " + tabelaContinua.getCoeficienteVariacao()*/);
            }

            btnProcessar.setEnabled(true);
            BtnGerarFrenquencia.setEnabled(false);
            txtEntrada.setEnabled(false);
            BtnContinuar.setEnabled(false);
            btnProcessar.requestFocus();
            ComboColeta.setEnabled(false);
            ComboVariavel.setEnabled(false);
        }
    }//GEN-LAST:event_BtnGerarFrenquenciaActionPerformed

    private void ComboVariavelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboVariavelItemStateChanged
        
        if (ComboVariavel.getSelectedIndex() != 0)
        {
            txtEntrada.setEnabled(true);
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
        txtEntrada.setText("");
        ListaDeNumeros.clear();
        ListaDeNumerosXI.clear();
        ListaQtdNumerosF.clear();
        ListaQtdNumerosFI.clear();
        ListaQtdNumerosFPerc.clear();
        ListaQtdNumerosFrPerc.clear();
        ComboColeta.setEnabled(true);
        ComboVariavel.setEnabled(true);
        
        tabelaDiscreta.getLista_Rol().clear();
        tabelaDiscreta.getLista_xi().clear();
        tabelaDiscreta.getLista_fi().clear();
        tabelaDiscreta.getLista_frPorcentual().clear();
        tabelaDiscreta.getLista_F().clear();
        tabelaDiscreta.getLista_FPorcentual().clear();
        tabelaDiscreta.getLista_XiFi().clear();
        tabelaDiscreta.getLista_xixfi().clear();
        tabelaDiscreta.getModa().clear();
       
        tabelaContinua.getLista_Rol().clear();
        tabelaContinua.getClasses().clear();
        tabelaContinua.getPeriodo().clear();
        tabelaContinua.getLista_fi().clear();
        tabelaContinua.getLista_frPorcentual().clear();
        tabelaContinua.getLista_F().clear();
        tabelaContinua.getLista_FPorcentual().clear();
        tabelaContinua.getLista_xi().clear();
        tabelaContinua.getLista_XiFi().clear();
        tabelaContinua.getLista_xixfi().clear();
        tabelaContinua.getModa().clear();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void ComboColetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboColetaItemStateChanged
        if (ComboColeta.getSelectedIndex() != 0)
        {
            txtEntrada.requestFocus();
        }
    }//GEN-LAST:event_ComboColetaItemStateChanged

    private void txtEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyTyped
        BtnContinuar.setEnabled(true);
    }//GEN-LAST:event_txtEntradaKeyTyped

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        List<Double> rol = new ArrayList<>();
    }//GEN-LAST:event_formComponentShown

    private void ComboVariavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboVariavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboVariavelActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextPane txtSaida;
    // End of variables declaration//GEN-END:variables

    private void limitaDigitos()
    {
        txtEntrada.setDocument(new LimiteDigitos(30));
    }
}
