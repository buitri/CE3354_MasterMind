package games;

import java.util.*;

public class MasterMindGame {

	public static void main(String[] args) {
		int turncounter = 1;
		ArrayList<String> input = new ArrayList<String>();
		ArrayList<String> ramcolor = new ArrayList<String>();

		Random randomGenerator = new Random();

		System.out.println("Welcome to Master Mind Game");
		System.out.println("=========================================================================================");
		System.out.println("Here are the instruction.");
		System.out.println("The rule and instruction is simiple. Try to guess what color and order the AI has choosen. \nYou have twelve turns to figure it out!");

		System.out.println("=========================================================================================");
		System.out.println("Input in 'continue' to start the game....");
		System.out.println("Else, input in 'exit' to exit the game...");

		System.out.println();


		for (int i = 1; i < 5; i++) {
			int randomColor = randomGenerator.nextInt(4);

			switch(randomColor) {
				case 0: 
					ramcolor.add("r");
					break;
				case 1:
					ramcolor.add("g");
					break;
				case 2:
					ramcolor.add("b");
					break;
				case 3:
					ramcolor.add("y");
					break;
			}
		}

		while (turncounter < 13) {
			int numcolorcorrect = 0;
			int numcolorwrong = 0;

			System.out.println("Turn " + turncounter);

			for (int i = 0; i < 4; i++) {
				System.out.print("Color " + i + ": ");
				Scanner terminalInput = new Scanner(System.in);
				input.add(terminalInput.nextLine());
			}
			
			for (int i = 0; i < input.size(); i++) {
				numcolorcorrect = 0;
				numcolorwrong = 0;

				for (int j = 0; j < ramcolor.size(); j++) {
					if (ramcolor.get(j).contains(input.get(j))){
						numcolorcorrect++;
					}
					else {
						numcolorwrong++;
					}
					/*
					System.out.println("input " + input.get(i) + " randome color " + ramcolor.get(j));
					System.out.println(ramcolor.get(j).contains(input.get(i)));
					System.out.println("random color: " + ramcolor);*/
				}
			}

			for (int k = 0; k < numcolorcorrect; k++) {
				System.out.print("Correct ");
			}

			for (int k = 0; k < numcolorwrong; k++) {
				System.out.print("Wrong ");
			}

			System.out.println();

			System.out.println(input);
			System.out.println(ramcolor);

			for (int i = input.size() - 1; i >= 0; i--) {
				input.remove(i);
			}

			System.out.println();

			if(numcolorcorrect > 3) {
				System.out.println(ramcolor);
				System.out.println("Congrats you won with: " + input);
			} else if(numcolorcorrect < 10) {
				System.out.println("You lose!");
			}

			turncounter ++;
		}	
	}
}