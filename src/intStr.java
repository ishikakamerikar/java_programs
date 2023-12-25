public class intStr {
    public static String g4(String str)
    {
        str = str.replaceAll("[^0-9]", " "); // regular expression"      1122   4 543   "

        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");//" 1122 4 543"

        if (str.equals(" "))
            System.out.println("-1");

        return str;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "avb";
        System.out.print(g4(str));
    }
}
