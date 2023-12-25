import java.util.*;
public class arrayPrimeTime {
    public static int prime_numbers(int n)
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers: ");
        int num = sc.nextInt();
        int[] arr= new int[num];
        arr[0]=2;
        System.out.println(arr[0]);
        int l=1, i=3;
            do
            {
                int logic= prime_numbers(i);
                if(logic==0)
                {
                    i++;
                }
                else {
                    arr[l]= i ;
                    System.out.println(arr[l]);
                    if(l!=(num-1))
                    {
                        l++;
                    }
                    else
                    {
                        break;
                    }
                    i++;
                }
            }
            while(i>=3);
    }
}
