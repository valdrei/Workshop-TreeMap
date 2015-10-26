import java.util.TreeMap;

public class Exemplo {

	public static void main(String[] args) {
		TreeMap<String, Integer> students = new TreeMap<String, Integer>();
        //Adiciona a chave e os valores, fora de ordem
        students.put("Ed", 47);
        students.put("Alan", 34);
        students.put("Sheila", 65);
        students.put("Becca", 44);
 
        //Impressão das chaves em ordem
        //Felipe viado
        for(String key: students.keySet()){
            System.out.println(key  +" :: "+ students.get(key));
        }
	}
	
}
