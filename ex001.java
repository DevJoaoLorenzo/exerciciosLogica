import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		/*Imagine uma brincadeira entre dois
		colegas, na qual um pensa um número e o outro deve fazer chutes até acertar o
		número imaginado. Como dica, a cada tentativa é dito se o chute foi “ALTO” ou
		foi “BAIXO”.
		Elabore um algoritmo dentro deste
		contexto, que leia o número imaginado e os chutes, ao final mostre quantas
		tentativas foram necessárias para descobrir o número.*/
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		int cont=1;
		
		System.out.println("Pense em um número e o digite aqui: ");
		n1=sc.nextInt();
		System.out.println("Qual número você acha que seu amigo pensou? ");
		n2=sc.nextInt();
		
		if(n2==n1) {
			System.out.printf("Acertou na tentativa %d", cont);
		}
		else {
			while(n2!=n1) {
				if(n2>n1) {
					System.out.println("Chute ALTO, tente de novo.");
					n2=sc.nextInt();
				}
				else {
					System.out.println("Chute BAIXO, tente de novo.");
					n2=sc.nextInt();
				}
				cont++;
			}
			System.out.printf("Acertou em %d tentativas", cont);
		}
		
		sc.close();
	}
	
}
