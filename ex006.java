import java.util.Scanner;

public class ex006 {
	
	//Ler um número inteiro N e calcular todos os seus divisores.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número para descobrir quais sao seus divisores: ");
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.printf("%d\n", i);
			}
		}
		
		sc.close();

	}

}
