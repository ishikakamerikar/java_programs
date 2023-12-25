import java.util.*;
public class twodarray {
    public static int  maxim(int[][] arr)
    {
        int sum=0;
        //Scanner sc= new Scanner(System.in);
        //System.out.println(arr.length);
        int[] sum1=new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //System.out.println(arr[i][j]);
                sum=sum+arr[i][j];

            }
            //System.out.println(sum);
            sum1[i]=sum;
            //System.out.println(sum1[i]);
            sum=0;
        }
        int max = Arrays.stream(sum1).max().getAsInt();
        return max;
    }
    public static void main(String[] args)
    {
        int[][]arr = {{1, 2}, {4, 5}, {7,8} };
        System.out.println(maxim(arr));
    }
}
