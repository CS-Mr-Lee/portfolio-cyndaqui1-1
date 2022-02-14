/**
 * Name: Franklin Zhang
 * Date: 20222-02-08
 * Description: Program to find the hp and champion with the highest hp, and the armor and champion with the lowest armor
 */

import java.util.*; // imports all moddules in util library
import java.io.*; // imports all modules from io library

public class Franklin_Zhang_ChampionFilter {
	public static void main(String[] arg) {
		

		// declare empty arrays for champion names, hitpoints, and armor. Array lengths are 152 since there are 152 champions currently present in the file
		String[] champions = new String[152];
		double[] hp = new double[152];
		double[] armor = new double[152];

		int index = 0; // counter used for filling out respective indexes in arrays above
		
		try {

			String line;
			
			//create an object to read from file "champions.json"
			File file = new File("MaxChampStats.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader reader = new BufferedReader(filereader);
			
			while ((line = reader.readLine()) != null) {

				if (line.contains("\"id\"")) { // check if line contains string "id", then cuts the important information to fill in spot in champions name array
					champions[index] = line.substring(line.indexOf(": \"") + 3,line.length()-2);
				}

				if (line.contains("\"hp\"")) { // check if line contains string "hp", then cuts the important information to fill in spot in hp array
					hp[index] = Double.parseDouble(line.substring(line.indexOf(":") + 2, line.length()-1));
				}
				
				if (line.contains("\"armor\"")) { // checks if line contains string "armor", then cuts the important information to fill in spot in armor array. Additionally, since its the last attribute of the respective champion needed, the index counter is incremented so the array progressively fills out
					armor[index] = Double.parseDouble(line.substring(line.indexOf(":") + 2, line.length()-1));
					index++;
				}
			}
		}

		catch (Exception e) {}

		index = 0; // reset pointer

		for (int i = 1; i < 152; i++) { // reuses index as a pointer, in which case, we are finding the largest element, and using the index as a pointer to that element

			if (hp[i] > hp[index]) {
				index = i;
			}
		}
		System.out.println("Highest HP: " + champions[index] + " (" + hp[index] + "HP)"); // outputs largest hp champion's hp and name
		for (int i = 1; i < 152; i++) { // finds the weakest armor and uses index variable as a pointer to the element

			if (armor[i] < armor[index]) {
				index = i;
			}
		}

		System.out.println("Lowest Armor: " + champions[index] + " (" + armor[index] + " Armor)"); // outputs largest armor champion's hp and name

	}
}