import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //func1();
        //func2();
        //func3(4444);
        //func4("abba");
        //func5(24);
        //func6();
        //func7();
        //func8(5);
        func9(5, 3);
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

    public static void func4(String s)
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

        if (isPolindrome)
            System.out.println("The string is polindrome");
        else
            System.out.println("The string is not polindrome");

    }

    public static void func5(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                if (i == num)
                    System.out.print(i);
                else
                    System.out.print(i + ",");
            }
        }
    }

    public static void func6()
    {
        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void func7()
    {
        int grade;
        Scanner s = new Scanner(System.in);
        int minGrade = 100;
        int maxGrade = 0;

        for (int i = 0; i < 7; i++)
        {
            System.out.println("Enter grade: ");
            grade = s.nextInt();

            if (grade < minGrade)
            {
                minGrade = grade;
            }
            else if(grade > maxGrade)
            {
                maxGrade = grade;
            }
        }

        System.out.println("Max grade: " + maxGrade);
        System.out.println("Min Grade: " + minGrade);
    }

    public static void func8(int num)
    {
        int a = 1;
        int b = 1;

        while (true)
        {
            if (a == num || b == num)
            {
                System.out.println("The number " + num + " found in the fib");
                break;
            } else if (a > num && b > num)
            {
                System.out.println("The number " + num + " not found in the fib");
                break;
            }

            a = a + b;
            b = a + b;
        }
    }

    public static void func9(int a, int b)
    {
        int mul = 0;
        for (int i = 0; i < a; i++)
        {
            mul += b;
        }

        System.out.println("The mul of " + a + " and " + b + " is " + mul);
    }
}