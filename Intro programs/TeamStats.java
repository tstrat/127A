/*
	Travis Stratton
	Partner:  Joy Chen
	Sec. Leader: Andrew Emmott
	Date: Sept. 10, 2010
	Class: CSc 127A Section 10
	Description:
		Calculates the general statistics for a generic
		team based on input from the keyboard.
*/

import java.util.Scanner;

public class TeamStats 
{
	public static void main(String args[])
	{
		int played, won, ptScored, penalties, numPlayers, winRec, lost;
		double ptAverage, foulAverage, playerFouls, playerPoints;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Number of games played: ");
		played = userInput.nextInt();
		System.out.print("Number of games won: ");
		won = userInput.nextInt();
		System.out.print("Total points scored among all games: ");
		ptScored = userInput.nextInt();
		System.out.print("Total penalties among all games: ");
		penalties = userInput.nextInt();
		System.out.print("Number of players on team: ");
		numPlayers = userInput.nextInt();
		
		winRec = (won*100)/(played);
		lost = played-won;
		ptAverage = (double)ptScored/played;
		foulAverage = (double)penalties/won;
		playerFouls = (double)penalties/numPlayers;
		playerPoints = (double)ptScored/numPlayers;
		
		System.out.println(		"The team has a win ratio of "+winRec+"% and has lost "+
										lost+" games out of "+played+".");
		System.out.println(		"The team scores an average of "+ptAverage+
										" points per game and fouls "+foulAverage+" times.");
		System.out.println(		"On average, each player has "+playerFouls+" penalties and has scored "+
										playerPoints+" points.");
	

	}
}