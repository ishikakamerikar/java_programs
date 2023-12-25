public class primearray {
    public static void main(String[] args)
    {
        int n = 11;
        boolean flag=true;
        for(int i=2;i<n;i++)
        {
            for(int k=i;k<=n;k++)
            {
                if (k % i == 0) {
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}
