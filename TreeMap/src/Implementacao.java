import java.util.TreeMap;

public class Implementacao {
	
	//Instancia de um objeto do tipo treemap, neste contexto a chave dessa treempa é uma string e o valor é um inteiro,
	//porem esses tipos podem ser invertidos ou alterados para satisfazer as necessidade da aplicação.
	TreeMap<String, Integer> nomes = new TreeMap<String, Integer>();
	
	//Metodo que adiciona uma chave e um valor na treemap.
	public void addKV(String key, int value){
		nomes.put(key,value);
	}
	
	//Metodo que remove uma unica chave.
	public void removeK(String key){
		nomes.remove(key);
	}
	
	//Metodo que busca e imprime uma unica chave.
	public void buscaUmaK(String key){
		System.out.println(key  +" :: "+ nomes.get(key));
	}
	
	//Metodo que imprime todas as chaves e valores da treemap.
	public void buscaTodasK(){
		for(String key: nomes.keySet()){
            System.out.println(key  +" :: "+ nomes.get(key));
        }
	}
	
	//Metodo que limpa todas das chaves e valores da treemap.
	public void limpaTodoMap(){
		nomes.clear();
	}

}
