
public class Testadora {
	
	
	public static void main(String[] args) {
		Implementacao teste = new Implementacao();
		
		teste.addKV("Joao", 80);
		teste.addKV("Maria", 2);
		teste.addKV("Andre", 7);
		
		teste.buscaTodasK();
		
		//teste.buscaUmaK("Joao");
		
		teste.removeK("Joao");
		
		//teste.limpaTodoMap();
		
		
	}

}
