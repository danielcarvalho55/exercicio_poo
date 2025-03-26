package exercicio_extra_1;

import java.util.ArrayList;

public class Usuario {
	
	public String nome;
	public int id_usuario;
	private ArrayList<ItemBiblioteca> itens_emprestados;
	
	public void setArray() {
		this.itens_emprestados = new ArrayList();
	}
	
	public ArrayList getArray() {
		return this.itens_emprestados;
	}
	
	public void emprestar_item(ItemBiblioteca item) {
		boolean vale = item.emprestar();
		if (vale == true) {
			itens_emprestados.add(item);
			System.out.println("O item " + item.titulo +  " foi emprestado para o " + this.nome + "!");
		}
		else System.out.println("Item " + item.titulo + " não disponível!");
	}

	public void devolver_item(ItemBiblioteca item) {
		if (itens_emprestados.contains(item)) {
			item.devolver();
			itens_emprestados.remove(item);
			System.out.println("Item " + item.titulo + " devolvido!");
		}
		else System.out.println("Este usuário não está de posse desse item!");
	}
	
	public String listar_itens() {
		String livros_listados = "Itens do " + this.nome + ": ";
		for (int i = 0; i < itens_emprestados.size(); i++) {
			livros_listados += this.itens_emprestados.get(i).titulo;
			livros_listados += ", ";
		}
		return livros_listados;
	}
	
}
