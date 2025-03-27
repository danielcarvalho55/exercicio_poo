package exercicio_extra_2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {

	public int numero_pedido;
	private ArrayList<ItemMenu> itens;
	public LocalDateTime data;
	
	public void setArray() {
		this.itens = new ArrayList();
	}
	
	public ArrayList getArray() {
		return this.itens;
	}
	
	public void adiciona_item(ItemMenu item) {
		this.itens.add(item);
	}
	
	public void remove_item(ItemMenu item) {
		if (this.itens.contains(item)) {
			this.itens.remove(item);
		}
		else System.out.println("Item não encontrado!");
	}
	
	public float calcula_preco() {
		float preco_total = 0.00f;
		for (int i = 0; i < itens.size(); i++) {
			preco_total += this.itens.get(i).get_preco();
		}
		return preco_total;
	}
	
	public void listar_itens() {
		String itens_pedido = "Itens do pedido " + this.numero_pedido + ": ";
		for (int i = 0; i < itens.size(); i++) {
			itens_pedido += this.itens.get(i).nome;
			itens_pedido += ", ";
		}
		System.out.println(itens_pedido);;
	}
	
}
