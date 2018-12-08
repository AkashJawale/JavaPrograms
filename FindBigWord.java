public class FindBigWord 
{

    public static void main( String[] args )
    {
        String s = "Akash Sagar Arif Bangalore Sandeep Avinash";
        String[] word = s.split( " " );
        String big = " ";

        for ( int i = 0; i < word.length; i++ )
        {
            if ( word[i].length() > big.length() )
                big = word[i];

        }

         System.out.print("Length of the words is : " + big.length());
         System.out.println("\n");
         System.out.println("Biggest word is :" +big);
    }

}
