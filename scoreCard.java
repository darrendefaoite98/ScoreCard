import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class scoreCard {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int number_of_rounds = 0;
		String fighter_one_name = " "; 
		String fighter_two_name = " ";
		int fighter_one_total_score = 0;
		int fighter_two_total_score = 0;
		boolean isNumber;

		ArrayList f1_score_card = new ArrayList();
		ArrayList f2_score_card = new ArrayList();

		do{
			System.out.println("How many rounds? ");

			if(kb.hasNextInt()){
				number_of_rounds = kb.nextInt() + 1;
				isNumber = true;
			}else{
				System.out.println("I don't understand ");
				isNumber = false;
				kb.next();
			}
		} while (! (isNumber));

		System.out.println("What is fighter one's name? ");
		fighter_one_name = kb.next();

		System.out.println("What is fighter two's name? ");
		fighter_two_name = kb.next();


		for(int x = 1; x < number_of_rounds; x++){

			int fighter_one_round_score;
			int fighter_two_round_score;

			System.out.println("What do you score " + fighter_one_name + " in round "+ x +"?" );
			fighter_one_round_score = kb.nextInt();
			fighter_one_total_score = fighter_one_total_score + fighter_one_round_score;
			f1_score_card.add(fighter_one_round_score);

			System.out.println("What do you score " + fighter_two_name + " in round "+ x +"?" );
			fighter_two_round_score = kb.nextInt();
			fighter_two_total_score = fighter_two_total_score + fighter_two_round_score;
			f2_score_card.add(fighter_two_round_score);
			
		}

		System.out.println("\nThe results: ");
		System.out.println(fighter_one_name + " : " + fighter_one_total_score);
		System.out.println(fighter_two_name + " : " + fighter_two_total_score);
		System.out.println("\nScore Card: ");
		System.out.println(fighter_one_name +" "+ f1_score_card);
		System.out.println(fighter_two_name +" "+ f2_score_card);
	}

}
