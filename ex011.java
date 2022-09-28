import java.util.Scanner;

public class ex011 {
//    //Fazer um programa que leia dois números inteiros M e N, e de uma matriz
//    de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em
//    seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X,
//    mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m, n, x;
        System.out.println("Digite o número de linhas: ");
        m = sc.nextInt();
        System.out.println("Digite o número de colunas: ");
        n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Insira os elementos na matriz: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("Posição " + i + ", " + j + ":");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Insira um número pertencente a matriz: ");
        x = sc.nextInt();
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição " + i + ", " + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (j < n-1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < m-1) {
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
