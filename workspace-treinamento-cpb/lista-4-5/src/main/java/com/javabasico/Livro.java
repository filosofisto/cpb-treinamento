package com.javabasico;

public class Livro {

	private String isbn;
	private String titulo;
	private String autor;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public int hashCode() {
		return getIsbn().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Livro) {
			Livro outro = (Livro) obj;
			
			return getIsbn().equals(outro.getIsbn());
		}
		
		return false;
	}
	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + ", autor="
				+ autor + "]";
	}
}
