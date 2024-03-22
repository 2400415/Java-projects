/*project will give you reminder of any two numbers you enter*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first_number:");
        int first_number=input.nextInt();
        System.out.println("Enter your second_number:");
        int second_number=input.nextInt();
        int reminder_total=first_number%second_number;
        System.out.println("the reminder is:"+reminder_total);
        input.close();

    }
}