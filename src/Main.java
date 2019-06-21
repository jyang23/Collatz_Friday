import java.util.Scanner;

public class Main {
    
    public static int isEven(int even)
    {
        even = even/2;
        return even;
    }

    public static int isOdd(int odd)
    {
        odd = (odd*3) + 1;
        return odd;
    }

//    public static boolean isOne(int one)
//    {
//        boolean checker = false;
//        if(one == 1)
//        {
//            checker = true;
//        }
//        else
//        {
//            checker = false;
//        }
//        return checker;
//
//    }

    public static void main(String[] args) {

        int input;
        boolean flag = true;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Collatz Sequence!");
        System.out.println("Please Enter a number: ");
        input = in.nextInt();
        System.out.print(input+" ");

        while(flag)
        {
            if(input == 1)
            {
                flag = false;
            }
            else if(input%2 == 0)
            {
                input = isEven(input);
                System.out.print(input+" ");
            }
            else
            {
                input = isOdd(input);
                System.out.print(input+" ");
            }
        }
    }
}
