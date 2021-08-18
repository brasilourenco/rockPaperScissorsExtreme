import java.util.Scanner;

public class Player2 {

    public Scanner name;
    private Scanner choose1;
    public Scanner choose2;

    public Player2() {
        name = new Scanner(System.in);
        choose1 = new Scanner(System.in);
        choose2 = new Scanner(System.in);
    }

    public void player2Method(){
        System.out.println("Hello, whats your name?");
        String playerName = this.name.nextLine();
        System.out.println("Hi " + playerName + " let's play?");
        String choose = this.choose1.nextLine();
        if (choose.equals("No") || choose.equals("no")){
            System.out.println("Bye!");
            System.exit(0);
        }

        if (choose.equals("Yes") || choose.equals("yes")){
            System.out.println("Choose your object:");
            String choose2 = this.choose2.nextLine();
            if (choose2.equals("rock") || choose2.equals("paper") || choose2.equals("scissor")){
                System.out.println("Hmm...");
            } else{
                System.out.println("Sorry, but that object doesn't exist!");
                System.exit(0);
            }
        }

    }

}
