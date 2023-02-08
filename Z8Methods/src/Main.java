public class Main {
    public static void main(String[] args) {
        int levelCompleted = 5;
        int bonus = 100;

        // we can simply use the method name to invoke it
        calculateScore(true, 800, levelCompleted, bonus);


        calculateScore(true, 100000, 8, 200);

    }

    // if method has keyword public it can be called by outside word
    // static signifies the method can be called directly by method
    // void is declared return type as the method does not return any data
    public static void myMethode(){

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = calcFinalScore(levelCompleted, score, bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    // we can change return type before method name
    public static int calcFinalScore(int levelCompleted, int score, int bonus){
        return score + (levelCompleted * bonus) + 1000;
    }
}