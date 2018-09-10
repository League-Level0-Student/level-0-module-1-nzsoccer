package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Riddle = JOptionPane.showInputDialog(
				"A man wants to enter an exclusive club, but he doesn’t know the password, so he watches the bouncer to figure it out. A woman comes up and the bouncer says, 12.The woman replies,6 The bouncer lets her in.  Another woman comes up and the bouncer says, “6.” The woman says “3” and the bouncer lets her in.The man feels he’s heard enough and goes up to the door. The bouncer says 10, and the man replies, 5. The bouncer tells him to get lost. What should the man have said instead?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (Riddle.equals("3")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;

		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer is 3.");
		}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		if (Riddle.equals("3"))
			JOptionPane.showMessageDialog(null, "Your score is 1!");

	}
}
