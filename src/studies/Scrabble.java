package studies;
import java.util.Scanner;

public class Scrabble {

		public static int calcScore(String word) {
		int points[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
		int score = 0;
		char[] wordArr = word.toCharArray();
		
		for(int i = 0; i < wordArr.length;i++) {
			if (Character.isUpperCase(wordArr[i]))
			{
				score += points[(int)wordArr[i] - (int)'A'];
			}
			else if(Character.isLowerCase(wordArr[i])) 
			{
				score += points[(int)wordArr[i] - (int)'a'];
			}
		}
		return score;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Player 1: ");
		String player1 = scanner.nextLine();
		System.out.println("Player 2: ");
		String player2 = scanner.nextLine();
		scanner.close();
		
		if (Scrabble.calcScore(player1) > Scrabble.calcScore(player2))
		{
			System.out.println("Player 1 wins!");
		}
		else if (Scrabble.calcScore(player1) < Scrabble.calcScore(player2))
		{
			System.out.println("Player 2 wins!");
		}
		else 
		{
			System.out.println("Tie!");
		}
		
		
	}

}
