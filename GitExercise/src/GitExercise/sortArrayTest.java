package GitExercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class sortArrayTest {

	@Test
	void test() {
		//testing if array is empty
		ArrayList<Character> A= sortArray.createArray();
		Boolean arrayEmpty= A.isEmpty();
		assertFalse(arrayEmpty);
		
		ArrayList<Character> Letters = sortArray.sortArrayLetters(A);
		
		for (int x=Letters.size()-1;x>0; x--) {
			assertTrue(Character.isLetter(Letters.get(x)));
		}
		
		ArrayList<Character> Nums = sortArray.sortArrayNums(A);
		
		for (int x=Nums.size()-1;x>0; x--) {
			assertTrue(Character.isDigit(Nums.get(x)));
		}
		
		ArrayList<Character> Misc = sortArray.sortArrayMisc(A);
		
		for (int x=Misc.size()-1;x>0; x--) {
			assertFalse(Character.isDigit(Misc.get(x)));
			assertFalse(Character.isLetter(Misc.get(x)));
		}
		
		
	}

}
