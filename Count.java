import java.util.*;

public class Count
{
    public static void main(String[] args) 
    {
        Map<String, Integer> same = new TreeMap<String, Integer>();
        String string1="my name is akash my village is chanda";
        String string2[]=string1.split(" ");

        for (int i=0; i<string2.length; i++)
        {
            String string=string2[i];
            same.put(string,(same.get(string) == null?1:(same.get(string)+1)));
        }

        System.out.println(same);
    }
}      