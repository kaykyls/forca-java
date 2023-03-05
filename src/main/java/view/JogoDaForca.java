package view;
import java.util.ArrayList;

public class JogoDaForca extends javax.swing.JFrame {

    public JogoDaForca() {
        initComponents();
        this.jTabbedPane1.setEnabledAt(1, false);
        jogarNovamenteButton.setVisible(false);
        
        
        cabecaImg.setVisible(false);
        corpoImg.setVisible(false);
        bracoEsqImg.setVisible(false);
        bracoDirImg.setVisible(false);
        pernaEsqImg.setVisible(false);
        pernaDirImg.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        filmesRadio = new javax.swing.JRadioButton();
        novelasRadio = new javax.swing.JRadioButton();
        carrosRadio = new javax.swing.JRadioButton();
        jogarBotao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        letraTextField = new javax.swing.JTextField();
        informacaoLabel = new javax.swing.JLabel();
        chutarBotao = new javax.swing.JButton();
        letrasSorteadasLabel = new javax.swing.JLabel();
        letrasLabel = new javax.swing.JLabel();
        palavraLabel = new javax.swing.JLabel();
        temaLabel = new javax.swing.JLabel();
        jogarNovamenteButton = new javax.swing.JButton();
        cordaImg = new javax.swing.JLabel();
        cabecaImg = new javax.swing.JLabel();
        bracoEsqImg = new javax.swing.JLabel();
        pernaEsqImg = new javax.swing.JLabel();
        bracoDirImg = new javax.swing.JLabel();
        pernaDirImg = new javax.swing.JLabel();
        corpoImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(filmesRadio);
        filmesRadio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        filmesRadio.setText("Filmes");
        filmesRadio.setAlignmentY(0.0F);

        buttonGroup1.add(novelasRadio);
        novelasRadio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        novelasRadio.setText("Novelas");

        buttonGroup1.add(carrosRadio);
        carrosRadio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        carrosRadio.setText("Carros");

        jogarBotao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jogarBotao.setText("Jogar");
        jogarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(filmesRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novelasRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carrosRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(filmesRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novelasRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carrosRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jogarBotao)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Início", jPanel1);

        informacaoLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        informacaoLabel.setText("Insira a letra:");

        chutarBotao.setText("Jogar");
        chutarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chutarBotaoActionPerformed(evt);
            }
        });

        letrasSorteadasLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letrasSorteadasLabel.setText("Letras sorteadas:");

        palavraLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        palavraLabel.setText("_ _ _ _ _ _ _ _ _ _ _ _ _");

        temaLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        temaLabel.setText("Tema: tema");

        jogarNovamenteButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jogarNovamenteButton.setText("Jogar novamente");
        jogarNovamenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarNovamenteButtonActionPerformed(evt);
            }
        });

        cordaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/corda (3).png"))); // NOI18N

        cabecaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/cabeca (1).png"))); // NOI18N

        bracoEsqImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/braco-perna-esq.png"))); // NOI18N

        pernaEsqImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/braco-perna-esq.png"))); // NOI18N

        bracoDirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/braco-perna-dir.png"))); // NOI18N

        pernaDirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/braco-perna-dir.png"))); // NOI18N

        corpoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/corpo (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(temaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cordaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(letrasSorteadasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(pernaEsqImg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pernaDirImg))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(bracoEsqImg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bracoDirImg))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(corpoImg))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(jogarNovamenteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 370, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(informacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(cabecaImg)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chutarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(palavraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letrasSorteadasLabel)
                    .addComponent(temaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(cordaImg))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(cabecaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corpoImg)
                            .addComponent(bracoDirImg)
                            .addComponent(bracoEsqImg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pernaEsqImg)
                            .addComponent(pernaDirImg))
                        .addGap(51, 51, 51)
                        .addComponent(jogarNovamenteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palavraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chutarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Jogo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String[] carros = new String[] {"celta", "fusca", "elantra", "hylux", "impala"};
    String[] novelas = new String[] {"senhora", "gabriela", "pantanal", "chiquititas", "carrossel"};
    String[] filmes = new String[] {"fragmentado", "vidro", "shrek", "interestelar", "narnia"};
    
    public String sortear(int id) {
        int random = (int) (Math.random() * 5);

        String palavraAleatoria = "";

        switch (id) {
            case 1:
                palavraAleatoria = carros[random];
                break;
            case 2:
                palavraAleatoria = novelas[random];
                break;
            case 3:
                palavraAleatoria = filmes[random];
                break;
        }
        
        return palavraAleatoria;
    }
    
    public void setTema(String tema) {
        temaLabel.setText("Tema: " + tema);
    }
    
    public void definirPalavra(int id) {
        palavraArray = sortear(id).toCharArray();

        for(int i = 0; i < palavraArray.length; i++) {
           palavraSecreta += "_";
           palavraSecretaTexto += "_ ";
        }

        palavraLabel.setText(palavraSecretaTexto);
                
        switch(id){
            case 1:
                setTema("Carros");
                break;
            case 2:
                setTema("Novelas");
                break;
            case 3:
                setTema("Filmes");
                break;
        }
    }
    
    public void resetGame() {
        palavraSecreta = "";
        palavraSecretaTexto = "";

        palavraArray = new char[0];
        palavraSecretaArray = new char[0];
        
        chutes = new ArrayList<Character>();
        
        jogarNovamenteButton.setVisible(false);
        
        informacaoLabel.setText("Insira a letra:");
        letrasLabel.setText("");

        this.jTabbedPane1.setSelectedIndex(0);
        erros = 0;
        
        this.jTabbedPane1.setEnabledAt(1, false);
        
        cabecaImg.setVisible(false);
        corpoImg.setVisible(false);
        bracoEsqImg.setVisible(false);
        bracoDirImg.setVisible(false);
        pernaEsqImg.setVisible(false);
        pernaDirImg.setVisible(false);
    }

    String palavraSecreta = "";
    String palavraSecretaTexto = "";

    char[] palavraArray;
    char[] palavraSecretaArray;

    ArrayList<Character> chutes = new ArrayList<Character>();

    int erros = 0;

    private void jogarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarBotaoActionPerformed
        resetGame();
        if (this.carrosRadio.isSelected() || this.novelasRadio.isSelected() || this.filmesRadio.isSelected()) {

            this.jTabbedPane1.setSelectedIndex(1);
            this.jTabbedPane1.setEnabledAt(1, true);

            if (carrosRadio.isSelected()) {
                definirPalavra(1);
            } else if (novelasRadio.isSelected()) {
                definirPalavra(2);
            } else if (filmesRadio.isSelected()) {
                definirPalavra(3);
            }

            palavraSecretaArray = palavraSecreta.toCharArray();
        }
    }//GEN-LAST:event_jogarBotaoActionPerformed

    private void chutarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chutarBotaoActionPerformed
        boolean acertou = false;
        boolean ganhou = false;
        
        char[] letrasArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        ArrayList<Character> letras = new ArrayList<Character>();

        for(char letra : letrasArray){
            letras.add(letra);
        }
        
        if (erros == 6) {
            informacaoLabel.setText("Você perdeu!!!");
            jogarNovamenteButton.setVisible(true);
            return;
        }

        if (letraTextField.getText().length() > 1) {
            informacaoLabel.setText("Insira apenas uma letra!");
            return;
        }
        
        if (letraTextField.getText().length() == 0) {
            informacaoLabel.setText("Insira uma letra!");
            return;
        }

        if (!(letras.contains(letraTextField.getText().charAt(0)))) {
            informacaoLabel.setText("Insira apenas letras (A - Z)!");
            return;
        }
        
        char tentativa = letraTextField.getText().toLowerCase().charAt(0);

        if (chutes.contains(tentativa)) {
            informacaoLabel.setText("Essa letra já foi!");
            return;
        }

        chutes.add(tentativa);

        String letrasTexto = "";
        for (int i = 0; i < chutes.size(); i++) {
            letrasTexto += chutes.get(i) + ",";
        }

        letrasLabel.setText(letrasTexto);

        for (int i = 0; i < palavraArray.length; i++) {
            if (tentativa == palavraArray[i]) {
                palavraSecretaArray[i] = tentativa;
                acertou = true;
            }
        }

        if (!acertou) {
            erros++;
        }
        
        switch (erros) {
            case 1:
                cabecaImg.setVisible(true);
                break;
            case 2:
                corpoImg.setVisible(true);
                break;
            case 3:
                bracoEsqImg.setVisible(true);
                break;
            case 4:
                bracoDirImg.setVisible(true);
                break;
            case 5:
                pernaEsqImg.setVisible(true);
                break;
            case 6:
                pernaDirImg.setVisible(true);
                break;    
        }
        
        if (erros == 6) {
            informacaoLabel.setText("Você perdeu!!!");
            jogarNovamenteButton.setVisible(true);
            letraTextField.setText("");
            return;
        }

        palavraSecretaTexto = "";
        for (int i = 0; i < palavraArray.length; i++) {
            palavraSecretaTexto += palavraSecretaArray[i] + " ";
        }

        palavraLabel.setText(palavraSecretaTexto);

        int quantLetrasAcertadas = 0;
        for (int i = 0; i < palavraArray.length; i++) {
            if (palavraSecretaArray[i] == palavraArray[i]) {
                quantLetrasAcertadas++;
                if (quantLetrasAcertadas == palavraArray.length) {
                    ganhou = true;
                }
            }
        }

        informacaoLabel.setText("Insira a letra:");

        if (ganhou) {
            informacaoLabel.setText("Você ganhou!!!");
            jogarNovamenteButton.setVisible(true);
        }
        
        letraTextField.setText("");
    }//GEN-LAST:event_chutarBotaoActionPerformed

    private void jogarNovamenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarNovamenteButtonActionPerformed
        // TODO add your handling code here:
        resetGame();
    }//GEN-LAST:event_jogarNovamenteButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoDaForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaForca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bracoDirImg;
    private javax.swing.JLabel bracoEsqImg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cabecaImg;
    private javax.swing.JRadioButton carrosRadio;
    private javax.swing.JButton chutarBotao;
    private javax.swing.JLabel cordaImg;
    private javax.swing.JLabel corpoImg;
    private javax.swing.JRadioButton filmesRadio;
    private javax.swing.JLabel informacaoLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jogarBotao;
    private javax.swing.JButton jogarNovamenteButton;
    private javax.swing.JTextField letraTextField;
    private javax.swing.JLabel letrasLabel;
    private javax.swing.JLabel letrasSorteadasLabel;
    private javax.swing.JRadioButton novelasRadio;
    private javax.swing.JLabel palavraLabel;
    private javax.swing.JLabel pernaDirImg;
    private javax.swing.JLabel pernaEsqImg;
    private javax.swing.JLabel temaLabel;
    // End of variables declaration//GEN-END:variables
}
