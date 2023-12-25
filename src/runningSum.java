public class runningSum {
    public static void main(String[] args)
    {
        int[] arr={1,1,1,1}; //{1,3,6,10}
        int sum=0;
        for(int i=0;i<arr.length;i++ )
        {
            sum = sum + arr[i];
            System.out.print(sum+ " ");
        }
    }
}
