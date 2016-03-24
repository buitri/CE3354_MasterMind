import java.util.*;

public class MasterMindGame {

	public static void main(String[] args) {
		int turncounter = 0;
		ArrayList input = new ArrayList();
		ArrayList ramcolor = new ArrayList();

		Random randomGenerator = new Random();

		for(int i = 0; i < 5; i++) {
			int randomcolor = randomGenerator.nextInt(4);

			switch(randomcolor) {
				case 1:
					ramcolor.add('r');
					break;
				case 2:
					ramcolor.add('g');
					break;
				case 3:
					ramcolor.add('b');
					break;
				case 4:
					ramcolor.add('y');
					break;
			}
		}

		while (turncounter <= 12) {
			turncounter ++;

			System.out.println("Current attempt: " + turncounter);

			for (int i = 0; i < 4; i++) {
				System.out.print("Color " + i + ": ");
				Scanner terminalInput = new Scanner(System.in);
				input.add(terminalInput.nextLine());
			}

			for (int i = 0; i < input.size(); i++) {
				for (int j = 0; j < ramcolor.size(); j++) {
					System.out.println(ramcolor);
					System.out.println(input + " " + i);
					if (input.get(i) == ramcolor.get(j))
						System.out.println("Correct");
					else
						System.out.println("Wrong");
				}
			}

			for (int i = input.size() - 1; i >= 0; i--) {
				input.remove(i);
			}
		}	
	}
}