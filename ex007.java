import java.util.Scanner;

public class ex007 {
	
//	Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. 
//	Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int l1 = i;
			int l2 = i*i;
			int l3 = i*i*i;
			System.out.printf("%d %d %d\n", l1,l2,l3);
		}
		sc.close();
	}
}
