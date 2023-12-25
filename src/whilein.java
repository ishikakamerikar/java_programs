public class whilein
{
    public static void main(String[] args){
        int n = 9;
        int i=1;
        while(i<=n)
        {
            int s =i*i;
            if(s<=n){
                System.out.println(s);
                i++;
            }else {
                break;
            }
        }
    }

}