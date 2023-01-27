package view;

public class Palavras {
    String[] carros = new String[] {"Celta", "Fusca", "Elantra", "Hylux", "Impala"};
    String[] novelas = new String[] {"Senhora", "Gabriela", "Pantanal", "Chiquititas", "Carrossel"};
    String[] filmes = new String[] {"Fragmentado", "Vidro", "Shrek", "Interestelar", "Nárnia"};
    
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