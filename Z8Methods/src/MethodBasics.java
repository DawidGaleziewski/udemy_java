public class MethodBasics {

    // "main" method is special for java, as JVM looks for this method as a entry point for the code
    public static void main(String[] args) {
        int levelCompleted = 5;
        int bonus = 100;

        // we can simply use the method name to invoke it
        calculateScore(true, 800, levelCompleted, bonus);


        calculateScore(true, 100000, 8, 200);

    }

    // declarations needed for method: [Declaring modifiers like public and static] [return type like void]
    // if method has keyword public it can be called by outside word
    // static signifies the method can be called directly by method
    // void is declared return type as the method does not return any data
    public static void myMethode(){ // method signature - method is uniquely defined in a class by its name, and the number adn type of parameters that are declered for it

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = calcFinalScore(levelCompleted, score, bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    // we can change return type before method name
    // java does not support default values for parameters
    public static int calcFinalScore(int levelCompleted, int score, int bonus){
        return score + (levelCompleted * bonus) + 1000;
    }
}