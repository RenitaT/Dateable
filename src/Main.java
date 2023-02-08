import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //Prompt + input:  Enter your age: 19

        //Output:  19-year olds should date somebody who is at least 16 years old.

        //Another sample program run could be:

        //Prompt + input: :  Enter your age: 22

        //22-year olds should date somebody who is at least 18 years old.

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?:");

        int age = scanner.nextInt();

        int youngest = age/2 + 7;

        String output = "" + age + " year olds should date somebody who is at least "+youngest+" years old.";

        System.out.println(output);


    }
}