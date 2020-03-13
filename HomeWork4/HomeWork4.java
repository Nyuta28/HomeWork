public class HomeWork4 {
    public static void main(String[] arg){

        ClassForHomeWork4 example = new ClassForHomeWork4();
        int summ = example.doSum(3, 6);
        int summ1 = example.doSum(3,6,8);
        System.out.println("Result of Sum: " + summ);
        System.out.println("Result of Sum overload: " + summ1);

        ClassForHomeWork4 example1 = new ClassForHomeWork4();
        int mult = example1.doMult(3, 6);
        int mult1 = example1.doMult(3, 6, 8);
        System.out.println("Result of Mul: " + mult);
        System.out.println("Result of Mul overload: " + mult1);

        // статик
        int div = ClassForHomeWork4.doDiv( 2, 3);
        System.out.println("Result of div: " + div);
        int sub = ClassForHomeWork4.doSub( 2, 3);
        System.out.println("Result of: " + sub);

        // оверлоад static
        int div1 = ClassForHomeWork4.doDiv(2, 3, 4);
        System.out.println("For third: " + div1);
        int sub1 = ClassForHomeWork4.doDiv(2, 3, 4);
        System.out.println("For third: " + sub1);
    }


}
