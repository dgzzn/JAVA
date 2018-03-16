package lista5;
/**
 * Espaço para melhora, parece ser o pior método de se fazer isso, mas é o que tem por enquanto.
 */
import java.util.Scanner;

/**
 *
 * @author Hope(less)
 */
public class Ex2 {
    public static void main(String[] args) {
        /*
        2.	Escrever um algoritmo que lê um array X(100) e o escreve. Substitua, a seguir,
        todos os valores 0 de X por 1 e, após todo esse processo, escreva novamente o array X.
         */
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int[] numeros2 = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + (i + 1) + "/" + numeros.length + "] Digite um número: ");    //preenche o array com números
            numeros[i] = scan.nextInt();

        }
        System.out.println("\n");
        for (int i = 0; i < numeros.length; i++) {  //printa o array
            System.out.println(numeros[i]);
        }
        System.out.println("\n - - - - - - - - - - - \n");
        for(int i = 0; i < numeros.length; i++){
            if(String.valueOf(numeros[i]).contains("0")){
                numeros2[i] = Integer.valueOf(String.valueOf(numeros[i]).replace("0", "1"));
            }else{
                numeros2[i] = numeros[i];
            }
            System.out.println(numeros2[i]);
        }
    }
}
