/**
 * 
 */
package basic.methods.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 40312100 
 * Class sets up an interactive text-based question and answer quiz
 */
public class PubQuiz {

	static int correctAnswersTally;
	
	/**
	 * @param args Main method code begins here
	 */
	public static void main(String[] args) {
		int questionAnswerIndex; 
		// continue or end the session
		String keepGoing = "y";  
		// declaring the questions and answers
		String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?",
				"Roman god of War ?" };
		String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };
		// initialising the total correct answers
		correctAnswersTally = 0;   
		// open scanner to read user's responses
		Scanner readInput = new Scanner(System.in);
		// loop as long as keepGoing is "y"
		do {
			System.out.println("General Knowledge Quiz...");
			questionAnswerIndex = generateRandom(jokeQuestions.length);
			System.out.println(getQuestion(jokeQuestions, questionAnswerIndex));
			System.out.println("Your Answer...");
			System.out.println(fetchReply(jokeAnswers, questionAnswerIndex, readInput.nextLine()));
			System.out.println("Another Question (Y or N) ?");
			keepGoing = readInput.nextLine();
		} while (keepGoing.equalsIgnoreCase("Y"));
		// close the scanner to avoid resource leak
		readInput.close();
		System.out.println("Thanks for playing, you scored " + correctAnswersTally);
	}

	/**
	 * Gets random index number corresponding to the length of the question and
	 * answer arrays
	 * 
	 * @param length is the size of the question and answer arrays
	 * @return random index appropriate for selecting elements in question and
	 *         answer arrays
	 */
	public static int generateRandom(int length) {
		Random random = new Random();
		return random.nextInt(length);
	}

	/**
	 * Retrieves question from questions array corresponding to previously selected
	 * index
	 * 
	 * @param questionList   is the questions array
	 * @param questionNumber is the previously selected index
	 * @return a String question from the questions array
	 */
	public static String getQuestion(String[] questionList, int questionNumber) {
		return questionList[questionNumber];
	}

	/**
	 * Replies to the user's answer depending on whether the answer corresponded to
	 * the correct element in the answers array
	 * 
	 * @param answerList   is the answers array
	 * @param answerNumber is the index in the answers array
	 * @param response     is the user's guess at the previously asked question from
	 *                     the questions array
	 * @return a String response confirming the user's answer was correct or not
	 */
	public static String fetchReply(String[] answerList, int answerNumber, String response) {
		String correctAnswer, reply;
		// retrieve the correct answer
		correctAnswer = answerList[answerNumber];
		// check whether the correct answer is the same as the user's guess
		if (correctAnswer.equalsIgnoreCase(response)) {
			reply = "Well Done !";
			// increment the number of correct answers
			correctAnswersTally++;
		} else {
			reply = "Not a bad guess, but it was " + correctAnswer;
		}
		return reply;
	}
}
