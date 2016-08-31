/**
 * Created by jakefroeb on 8/31/16.
 */
public class User {
    String name;
    int promptChoice;
    int withdrawl;
    int balance;


    public void userName() throws Exception {
        System.out.println("Enter your name");
        name = Main.scanner.nextLine();

        if(!name.isEmpty()){
            System.out.println("Hello" + name);
        }
        else{
            throw new Exception("No name provided");
        }

    }
    public void promptUser() throws Exception{
        balance = 100;
        do {
            System.out.println("Would you like to 1. Check my balance, 2. Withdraw Funds, or 3. Cancel");
            promptChoice = Main.scanner.nextInt();
            if (promptChoice == 1) {
                System.out.println("Your balance is " + balance);
            } else if (promptChoice == 2) {
                System.out.println("How much Would you like to withdrawl?");
                withdrawl = Main.scanner.nextInt();
                if (balance-withdrawl < 0) {
                    throw new Exception("Invalid amount");
                } else {
                    balance = balance - withdrawl;
                    System.out.println("Please take all of your money your remaining funds are " + balance);
                }
            } else if (promptChoice == 3) {
                System.out.println("Thank you please come again");
            } else {
                throw new Exception("Invalid prompt");
            }
        }
        while(promptChoice != 3);





    }

}
