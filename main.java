import java.util.Scanner;

public class main {
    public static void main(String[] args) { 
        Scanner x = new Scanner(System.in);
        int i, j;
        System.out.print("num i = ");
        i = x.nextInt();
        System.out.print("num j = ");
        j = x.nextInt();
        System.out.print("operation = ");
        char z = x.next().charAt(0);
        
        if(z == '+')
            System.out.printf("i + j = %d\n", i + j);
        else if(z == '-')
            System.out.printf("i - j = %d\n", i - j);
        else if(z == '*' || z == '*') // '*' is used for multiplication
            System.out.printf("i x j = %d\n", i * j);
        else if(z == '/' || z == '/') // '/' is used for division
            System.out.printf("i ÷ j = %d\n", i / j);
        else
            System.out.println("Invalid operation");
    }
}
