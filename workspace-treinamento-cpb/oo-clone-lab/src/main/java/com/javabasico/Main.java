package com.javabasico;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("1", "Omo", "Un");
		Produto p2 = new Produto("2", "Veja", "Lt");
		Produto p3 = new Produto("3", "Pendriver", "Un");
		
		ListaCompra listaCompra = new ListaCompra();
		listaCompra.adicionaProduto(p1);
		listaCompra.adicionaProduto(p2);
		listaCompra.adicionaProduto(p3);
		
		ListaCompra listaClone = listaCompra.clone();
		Produto[] produtos = listaClone.getProdutos();
		produtos[0].setDescricao("**omo**");
		
		System.out.println(p1.getDescricao());
		System.out.println(produtos[0].getDescricao());
	}
}
