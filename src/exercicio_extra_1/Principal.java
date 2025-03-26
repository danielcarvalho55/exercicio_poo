package exercicio_extra_1;

public class Principal {

	public static void main(String[] args) {
		
		Livro harry_potter1 = new Livro();
		harry_potter1.ano_publicacao = 2002;
		harry_potter1.autor = "J K";
		harry_potter1.titulo = "Harry Potter 1";
		harry_potter1.ISBN = "a123";
		harry_potter1.numero_paginas = 491;
		
		Livro harry_potter2 = new Livro();
		harry_potter2.ano_publicacao = 2004;
		harry_potter2.autor = "J K";
		harry_potter2.titulo = "Harry Potter 2";
		harry_potter2.ISBN = "a101";
		harry_potter2.numero_paginas = 510;
		
		Livro harry_potter3 = new Livro();
		harry_potter3.ano_publicacao = 2002;
		harry_potter3.autor = "J K";
		harry_potter3.titulo = "Harry Potter 3";
		harry_potter3.ISBN = "a163";
		harry_potter3.numero_paginas = 638;
		
		Livro senhor_aneis = new Livro();
		senhor_aneis.ano_publicacao = 1946;
		senhor_aneis.autor = "Tolkien";
		senhor_aneis.ISBN = "b321";
		senhor_aneis.numero_paginas = 984;
		senhor_aneis.titulo = "O Senhor dos Anéis";
		
		Revista lp3 = new Revista();
		lp3.ano_publicacao = 2007;
		lp3.editora = "Coquetel";
		lp3.numero = 3;
		lp3.periodicidade = "Mensal";
		lp3.titulo = "Logic Pix n 3";
		
		Revista lp10 = new Revista();
		lp10.ano_publicacao = 2009;
		lp10.editora = "Coquetel";
		lp10.numero = 10;
		lp10.periodicidade = "Mensal";
		lp10.titulo = "Logic Pix n 10";
		
		Revista lp25 = new Revista();
		lp25.ano_publicacao = 2013;
		lp25.editora = "Coquetel";
		lp25.numero = 3;
		lp25.periodicidade = "Mensal";
		lp25.titulo = "Logic Pix n 25";
		
		Usuario fulano = new Usuario();
		fulano.id_usuario = 9958;
		fulano.nome = "Fulano";
		
		Usuario ciclano = new Usuario();
		ciclano.id_usuario = 3710;
		ciclano.nome = "Ciclano";
		
		fulano.setArray();
		ciclano.setArray();
		
		fulano.emprestar_item(harry_potter1);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		fulano.emprestar_item(lp25);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		fulano.emprestar_item(harry_potter2);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		ciclano.emprestar_item(lp10);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		ciclano.emprestar_item(senhor_aneis);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		ciclano.emprestar_item(harry_potter1);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		fulano.devolver_item(harry_potter1);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		fulano.devolver_item(lp3);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		ciclano.emprestar_item(harry_potter1);
		System.out.println(fulano.listar_itens());
		System.out.println(ciclano.listar_itens());
		
		harry_potter1.detalhes();
		
		lp3.detalhes();
	}
	
}
