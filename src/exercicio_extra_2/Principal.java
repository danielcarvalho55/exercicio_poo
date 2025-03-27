package exercicio_extra_2;

public class Principal {
	
	public static void main(String[] args) {
		
		PratoPrincipal batata = new PratoPrincipal();
		batata.nome = "Batata Frita";
		batata.descricao = "500g de batatinha frita";
		batata.set_preco(15.00f);
		batata.setArray();
		batata.adiciona_ingrediente("batata inglesa");
		batata.adiciona_ingrediente("bacon em cubo");
		
		PratoPrincipal arroz = new PratoPrincipal();
		arroz.nome = "Arroz Branco";
		arroz.descricao = "500g de arroz branco";
		arroz.set_preco(20.00f);
		arroz.setArray();
		arroz.adiciona_ingrediente("arroz");
		arroz.adiciona_ingrediente("alho");
		
		PratoPrincipal feijao = new PratoPrincipal();
		feijao.nome = "Feijão Roxo";
		feijao.descricao = "500g de feijão roxo de calda";
		feijao.set_preco(25.00f);
		feijao.setArray();
		feijao.adiciona_ingrediente("feijão roxo");
		feijao.adiciona_ingrediente("alho");
		
		PratoPrincipal arroz_grega = new PratoPrincipal();
		arroz_grega.nome = "Arroz à Grega";
		arroz_grega.descricao = "500g de arroz à grega";
		arroz_grega.set_preco(28.00f);
		arroz_grega.setArray();
		arroz_grega.adiciona_ingrediente("arroz");
		arroz_grega.adiciona_ingrediente("alho");
		arroz_grega.adiciona_ingrediente("brócolis");
		arroz_grega.adiciona_ingrediente("cenoura");
		
		PratoPrincipal feijao_torpedo = new PratoPrincipal();
		feijao_torpedo.nome = "Feijão Tropeiro";
		feijao_torpedo.descricao = "500g de feijão tropeiro";
		feijao_torpedo.set_preco(30.00f);
		feijao_torpedo.setArray();
		feijao_torpedo.adiciona_ingrediente("feijão roxo");
		feijao_torpedo.adiciona_ingrediente("couve");
		feijao_torpedo.adiciona_ingrediente("farinha");
		feijao_torpedo.adiciona_ingrediente("linguiça");
		
		batata.listar_ingredientes();
		arroz.listar_ingredientes();
		feijao.listar_ingredientes();
		arroz_grega.listar_ingredientes();
		feijao_torpedo.listar_ingredientes();
		
		Bebida agua = new Bebida();
		agua.nome = "Água Mineral";
		agua.descricao = "garrafa de água sem gás";
		agua.set_preco(3.00f);
		
		Bebida chopp = new Bebida();
		chopp.nome = "Chopp Brahma";
		chopp.descricao = "caneca de chopp 300 ml";
		chopp.set_preco(10.00f);
		
		Bebida suco_l = new Bebida();
		suco_l.nome = "Suco de Laranja";
		suco_l.descricao = "copo 500 ml de suco de laranja";
		suco_l.set_preco(8.00f);
		
		Bebida suco_a = new Bebida();
		suco_a.nome = "Suco de Acerola";
		suco_a.descricao = "copo 500 ml de suco de acerola";
		suco_a.set_preco(7.50f);
		
		Bebida refri = new Bebida();
		refri.nome = "Guaraná";
		refri.descricao = "lata de 350 ml de guaraná";
		refri.set_preco(6.00f);
		
		Pedido pedido_1 = new Pedido();
		pedido_1.numero_pedido = 1;
		pedido_1.setArray();
		pedido_1.adiciona_item(arroz);
		pedido_1.adiciona_item(feijao_torpedo);
		pedido_1.adiciona_item(agua);
		pedido_1.listar_itens();
		System.out.println(pedido_1.calcula_preco());
		
	}

}
