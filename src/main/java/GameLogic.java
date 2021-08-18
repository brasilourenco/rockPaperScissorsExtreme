import java.util.Scanner;

public class GameLogic {

    private Scanner chooses;
    private Player1 player1;
    private Player2 player2;

    public GameLogic() {
        chooses = new Scanner(System.in);
        player1 = new Player1();
        player2 = new Player2();
    }

    public void logic(){
        while(true) {
            player1.player1Method();
            player2.player2Method();

            Scanner choosep1 = player1.choose2;
            Scanner choosep2 = player2.choose2;
            Scanner p1Name = player1.name;
            Scanner p2Name = player2.name;

            if (choosep1.equals(choosep2)){
                System.out.println("DRAW!");
            }
            if (choosep1.equals("rock") && choosep2.equals("scissor")){
                System.out.println(p1Name + " WINS!");
            }
            if (choosep1.equals("paper") && choosep2.equals("rock")){
                System.out.println(p1Name + "git push -u origin main WINS!");
            }
            if (choosep1.equals("scissor") && choosep2.equals("paper")){
                System.out.println(p1Name + " WINS!");
            }
            if (choosep2.equals("paper") && choosep1.equals("rock")){
                System.out.println(p2Name + " WINS!");
            }
            if (choosep2.equals("scissor") && choosep1.equals("paper")){
                System.out.println(p2Name + " WINS!");
            }
            if (choosep2.equals("rock") && choosep1.equals("scissor")){
                System.out.println(p2Name + " WINS!");
            }

            System.out.println("Do you want to continue?");
            String choose = chooses.nextLine();
            if (choose.equals("no") || choose.equals("No")){
                System.out.println("Bye!");
                System.exit(0);
            } else {
                continue;
            }
        }
    }

}
