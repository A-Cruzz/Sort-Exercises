package ordenacao;

public class OrdenacaoSelecao {
    
    public static void OrdenaporSelecao(String[] Vetor){
        
        int min,aux;
        
        for (int i = 0; i < Vetor.length - 1; i++){
            min = i;
            for (int j = (i + 1); j < Vetor.length; j++) {
                if (Vetor[j].compareTo(Vetor[min] > 0)){
                    min = j;
                }
            }
            
            if (i != min) {
                aux = Vetor[i];
                Vetor[i] = Vetor[min];
                Vetor[min] = aux;
            }
        }
    }
}
