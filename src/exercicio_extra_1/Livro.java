package exercicio_extra_1;

public class Livro extends ItemBiblioteca {
	
	public String autor;
	public int numero_paginas;
	public String ISBN;

	public void detalhes() {
		super.detalhes();
		System.out.println("e seu autor é " + this.autor);
	}
}
