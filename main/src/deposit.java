import java.io.*;

public class deposit extends checkBal{
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int deposit;
	
	public static void dep() throws IOException{
		char checkDeposit;
		int newBalance = balance + deposit;
		System.out.println("==================================================");
		System.out.println("How much would you like to deposit? ");
		System.out.println("==================================================");
		deposit = Integer.parseInt(br.readLine());
		
		if (newBalance < 500 && deposit < 500){
			System.out.println("==================================================");
			System.out.println("Invalid Action" +
								"\n" + "To perform this action, you must deposit atleast 500 Php for your first deposit");
		System.out.println("==================================================");
		}
		else if (deposit < 50) {
			System.out.println("==================================================");
			System.out.println("The minimum deposit is 50Php.");
			System.out.println("==================================================");
		}
		else{
			System.out.println("==================================================");
			System.out.print("Confirm Deposit? (Y/N):");
				checkDeposit = (char)br.read();
				br.readLine();
				if(checkDeposit=='y' || checkDeposit=='Y'){
					balance = balance + deposit;
					System.out.println("==================================================");
					System.out.println("You have deposited " + deposit + "Php");
					System.out.println("==================================================");
					System.out.println("Your new balance is " + balance + "Php");
					System.out.println("==================================================");
			
				}else if(checkDeposit=='n' || checkDeposit=='N'){
					System.out.println("==================================================");
					System.out.println("The action has been cancelled");
					System.out.println("==================================================");
			}else{
				System.out.println("Error!");
			}
			
		}
	}
}
