import java.util.*;
public class oddoreven {
    public static void main(String args[])
    {
        System.out.print("Enter a Number : ");
        Scanner sc1 = new Scanner(System.in);
        int no = sc1.nextInt();
        if((no%2)==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("ODD");
        }

    }
}
