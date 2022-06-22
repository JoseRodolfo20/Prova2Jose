package Controller;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import vo.Doador;
import Controller.DoadorController;

public class Database {
	
	private static ArrayList<Doador> doadores = new ArrayList<>();
	private static Map<String, Long> estoqueSanquineo = null;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		do {
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:{
				for(Doador doador1 : doadores) {
					System.out.println("Lista de Cadastrados: " + doador1);
					break;
				}
			}
			
			case 2:{
				for(Doador doador2 : doadores) {
					System.out.println("Lista de Cadastrados: " + doador2);
					break;
				}
			}

			default:
				System.out.println("Op��o inv�lida!!! Digite uma op��o v�lida!!!");
			}
			
		}while(opcao != 0 || opcao == 0);
		
	}
}
