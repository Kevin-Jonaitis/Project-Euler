import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Problem22 {

	public static final int ASCIIOFFSET = 64;
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("names.txt"));
		String all = scanner.next();
        ArrayList<String> names = new ArrayList<String>();
		String[] temp = all.split(",");

		//kinda repetitive to put it in an array, and then an arraylist
		for (int i = 0; i < temp.length; i++) {
			names.add(temp[i]);
		}
		Collections.sort(names);
		System.out.println("I'm sorted!");
		long namesTotal = 0;
		for(int pos = 0; pos < names.size(); pos++) {
			int nameTotal = 0;
			for (int i = 0; i < names.get(pos).length(); i++) {
				nameTotal += names.get(pos).charAt(i) - ASCIIOFFSET;
			}
			
			namesTotal += (nameTotal * (pos + 1)); //+1, because we start at the 1st pos, not the 0th
		}
		System.out.println("Names total " + namesTotal);
	}

}
