import java.util.Scanner;

public class ex002 {
	//Elabore um algoritmo que, dada uma quantidade indeterminada de números, 
	//um de cada vez, conte  quantos números foram fornecidos e encontre o maior deles, mostrando estas informações
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0, cont=0;
		int maior=num;
		char criterio;
		
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			if(num>maior)
				maior = num;
			cont++;
			System.out.println("Deseja inserir mais um número? ");
			criterio = sc.next().charAt(0);
			
		} while(criterio=='s');
		
		System.out.printf("Total de números lidos: %d\n", cont);
		System.out.printf("Maior número lido: %d", maior);
		
		sc.close();

	}

}
