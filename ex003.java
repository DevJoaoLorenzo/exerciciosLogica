import java.util.Scanner;

public class ex003 {
	//Escreva um algoritmo que, dados vinte números, informe qual a diferença entre o menor valor lido e o maior.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, maior, menor, cont;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		maior=num;
		menor=num;
		for(cont=0;cont<6;cont++) {
			System.out.println("Digite outro número: ");
			num = sc.nextInt();
			if(num>maior)
				maior=num;
			if(num<menor)
				menor=num;
		}
		System.out.printf("Maior valor: %d \nMenor valor: %d ", maior,menor);
		System.out.printf("\nDiferença entre eles: %d", maior - menor);
		sc.close();
	}

}
