public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        list.add("FIVE");
 
        list.add("SIX");
 
        list.add("SEVEN");
 
        System.out.println(list);     

        list.poll();
 
        list.pollFirst();
 
        list.remove();
 
        list.removeFirst();
 
        System.out.println(list);   

        list.pollLast();
 
        list.removeLast();
  
        System.out.println(list); 
    }
}