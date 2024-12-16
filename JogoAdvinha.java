import java.util.Random;
import java.util.Scanner;


public class JogoAdvinha {

    public static void main(String[] args){

       try {
           Scanner scr = new Scanner(System.in);       
            Random random = new Random();
            int pontosUsuario = 0;
            char continuar;

            System.out.println("*** Vamos começar nosso jogo do advinha!***");
    
            do {
                int numeroSorteado = random.nextInt(20) + 1;
    
                System.out.print("Digite seu palpite entre 1 a 60: ");
                int palpiteUsuaio = scr.nextInt();
    
                int pontos = calcularPontos(numeroSorteado, palpiteUsuaio);
    
                System.out.println(obterMensagem(numeroSorteado, palpiteUsuaio));    
                System.out.println("Numero Sorteado: " + numeroSorteado);
                System.out.println("Pontos da rodada: " + pontos);
    
                pontosUsuario += pontos;
    
                System.out.print("Deseja jogar novamente? (S/N): ");
                continuar = scr.next().toUpperCase().charAt(0);
    
            } while (continuar == 'S');
    
            System.out.println("Pontuação total: " + pontosUsuario);
            System.out.println("Obrigada pela participação!");
        } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }

    private static int calcularPontos(int numeroSorteado, int palpiteUsuaio) {
        
        if (palpiteUsuaio == numeroSorteado){
            return 10;
        } else if (Math.abs(palpiteUsuaio - numeroSorteado) == 1) {
            return 5;
        } else {
            return 0;
        }
    }

    private static String obterMensagem(int numeroSorteado, int palpiteUsuario) {
        if (palpiteUsuario == numeroSorteado){
            return "Parabéns! Você acertou o número!";
        } else if (Math.abs(palpiteUsuario - numeroSorteado) == 1) {
            return "Êta, chegou perto!";
        } else {
            return "Não foi dessa vez! Tente novamente.";
        }
    }
}
