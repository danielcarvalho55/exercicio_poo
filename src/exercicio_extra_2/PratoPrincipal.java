package exercicio_extra_2;

import java.util.ArrayList;

public class PratoPrincipal extends ItemMenu {
	
	private ArrayList<String> ingredientes;
	public int tempo_preparo;
	public String categoria;
	
	public void setArray() {
		this.ingredientes = new ArrayList();
	}
	
	public ArrayList getArray() {
		return this.ingredientes;
	}
	
	public void adiciona_ingrediente(String ingred) {
		this.ingredientes.add(ingred);
	}
	
	public void remove_ingrediente(String ingred) {
		if (this.ingredientes.contains(ingred)) {
			this.ingredientes.remove(ingred);
		}
		else System.out.println("Ingrediente não encontrado!");
	}
	
	public void listar_ingredientes() {
		String ingredientes_prato = "Ingredientes do prato " + this.nome + ": ";
		for (int i = 0; i < ingredientes.size(); i++) {
			ingredientes_prato += this.ingredientes.get(i);
			ingredientes_prato += ", ";
		}
		System.out.println(ingredientes_prato);;
	}

}
