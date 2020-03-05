public class Homework3 {
    public static void main(String[] args) {
        //Обьявить четыре разных числа, сравнить их и вывести на консоль наименьшее.
        int a = 4;
        int b = 1;
        int c = 100;
        int d = 99;
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }
        System.out.println(min);

        // Обявить несколько из них одинаковых, вывести на консоль сколько одинаковых чисел в наборе.
        int e = 2;
        int f = 3;
        int g = 2;
        int amount = 0;
        if (e == f) {
            amount++;
        }
        if (f == g) {
            amount++;
        }
        if (e == g) {
            amount++;
        }
        System.out.println(amount);

        //описать математические операции над некоторыми числами ввиде калькулятора и вывести их на консоль.
        calculatorMethod(a, b);
    }


    public static void calculatorMethod(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication result :" + mul);
        int sum = a + b;
        System.out.println("The result of the amount :" + sum);
        int div = a / b;
        System.out.println("Division result :" + div);
        int sub = a - b;
        System.out.println("Subtraction result :" + sub);
    }

}
