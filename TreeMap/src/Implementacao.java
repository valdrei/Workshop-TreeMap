import java.util.TreeMap;

public class Implementacao {
	
	TreeMap<String, Integer> nomes = new TreeMap<String, Integer>();
	
	public void addKV(String key, int value){
		nomes.put(key,value);
	}
	
	public void removeK(String key){
		nomes.remove(key);
	}
	
	public void buscaUmaK(String key){
		System.out.println(key  +" :: "+ nomes.get(key));
	}
	
	public void buscaTodasK(){
		for(String key: nomes.keySet()){
            System.out.println(key  +" :: "+ nomes.get(key));
        }
	}
	
	public void limpaTodoMap(){
		nomes.clear();
	}

}
