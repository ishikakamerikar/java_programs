import java.util.*;
public class shrp1 {
    public static void swap(int a,int b)
        {
            /* Write your code inside this block*/
            b=a+b;
            a = b-a;
            b=b-a;

            /* Do not change the code beyond this point*/
            System.out.println("a value is = "+a);
            System.out.println("b value is = "+b);
            System.out.println(Math.max(a,b));

        }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            swap(a,b);
        }
    }

