package exercicio_extra_1;

public class Revista extends ItemBiblioteca {
	
	public int numero;
	public String periodicidade;
	public String editora;
	
	public void detalhes() {
		super.detalhes();
		System.out.println("e sua editora é " + this.editora);
	}

}
