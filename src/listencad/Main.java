package listencad;

import java.util.Scanner;

public class Main {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		int tam, i;
		float valor = 0;
		System.out.println("Digite o tamanho da lista encadeada: ");
		tam = scanner.nextInt();
		ListEncad l = new ListEncad();
		System.out.println("Digite números inteiros: ");
		for(i=0; i < tam; i++){
			valor = scanner.nextFloat();
			l.InserePri(valor);
		}
		l.Inicio();
		l.imprime();
		scanner.close();
	}
}
