import java.util.*;
public class subarrays {
    public static void main(String[] args) {
        int[] a = {5,2,-4,-5, 3,-1,2,3,1}; int len=a.length; int w=0;
        int len2= (len*(len+1))/2;
        int[] a2= new int[len2];
        int sum = 0;
        for(int i =0;i<a.length;i++)
        {
            for(int j=i; j<a.length;j++)
            {
                System.out.print(a[j]);
                sum=sum+a[j];
                a2[w]=sum;w++;
                //System.out.println("sum: " +sum);
            }
            //System.out.println();
            sum=0;
        }
        for(int h =0;h<a2.length;h++)
        {
            System.out.println(a2[h]);
        }
        int max = Arrays.stream(a2).max().getAsInt();
        System.out.println("Maximum is: " + max);
    }
}
