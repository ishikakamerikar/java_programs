public class patternwh {
    public static void main(String[] args)
    {
        int i=1,k=5;
        while(k>=1)
        {
            System.out.print("*");
            int j =1;
            while(j<k)
            {
                System.out.print("*");
                j++;
            }
            k--;
            System.out.println();
        }
        while(i<=5)
        {
            System.out.print("*");
            int j =1;
            while(j<i)
            {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
