package collectionEx;

import java.util.*;

public class CollectionEx 
{
	

	public static void main(String[] args)
	{
	/*	
		List <String> list=new ArrayList <String>();
	    list.add("one");
	    list.add("two");
//	    System.out.println("List size :"+list.size());
	    
	
	List<String> list1 =new ArrayList<String>();
	list1.add("three");
	list1.add("four");
	list1.add("five");
	list.addAll(list1);
	
//	System.out.println("list size :"+list.size());
	for (int i=0;i<list.size();i++)
			{
		     System.out.println("elements at position :"+i +"   is    "+list.get(i));
			}
	
	   System.out.println("After itrerator.......");
	Iterator<String>iter =list.iterator();
	while (iter.hasNext())
	{
		System.out.println("Using Iterator :"+iter.next());
	}
	    System.out.println("After Shuffle");
	    
	    Collections.shuffle(list);
	    for(int i=0;i<list.size();i++)
{
	System.out.println("element at position is :"+i +"   is     "+list.get(i));
}
	*/

	Map<String,String> map=new HashMap<String,String>();
	map.put("1","one");
	map.put("2", "two");
	map.put("3", "three");
	map.put("4", "four");
	
	//System.out.println("Size of map is :"+map.size());
	String str=map.get("4");
	System.out.println("value from map "+str);
	
	Map <String,String>mp1=new HashMap<String,String>();
	mp1.put("4", "four");
	mp1.put("5", "five");
	mp1.put("6", "six");
	mp1.put("7", "seven");
	mp1.put("8", "eight");
	
	map.putAll(mp1);
	
	}
	

}
