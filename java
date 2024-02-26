import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	   Scanner s = new Scanner(System.in);
	   int n =s.nextInt();
	   createList(n);
	    
	}
	
	static void createList(int n)
	{  
	    Scanner s = new Scanner(System.in);
	    Node head,tail,newnode;
	    head = new Node();
	    int data = s.nextInt();
	    head.data = data;
	    head.prev = null;
	    head.next = null; 
	    tail = head;
	    for(int i=1;i<n;i++)
	    {
	        newnode = new Node();
	        int val = s.nextInt();
	        newnode.data = val;
	        newnode.prev=tail;
	        tail.next = newnode;
	        tail = newnode;
	    }
	    
	}
	
	static void display()
	{
	    Node temp = head;
	    while(temp!=null)
	    {
	        System.out.print(temp.data+" ");
	        temp = temp.next;
	    }
	    
	}
	
	
	
}

class Node 
{
    int data;
    Node prev;
    Node next;
}
