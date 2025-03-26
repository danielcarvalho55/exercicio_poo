package exercicio_extra_1;

public class ItemBiblioteca {
	
	public String titulo;
	public int ano_publicacao;
	private boolean disponivel = true;
	
	public boolean emprestar() {
		if (this.disponivel == true){
			this.disponivel = false;
			return true;
		}
		else return false;
	}
	
	public void devolver() {
		this.disponivel = true;
	}
	
	public void detalhes() {
		System.out.println("O título desse item é " + this.titulo);
	}

}
