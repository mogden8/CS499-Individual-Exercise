package GitExercise;

import java.util.*;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create random array
		//
		ArrayList array = createArray();
		//print random array
		printArray(array);
		//sort letters from array and print
		sortArrayLetters(array);
		sortArrayNums(array);
		sortArrayMisc(array);
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

public static void printArray(ArrayList A) {
	int y=0;
	for (int x=A.size()-1;x>0; x--) {
		System.out.print(A.get(x));
	}
	System.out.println();
}

public static ArrayList<Character> sortArrayLetters(ArrayList A) {
	
	ArrayList<Character> letterArray= new ArrayList<Character>();
	
	for (int x=A.size()-1;x>0; x--) {
		char y=(char)A.get(x);
		if (Character.isLetter(y))
			 letterArray.add(y);
	}
	
	System.out.println("Letters: ");
	
	printArray(letterArray);
	
	return letterArray;
	
	
}
public static ArrayList<Character> sortArrayNums(ArrayList A) {
	
	ArrayList<Character> numArray= new ArrayList<Character>();
	
	for (int x=A.size()-1;x>0; x--) {
		char y=(char)A.get(x);
		if (Character.isDigit(y))
			 numArray.add(y);
	}
	
	System.out.println("Numbers: ");
	
	printArray(numArray);
	
	return numArray;
	
	
}
public static ArrayList<Character> sortArrayMisc(ArrayList A) {
	
	ArrayList<Character> miscArray= new ArrayList<Character>();
	
	for (int x=A.size()-1;x>0; x--) {
		char y=(char)A.get(x);
		if (Character.isDigit(y)!=true && Character.isLetter(y)!=true)
			 miscArray.add(y);
	}
	
	System.out.println("Misc: ");
	
	printArray(miscArray);
	
	return miscArray;
	
	
}



}
