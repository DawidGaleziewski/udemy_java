public class SandboxClass {
    public static void main(String[] args) {
        double val1 = 20.00;
        double val2 = 80.00;
        double result = (val1 + val2) * 100.00d; // this is operator precedance as in normal math
        double remainder = result % 40.00d;
        boolean isZero = remainder == 0 ?  true : false;
        System.out.println("the remainder isNotZero is " + isZero);

        if(isZero){
            System.out.println("got some remainder");
        }
    }
}
