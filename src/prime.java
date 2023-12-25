public class prime {
    public static void main1(int n){
         int k; boolean flag;
        for(k=2;k<=(n-1);k++)
        {
            if(n%k==0)
            {
                flag=false;
            }
            else
            {
               flag = true;
            }
        }
        if(flag=true)
        {
            System.out.println(n + "prime");
        }
        else
        {
            System.out.println(n + "false");
        }

    }
    public static void main(String[] args)
    {
        int n=10;
        for(int i=3;i<=(n);i++) {
            main1(i);
        }
    }

}
