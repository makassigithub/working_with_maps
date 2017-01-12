package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap extends AbstractMap that implements Map Interface
public class Case_HashMap {
	
public static void main(String...args){
//Instanciate a HashMap to hold people names and They salaries 
HashMap<String,Double> salaries = new HashMap<String,Double>();

//populate the Map
salaries.put("Brahima", 89567.75);
salaries.put("Alban", 15893.45);
salaries.put("Teeya", 7693.45);
salaries.put("Rene", 15893.45);
salaries.put("Patrick", 56893.45);

//Get the Entry sets of the map from printing
//HashMap does not garantee the storage in the entry order
Set<Map.Entry<String,Double>> salSet = salaries.entrySet();
for(Map.Entry<String,Double> sal : salSet){
	
//getKey() and getValue() operate on Entry Objects
	System.out.println("The value "+sal.getValue()+" is stored with the key "+sal.getKey());
}
System.out.println();
System.out.println("Let's go through some methods availed by inheritance hierarchy");
//Check if the Map contains some specific keys or values with containsKey() and containsValue()

System.out.println("The map contains key called 'Alban': "+salaries.containsKey("Alban"));
System.out.println("The map contains value of '10000': "+salaries.containsValue(1000));

System.out.println();
//Get the value associated with a key from the Map
System.out.println("Value associated with Teeya is: "+salaries.get("Teeya"));

System.out.println();
//Compare the association key/value of two maps
HashMap<String,Double> mapObj2 = new HashMap<String,Double>(salaries);
System.out.println("salaries equals mapObj2: "+ salaries.equals(mapObj2));
System.out.println();
System.out.println("the Map is empty: "+salaries.isEmpty()+" size: "+ salaries.size()+" key/values");
System.out.println();
//get a set containing the keys of the Map or a collection of the values
System.out.println("Keys are in the set: "+salaries.keySet());
System.out.println("Values are in the collection: "+salaries.values());

System.out.println();

//because keys should be unique, the put() return the value being associated with the key before, 
//or return null otherwise

System.out.println("inserting Brahima again will retain: "+salaries.put("Brahima",10000.66)+"as old value");
System.out.println("inserting a new key/value retuns null: "+salaries.put("Tracy",7000.66));
System.out.println("putIfAbsent() ensure there is no key/value before adding : "+salaries.put("Tracy",7000.66));

//insert Map of inside Map
HashMap<String,Double> new_map =new HashMap<String,Double>(3);
new_map.put("Chapman",6578.05);
new_map.put("Hedi",5578.45);
new_map.put("Semalo",6578.05);
salaries.putAll(new_map);

//Print the map through an Entry set
Set<Map.Entry<String,Double>> salSet2 = salaries.entrySet();
for(Map.Entry<String,Double> sal : salSet2){
	
//getKey() and getValue() operate on Entry Objects
	System.out.print("key: "+sal.getKey()+" value: "+sal.getValue());
	System.out.println();
}
System.out.println();
//remove object based on the key from the Map
System.out.println("remove(k) delete from theMap and returns: "+ salaries.remove("Patrick"));

//getting and overriding an entry
double sa = salaries.get("Semalo");
System.out.println("Semalo's current salary is: "+sa);
sa += 500;//increase is salar
salaries.put("Semalo",sa);//this will remove and return the old salary
System.out.println("Semalo's new salary now is: "+salaries.get("Semalo"));

//we can also replace a value based on the key
System.out.println("replace() return the old value if it exist: "+salaries.replace("Chapman", 6000.00));
System.out.println();
System.out.println("The Map now contains: ");
Set<Map.Entry<String,Double>> salSet3 = salaries.entrySet();
for(Map.Entry<String,Double> sal : salSet3){
	
//getKey() and getValue() operate on Entry Objects
	System.out.print("key: "+sal.getKey()+" value: "+sal.getValue());
	System.out.println();
	
}

}
}
