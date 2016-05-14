package br.com.estatistica.view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Sartori
 */
public class TabelaDiscretaGUI extends javax.swing.JFrame {

    public TabelaDiscretaGUI() {
        initComponents();
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

        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDiscreta = new javax.swing.JTable();
        tabDistribuicao = new javax.swing.JTabbedPane();
        panNormal = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtMedia_distNormal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDesvioPadr_DistNormal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboPosicao_DistNormal = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtValor1_DistNormal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtValor2_DistNormal = new javax.swing.JTextField();
        btnCalc_DistNormal = new javax.swing.JButton();
        btnLimpar_DistNormal = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblProbabilidade_DistNormal = new javax.swing.JLabel();
        panBinomial = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_Q_DistBinomial = new javax.swing.JTextField();
        txt_K_DistBinomial = new javax.swing.JTextField();
        txt_P_DistBinomial = new javax.swing.JTextField();
        txt_N_DistBinomial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblProbabilidade_DistBinomial = new javax.swing.JLabel();
        lblMedia_DistBinomial = new javax.swing.JLabel();
        lblDesvioP_DistBinomial = new javax.swing.JLabel();
        btnLimpar_DistBinomial = new javax.swing.JButton();
        btnCalc_DistBinomial = new javax.swing.JButton();
        panUniforme = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        comboTamanho_DistUnif = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        comboPontosEq_DistUnif = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        comboPontos_DistUnif = new javax.swing.JComboBox<>();
        btnLimpar_DistUnif = new javax.swing.JButton();
        btnCalc_DistUnif = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtMinimo_DistUnif = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtMaximo_DistUnif = new javax.swing.JTextField();
        txtPonto1_DistUnif = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPonto2_DistUnif = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtMedia_DistUnif = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        lblProbabilidade_DistUnif = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblMedia_DistUnif = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblVariancia_DistUnif = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblDesvioP_DistUnif = new javax.swing.JLabel();
        tabMedidas = new javax.swing.JTabbedPane();
        panDispersao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtModa_Discreta = new javax.swing.JTextField();
        txtMedia_Discreta = new javax.swing.JTextField();
        txtMediana_Discreta = new javax.swing.JTextField();
        panTendenciaCentral = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCoefVariacao_Discreta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVariancia_Discreta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDesvioPadrao_Discreta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela - Variável Quantitativa Discreta");
        setResizable(false);

        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setPreferredSize(new java.awt.Dimension(51, 30));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        TabelaDiscreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TabelaDiscreta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "xi", "fi", "F", "Fr%", "F%", "xi.fi", "Variância"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDiscreta.setToolTipText("");
        jScrollPane1.setViewportView(TabelaDiscreta);

        tabDistribuicao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Distribuição", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        tabDistribuicao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Média");

        txtMedia_distNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Desvio Padrão");

        txtDesvioPadr_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Selecione a posição");

