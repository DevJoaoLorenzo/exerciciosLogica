import java.util.Scanner;

public class ex004 {
	/* Um marciano chegou a uma floresta e se escondeu atrás de uma das 100 árvores quando viu um caçador.
	O caçador só tinha cinco balas em sua espingarda. Cada vez que ele atirava, e não acertava, é claro, o marciano dizia:
	“estou mais à direita ou mais à esquerda. Se o caçador não conseguir acertar o marciano, ele será levado para marte.
	Implementar este jogo para dois jogadores, onde um escolhe a árvore em que o marciano irá se esconder, e o outro tenta acertar.
	(Sugestão: utilize números para representar as árvores)
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arvore, tiro, acertos=0;
		System.out.println("REGRAS DO JOGO: ");
		System.out.println("O MARCIANO PODE SE ESCONDER ENTRE 100 ARVORES, OU SEJA, DO 0 AO 100");
		System.out.println("O CAÇADOR DEVERA ACERTAR A ARVORE");
		System.out.println("CASO ERRE 5 VEZES, SERA ABDUZIDO, CASO CONTRARIO, SAIRA VIVO");
		do {
			System.out.println("Em qual arvore o Marcioano ira se esconder? ");
			arvore = sc.nextInt();
		} while(arvore < 0 || arvore > 100);
		for(int i=0;i<5;i++) {
			System.out.println("Em qual arvore o caçador ira atirar? ");
			tiro = sc.nextInt();
			if(tiro==arvore) {
				System.out.println("Acertou!!!");
				acertos++;
				break;
			} else if(tiro<arvore) {
				System.out.println("Marciona esta a DIREITA");
			} else if(tiro>arvore) {
				System.out.println("Marciona esta a ESQUERDA");
			} 
		}
		if(acertos==0) {
			System.out.println("CAÇADOR ABDUZIDO!");
			System.out.printf("A arvore escolhida era a %d. Foi quase...", arvore);
		} else {
			System.out.println("O CAÇADOR CONSEGUIU!!!!");
		}
		sc.close();
	}

}
