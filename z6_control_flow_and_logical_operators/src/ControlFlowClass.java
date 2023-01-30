public class ControlFlowClass {
    public static void main(String[] args) {
        boolean shouldDisplay = false;

        // java can use normal code block
        if(shouldDisplay){
            System.out.println("howdy");
        }

        // java allows us to use if statments in single line
        if(!shouldDisplay) System.out.println("single line print!");

        // some control flow gotchas with this (imho dont use this on multiline as it is confusing and java is simply not python)
        // this is due to the fact that we can write simple statment in multiple lines
        if(shouldDisplay); //semicolon will end if statment here not making


        if(shouldDisplay)
            System.out.println("I will not print out"); // this is one statment starting from if
            System.out.println("I will print out"); //

    }
}
