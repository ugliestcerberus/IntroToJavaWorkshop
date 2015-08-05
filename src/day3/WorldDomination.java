package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String Yesser=JOptionPane.showInputDialog("Do you know how to ride a code?");

		// 2. If they say "yes", tell them they will rule the world.
		if (Yesser.equals("yes")) {
		JOptionPane.showMessageDialog(null, "I'm the leader of the world");	
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "Good Luck Washing Dishes");
		}

	}
}

