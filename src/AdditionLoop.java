import java.util.*;
public class AdditionLoop {
    public static void main(String[] args)
    {
        System.out.print("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            sum= sum+i;
            //System.out.print(sum +" ");
        }
        System.out.print("\n" +sum +" ");
    }
}
