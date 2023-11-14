import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //func1();
        //func2();
        //func3(4444);
        boolean isPol = func4("abba");
    }

    public static void func1()
    {
        int avg = 0;
        int grade;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter grade: ");
            grade = s.nextInt();
            avg += grade;
        }

        avg /= 5;

        System.out.println("The average is: " + avg);
    }

    public static void func2()
    {
        String word;
        int count = 0;
        Scanner s = new Scanner(System.in);

        do
        {
            System.out.println("Enter word: ");
            word = s.nextLine();
            count++;
        } while (!word.equals("enter"));

        System.out.println("Words: " + count);
    }

    public static void func3(int code_)
    {
        int code;
        Scanner s = new Scanner(System.in);

        while (true)
        {
            do
            {
                System.out.println("Enter 4 digits code: ");
                code = s.nextInt();
            } while(code < 1000 || code > 10000);

            if (code == code_)
            {
                System.out.println("How much money?");
                break;
            }
            else
            {
                System.out.println("Error!");
            }
        }
    }

    public static boolean func4(String s)
    {
        boolean isPolindrome = true;

        for (int i = 0; i < s.length() / 2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            {
                isPolindrome = false;
                break;
            }
        }

        return isPolindrome;
    }


}