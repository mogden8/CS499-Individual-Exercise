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
		
		
	}

}