        comboPosicao_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboPosicao_DistNormal.setForeground(new java.awt.Color(0, 0, 0));
        comboPosicao_DistNormal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Entre", "Maior", "Menor" }));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Valor 1");

        txtValor1_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Valor 2");

        txtValor2_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btnCalc_DistNormal.setBackground(new java.awt.Color(153, 255, 153));
        btnCalc_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalc_DistNormal.setForeground(new java.awt.Color(0, 102, 0));
        btnCalc_DistNormal.setText("Calcular");

        btnLimpar_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpar_DistNormal.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar_DistNormal.setText("Limpar");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Probabilidade:");

        lblProbabilidade_DistNormal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProbabilidade_DistNormal.setForeground(new java.awt.Color(0, 0, 0));
        lblProbabilidade_DistNormal.setText("99,99%");

        javax.swing.GroupLayout panNormalLayout = new javax.swing.GroupLayout(panNormal);
        panNormal.setLayout(panNormalLayout);
        panNormalLayout.setHorizontalGroup(
            panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNormalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panNormalLayout.createSequentialGroup()
                        .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(txtMedia_distNormal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtDesvioPadr_DistNormal))
                        .addGap(37, 37, 37)
                        .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(comboPosicao_DistNormal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panNormalLayout.createSequentialGroup()
                                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtValor1_DistNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtValor2_DistNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panNormalLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(lblProbabilidade_DistNormal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNormalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpar_DistNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalc_DistNormal))
        );
        panNormalLayout.setVerticalGroup(
            panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNormalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedia_distNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPosicao_DistNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panNormalLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesvioPadr_DistNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panNormalLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor1_DistNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panNormalLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor2_DistNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblProbabilidade_DistNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc_DistNormal)
                    .addComponent(btnLimpar_DistNormal)))
        );

        tabDistribuicao.addTab("Normal", panNormal);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("n");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("p");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("k");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("q");

        txt_Q_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Q_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        txt_Q_DistBinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Q_DistBinomialActionPerformed(evt);
            }
        });

        txt_K_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_K_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        txt_K_DistBinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_K_DistBinomialActionPerformed(evt);
            }
        });

        txt_P_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_P_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        txt_P_DistBinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_P_DistBinomialActionPerformed(evt);
            }
        });

        txt_N_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_N_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        txt_N_DistBinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_N_DistBinomialActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Separe os valores por vírgula ( , )");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Probabilidade:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Média:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Desvio Padrão:");

        lblProbabilidade_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProbabilidade_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        lblProbabilidade_DistBinomial.setText("99,99%");

        lblMedia_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMedia_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        lblMedia_DistBinomial.setText("10");

        lblDesvioP_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDesvioP_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        lblDesvioP_DistBinomial.setText("5,25");

        btnLimpar_DistBinomial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpar_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar_DistBinomial.setText("Limpar");

        btnCalc_DistBinomial.setBackground(new java.awt.Color(153, 255, 153));
        btnCalc_DistBinomial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalc_DistBinomial.setForeground(new java.awt.Color(0, 102, 0));
        btnCalc_DistBinomial.setText("Calcular");

        javax.swing.GroupLayout panBinomialLayout = new javax.swing.GroupLayout(panBinomial);
        panBinomial.setLayout(panBinomialLayout);
        panBinomialLayout.setHorizontalGroup(
            panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBinomialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBinomialLayout.createSequentialGroup()
                        .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_N_DistBinomial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_P_DistBinomial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Q_DistBinomial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBinomialLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(jLabel18))
                            .addGroup(panBinomialLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_K_DistBinomial))))
                    .addGroup(panBinomialLayout.createSequentialGroup()
                        .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(31, 31, 31)
                        .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProbabilidade_DistBinomial, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(lblMedia_DistBinomial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDesvioP_DistBinomial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBinomialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpar_DistBinomial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalc_DistBinomial))
        );
        panBinomialLayout.setVerticalGroup(
            panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBinomialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_N_DistBinomial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_P_DistBinomial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_K_DistBinomial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(9, 9, 9)
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Q_DistBinomial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(35, 35, 35)
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblProbabilidade_DistBinomial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblMedia_DistBinomial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblDesvioP_DistBinomial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc_DistBinomial)
                    .addComponent(btnLimpar_DistBinomial)))
        );

        tabDistribuicao.addTab("Binomial", panBinomial);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Tamanho");

        comboTamanho_DistUnif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Maior", "Menor", "Nenhum" }));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Pontos de equilíbrio");

        comboPontosEq_DistUnif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "Nenhum" }));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Pontos");

        comboPontos_DistUnif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Mínimo", "Máximo", "Ambos" }));

        btnLimpar_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpar_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar_DistUnif.setText("Limpar");

        btnCalc_DistUnif.setBackground(new java.awt.Color(153, 255, 153));
        btnCalc_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalc_DistUnif.setForeground(new java.awt.Color(0, 102, 0));
        btnCalc_DistUnif.setText("Calcular");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Mínimo");

        txtMinimo_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Máximo");

        txtMaximo_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtPonto1_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("1º Ponto");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("2º Ponto");

        txtPonto2_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Média");

        txtMedia_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Probabilidade:");

        lblProbabilidade_DistUnif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProbabilidade_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        lblProbabilidade_DistUnif.setText("99,99%");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Média:");

        lblMedia_DistUnif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMedia_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        lblMedia_DistUnif.setText("10");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Variância:");

        lblVariancia_DistUnif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblVariancia_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        lblVariancia_DistUnif.setText("5,25");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Desvio Padrão:");

        lblDesvioP_DistUnif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDesvioP_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        lblDesvioP_DistUnif.setText("5,25");

        javax.swing.GroupLayout panUniformeLayout = new javax.swing.GroupLayout(panUniforme);
        panUniforme.setLayout(panUniformeLayout);
        panUniformeLayout.setHorizontalGroup(
            panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUniformeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUniformeLayout.createSequentialGroup()
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panUniformeLayout.createSequentialGroup()
                                .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUniformeLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(26, 26, 26)))
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesvioP_DistUnif)
                            .addComponent(lblMedia_DistUnif)
                            .addComponent(lblVariancia_DistUnif)
                            .addComponent(lblProbabilidade_DistUnif))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar_DistUnif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalc_DistUnif))
                    .addGroup(panUniformeLayout.createSequentialGroup()
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboPontosEq_DistUnif, 0, 170, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboTamanho_DistUnif, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPontos_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panUniformeLayout.createSequentialGroup()
                                .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMinimo_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaximo_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panUniformeLayout.createSequentialGroup()
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPonto1_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPonto2_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMedia_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(106, 106, 106))))
        );
        panUniformeLayout.setVerticalGroup(
            panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUniformeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panUniformeLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTamanho_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panUniformeLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPontos_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panUniformeLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPontosEq_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panUniformeLayout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMinimo_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panUniformeLayout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMaximo_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panUniformeLayout.createSequentialGroup()
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panUniformeLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPonto1_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panUniformeLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPonto2_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panUniformeLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMedia_DistUnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(lblProbabilidade_DistUnif))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(lblMedia_DistUnif))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(lblVariancia_DistUnif))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(lblDesvioP_DistUnif))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUniformeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalc_DistUnif)
                            .addComponent(btnLimpar_DistUnif)))))
        );

        tabDistribuicao.addTab("Uniforme", panUniforme);

        tabMedidas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medidas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        tabMedidas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Média");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Moda");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mediana");

        txtModa_Discreta.setEditable(false);
        txtModa_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtModa_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        txtMedia_Discreta.setEditable(false);
        txtMedia_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMedia_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        txtMediana_Discreta.setEditable(false);
        txtMediana_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMediana_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panDispersaoLayout = new javax.swing.GroupLayout(panDispersao);
        panDispersao.setLayout(panDispersaoLayout);
        panDispersaoLayout.setHorizontalGroup(
            panDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDispersaoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
            .addGroup(panDispersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedia_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtModa_Discreta)
                .addGap(18, 18, 18)
                .addComponent(txtMediana_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panDispersaoLayout.setVerticalGroup(
            panDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDispersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModa_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedia_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMediana_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tabMedidas.addTab("Tendência Central", panDispersao);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CV");

        txtCoefVariacao_Discreta.setEditable(false);
        txtCoefVariacao_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCoefVariacao_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Variância");

        txtVariancia_Discreta.setEditable(false);
        txtVariancia_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtVariancia_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Desvio Padrão");

        txtDesvioPadrao_Discreta.setEditable(false);
        txtDesvioPadrao_Discreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDesvioPadrao_Discreta.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panTendenciaCentralLayout = new javax.swing.GroupLayout(panTendenciaCentral);
        panTendenciaCentral.setLayout(panTendenciaCentralLayout);
        panTendenciaCentralLayout.setHorizontalGroup(
            panTendenciaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTendenciaCentralLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addComponent(jLabel6))
            .addGroup(panTendenciaCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCoefVariacao_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtVariancia_Discreta)
                .addGap(18, 18, 18)
                .addComponent(txtDesvioPadrao_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panTendenciaCentralLayout.setVerticalGroup(
            panTendenciaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTendenciaCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTendenciaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTendenciaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVariancia_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoefVariacao_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesvioPadrao_Discreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tabMedidas.addTab("Dispersão", panTendenciaCentral);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Gráfico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tabMedidas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tabDistribuicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txt_Q_DistBinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Q_DistBinomialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Q_DistBinomialActionPerformed

    private void txt_K_DistBinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_K_DistBinomialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_K_DistBinomialActionPerformed

    private void txt_P_DistBinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_P_DistBinomialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_P_DistBinomialActionPerformed

    private void txt_N_DistBinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_N_DistBinomialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_N_DistBinomialActionPerformed

    // ++++++++++++++++++   COMEÇO DOS ENABLE DISABLE +++++++++++++++++++++++++ //

    /**
     *
     * @param evt
     */
    
    public void comboPosicao_DistNormal (java.awt.event.ItemEvent evt)
    {
        if (comboPosicao_DistNormal.getSelectedIndex() == 0) // DESABILITA OS CAMPOS VALOR E BOTÃO CALCULAR
        {
            txtValor1_DistNormal.setEnabled(false);
            txtValor2_DistNormal.setEnabled(false);
            btnCalc_DistNormal.setEnabled(false);
        }
        
        if (comboPosicao_DistNormal.getSelectedIndex() == 1) // HABILITA OS 2 CAMPOS
        {
            txtValor1_DistNormal.setEnabled(true);
            txtValor2_DistNormal.setEnabled(true);
            btnCalc_DistNormal.setEnabled(true); // Habilita botão calcular
        }
        
        if (comboPosicao_DistNormal.getSelectedIndex() == 2) // HABILITA O VALOR 1
        {
            txtValor1_DistNormal.setEnabled(true);
            txtValor2_DistNormal.setEnabled(false);
            btnCalc_DistNormal.setEnabled(true);
        }
        
        if (comboPosicao_DistNormal.getSelectedIndex() == 3)
        {
            txtValor1_DistNormal.setEnabled(true);
            txtValor2_DistNormal.setEnabled(false);
            btnCalc_DistNormal.setEnabled(true);
        }
    }
    
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
            java.util.logging.Logger.getLogger(TabelaDiscretaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaDiscretaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaDiscretaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaDiscretaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaDiscretaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDiscreta;
    private javax.swing.JButton btnCalc_DistBinomial;
    private javax.swing.JButton btnCalc_DistNormal;
    private javax.swing.JButton btnCalc_DistUnif;
    private javax.swing.JButton btnLimpar_DistBinomial;
    private javax.swing.JButton btnLimpar_DistNormal;
    private javax.swing.JButton btnLimpar_DistUnif;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> comboPontosEq_DistUnif;
    private javax.swing.JComboBox<String> comboPontos_DistUnif;
    private javax.swing.JComboBox<String> comboPosicao_DistNormal;
    private javax.swing.JComboBox<String> comboTamanho_DistUnif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesvioP_DistBinomial;
    private javax.swing.JLabel lblDesvioP_DistUnif;
    private javax.swing.JLabel lblMedia_DistBinomial;
    private javax.swing.JLabel lblMedia_DistUnif;
    private javax.swing.JLabel lblProbabilidade_DistBinomial;
    private javax.swing.JLabel lblProbabilidade_DistNormal;
    private javax.swing.JLabel lblProbabilidade_DistUnif;
    private javax.swing.JLabel lblVariancia_DistUnif;
    private javax.swing.JPanel panBinomial;
    private javax.swing.JPanel panDispersao;
    private javax.swing.JPanel panNormal;
    private javax.swing.JPanel panTendenciaCentral;
    private javax.swing.JPanel panUniforme;
    private javax.swing.JTabbedPane tabDistribuicao;
    private javax.swing.JTabbedPane tabMedidas;
    private javax.swing.JTextField txtCoefVariacao_Discreta;
    private javax.swing.JTextField txtDesvioPadr_DistNormal;
    private javax.swing.JTextField txtDesvioPadrao_Discreta;
    private javax.swing.JTextField txtMaximo_DistUnif;
    private javax.swing.JTextField txtMedia_Discreta;
    private javax.swing.JTextField txtMedia_DistUnif;
    private javax.swing.JTextField txtMedia_distNormal;
    private javax.swing.JTextField txtMediana_Discreta;
    private javax.swing.JTextField txtMinimo_DistUnif;
    private javax.swing.JTextField txtModa_Discreta;
    private javax.swing.JTextField txtPonto1_DistUnif;
    private javax.swing.JTextField txtPonto2_DistUnif;
    private javax.swing.JTextField txtValor1_DistNormal;
    private javax.swing.JTextField txtValor2_DistNormal;
    private javax.swing.JTextField txtVariancia_Discreta;
    private javax.swing.JTextField txt_K_DistBinomial;
    private javax.swing.JTextField txt_N_DistBinomial;
    private javax.swing.JTextField txt_P_DistBinomial;
    private javax.swing.JTextField txt_Q_DistBinomial;
    // End of variables declaration//GEN-END:variables
}

