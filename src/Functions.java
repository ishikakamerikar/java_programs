import java.util.*;
public class Functions {
    public static int mysum(int y, int z)
    {
        int h = y+z;
        return h;
    }
    public static int myMul(int num1, int num2)
    {
        int num3 = num1*num2;
        return num3;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = mysum(a,b);
        int mul = myMul(a,b);
        System.out.println("The addition is: " + sum);
        System.out.println("The product is: " + mul);
    }
}
