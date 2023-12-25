import java.util.*;
public class elseif {
    public static void main(String args[])
    {
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("EQUAL");
        }
        else if(a>b)
        {
            System.out.println(a + " Greater");
        }
        else {
            System.out.println(b + " greater");
        }
    }
}
