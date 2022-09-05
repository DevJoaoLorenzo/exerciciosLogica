import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code, qnt;
		double total=0.0;
		System.out.println("Cardapio:\n");
		System.out.println("Codigo --- Produto --- Valor (R$)\n");
		System.out.println("1 --- Refrigerante --- 2,50\n");
		System.out.println("2 --- Bolo ----------- 3,50\n");
		System.out.println("3 --- Torrada -------- 4,50\n");
		System.out.println("4 --- Picadinho ------ 10,00\n");
		System.out.println("5 --- Agua mineral --- 2,00\n");
		System.out.println("99 -- Finalizar --- \n");
		do {
			System.out.println("Insira o código do produto: ");
			code = sc.nextInt();
			if(code==99) {
				System.out.println("Pedido finalizado.");
				break;
			}
			System.out.println("Insira a quantidade: ");
			qnt = sc.nextInt();
			switch(code) {
				case 1:
					total+= qnt*2.50;
					break;
				case 2:
					total+= qnt*3.50;
					break;
				case 3:
					total+= qnt*4.50;
					break;
				case 4:
					total+= qnt*10.00;
					break;
				case 5:
					total+= qnt*2.00;
					break;
				default:
					System.out.println("Código inválido! ");
					break;
			}
		}while(code!=99);
		System.out.printf("O total do pedido foi de R$%.2f", total);
		
		sc.close();

	}

}
