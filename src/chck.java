public class chck {
    public static void main(String[] args)
    {
        int []a= {5,4,7,2,6};
        int max= a[0];
        for(int i=0;i<=4;i++)
        {
           if(max>=a[i])
           {
               max  = max;

           }
           else {
               max = a[i];
           }
        }
        System.out.println(max);

    }
}
