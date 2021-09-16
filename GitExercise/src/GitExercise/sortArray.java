package GitExercise;

import java.util.*;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public static ArrayList createArray() {
		
		ArrayList<Character> Array= new ArrayList<Character>();
		Random r = new Random();
		
		for (int x=0; x<=100; x++) {
			char c = (char)(r.nextInt(26) + '0');
			Array.add(c);
		}
		return Array;
	}

}
