package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import vo.Doador;
import Controller.Database;

public class DoadorController {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Doador> doadores = new ArrayList<>();
		
		public static void main(String[] args) {
			
			int opcao;
			Scanner entrada = new Scanner(System.in);
			
			do {
				menu();
				opcao = entrada.nextInt();
				
				switch (opcao) {
				case 1:{
					cadastrarDoador();
					break;
				}
				
				case 2:{
					cadastrarDoacao();
					break;
				}
				case 3: {
					fim();
					break;
				}

				default:
					System.out.println("Opção inválida!!! Digite uma opção válida!!!");
				}
				
			}while(opcao != 0 || opcao == 0);
			
		}

		private static void cadastrarDoador() {
			// TODO Auto-generated method stub
			System.out.println("Você escolheu a Cadastrar Doador:");
			
                 
			Doador doador = new Doador();
			System.out.println("Digite o CPF: ");
			String a = sc.nextLine();
			doador.getCpf();
			
			System.out.println("Digite o Tipo Sanguineo");
			String b = sc.nextLine();
			doador.getTipoSanguineo();
			
			for (int i = 0; i < doadores.size(); i++) {
                Doador doador1 = doadores.get(i);
                if (doador1 != null) {
                    System.out.println("CPF " + doador.getCpf());
                    System.out.println("Tipo Sanguíneo " + doador.getTipoSanguineo());

                }
			}

		}
			
		
		private static void cadastrarDoacao() {
			// TODO Auto-generated method stub
			
			Doador doador = new Doador();
			System.out.println("Digite o Tipo Sanguineo: ");
			String a = sc.nextLine();
			doador.getTipoSanguineo();
			
			System.out.println("Digite a quantidade de Doações: ");
			String b = sc.nextLine();
			doador.getQuantidade();
			
			for (int i = 0; i < doadores.size(); i++) {
                Doador doador2 = doadores.get(i);
                if (doador2 != null) {
                    System.out.println("Tipo Sanguíneo " + doador.getTipoSanguineo());
                    System.out.println("Quantidade de Doações " + doador.getQuantidade());
                }
            }
			
		}

		private static void menu() {
			// TODO Auto-generated method stub
			System.out.println("1 - Cadastrar Doador");
			System.out.println("2 - Cadastrar Doação");
			
		}	
		
		private static void fim() {
			// TODO Auto-generated method stub
			System.out.println("A aplicação foi encerrada!");

	        System.exit(0);
		}
}
