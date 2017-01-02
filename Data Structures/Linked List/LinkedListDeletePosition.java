import java.util.Scanner;

public class LinkedListDeletePosition
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
		System.out.print("Insert Successful");
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
			System.out.print("Insert Successful");
		}
	}
	private void append(int d)
	{
		Node n = new Node(d);
		if(head == null)
		{
			System.out.print("Insert Successful");
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
		System.out.print("Insert Successful");
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
	private void delete(int k)
	{
		Node temp = head, previous = null;
		if(temp != null && temp.data == k)
		{
			head = temp.next;
			return;
		}
		while(temp != null && temp.data !=k)
		{
			previous = temp;
			temp = temp.next;
		}
		System.out.print("Deleting Element");
		if(temp == null)
		{
			System.out.print("No Data");
			return;
		}
		previous.next = temp.next;
	}
	private void deletepos(int pos)
	{
		if(head == null)
		{
			System.out.print("Empty List");
			return;
		}
		Node temp = head;
		if(pos == 0)
		{
			head = temp.next;
			return;
		}
		for(int i = 0; temp != null && i < (pos - 1); i++)
		{
			temp = temp.next;
		}
		if(temp == null || temp.next == null)
		{
			System.out.print("Over Flow - No nodes @ this Position");
			return;
		}
		System.out.print("Removed Element @ Position : " + (pos + 1));
		Node next = temp.next.next;
		temp.next = next;
	}
	public static void main(String[] args)
	{
		char c;
		int x,a;
		LinkedListDeletePosition l = new LinkedListDeletePosition();
		do
		{
			System.out.print("\n\n          Menu");
			System.out.print("\n1. Insert Element @ Last");
			System.out.print("\n2. Insert Element @ Begining");
			System.out.print("\n3. Insert Element @ After Previous Node");
			System.out.print("\n4. Delete Element");
			System.out.print("\n5. Delete Element @ Position");
			System.out.print("\n6. Print the List");
			System.out.print("\n7. Exit");
			System.out.print("\nEnter your Choise (1 - 7) : ");
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
				case 4: System.out.print("Enter Element to be Deleted : ");
						a = in.nextInt();
						l.delete(a);
						break;
				case 5: System.out.print("Enter Position of Element to be Deleted : ");
						a = in.nextInt();
						a -= 1;
						l.deletepos(a);
						break;
				case 6: l.print();
						break;
				case 7: return;
				default: System.out.print("Wrong Choice Try Again");
				 		 break;
			}
			System.out.print("\nDo you wish to Continue ( Y / N ) : ");
			c = in.next().charAt(0);
		}while( c == 'y' || c == 'Y');
	}
}
