import java.io.*;
class changePin extends main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void changePin()throws IOException{
	
		int newPin, newPin1;
		char answer, answer1;
		System.out.println("==================================================");
		System.out.print("Enter your new PIN number: ");
		newPin = Integer.parseInt(br.readLine());
		System.out.println("==================================================");
		System.out.print("Re-enter your new PIN number: ");
		newPin1 = Integer.parseInt(br.readLine());
		System.out.println("==================================================");
		if (newPin==newPin1){
			System.out.print("Confirm Change PIN Number? (Y/N):  ");
			answer = (char)br.read();
			br.readLine();
			if(answer=='y' || answer=='Y'){
				main m = new main();
				m.pin = newPin;
				System.out.println("==================================================");
				System.out.println("Your PIN number has been successfully changed!");
				System.out.println("==================================================");
			}else if(answer == 'n' || answer== 'N'){
				System.out.println("==================================================");
				System.out.println("The action has been cancelled");
				System.out.println("==================================================");
			}else{
				System.out.println("Error!");
			}
		}else{
			System.out.print("PIN number do not match" + "\n" +"Do you want to try again? (Y/N):");
				answer1 = (char)br.read();
				br.readLine();
				System.out.println("================================================== \n");
				if(answer1=='y' || answer1=='Y'){
					changePin();
				}else if(answer1 == 'n' || answer1 == 'N'){
					System.out.println("==================================================");
					System.out.println("The action has been cancelled");
					System.out.println("==================================================");
			}else{
				System.out.println("Error!");
			}
		}
	}
}
