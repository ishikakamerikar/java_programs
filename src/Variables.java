import java.util.*;
public class Variables {
    public static void main(String args[])
    {
        System.out.println("Please enter first no: ");
        Scanner sc = new Scanner(System.in);
        int no1= sc.nextInt();
        System.out.println("Please enter second no: ");
        Scanner sc1 = new Scanner(System.in);
        int no2= sc1.nextInt();
        int sum= no1 + no2;
        System.out.println(" Addition of the two nos is");
        System.out.println(sum);

    }
}
