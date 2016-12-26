import javax.swing.JOptionPane;
import java.util.Scanner;

public class SwingExample 
{

	public static void main(String[] args) 
	{
		String username = JOptionPane.showInputDialog("User Name : ");
		String password = JOptionPane.showInputDialog("Password : ");
		if(username != null && password!= null && username.equals("Harz") && password.equals("1234"))
		{
			JOptionPane.showMessageDialog(null, "In");
		}
		else
		{
			JOptionPane.showConfirmDialog(null, "Out");
		}
		if (username != null &&password != null && ( (username.equals("Harz") && password.equals("1234")) || (username.equals("HarzSR") && password.equals("4321"))))
		{
			JOptionPane.showMessageDialog(null, "You’re in");
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "You’re suspicious");
		}
		/*Scanner in = new Scanner(System.in);
		System.out.print("User Name : ");
		String username = in.nextLine();
		//String username = keyboard.next();
		if(username.equals("Harz"))
		{
			System.out.print("Password : ");
			String password = in.nextLine();
			if(password.equals("1234"))
			{
				System.out.println("You are In");
			}
			else
			{
				System.out.println("Incorrect Password");
			}
			
		}
		else
		{
			System.out.println("Incorrect Username");
		}*/
	}
}
