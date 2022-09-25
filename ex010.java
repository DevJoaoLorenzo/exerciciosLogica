import java.util.Scanner;

public class ex010 {
//    Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//    terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//    o vetor C gerado.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite o tamanho que vai ser cada vetor: ");
        n = sc.nextInt();
        int[] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetC = new int[n];
        System.out.println("Digite os valores no vetor A: ");
        for (int i=0;i<vetA.length;i++){
            System.out.printf("%do valor: ", i+1);
            vetA[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Digite os valores no vetor B: ");
        for (int i=0;i<vetB.length;i++){
            System.out.printf("%do valor: ", i+1);
            vetB[i] = sc.nextInt();
        }
        for (int i=0;i<vetC.length;i++){
            vetC[i] = vetA[i]+vetB[i];
        }
        System.out.println();
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.print("Vetor B: ");
        for (int i : vetB) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.print("Vetor C: ");
        for (int i : vetC) {
            System.out.printf("%d ", i);
        }

        sc.close();
    }
}
