public class WhileClass {
    public static void main(String[] args) {
        whileLoop(8);
        skipOnly(2);
    }

    public static void whileLoop(int noOfLoops){
        int i = 0;
        while(i < noOfLoops){
            System.out.println("index from while " + i);
            i++;
        }

        int j = 0;
        while(true){
            if(j >= noOfLoops){
                break;
            }
            System.out.println("index from break while " + j);
            j++;
        }
    }

    public static void skipOnly(int numToSkip){
        int i = 0;
        while(i < 100) {
            i++;
            if(i == numToSkip){
                continue;
            };
            System.out.println("index in skipOne " + i);
        };
    }
}
