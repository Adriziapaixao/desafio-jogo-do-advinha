# desafio-jogo-do-advinha

<h3 align="center"> Este é um jogo de adivinhação simples, desenvolvido para rodar no console, onde o usuário tenta adivinhar números sorteados pelo sistema. O jogo utiliza condicionais para implementar a lógica de vitória ou derrota e oferece diferentes níveis de dificuldade.
</h3>

## Como Jogar

1. Execute o programa no console.
2. Escolha o nível de dificuldade desejado.
3. Insira seu palpite quando solicitado.
4. O sistema informará se você ganhou pontos e exibirá sua pontuação total.
5. Escolha se deseja continuar jogando ou encerrar o jogo.
6. Ao encerrar o jogo, o sistema exibirá sua pontuação final e um resumo dos números acertados, aproximados e errados.


## Como funciona a pontuação:

<h3 align="center">

  Exemplo  | Total
---------- | ---------
 Acerto    | 10 pontos
 Aproximado| 5 pontos
   Erro    |     0
</h3>

## Exemplo de Uso

```plaintext
Bem-vindo ao Jogo do Adivinha!
Escolha o nível de dificuldade:
1 - Fácil (1 a 10)
2 - Médio (1 a 50)
3 - Difícil (1 a 100)
Digite sua escolha: 1

Rodada 1:
Digite seu palpite: 5
O número sorteado foi: 6
Você ganhou 5 pontos!
Pontuação total: 5
Deseja continuar jogando? (s/n): s

Rodada 2:
Digite seu palpite: 3
O número sorteado foi: 3
Parabéns! Você acertou o número e ganhou 10 pontos!
Pontuação total: 15
Deseja continuar jogando? (s/n): n

Jogo encerrado!
Pontuação final: 15
Números acertados: [3]
Números aproximados: [6]
Números errados: []