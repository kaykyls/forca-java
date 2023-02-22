package view;

public class Palavras {
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
}