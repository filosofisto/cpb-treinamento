package com.javabasico;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		init();
		
		try {
			menu();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void menu() throws IOException, ClassNotFoundException, SQLException {
		Teclado t = new Teclado();
		
		for (;;) {
			clearConsole();
			System.out.println("============ Menu ============");
			System.out.println("1. Incluir Pessoas");
			System.out.println("2. Listar Pessoas");
			System.out.println("3. Excluir Pessoa");
			System.out.println("4. Sair da Aplicacao");
			System.out.println("==============================");
			
			String opcao = t.read(">");
			
			if (opcao.equals("1")) {
				insert();
			} else if (opcao.equals("2")) {
				list();
			} else if (opcao.equals("3")) {
				delete();
			} else if (opcao.equals("4")) {
				System.out.println("By ;P");
				break;
			} else {
				System.out.println("Opcao invalida");
			}
		}
		
	}

	private static void clearConsole() {
		for (int i = 1; i < 15; i++) {
			System.out.println();
		}
	}

	private static void delete() throws ClassNotFoundException, SQLException, IOException {
		Teclado t = new Teclado();
		Connector connector = new Connector();
		PessoaDAO dao = new PessoaDAO(connector.makeConnection());
		
		System.out.println("Cadastro Pessoa");
		
		String cpf = t.read("CPF");
		
		dao.excluir(cpf);
		
		dao.closeConnection();
	}

	private static void list() throws ClassNotFoundException, SQLException {
		Connector connector = new Connector();
		PessoaDAO dao = new PessoaDAO(connector.makeConnection());
		
		System.out.println("Listagem de Pessoas");
		
		List<Pessoa> list = dao.listar();
		
		for (Pessoa p: list) {
			System.out.println(p);
		}
		
		dao.closeConnection();
	}

	private static void insert() throws IOException, ClassNotFoundException, SQLException {
		Teclado t = new Teclado();
		Connector connector = new Connector();
		PessoaDAO dao = new PessoaDAO(connector.makeConnection());
		
		System.out.println("Cadastro Pessoa");
		
		for(;;) {
			Pessoa pessoa = new Pessoa();
			
			pessoa.setCpf(t.read("CPF"));
			pessoa.setNome(t.read("Nome"));
			pessoa.setIdade(Integer.parseInt(t.read("Idade")));
			
			dao.incluir(pessoa);
			
			if (!t.read("Continuar [S/N]").equalsIgnoreCase("S")) {
				break;
			}
		}
		
		dao.closeConnection();
	}

	private static void init() {
		try {
			CreateTable createTable = new CreateTable();
			boolean criou = createTable.createPessoa();
			
			if (criou) {
				System.out.println("Tabela pessoa criada com sucesso");
			}
			
			System.out.println("Sistema iniciado");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
