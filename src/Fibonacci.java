public class Fibonacci {
    public static void main(String[] args)
    {
        //0 1 1 2 3 5 8
        int i,n=4, a=0,b=1,sum;
        System.out.print(a+" "+b);
        for(i=0;i<=n-2;i++)
        {
            sum = a+b;
            System.out.print(" "+sum);
            a=b;   //0=b
            b=sum;// 1 =sum

        }
    }
}
