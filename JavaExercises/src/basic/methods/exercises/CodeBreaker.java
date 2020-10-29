/**
 * 
 */
package basic.methods.exercises;

import java.util.Arrays;

/**
 * @author DeeFinlay
 * Converts String array to ASCII-table references and vice-versa
 */
public class CodeBreaker {

	/**
	 * @param args
	 * Main method code
	 */
	public static void main(String[] args) {
		// declare variables
		String nameAsChars;
		nameAsChars = "Johnjo Billybob";
		int[] codedToAscii = new int[nameAsChars.length()];

		// call conversion method passing usersName as argument
		codedToAscii = convertStringToAscii(nameAsChars);
		System.out.println(Arrays.toString(codedToAscii));

		// call conversion method passing previously converted to Ascii name as argument
		char[] codedToChars = convertAsciiToString(codedToAscii);
		System.out.println(Arrays.toString(codedToChars));
	}

	/**
	 * Converts a String name to an array of integers
	 * @param nameToConvert original String name
	 * @return integer array representing the converted name
	 */
	public static int[] convertStringToAscii(String nameToConvert) {
		int[] convertedName = new int[nameToConvert.length()];
		// loop through each character in the name
		for (int chCounter = 0; chCounter < nameToConvert.length(); chCounter++) {
			convertedName[chCounter] = (int) nameToConvert.charAt(chCounter);
		}
		return convertedName;

	}

	public static char[] convertAsciiToString(int[] nameToConvert) {
		char[] convertedName = new char[nameToConvert.length];
		// loop through each character in the name
		for (int counter = 0; counter < nameToConvert.length; counter++) {
			convertedName[counter] = (char) nameToConvert[counter];
		}
		return convertedName;

	}

}
