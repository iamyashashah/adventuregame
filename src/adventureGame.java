/* code for checking bank and details*/

import java.util.Scanner;
public class adventureGame {

	public static void main(String[] args) {
		
		int bank, optionselect, checktransfer;

		Scanner keyboard = new Scanner (System.in);

		System.out.println("Welcome to banking site");

		System.out.println("Please select the bank between bofa(1) and citi(2)");
		bank = keyboard.nextInt();

		


		if (bank == 1){
			System.out.println("bofa"); // selecting bank
			
		}
		else if (bank == 2) 
		{
			System.out.println("citi"); //selecting bank
		}
		else 
		{
			System.out.println("invalid bank");
			keyboard.close();
		}
		
		
		System.out.println("Please select checking or savings");
		optionselect = keyboard.nextInt();
			if (optionselect == 1)
				{
					System.out.println("your checking");
					
				}
			else if (optionselect == 2)
			{
			System.out.println("your savings");
			
			}
			else {
				System.out.println("invalid option");
				keyboard.close();
			}
			System.out.println("Please select check balance or Transfer balance");
			checktransfer = keyboard.nextInt();
					if (checktransfer == 1)
					{
						System.out.println("check balance");
					}
					else if (checktransfer == 2)
					{
						System.out.println("transfer balance");
					}
					else {
						System.out.println("invalid selection");
						keyboard.close();
					}
		
		
		
	
}

}
