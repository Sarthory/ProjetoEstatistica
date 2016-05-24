package br.com.estatistica.view;

import br.com.estatistica.controller.DistribuicaoNormal;
import java.net.URL;
import javax.swing.ImageIcon;
import br.com.estatistica.util.LimiteDigitos;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class DistGUI extends javax.swing.JFrame {
    
    DistribuicaoNormal DistNormal;

    public DistGUI() {
        initComponents();
        URL iconURL = getClass().getResource("/br/com/estatistica/img/chart_bar.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setLocationRelativeTo(null);
        limitaDigitos();
        DistNormal = new DistribuicaoNormal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Distribuições");

        tabDistribuicao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Distribuição", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        tabDistribuicao.setForeground(new java.awt.Color(0, 0, 0));
        tabDistribuicao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabDistribuicao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabDistribuicaoFocusGained(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Média");

        txtMedia_distNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Desvio Padrão");

        txtDesvioPadr_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Selecione a posição");

        comboPosicao_DistNormal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboPosicao_DistNormal.setForeground(new java.awt.Color(0, 0, 0));
        comboPosicao_DistNormal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Entre (Valor 1 e Valor 2)", "Maior (Valor 1)", "Menor (Valor 1)" }));
        comboPosicao_DistNormal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPosicao_DistNormalItemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Valor 1");

        txtValor1_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtValor1_DistNormal.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Valor 2");

        txtValor2_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtValor2_DistNormal.setEnabled(false);

        btnCalc_DistNormal.setBackground(new java.awt.Color(153, 255, 153));
        btnCalc_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalc_DistNormal.setForeground(new java.awt.Color(0, 102, 0));
        btnCalc_DistNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/Gear-01.png"))); // NOI18N
        btnCalc_DistNormal.setText("Calcular");
        btnCalc_DistNormal.setEnabled(false);
        btnCalc_DistNormal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalc_DistNormal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCalc_DistNormal.setIconTextGap(10);
        btnCalc_DistNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc_DistNormalActionPerformed(evt);
            }
        });

        btnLimpar_DistNormal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpar_DistNormal.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar_DistNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/Button Reload-01.png"))); // NOI18N
        btnLimpar_DistNormal.setText("Limpar");
        btnLimpar_DistNormal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpar_DistNormal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpar_DistNormal.setIconTextGap(10);
        btnLimpar_DistNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_DistNormalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Probabilidade:");

        lblProbabilidade_DistNormal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProbabilidade_DistNormal.setForeground(new java.awt.Color(0, 0, 0));
        lblProbabilidade_DistNormal.setText("99,99 %");

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
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
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
                .addGap(29, 29, 29)
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
                .addGap(32, 32, 32)
                .addGroup(panNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblProbabilidade_DistNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
        txt_Q_DistBinomial.setEnabled(false);
        txt_Q_DistBinomial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Q_DistBinomialKeyTyped(evt);
            }
        });

        txt_K_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_K_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        txt_K_DistBinomial.setEnabled(false);
        txt_K_DistBinomial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_K_DistBinomialKeyTyped(evt);
            }
        });

        txt_P_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_P_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        txt_P_DistBinomial.setEnabled(false);
        txt_P_DistBinomial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_P_DistBinomialKeyTyped(evt);
            }
        });

        txt_N_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_N_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        txt_N_DistBinomial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_N_DistBinomialKeyTyped(evt);
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
        lblProbabilidade_DistBinomial.setText("99,99 %");

        lblMedia_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMedia_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        lblMedia_DistBinomial.setText("99,99");

        lblDesvioP_DistBinomial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDesvioP_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        lblDesvioP_DistBinomial.setText("99,99");

        btnLimpar_DistBinomial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpar_DistBinomial.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar_DistBinomial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/Button Reload-01.png"))); // NOI18N
        btnLimpar_DistBinomial.setText("Limpar");
        btnLimpar_DistBinomial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpar_DistBinomial.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpar_DistBinomial.setIconTextGap(10);
        btnLimpar_DistBinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_DistBinomialActionPerformed(evt);
            }
        });

        btnCalc_DistBinomial.setBackground(new java.awt.Color(153, 255, 153));
        btnCalc_DistBinomial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalc_DistBinomial.setForeground(new java.awt.Color(0, 102, 0));
        btnCalc_DistBinomial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/Gear-01.png"))); // NOI18N
        btnCalc_DistBinomial.setText("Calcular");
        btnCalc_DistBinomial.setEnabled(false);
        btnCalc_DistBinomial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalc_DistBinomial.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCalc_DistBinomial.setIconTextGap(10);

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
                        .addGap(39, 39, 39)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panBinomialLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_K_DistBinomial, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
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
                .addContainerGap(31, Short.MAX_VALUE)
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
                .addGap(28, 28, 28)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBinomialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc_DistBinomial)
                    .addComponent(btnLimpar_DistBinomial)))
        );

        tabDistribuicao.addTab("Binomial", panBinomial);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Tamanho");

        comboTamanho_DistUnif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Maior", "Menor", "Nenhum" }));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Pontos de equilíbrio");

        comboPontosEq_DistUnif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "Nenhum" }));
        comboPontosEq_DistUnif.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPontosEq_DistUnifItemStateChanged(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Pontos");

        comboPontos_DistUnif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Mínimo", "Máximo", "Ambos" }));
        comboPontos_DistUnif.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPontos_DistUnifItemStateChanged(evt);
            }
        });

        btnLimpar_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpar_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar_DistUnif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/Button Reload-01.png"))); // NOI18N
        btnLimpar_DistUnif.setText("Limpar");
        btnLimpar_DistUnif.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpar_DistUnif.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpar_DistUnif.setIconTextGap(10);
        btnLimpar_DistUnif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_DistUnifActionPerformed(evt);
            }
        });

        btnCalc_DistUnif.setBackground(new java.awt.Color(153, 255, 153));
        btnCalc_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalc_DistUnif.setForeground(new java.awt.Color(0, 102, 0));
        btnCalc_DistUnif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/Gear-01.png"))); // NOI18N
        btnCalc_DistUnif.setText("Calcular");
        btnCalc_DistUnif.setEnabled(false);
        btnCalc_DistUnif.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalc_DistUnif.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCalc_DistUnif.setIconTextGap(10);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Mínimo");

        txtMinimo_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtMinimo_DistUnif.setEnabled(false);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Máximo");

        txtMaximo_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtMaximo_DistUnif.setEnabled(false);

        txtPonto1_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPonto1_DistUnif.setEnabled(false);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("1º Ponto");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("2º Ponto");

        txtPonto2_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPonto2_DistUnif.setEnabled(false);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Média");

        txtMedia_DistUnif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtMedia_DistUnif.setEnabled(false);

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Probabilidade:");

        lblProbabilidade_DistUnif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProbabilidade_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        lblProbabilidade_DistUnif.setText("99,99 %");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Média:");

        lblMedia_DistUnif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMedia_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        lblMedia_DistUnif.setText("99,99");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Variância:");

        lblVariancia_DistUnif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblVariancia_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        lblVariancia_DistUnif.setText("99,99");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Desvio Padrão:");

        lblDesvioP_DistUnif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDesvioP_DistUnif.setForeground(new java.awt.Color(0, 0, 0));
        lblDesvioP_DistUnif.setText("99,99");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        btnFechar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(0, 0, 0));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/estatistica/img/close.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPosicao_DistNormalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPosicao_DistNormalItemStateChanged
        if (comboPosicao_DistNormal.getSelectedIndex() == 0) // DESABILITA OS CAMPOS VALOR E BOTÃO CALCULAR
        {
            txtValor1_DistNormal.setEnabled(false);
            txtValor2_DistNormal.setEnabled(false);
            btnCalc_DistNormal.setEnabled(false);
        }

        if (comboPosicao_DistNormal.getSelectedIndex() == 1) // HABILITA OS 2 CAMPOS
        {
            txtMedia_distNormal.requestFocus();
            txtValor1_DistNormal.setEnabled(true);
            txtValor2_DistNormal.setEnabled(true);
            btnCalc_DistNormal.setEnabled(true); // Habilita botão calcular
        }

        if (comboPosicao_DistNormal.getSelectedIndex() == 2) // HABILITA O VALOR 1
        {
            txtMedia_distNormal.requestFocus();
            txtValor1_DistNormal.setEnabled(true);
            txtValor2_DistNormal.setEnabled(false);
            btnCalc_DistNormal.setEnabled(true);
        }

        if (comboPosicao_DistNormal.getSelectedIndex() == 3)
        {
            txtMedia_distNormal.requestFocus();
            txtValor1_DistNormal.setEnabled(true);
            txtValor2_DistNormal.setEnabled(false);
            btnCalc_DistNormal.setEnabled(true);
        }
    }//GEN-LAST:event_comboPosicao_DistNormalItemStateChanged

    private void btnLimpar_DistNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_DistNormalActionPerformed
        txtMedia_distNormal.setText("");
        txtDesvioPadr_DistNormal.setText("");
        lblProbabilidade_DistNormal.setText("00,00 %");
        comboPosicao_DistNormal.setSelectedIndex(0);
        txtValor1_DistNormal.setEnabled(false);
        txtValor2_DistNormal.setEnabled(false);
        txtValor1_DistNormal.setText("");
        txtValor2_DistNormal.setText("");
        txtMedia_distNormal.requestFocus();
    }//GEN-LAST:event_btnLimpar_DistNormalActionPerformed

    private void txt_Q_DistBinomialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Q_DistBinomialKeyTyped
        txt_K_DistBinomial.setEnabled(true);
    }//GEN-LAST:event_txt_Q_DistBinomialKeyTyped

    private void txt_K_DistBinomialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_K_DistBinomialKeyTyped
        btnCalc_DistBinomial.setEnabled(true);
    }//GEN-LAST:event_txt_K_DistBinomialKeyTyped

    private void txt_P_DistBinomialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_P_DistBinomialKeyTyped
        txt_Q_DistBinomial.setEnabled(true);
    }//GEN-LAST:event_txt_P_DistBinomialKeyTyped

    private void txt_N_DistBinomialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_N_DistBinomialKeyTyped
        txt_P_DistBinomial.setEnabled(true);
    }//GEN-LAST:event_txt_N_DistBinomialKeyTyped

    private void btnLimpar_DistBinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_DistBinomialActionPerformed
        txt_N_DistBinomial.setText("");
        txt_P_DistBinomial.setText("");
        txt_P_DistBinomial.setEnabled(false);
        txt_Q_DistBinomial.setText("");
        txt_Q_DistBinomial.setEnabled(false);
        txt_K_DistBinomial.setText("");
        txt_K_DistBinomial.setEnabled(false);
        lblProbabilidade_DistBinomial.setText("00,00 %");
        lblMedia_DistBinomial.setText("00,00");
        lblDesvioP_DistBinomial.setText("00,00");
        btnCalc_DistBinomial.setEnabled(false);
        txt_N_DistBinomial.requestFocus();
    }//GEN-LAST:event_btnLimpar_DistBinomialActionPerformed

    private void comboPontosEq_DistUnifItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPontosEq_DistUnifItemStateChanged
        if (comboPontosEq_DistUnif.getSelectedIndex() == 0)
        {
            txtPonto1_DistUnif.setEnabled(false);
            txtPonto2_DistUnif.setEnabled(false);
            btnCalc_DistUnif.setEnabled(false);
        }

        if (comboPontosEq_DistUnif.getSelectedIndex() == 1)
        {
            txtPonto1_DistUnif.setEnabled(true);
            txtPonto2_DistUnif.setEnabled(false);
            btnCalc_DistUnif.setEnabled(true);
            txtPonto1_DistUnif.requestFocus();
        }
        if (comboPontosEq_DistUnif.getSelectedIndex() == 2)
        {
            txtPonto1_DistUnif.setEnabled(true);
            txtPonto2_DistUnif.setEnabled(true);
            btnCalc_DistUnif.setEnabled(true);
            txtPonto1_DistUnif.requestFocus();
        }
        if (comboPontosEq_DistUnif.getSelectedIndex() == 3)
        {
            txtPonto1_DistUnif.setEnabled(false);
            txtPonto2_DistUnif.setEnabled(false);
            btnCalc_DistUnif.setEnabled(true);
        }
    }//GEN-LAST:event_comboPontosEq_DistUnifItemStateChanged

    private void comboPontos_DistUnifItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPontos_DistUnifItemStateChanged
        if (comboPontos_DistUnif.getSelectedIndex() == 0)
        {
            txtMinimo_DistUnif.setEnabled(false);
            txtMaximo_DistUnif.setEnabled(false);
            txtMedia_DistUnif.setEnabled(false);
            btnCalc_DistUnif.setEnabled(false);
        }

        if (comboPontos_DistUnif.getSelectedIndex() == 1)
        {
            txtMinimo_DistUnif.setEnabled(true);
            txtMaximo_DistUnif.setEnabled(false);
            txtMedia_DistUnif.setEnabled(true);
            btnCalc_DistUnif.setEnabled(true);
            txtMinimo_DistUnif.requestFocus();
        }

        if (comboPontos_DistUnif.getSelectedIndex() == 2)
        {
            txtMinimo_DistUnif.setEnabled(false);
            txtMaximo_DistUnif.setEnabled(true);
            txtMedia_DistUnif.setEnabled(true);
            btnCalc_DistUnif.setEnabled(true);
            txtMaximo_DistUnif.requestFocus();
        }

        if (comboPontos_DistUnif.getSelectedIndex() == 3)
        {
            txtMinimo_DistUnif.setEnabled(true);
            txtMaximo_DistUnif.setEnabled(true);
            txtMedia_DistUnif.setEnabled(false);
            btnCalc_DistUnif.setEnabled(true);
            txtMinimo_DistUnif.requestFocus();
        }
    }//GEN-LAST:event_comboPontos_DistUnifItemStateChanged

    private void btnLimpar_DistUnifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_DistUnifActionPerformed
        comboTamanho_DistUnif.setSelectedIndex(0);
        comboPontosEq_DistUnif.setSelectedIndex(0);
        comboPontos_DistUnif.setSelectedIndex(0);
        txtPonto1_DistUnif.setText("");
        txtPonto2_DistUnif.setText("");
        txtMinimo_DistUnif.setText("");
        txtMaximo_DistUnif.setText("");
        txtMedia_DistUnif.setText("");
        lblProbabilidade_DistUnif.setText("00,00 %");
        lblMedia_DistUnif.setText("00,00");
        lblVariancia_DistUnif.setText("00,00");
        lblDesvioP_DistUnif.setText("00,00");
        btnCalc_DistUnif.setEnabled(false);
    }//GEN-LAST:event_btnLimpar_DistUnifActionPerformed

    private void tabDistribuicaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabDistribuicaoFocusGained
        txt_N_DistBinomial.requestFocus();
    }//GEN-LAST:event_tabDistribuicaoFocusGained

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnCalc_DistNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc_DistNormalActionPerformed
        
        int posicao = 0;
        double media = Double.parseDouble(txtMedia_distNormal.getText());
        double dp = Double.parseDouble(txtDesvioPadr_DistNormal.getText());
        double valor1 = 0;
        double valor2 = 0;
        
        if (comboPosicao_DistNormal.getSelectedIndex() == 1)
        {
            posicao = 1;
            valor1 = Double.parseDouble(txtValor1_DistNormal.getText());
            valor2 = Double.parseDouble(txtValor2_DistNormal.getText());
        }

        if (comboPosicao_DistNormal.getSelectedIndex() == 2)
        {
            posicao = 2;
            valor1 = Double.parseDouble(txtValor1_DistNormal.getText());
            valor2 = 0;
        }

        if (comboPosicao_DistNormal.getSelectedIndex() == 3)
        {
            posicao = 3;
            valor1 = Double.parseDouble(txtValor1_DistNormal.getText());
            valor2 = 0;
        }
        
        double probabilidade = DistNormal.calcular(posicao, media, dp, valor1, valor2);
        
        lblProbabilidade_DistNormal.setText(Double.toString(probabilidade) + " %");
        
    }//GEN-LAST:event_btnCalc_DistNormalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc_DistBinomial;
    private javax.swing.JButton btnCalc_DistNormal;
    private javax.swing.JButton btnCalc_DistUnif;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar_DistBinomial;
    private javax.swing.JButton btnLimpar_DistNormal;
    private javax.swing.JButton btnLimpar_DistUnif;
    private javax.swing.JComboBox<String> comboPontosEq_DistUnif;
    private javax.swing.JComboBox<String> comboPontos_DistUnif;
    private javax.swing.JComboBox<String> comboPosicao_DistNormal;
    private javax.swing.JComboBox<String> comboTamanho_DistUnif;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDesvioP_DistBinomial;
    private javax.swing.JLabel lblDesvioP_DistUnif;
    private javax.swing.JLabel lblMedia_DistBinomial;
    private javax.swing.JLabel lblMedia_DistUnif;
    private javax.swing.JLabel lblProbabilidade_DistBinomial;
    private javax.swing.JLabel lblProbabilidade_DistNormal;
    private javax.swing.JLabel lblProbabilidade_DistUnif;
    private javax.swing.JLabel lblVariancia_DistUnif;
    private javax.swing.JPanel panBinomial;
    private javax.swing.JPanel panNormal;
    private javax.swing.JPanel panUniforme;
    private javax.swing.JTabbedPane tabDistribuicao;
    private javax.swing.JTextField txtDesvioPadr_DistNormal;
    private javax.swing.JTextField txtMaximo_DistUnif;
    private javax.swing.JTextField txtMedia_DistUnif;
    private javax.swing.JTextField txtMedia_distNormal;
    private javax.swing.JTextField txtMinimo_DistUnif;
    private javax.swing.JTextField txtPonto1_DistUnif;
    private javax.swing.JTextField txtPonto2_DistUnif;
    private javax.swing.JTextField txtValor1_DistNormal;
    private javax.swing.JTextField txtValor2_DistNormal;
    private javax.swing.JTextField txt_K_DistBinomial;
    private javax.swing.JTextField txt_N_DistBinomial;
    private javax.swing.JTextField txt_P_DistBinomial;
    private javax.swing.JTextField txt_Q_DistBinomial;
    // End of variables declaration//GEN-END:variables
    
    private void limitaDigitos()
    {
        txtDesvioPadr_DistNormal.setDocument(new LimiteDigitos(30));
        txtMedia_distNormal.setDocument(new LimiteDigitos(30));
        txtValor1_DistNormal.setDocument(new LimiteDigitos(30));
        txtValor2_DistNormal.setDocument(new LimiteDigitos(30));
        
        txt_N_DistBinomial.setDocument(new LimiteDigitos(30));
        txt_P_DistBinomial.setDocument(new LimiteDigitos(30));
        txt_Q_DistBinomial.setDocument(new LimiteDigitos(30));
        txt_K_DistBinomial.setDocument(new LimiteDigitos(30));
        
        txtPonto1_DistUnif.setDocument(new LimiteDigitos(30));
        txtPonto2_DistUnif.setDocument(new LimiteDigitos(30));
        txtMinimo_DistUnif.setDocument(new LimiteDigitos(30));
        txtMaximo_DistUnif.setDocument(new LimiteDigitos(30));
        txtMedia_DistUnif.setDocument(new LimiteDigitos(30));
    }
}
