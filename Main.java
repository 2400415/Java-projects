/*project will give you the answer of any two numbers you enter to be subtracted*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first_number:");
        int first_number=input.nextInt();
        System.out.println("Enter your second_number:");
        int second_number=input.nextInt();
        int number_difference=first_number-second_number;
        System.out.println("the answer is:"+number_difference);
        input.close();

    }
}
