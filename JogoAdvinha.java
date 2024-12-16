import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class JogoAdvinha {

    public static void main(String[] args){

       try {
           Scanner scr = new Scanner(System.in);
           Random random = new Random();
           int pontosUsuario = 0;
           char continuar;
           List<Integer> acertos = new ArrayList<>();
           List<Integer> aproximados = new ArrayList<>();
           List<Integer> erros = new ArrayList<>();


           System.out.println("*** Vamos começar nosso jogo do advinha!***");
           System.out.println("Qual nível de dificuldade você prefere: ");
           System.out.println("1. Nível Fácil (1 a 10)");
           System.out.println("2. Nível Médio (1 a 50)");
           System.out.println("3. Nível Difícil (1 a 100)");
           int nivel = scr.nextInt();

           int numeroMax = getNumeroMax(nivel);
    
            do {
                int numeroSorteado = random.nextInt(numeroMax) + 1;
                //System.out.println(numeroSorteado);
    
                System.out.print("Digite seu palpite entre 1 a " + numeroMax + ": ");
                int palpiteUsuaio = scr.nextInt();
    
                int pontos = calculePontos(numeroSorteado, palpiteUsuaio);
    
                System.out.println(obtenhaMensagem(numeroSorteado, palpiteUsuaio));
                System.out.println("Numero Sorteado: " + numeroSorteado);
                System.out.println("Pontos da rodada: " + pontos);
    
                pontosUsuario += pontos;

                if (pontos == 10){
                    acertos.add(palpiteUsuaio);
                } else if (pontos == 5) {
                    aproximados.add(palpiteUsuaio);
                } else {
                    erros.add(palpiteUsuaio);
                }
    
                System.out.print("Deseja jogar novamente? (S/N): ");
                continuar = scr.next().toUpperCase().charAt(0);
    
            } while (continuar == 'S');
    
            System.out.println("Pontuação total: " + pontosUsuario);
            System.out.println("Números que você acertou : " + acertos);
            System.out.println("Números que você aproximou : " + aproximados);
            System.out.println("Números que você errou: " + erros);
            System.out.println("Obrigada pela participação!");

        } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    private static int getNumeroMax(int nivel) {
        return switch (nivel) {

            case 1 -> 10; //Fácil
            case 2 -> 50; //Médio
            case 3 -> 100; //Difícil

            default -> throw new IllegalStateException("Tente novamente escolhendo entre os níveis (1. fácil, 2. médio e 3. difícil): ");
        };
    }

    private static int calculePontos(int numeroSorteado, int palpiteUsuario) {
        
        if (palpiteUsuario == numeroSorteado){
            return 10;
        } else if (Math.abs(palpiteUsuario - numeroSorteado) == 1) {
            return 5;
        } else {
            return 0;
        }
    }

    private static String obtenhaMensagem(int numeroSorteado, int palpiteUsuario) {
        if (palpiteUsuario == numeroSorteado){
            return "Parabéns! Você acertou o número!";
        } else if (Math.abs(palpiteUsuario - numeroSorteado) == 1) {
            return "Êta, chegou perto!";
        } else {
            return "Não foi dessa vez! Tente novamente.";
        }
    }
}
