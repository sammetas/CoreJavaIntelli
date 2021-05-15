import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
/*
      user selects one of the options Rock/Paper/Scissors
 */
    enum Move{
        ROCK,PAPER,SCISSORS;
}
static  Map<Integer,String> map= new HashMap<>();

static String all="ROCK|PAPER|SCISSORS|";
    static  String allno="1|2|3|";
    public static void main(String[] args) {
        map.put(1,"ROCK");
        map.put(2,"PAPER");
        map.put(3,"SCISSORS");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter your choice from below\n 1.ROCK\n2.PAPER\n3.SCISSORS\n");
        String userChoice=scanner.nextLine();

            while (!userChoice.equals(-1)) {
                if (userChoice.length() == 0 || userChoice == null || !all.contains(userChoice.toUpperCase())) {
                    System.out.println("You choice wrong option");
                    System.out.println("Please Enter your choice from below\n 1.ROCK\n2.PAPER\n3.SCISSORS\n");
                    userChoice=scanner.nextLine();
                }


                String compChoice = getCompChoice();
                System.out.println("Computer Chose::" + compChoice);//+" And user Choice::"+userChoice);
                if (userChoice.equals(compChoice)) {
                    System.out.println("It's a Tie. Computer and you both Choose " + compChoice);
                    //ROCKSystem.exit(1);
                }
                if (userChoice.equals(String.valueOf(Move.PAPER))) {
                    if (compChoice.equals(String.valueOf(Move.ROCK))) {
                        System.out.println("Hurrey You won!!");
                    }
                    if (compChoice.equals(String.valueOf(Move.SCISSORS))) {
                        System.out.println("You lost,Computer Won");
                    }
                } else if (userChoice.equals(String.valueOf(Move.ROCK))) {
                    if (compChoice.equals(String.valueOf(Move.PAPER))) {
                        System.out.println("sharad lost,Computer Won");
                    }
                    if (compChoice.equals(String.valueOf(Move.SCISSORS))) {
                        System.out.println("Hurrey sharad won!!");
                    }
                } else {
                    if (compChoice.equals(String.valueOf(Move.PAPER))) {
                        System.out.println("Hurrey sharad won!!");
                    }
                    if (compChoice.equals(String.valueOf(Move.ROCK))) {
                        System.out.println("sharad lost,Computer Won");
                    }
                }
                System.out.println("Please Enter your choice from below\n 1.ROCK\n2.PAPER\n3.SCISSORS\n");
                userChoice=scanner.nextLine();
            }
    }

    private static String getCompChoice() {

        Random rand=new Random();
         int t=  rand.nextInt(3)+1;
        //System.out.println(t);
        return map.get(t);

    }
}
