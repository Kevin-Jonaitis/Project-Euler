import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem67 {

	
	public static final int LEFT = 0;
	public static final int RIGHT = 1;
	static Scanner scanner;
//	static Scanner childScan;
	static ArrayList<Node> Nodes;
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanning("triangle.txt");
	}
	
	public static void Scanning(String filename) throws FileNotFoundException {
		scanner = new Scanner(new File(filename));
		Nodes = new ArrayList<Node>();
		
		Node current = null;
		int numberOnLine = 1;
		int absolutePos = 0;
		while (scanner.hasNext()) {
			
			for (int currPos= 0; currPos < numberOnLine; currPos++) {
				int value = scanner.nextInt();
				
				if (numberOnLine == 1) //root
					current = new Node(value, null, null);
				else if (currPos == numberOnLine - 1) //right most
					current = new Node(value, Nodes.get(absolutePos - numberOnLine), null);
				else if (currPos == 0) //left most
					current = new Node(value, null, Nodes.get(absolutePos - numberOnLine + 1)); //any other node
				else
					current = new Node(value, Nodes.get(absolutePos - numberOnLine),Nodes.get(absolutePos - numberOnLine + 1));
				
				Nodes.add(current);
				absolutePos++; //adds at the END, so that it starts at 0

			}
			numberOnLine++;
		}
		
		int max = -99;
		String path = "";
		for (Node n: Nodes) {
			if (n.sum > max) {
				max = n.sum;
				path = n.path;
			}
		}
		
		System.out.println("The max is: " + max);
		System.out.println("The max path is: " + path);
	}

	
static class Node {

	Node left;
	Node right;
	Node parentLeft;
	Node parentRight;
	int value;
	int sum; //this is a sum of all previous values
	String path; //for debugging the path

	
	public Node(int value, Node parentLeft, Node parentRight) {
		//root node
		if (parentLeft == null && parentRight == null) {
			this.value = value;
			this.sum = value;
			this.path = Integer.toString(value);
		}
		//right side
		else if (parentLeft ==  null) {
			this.parentRight = parentRight;
			this.value = value;
			this.sum = value + parentRight.sum;
			this.path = parentRight.path + " " + Integer.toString(value);
			
		}
		//left side
		else if (parentRight == null) {
			this.parentLeft = parentLeft;
			this.value = value;
			this.sum = value + parentLeft.sum;
			this.path = parentLeft.path + " " + Integer.toString(value);

		}
		//somewhere in the middle
		else if (parentLeft != null && parentRight != null) {
			this.value = value;
			this.parentLeft = parentLeft;
			this.parentRight = parentRight;
			if (parentLeft.sum >= parentRight.sum) {
				this.sum = value + parentLeft.sum;
				this.path = parentLeft.path + " " +  Integer.toString(value);
			}
			else if (parentLeft.sum < parentRight.sum) {
				this.sum = value + parentRight.sum;
				this.path = parentRight.path + " " + Integer.toString(value);
			}
		}
	}
}	
}