package view;

import java.util.*;

public class JogoDaForca extends javax.swing.JFrame {
    public JogoDaForca() {
        initComponents();
        this.jTabbedPane1.setEnabledAt(1, false);
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
        temaText = new javax.swing.JLabel();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
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

        temaText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        temaText.setText("Tema: tema");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(palavraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temaText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chutarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(letrasSorteadasLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(letraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(informacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(letrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letrasSorteadasLabel)
                    .addComponent(temaText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(letrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                        .addComponent(informacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(chutarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(palavraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        temaText.setText("Tema: " + tema);
    }
    
    String palavra = "";
    String palavraSecreta = "";
    String palavraSecretaTexto = "";
    
    char[] palavraArray;
    char[] palavraSecretaArray;
    
    ArrayList <Character> chutes = new ArrayList<Character>();
    
    
    int erros = 0;
    
    private void jogarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarBotaoActionPerformed

        if(this.carrosRadio.isSelected() || this.novelasRadio.isSelected() || this.filmesRadio.isSelected()) {
            Palavras palavras = new Palavras();
            
            this.jTabbedPane1.setSelectedIndex(1);
            this.jTabbedPane1.setEnabledAt(1, true);
            
            if(carrosRadio.isSelected()) {    
                palavra = palavras.sortear(1);
                
                for(int i = 0; i < palavra.length(); i++) {
                    palavraSecreta += "_";
                    palavraSecretaTexto += "_ ";
                }

                palavraLabel.setText(palavraSecretaTexto);
                setTema("Carros");
            } else if (novelasRadio.isSelected()) {
                palavra = palavras.sortear(2);
                
                for(int i = 0; i < palavra.length(); i++) {
                    palavraSecreta += "_";
                    palavraSecretaTexto += "_ ";
                }
                
                palavraLabel.setText(palavraSecretaTexto);
                setTema("Novelas");
            } else if(filmesRadio.isSelected()) {
                palavra = palavras.sortear(3);
                
                for(int i = 0; i < palavra.length(); i++) {
                    palavraSecreta += "_";
                    palavraSecretaTexto += "_ ";
                }
                
                palavraLabel.setText(palavraSecretaTexto);
                setTema("Filmes");
            }
            
            palavraArray = palavra.toCharArray();
            palavraSecretaArray = palavraSecreta.toCharArray();
        }
    }//GEN-LAST:event_jogarBotaoActionPerformed

    private void chutarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chutarBotaoActionPerformed
        boolean acertou = false;
        boolean ganhou = false;
        
        if(erros < 6) {
            if(letraTextField.getText().length() == 1) {
                char tentativa = letraTextField.getText().charAt(0);
                
                if (!chutes.contains(tentativa)) {
                    chutes.add(tentativa);

                    String letrasTexto = "";
                    for(int i = 0; i < chutes.size(); i++) {
                        letrasTexto += chutes.get(i) + ",";
                    }

                    letrasLabel.setText(letrasTexto);

                    for(int i = 0; i < palavra.length(); i++) {
                        if(tentativa == palavraArray[i]) {
                            palavraSecretaArray[i] = tentativa;
                            acertou = true;
                        }
                    }

                    if(!acertou) {
                        erros++;
                    }

                    palavraSecretaTexto = "";
                    for(int i = 0; i < palavra.length(); i++) {
                        palavraSecretaTexto += palavraSecretaArray[i] + " ";
                    }

                    palavraLabel.setText(palavraSecretaTexto);

                    int quantLetrasAcertadas = 0;
                    for(int i = 0; i < palavra.length(); i++) {
                        if(palavraSecretaArray[i] == palavraArray[i]){
                            System.out.println("1: " + palavraSecretaArray[i] + "   2: " + palavraArray[i]);
                            System.out.println("ENTROU IF 1");

                            quantLetrasAcertadas++;
                            if(quantLetrasAcertadas == palavra.length()) {
                                System.out.println("ENTROU IF 2");
                                ganhou = true;
                            }
                        }
                    }
                    
                    informacaoLabel.setText("Insira a letra:");

                    if(ganhou) {
                        informacaoLabel.setText("Você ganhou!!!");
                    }
                } else {
                    informacaoLabel.setText("Essa letra já foi!");
                }
                

            } else {
                informacaoLabel.setText("Insira apenas uma letra!");
            }
        } else {
            informacaoLabel.setText("Você perdeu!!!");
        }
    }//GEN-LAST:event_chutarBotaoActionPerformed


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
    private javax.swing.JTextField letraTextField;
    private javax.swing.JLabel letrasLabel;
    private javax.swing.JLabel letrasSorteadasLabel;
    private javax.swing.JRadioButton novelasRadio;
    private javax.swing.JLabel palavraLabel;
    private javax.swing.JLabel temaText;
    // End of variables declaration//GEN-END:variables
}
