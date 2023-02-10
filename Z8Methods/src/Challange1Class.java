import java.awt.*;

public class Challange1Class {
    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1000));
        displayHighScorePosition("Mark", calculateHighScorePosition(500));
        displayHighScorePosition("Mark", calculateHighScorePosition(150));
        displayHighScorePosition("Mark", calculateHighScorePosition(25));

        System.out.println("20km is " + toMilesPerHour(20));
    }

    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
            return;
        } else if (number < 0){
            System.out.println("negative");
            return;
        }

        System.out.println("zero");
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }

        double MILES_FOR_ONE_KM = 0.621371192;
        return Math.round(MILES_FOR_ONE_KM * kilometersPerHour);
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.printf("%s km/h = %s mi/h", kilometersPerHour, milesPerHour);
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
       if(score >= 1000){
           position = 1;
       } else if(score >= 500){
           position = 2;
       } else if(score >= 100) {
           position= 3;
       }

       return position;
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.printf("%s managed to get into position %s on the high score list \n", playerName, highScorePosition);
    };
}
