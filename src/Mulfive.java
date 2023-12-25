public class Mulfive {
    public static void main(String[] args)
    {
        int n = 1, m;int j=1; int sum=0;
        int length = (String.valueOf(n)).length();
        int i=1;int sum1=1;
        while(i<length)
        {
            sum1=sum1*10;//1*10=10
            i++;
            //System.out.println(sum1);
        }
        while(j<=length)
        {
            m = n%10;//3 //0.1
            n=n/10;//15
            sum= sum+(m*sum1);//0+1
            sum1=sum1/10;//1
            j++;
        }
        System.out.println(sum);
    }
}
//300+50+1