package saida_dados;

import ordenacao.OrdenacaoSelecao;
import java.util.Scanner;

public class Exibicao {

    public static void VisualizaItens() {

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Informe a quantidade de nomes a serem inseridos: ");
        int tamanhoVetor = leitor.nextInt();
        System.out.println("");

        String Vetor[] = new String[tamanhoVetor];

        for (int i = 0; i < Vetor.length; i++) {
            System.out.printf("Informe o valor do %dº campo: ", i + 1);
            Vetor[i] = leitor.nextLine();
        }

        OrdenacaoSelecao.OrdenaporSelecao(Vetor);

        for (int i = 0; i < Vetor.length; i++) {
            System.out.printf("[%S] ", Vetor[i]);
        }
        System.out.println("");

    }
    
}
