import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
@SuppressWarnings({ "Serial", "serial" })
public class Simple extends JFrame{
	public Simple()
	{
		setTitle("Frame Title");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Press"));
		setSize(500,250);
		setVisible(true);
	}
}
