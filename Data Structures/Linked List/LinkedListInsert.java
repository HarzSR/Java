import java.util.Scanner;

public class LinkedListInsert 
{
	Node head = null;
	
	class Node
	{
		int data;
		Node next;
		Node(int n)
		{
			data = n;
			next = null;
		}
	}
	private void push(int d)
	{
		Node n = new Node(d);
		n.next = head;
		head = n;
	}
	private void insert(Node pre, int d)
	{
		if(pre == null)
		{
			System.out.print("Previous Node Null");
			return;
		}
		else
		{
			Node n = new Node(d);
			n.next = pre.next;
			pre.next = n;
		}
	}
	private void append(int d)
	{
		Node n = new Node(d);
		if(head == null)
		{
			head = new Node(d);
			return;
		}
		n.next = null;
		Node last = head;
		while(last.next !=null)
		{
			last = last.next;
		}
		last.next = n;
		return;
	}
	private void print()
	{
		Node print = head;
		while(print != null)
		{
			System.out.print(print.data + " -> ");
			print = print.next;
		}
		System.out.print("End");
	}
	public static void main(String[] args)
	{
		char c;
		int x,a;
		LinkedListInsert l = new LinkedListInsert();
		do
		{
			System.out.print("\n\n          Menu");
			System.out.print("\n1. Insert Element @ Last");
			System.out.print("\n2. Insert Element @ Begining");
			System.out.print("\n3. Insert Element @ After Previous Node");
			System.out.print("\n4. Print the List");
			System.out.print("\n5. Exit");
			System.out.print("\nEnter your Choise (1 - 5) : ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			switch(x)
			{
				case 1: System.out.print("Enter Data to Add Last : ");
						a = in.nextInt();
						l.append(a);
						break;
				case 2: System.out.print("Enter Data to Add First : ");
						a = in.nextInt();
						l.push(a);
						break;
				case 3: System.out.print("Enter Data to Add Between : ");
						a = in.nextInt();
						l.insert(l.head.next, a);
						break;
				case 4: l.print();
						break;
				case 5: return;
				default: System.out.print("Wrong Choice Try Again");
				 		 break;
			}
			System.out.print("\nDo you wish to Continue ( Y / N ) : ");
			c = in.next().charAt(0);
		}while( c == 'y' || c == 'Y');
	}
}
