package maps;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMaps extends AbstractMap and implements NaviguableMap interface
public class Case_TreeMap {

	public static void main(String... args) {
		// Instantiate a TreeMap to hold people names and They ages
		TreeMap<String, Integer> ages = new TreeMap<String, Integer>();

		// populate the Map
		ages.put("Brahima", 32);
		ages.put("Alban", 30);
		ages.put("Teeya", 40);
		ages.put("Rene", 25);
		ages.put("Patrick", 45);
		ages.put("Jake", 31);

		// Get the Entry sets of the map from printing
		// TreeMap stores the entries in ascendinf order
		Set<Map.Entry<String, Integer>> ageSet = ages.entrySet();
		for (Entry<String, Integer> age : ageSet) {

			// getKey() and getValue() operate on Entry Objects
			System.out.println("The value " + age.getValue() + " is stored with the key " + age.getKey());
		}
		System.out.println();

		// Modify Jake's age
		ages.put("Jake", ages.get("Jake") - 1);
		System.out.println("jakes age is now: " + ages.get("Jake"));

		// Many methods are inherited from the the NavigableMap
		System.out.println("Add more data to ages");

		TreeMap<String, Integer> another_map = new TreeMap<String, Integer>();
		another_map.put("Fatim", 27);
		another_map.put("Diallo", 38);
		another_map.put("Edmon", 42);
		another_map.put("Chaka", 39);
		another_map.put("Dissouf", 38);

		ages.putAll(another_map);
		// Let's what is inside ages now

		Set<Map.Entry<String, Integer>> ageSet2 = ages.entrySet();
		System.out.println("KEYS\tVALUES");
		for (Entry<String, Integer> age : ageSet2) {
			// getKey() and getValue() operate on Entry Objects
			System.out.println(age.getKey() + "\t" + age.getValue());
		}
		System.out.println();

		// getting first and last keys
		System.out.println("The first key in the Map is:" + ages.firstKey());
		System.out.println("The last Key in the Map is:" + ages.lastKey());

		// Retrieving portion of the Map
		// retrieving a heaMap
		SortedMap<String, Integer> sorted_head_map = ages.headMap("Edmon");// specify
																			// the
																			// End
																			// key
																			// parameter.It
																			// excludes
																			// argument's
																			// entry
		Set<String> headKeySet = sorted_head_map.keySet();// returns a set of
															// keys in the
															// sorted_head_map
		Collection<Integer> headValueSet = sorted_head_map.values();// returns a
																	// raw
																	// collection
		System.out.println("Key up to Edmon: " + headKeySet);
		System.out.println("values up to Edmon: " + headValueSet);

		// Retrieving a tailMap
		SortedMap<String, Integer> sorted_tail_map = ages.tailMap("Fatim");// specify
																			// the
																			// Start
																			// key
																			// parameter
																			// include
																			// argument's
																			// entry
		Set<String> tailKeySet = sorted_tail_map.keySet();// return a set
		Collection<Integer> tailValueSet = sorted_tail_map.values();// returns a
																	// raw
																	// collection
		System.out.println("Key from Fatim: " + tailKeySet);
		System.out.println("values form Fatim: " + tailValueSet);

		// Retrieving a subMap
		SortedMap<String, Integer> sorted_subMap = ages.subMap("Brahima", "Jake");// specify
																					// the
																					// Start
																					// and
																					// End(start
																					// included,end
																					// excluded)
		Set<String> subKeySet = sorted_subMap.keySet();// return a set
		Collection<Integer> subValueSet = sorted_subMap.values();// returna raw
																	// collection
		System.out.println("Key between Barhima and Jake: " + subKeySet);
		System.out.println("values form Fatim: " + subValueSet);

		// retrieving Entries, based on a medium
		Map.Entry<String, Integer> ceil_entry = ages.ceilingEntry("Emile");
		// the key Emile does not exist, this directly addresses the
		// alphabetical key >= Emile
		System.out.println("The key of the ceiling for Emile is: " + ceil_entry.getKey());
		System.out.println("The value of the ceiling for Emile is: " + ceil_entry.getValue());

		Map.Entry<String, Integer> floor_entry = ages.ceilingEntry("Emile");
		// the key Emile does not exist, this directly addresses the
		// alphabetical key <= Emile
		System.out.println("The key of the floor for Emile is: " + floor_entry.getKey());
		System.out.println("The value of the floor for Emile is: " + floor_entry.getValue());

		Map.Entry<String, Integer> lower_entry = ages.lowerEntry("Emile");
		// the key Emile does not exist, this directly addresses the
		// alphabetical key < Emile
		System.out.println("The key of the lower entry for Emile is: " + lower_entry.getKey());
		System.out.println("The value of the lower entry for Emile is: " + lower_entry.getValue());

		Map.Entry<String, Integer> higher_entry = ages.higherEntry("Emile");
		// the key Emile does not exist, this directly addresses the alphabetical
		// key > Emile
		System.out.println("The key of the higer entry for Emile is: " + higher_entry.getKey());
		System.out.println("The value of the higher entry for Emile is: " + higher_entry.getValue());

		// we can directly get the key of the ceiling or the floor from a Map
		// without focusing on entries
		System.out.println("The ceiling key for Emile is: " + ages.ceilingKey("Emile"));
		System.out.println("The floor key for Emile is: " + ages.floorKey("Emile"));

		// we can also get the lower and the higher key of the Map
		// returns the highest key that is alphabetically < Emile
		System.out.println("The lower key for Emile is: " + ages.lowerKey("Emile"));
		// returns the lowest key that is alphabetically >Emile
		System.out.println("The higher key for Emile is: " + ages.higherKey("Emile"));

		// Get Entries based on their Position
		System.out.println("The First Entry of the Map as the key: " + ages.firstEntry().getKey());
		System.out.println("The First Entry of the Map as the value: " + ages.firstEntry().getValue());
		System.out.println("The Last Entry of the Map as the key: " + ages.lastEntry().getKey());
		System.out.println("The Last Entry of the Map as the value: " + ages.lastEntry().getValue());

		// Get a NaviguableMap from The current Map and print it
		// true means include data from Edmon
		NavigableMap<String, Integer> age_navHeadMap = ages.headMap("Edmon", true);
																						
		Set<Map.Entry<String, Integer>> age_navHeadMap_entries = age_navHeadMap.entrySet();
		System.out.println("NavigableMapKeys\tNavigableMapValue");
		for (Map.Entry<String, Integer> tr : age_navHeadMap_entries) {
			System.out.println(tr.getKey() + "\t\t\t" + tr.getValue());
		}

		// the NavigableMap is an interface, then backed by TreeMap
		// Another modification on one affects the other.
		// In the Following Brahima will removed from both The Navigable sub-map
		// and the initial TreeMap
		age_navHeadMap.remove("Brahima");
		System.out.println("Remaining keys of the NavigableMap: " + age_navHeadMap.keySet());
		System.out.println("Remaining Values of The NavigableMap: " + age_navHeadMap.values());

		// Compare with that of the original TreeMap
		System.out.println("Remaining keys of the TreeMap: " + ages.keySet());
		System.out.println("Remaining Values of The TreeMap: " + ages.values());

		// We can get the Keysets or a Navigable Map in descending order.
		NavigableMap<String, Integer> age_desc_navHeadMap = ages.descendingMap();
		
		Set<Map.Entry<String, Integer>> age_desc_navHeadMap_entries = age_desc_navHeadMap.entrySet();
		System.out.println("NavigableMapKeys\tNavigableMapValue");
		for (Map.Entry<String, Integer> tr : age_desc_navHeadMap_entries) {
			System.out.println(tr.getKey() + "\t\t\t" + tr.getValue());
		}
		System.out.println();
		System.out.println("The Descending KeySet");
		NavigableSet<String> nav_keySet = ages.descendingKeySet();
		for (String s : nav_keySet) {
			System.out.print(s + " ;");
		}
	}
}
