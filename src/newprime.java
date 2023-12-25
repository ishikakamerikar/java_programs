import java.util.*;
public class newprime {
    public static int main2(int n)
    {
        int counter=0;
        boolean flag;
        int i,k;
        for(i=2;i<=(n-1);i++)
        {
           if(n%i==0)
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
    public static void main(String[] args)
    {
        int l;
        int num=9;
        System.out.println("2");
       for(l=3;l<=num;l++) {
           int ret = main2(l);
           if (ret == 0) {
               //System.out.println(l+ " not prime");
           } else {
               System.out.println(l);
           }
       }
    }
}
