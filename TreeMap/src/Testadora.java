
public class Testadora {
	
	
	public static void main(String[] args) {
		//Intancia de um objeto do tipo Implementacao, que sera responsavel por chamar os metodos 
		// da classe implementacao.
		Implementacao teste = new Implementacao();
		
		
		//Inicio dos testes
		
		//Adicionando chaves e valores
		teste.addKV("Joao", 80);
		teste.addKV("Maria", 2);
		teste.addKV("Andre", 7);
		
		//**************************************************************************************
		//Buscando todas as chaves da treemap.
		teste.buscaTodasK();
		
		//***************************************************************************************
		//Buscando uma unica chave
		//teste.buscaUmaK("Joao");
		
		
		//****************************************************************************************
		//Removendo uma unica chave
		teste.removeK("Joao");
		
		
		//*****************************************************************************************
		//Limpando toda a treemap
		//teste.limpaTodoMap();
		
		
		//*****************************************************************************************
		teste.buscaTodasK();
	}

}
