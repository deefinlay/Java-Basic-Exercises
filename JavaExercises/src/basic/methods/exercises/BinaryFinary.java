/**
 * 
 */
package basic.methods.exercises;

import java.util.Arrays;

/**
 * @author 40312100 Converts an 8 element boolean array to a binary array
 */
public class BinaryFinary {

	/**
	 * @param args Main method begins
	 */
	public static void main(String[] args) {
		boolean[] eightBitArray = { true, false, false, true, false, true, false, true };
		int[] eightBitBinaryArray = booleanToBinary(eightBitArray); // conversion to binary
		System.out.println(Arrays.toString(eightBitBinaryArray)); // print the converted binary array
		System.out.println(binaryToDecimal(eightBitBinaryArray)); // convert to a decimal integer
	}

	/**
	 * Converts from a boolean array to an equivalent binary array
	 * 
	 * @param boolArray is an array of boolean elements
	 * @return integer array representing binary equivalents of the boolean elements
	 */
	public static int[] booleanToBinary(boolean[] boolArray) {
		int[] binArray = new int[boolArray.length];
		for (int counter = 0; counter < boolArray.length; counter++) {
			// if the boolArray element is true, binArray element is 1 and 0 if false
			binArray[counter] = boolArray[counter] ? 1 : 0;
		}
		return binArray;
	}

	/**
	 * Converts from an array of binary integers to a decimal value
	 * 
	 * @param binArray is an array of binary integers
	 * @return decimal value of the equivalent binary number
	 */
	public static int binaryToDecimal(int[] binArray) {
		int decimalValue = 0;
		for (int counter = binArray.length - 1; counter >= 0; counter--) {
			// calculate the power ie. exponent for the decimal conversion calculation
			int binaryPower = binArray.length - (counter + 1);
			decimalValue += binArray[counter] * Math.pow(2, binaryPower);
		}
		return decimalValue;
	}

}
