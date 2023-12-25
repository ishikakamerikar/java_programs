import java.util.Arrays;
class tochckval {
    private static void check(Integer[] arr, int toCheckValue)
    {
        boolean test = Arrays.asList(arr).contains(toCheckValue);
       // System.out.println("Is " + toCheckValue + " present in the array: " + test);
        if (test==false)
        {
            System.out.println(toCheckValue);
        }

    }
    public static void main(String[] args)
    {

        Integer []arr= { 8,3,1,4,5,6,9};
        int toCheckValue;
        //System.out.println("Array: " + Arrays.toString(arr));
        //check(arr, toCheckValue);
        int j=1;
        for(int k =0;k<arr.length+1;k++)
        {
            check(arr, j);

            j++;
        }
    }
}
