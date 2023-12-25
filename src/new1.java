import java.util.*;
public class new1
{
    public static int prime_numbers(int num)
    {
        int counter=0;
        boolean flag;
        int i,k;
        for(i=2;i<=(num-1);i++)
        {
            if(num%i==0)
            {
                ++counter;
            }

        }
        if(counter>=1)
        {
            k=0;
        }
        else
        {
            k=1;
        }
        return k;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int l;
        System.out.println("2");
        for(l=3;l<=num;l++)
        {
            int ret = prime_numbers(l);
            if (ret == 0)
            {
                //System.out.println(l+ " not prime");
            } else {
                System.out.println(l);
            }


        }
    }
}
