import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Problem17 {
	FileWriter fw;
	
	/**
	 * @param args
	 */
	
	public static final int ONE = 3;
	public static final int TWO = 3;
	public static final int THREE = 5;
	public static final int FOUR = 4;
	public static final int FIVE = 4;
	public static final int SIX = 3;
	public static final int SEVEN = 5;
	public static final int EIGHT = 5;
	public static final int NINE = 4;
	public static final int TEN = 3;
	public static final int ELEVEN = 6;
	public static final int TWELVE = 6;
	public static final int THIRTEEN = 8;
	public static final int FOURTEEN = 8;
	public static final int FIFTEEN = 7;
	public static final int SIXTEEN = 7;
	public static final int SEVENTEEN = 9;
	public static final int EIGHTEEN = 8;
	public static final int NINETEEN = 8;

	public static final int TWENTY = 6;
	public static final int THIRTY = 6;
	public static final int FORTY = 5;
	public static final int FIFTY = 5;
	public static final int SIXTY = 5;
	public static final int SEVENTY = 7;
	public static final int EIGHTY = 6;
	public static final int NINETY = 6;
	
	public static final int HUNDRED = 7;
	public static final int THOUSAND = 8;
	public static final int AND = 3;
	
	public static void main(String[] args) {
		//numbers 1 to 9
		int ones = ONE + TWO + THREE + FOUR + FIVE + SIX + SEVEN + EIGHT + NINE;
		
		//10 to 19
		int teens = TEN + ELEVEN + TWELVE + THIRTEEN + FOURTEEN + FIFTEEN + SIXTEEN + SEVENTEEN + EIGHTEEN
						+ NINETEEN;
		
		//numbers 20 to 90
		int tens = TWENTY + THIRTY + FORTY + FIFTY + SIXTY + SEVENTY + EIGHTY + NINETY;
		
		
		
		
		//1 to 99 
		//twen, thirty, fourty, ect; 8 of these
		
		//last trick was there are 10 tens, because you have to include the base number with no extra number attached
		int totalTens = ones + teens + (tens * 10) + (ones * 8);
		
		//ALL Hundreds, ALL Ands, all ___ HUNDRED AND BLAH, all BLAH HUNDRED AND ____
		int totalHundreds = HUNDRED * 900 + (AND * (900 - 9)) + (ones * 100) + (totalTens * 9);
		
		int total = totalTens + totalHundreds + ONE + THOUSAND;
		System.out.println(THREE + HUNDRED + AND + FORTY + TWO);
		System.out.println(ONE + HUNDRED + AND + FIFTEEN);
		System.out.println(ONE + TWO + THREE + FOUR + FIVE);
		System.out.println(total);
	}
	
	public Problem17() throws IOException {
		File f = new File("numbers.txt");
		fw = new FileWriter(f);
		printOnes();
	//	printTeens();
	//	printtotalrestOfTens();
		
	}

	private void printOnes() {
		for (int i = 1; i <= 9; i++) {
		}
	}

}
