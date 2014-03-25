package com.javabasico;

public class ListaCompra implements Cloneable {

	private Produto[] produtos;
	private int count;
	
	public ListaCompra() {
		produtos = new Produto[10];
		count = -1;
	}
	
	public void adicionaProduto(Produto produto) {
		produtos[++count] = produto;
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}
	
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	@Override
	public ListaCompra clone() {
		try {
			Produto[] cloneProds = new Produto[produtos.length];
			for (int i = 0; i < produtos.length; i++) {
				if (i == count) 
					break;
				
				cloneProds[i] = produtos[i].clone();
			}
			ListaCompra ret = (ListaCompra) super.clone();
			ret.setProdutos(cloneProds);
			
			return ret;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
