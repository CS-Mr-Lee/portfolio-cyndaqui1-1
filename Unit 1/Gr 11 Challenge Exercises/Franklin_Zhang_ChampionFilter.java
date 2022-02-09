/**
 * Name: Franklin Zhang
 * Date: 20222-02-08
 * Description: Program to find the hp and champion with the highest hp, and the armor and champion with the lowest armor
 */

import java.util.*; // imports all moddules in util library
import java.io.*; // imports all modules from io library

public class Franklin_Zhang_ChampionFilter {
	public static void main(String[] arg) {
		String[] champions = new String[224];
		double[] hp = new double[224];
		double[] armor = new double[224];
		int index = 0;
		try {
			String line;
			File file = new File("champions.json");
			FileReader filereader = new FileReader(file);
			BufferedReader reader = new BufferedReader(filereader);
			while ((line = reader.readLine()) != null) {
				if (line.contains("\"id\"")) {
					champions[index] = line.substring(line.indexOf(": \"") + 3,line.length()-2);
				}
				if (line.contains("\"hp\"")) {
					hp[index] = Double.parseDouble(line.substring(line.indexOf(":") + 2, line.length()-1));
				}
				if (line.contains("\"armor\"")) {
					armor[index] = Double.parseDouble(line.substring(line.indexOf(":") + 2, line.length()-1));
					index++;
				}
			}
		}
		catch (Exception e) {}
		for (int i = 1; i < 224; i++) {
			if (hp[i] > hp[index]) {
				index = i;
			}
		}
		System.out.println("Highest HP: " + champions[index] + " (" + hp[index] + "HP)");
		for (int i = 1; i < 224; i++) {
			if (armor[i] > armor[index]) {
				index = i;
			}
		}System.out.println("Highest Armor: " + champions[index] + " (" + hp[index] + " Armor)");

	}
}