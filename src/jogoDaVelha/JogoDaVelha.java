package jogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {

        Campo[][] velha = new Campo[3][3];
        char simboloAtual = 'X';
        Boolean game = true;
        String vitoria;
        Scanner leitor = new Scanner(System.in);

            iniciarJogo(velha);

            while (game) {
                desenhaJogo(velha);
                try {
                    if (verificaJogada(velha, jogar(leitor, simboloAtual), simboloAtual)) {
                        if (simboloAtual == 'X') {
                            simboloAtual = 'O';
                        } else
                            simboloAtual = 'X';
                    }
                } catch (Exception e) {
                    System.out.print("Erro");
                }
            }
            System.out.println("Fim do Jogo!");
    }

    public static void desenhaJogo(Campo[][] velha){
        System.out.println("  0    1    2");
        System.out.printf("0  %c  | %c | %c %n", velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("  --------------");
        System.out.printf("1  %c  | %c | %c %n", velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("  --------------");
        System.out.printf("2  %c  | %c | %c %n", velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    }
    public static void limparTela(){
        for(int cont=0; cont<200; cont++){
            System.out.println(" ");
        }
    }
    public static int[] jogar(Scanner leitor, char simboloAtual){
        int p[] = new int[2];
        System.out.printf("%s %c%n", "Quem joga: ", simboloAtual);
        System.out.print("informe a linha: ");
        p[0]= leitor.nextInt();
        System.out.print("Informe a coluna: ");
        p[1]= leitor.nextInt();
        return p;
    }
    public static Boolean verificaJogada(Campo[][] velha, int[] p, char simoboloAtual){
        if(velha[p[0]][p[1]].getSimbolo() == ' '){
            velha[p[0]][p[1]].setSimbolo(simoboloAtual);
            return true;
        }else{
            return false;
        }
    }
    public static void iniciarJogo(Campo[][]velha){
        for (int l=0; l<3; l++ ){
            for(int c=0; c<3; c++){
                velha[l][c] = new Campo();
            }
        }
    }
    public static String verificaVitoria(Campo[][] velha) {

        return " ";
    }
}