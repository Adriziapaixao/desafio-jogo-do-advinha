import java.util.Random;
import java.util.Scanner;


public class JogoAdvinha {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        Random random = new Random();
        int pontosUsuario = 0;
        char continuar;

        System.out.println("*** Vamos começar nosso jogo do advinha!***");

        do {
            int numeroSorteado = random.nextInt(60) + 1;

            System.out.print("Digite seu palpite entre 1 a 60: ");
            int palpiteUsuaio = scr.nextInt();

            int pontos = 10;
            if (palpiteUsuaio == numeroSorteado) {

                pontos = 10;
                System.out.println("Parabéns! Você é sortudo e acertou o número!");
            } else if (Math.abs(palpiteUsuaio - numeroSorteado) == 1) {

                pontos = 5;
                System.out.println("Êta, chegou perto!");
            } else {

                pontos = 0;
                System.out.println("Não foi dessa vez! Tente novamente.");
            }

            System.out.println("Numero Sorteado: " + numeroSorteado);
            System.out.println("Pontos da rodada: " + pontos);

            pontosUsuario += pontos;

            System.out.print("Deseja jogar novamente? (S/N): ");
            continuar = scr.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Pontuação total: " + pontosUsuario);
        System.out.println("Obrigada pela participação!");

        scr.close();
    }
}
