package view;
import java.util.ArrayList;

public class JogoDaForca extends javax.swing.JFrame {

    public JogoDaForca() {
        initComponents();
        this.jTabbedPane1.setEnabledAt(1, false);
        jogarNovamenteButton.setVisible(false);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(filmesRadio);
        filmesRadio.setText("Filmes");
        filmesRadio.setAlignmentY(0.0F);

        buttonGroup1.add(novelasRadio);
        novelasRadio.setText("Novelas");

        buttonGroup1.add(carrosRadio);
        carrosRadio.setText("Carros");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(filmesRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novelasRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carrosRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(390, 390, 390))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(filmesRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novelasRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carrosRadio)
                .addGap(12, 12, 12)
                .addComponent(jogarBotao)
                .addGap(192, 192, 192))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(palavraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chutarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(letrasSorteadasLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(letraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(informacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(letrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addComponent(jogarNovamenteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letrasSorteadasLabel)
                    .addComponent(temaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jogarNovamenteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(informacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(chutarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(palavraLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    public void setTema(String tema) {
        temaLabel.setText("Tema: " + tema);
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
    }

//    String palavra = "";
    String palavraSecreta = "";
    String palavraSecretaTexto = "";

    char[] palavraArray;
    char[] palavraSecretaArray;

    ArrayList<Character> chutes = new ArrayList<Character>();

    int erros = 0;

    private void jogarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarBotaoActionPerformed
        resetGame();
        if (this.carrosRadio.isSelected() || this.novelasRadio.isSelected() || this.filmesRadio.isSelected()) {
            Palavras palavras = new Palavras();

            this.jTabbedPane1.setSelectedIndex(1);
            this.jTabbedPane1.setEnabledAt(1, true);

            if (carrosRadio.isSelected()) {
                //TODO: delertar variavel palavra e colocar .toCharArray no final de .sortear(), a variavel será palavraArray
                palavraArray = palavras.sortear(1).toCharArray();

                for (int i = 0; i < palavraArray.length; i++) {
                    palavraSecreta += "_";
                    palavraSecretaTexto += "_ ";
                }

                palavraLabel.setText(palavraSecretaTexto);
                setTema("Carros");
            } else if (novelasRadio.isSelected()) {
                palavraArray = palavras.sortear(2).toCharArray();

                for (int i = 0; i < palavraArray.length; i++) {
                    palavraSecreta += "_";
                    palavraSecretaTexto += "_ ";
                }

                palavraLabel.setText(palavraSecretaTexto);
                setTema("Novelas");
            } else if (filmesRadio.isSelected()) {
                palavraArray = palavras.sortear(3).toCharArray();

                for (int i = 0; i < palavraArray.length; i++) {
                    palavraSecreta += "_";
                    palavraSecretaTexto += "_ ";
                }

                palavraLabel.setText(palavraSecretaTexto);
                setTema("Filmes");
            }

//            palavraArray = palavra.toCharArray();
            palavraSecretaArray = palavraSecreta.toCharArray();
        }
    }//GEN-LAST:event_jogarBotaoActionPerformed

    private void chutarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chutarBotaoActionPerformed
        boolean acertou = false;
        boolean ganhou = false;
        char tentativa = letraTextField.getText().toLowerCase().charAt(0);

        if (!(erros < 5)) {
            informacaoLabel.setText("Você perdeu!!!");
            jogarNovamenteButton.setVisible(true);
            return;
        }

        if (!(letraTextField.getText().length() == 1)) {
            informacaoLabel.setText("Insira apenas uma letra!");
            return;
        }

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton carrosRadio;
    private javax.swing.JButton chutarBotao;
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
    private javax.swing.JLabel temaLabel;
    // End of variables declaration//GEN-END:variables
}
