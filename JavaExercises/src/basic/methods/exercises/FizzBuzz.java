/**
 * 
 */
package basic.methods.exercises;

/**
 * @author DeeFinlay Class demonstrates the FizzBuzz idea, multiples of 3
 *         replaced by Fizz, 5 replaced by buzz, 3&5 replaced by FizzBuzz
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int counter = 1; counter <= 100; counter++) {
			// if the current number is not a factor of 3 or 5, print the number
			if (getFizzOrBuzz(counter) == "Non Factor") {
				System.out.println(counter);
			} else {
				System.out.println(getFizzOrBuzz(counter));
			}
		}

	}

	/**
	 * Determines whether the number passed as an argument is a multiple of 3, or
	 * multiple of 5, or multiple of both, or neither multiple of 3 nor 5
	 * 
	 * @param numberToCheck the number to determine
	 * @return either "Non Factor" when neither a multiple of 3 or 5, "Fizz" for
	 *         multiples of 3, "Buzz" for multiples of 5, "Fizz Buzz" for multiples
	 *         of 15, ie. 3 and 5
	 */
	public static String getFizzOrBuzz(int numberToCheck) {
		String output;
		if (numberToCheck % 3 == 0) {
			output = "Fizz";
			// multiple of 3 and multiple of 5
			if (numberToCheck % 5 == 0) {
				output = "Fizz Buzz";
			}
		} else if (numberToCheck % 5 == 0) {
			output = "Buzz";
		} else {
			// not a multiple of 3 or of 5
			output = "Non Factor";
		}
		return output;
	}

}
