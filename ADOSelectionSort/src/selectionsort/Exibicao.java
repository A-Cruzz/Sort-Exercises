
package selectionsort;

import java.util.Scanner;

public class Exibicao {

    public static void Exibicao(){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Informe a quantidade de valores a serem inseridos: ");
        int tamanhoVetor = leitor.nextInt();
        System.out.println("");
        
        int Vetor[] = new int[tamanhoVetor];
        
        for (int i = 0; i < Vetor.length; i++) {
            System.out.printf("Informe o valor do %dº campo: ",i + 1);
            Vetor[i] = leitor.nextInt();      
        }
        
        OrdenacaoSelecao.Ordenacao(Vetor);
        
        for (int i = 0; i < Vetor.length; i++) {
            System.out.printf("[%d] ",Vetor[i]);
        }
        System.out.println("");
        
    }
}
