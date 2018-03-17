package lista5;

import java.util.Scanner;

/**
 *
 * @author Hope(less)
 */
public class Ex6 {
    public static void main(String[] args) {
        /**
         * 6.	Repita o exercício anterior lendo a quantidade de jogadores que vão jogar.
         * Para cada jogador, leia seu nome e o cartão de respostas (resposta(6)).
         * Ao final do procedimento, informar o nome e a quantidade de acertos no jogador que mais acertou e que menos acertou
         * (suponha que nenhum jogador acertou a mesma quantidade de números).
         */
        Scanner scan = new Scanner(System.in);
        int[] resultado = new int[6];  
        String maisAcertos="", menosAcertou="";
        int acertos = 0, nMaisAcertos = 0, nMenosAcertos = 6;
        
        
        System.out.println("Números sorteados \n");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println((i + 1) + "º: ");        //Números sorteados
            resultado[i] = scan.nextInt();
        }
        
        System.out.println("Informe a quantidade de jogadores que participarão: ");
        int nJogadores = scan.nextInt();                                        //Número de jogadores que vão participar
        String[] nomesPlayers = new String[nJogadores];
        
        int[][] apostas = new int[nJogadores][6];
        int[] totalAcertos = new int[nJogadores];
        
        int iDados = 0;
        do{
            System.out.println("\nNome do jogador: ");
            nomesPlayers[iDados] = scan.next();
            System.out.println("\n - - Aposta do jogador - - ");        //ler nome e apostas de cada jogador
            for(int i = 0; i < apostas[1].length; i++){
                System.out.println((i+1)+"º número: ");
                apostas[iDados][i] = scan.nextInt();
            }
            iDados++;
        }while(iDados < nJogadores);
        
        for(int i = 0; i < nJogadores; i++){ //passando por cada jogador
            for(int j = 0; j < resultado.length; j++){ //comparando o resultado final
                for(int k = 0; k < apostas[1].length; k++){ //com o palpite do jogador
                    if(resultado[j]==apostas[i][k]){
                        acertos++;
                        
                    }
                }
            }
            totalAcertos[i] = acertos;
            acertos = 0;
            System.out.println(totalAcertos[i]);
        }
        for(int i = 0; i < nJogadores; i++){
            if(totalAcertos[i] > nMaisAcertos){
                nMaisAcertos = totalAcertos[i];
                maisAcertos = nomesPlayers[i];
            }
            if(totalAcertos[i] < nMenosAcertos){
                nMenosAcertos = totalAcertos[i];
                menosAcertou = nomesPlayers[i];
            }
        }
        System.out.println("\n - - - - - - -");
        if(nMaisAcertos == 6){
            System.out.println("Mais acertou: "+maisAcertos+" / Total de acertos: "+nMaisAcertos+" - G A N H A D O R");
        }else{
            System.out.println("Mais acertou: "+maisAcertos+" / Total de acertos: "+nMaisAcertos);
        }
        System.out.println("Menos acertou: "+menosAcertou+" / Total de acertos: "+nMenosAcertos);
    }
}
