import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first_integer:");
        int first_integer = input.nextInt();
        System.out.println("Enter your second_integer:");
        int second_integer = input.nextInt();
        int integer_difference = first_integer - second_integer;
        System.out.println("The answer difference:"+integer_difference);
        /*to determine if the difference is even or odd*/
        if (integer_difference % 2 == 0) {
            System.out.println("which is an even number!!");
        } else if (integer_difference % 2 >= 1) {
            System.out.println("which is an odd number!!");}
    }
}


