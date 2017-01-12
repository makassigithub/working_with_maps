package collection_maps;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Maps can contain collections
public class Case_CollectionMaps {

	public static void main(String...args){
		
// create a Collection of Toyota Cars and populate it		
		ArrayList<Car> toyotaList = new ArrayList<Car>();
		toyotaList.add(new Car("Toyota","Camry",12400,true));
		toyotaList.add(new Car("Toyota","Higlander",627000,false));
		toyotaList.add(new Car("Toyota","Hilux",62000,true));
		
// create a Collection of Volvo Cars and populate it		
				ArrayList<Car> mazdaList = new ArrayList<Car>();
				mazdaList.add(new Car("Mazda","Tribute",1800,true));
				mazdaList.add(new Car("Mazda","cx7",627000,true));
				mazdaList.add(new Car("Mazda","mz6",62000,true));
		
//create a map to store the collection list add the collections to it
		Map<String,ArrayList<Car>> carMap = new TreeMap<String,ArrayList<Car>>();
		                            carMap.put("Toyota",toyotaList );
		                            carMap.put("Mazda",mazdaList);
		                            
// get the set of entries in the map and loop through the colections
Set<Map.Entry<String,ArrayList<Car>>>	entries = carMap.entrySet(); 
for(Map.Entry<String,ArrayList<Car>> entry :entries ){	
	System.out.println(entry.getKey()+"s :"+entry.getValue());	
}

System.out.println("\n");
//Or we could loop through both the entries and their content at the same time
Set<Map.Entry<String,ArrayList<Car>>>	entries2 = carMap.entrySet(); 
for(Map.Entry<String,ArrayList<Car>> entry :entries2 ){	
	for(Car c: entry.getValue()){
		
		System.out.println("Made: "+c.getMade()+"  "+"Series: "+c.getSeries()+"  "+"Millage: "+c.getMillage()+"  "+"good Condition: "+c.isNew());
	}

}
				
}
	
}
