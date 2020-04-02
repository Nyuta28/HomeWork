import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

// первый способ
        String string = "First method";

        StringBuilder bildStr = new StringBuilder();

        bildStr.append(string);

        bildStr = bildStr.reverse();

        System.out.println(bildStr);

// второй способ
        String st = "Second Method";

        char symbols[] = st.toCharArray();   

        for (int x = symbols.length - 1; x >= 0; x--) {

            System.out.print(symbols[x]);

        }
        System.out.println("");

// третий спсоб

       String string3;

        Scanner scannerQ = new Scanner(System.in);

        System.out.println("Введите вашу строку:");

        string3 = scannerQ.nextLine();

        String[] temp = string3.split("");    

        for(int x= temp.length-1; x>=0; x--)

        {

            System.out.print(temp [x]);

        }

    }
}
