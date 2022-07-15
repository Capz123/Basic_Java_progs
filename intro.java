import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class intro extends JFrame implements ActionListener
{
	private Container c;
	private JLabel welcome;
	private JButton but1;
	
	intro()
	{
		setSize(300,150);
		setTitle("Introduction");
		setLocationRelativeTo(null);
		
		
		c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		welcome = new JLabel("WELCOME !");
		welcome.setFont(new Font("Arial",Font.BOLD,25));
		welcome.setForeground(Color.BLACK);
		
		but1 = new JButton("Next");
		but1.setFont(new Font("Arial",Font.BOLD,20));
		but1.setPreferredSize(new Dimension(200,50));

		
		c.add(welcome);
		c.add(but1);
		
		but1.addActionListener(this);
		
	}
	
	public static void main (String[] args) 
	{
		intro i = new intro();
		i.setVisible(true);
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == but1)
		{
			pass pas = new pass();
			pas.setVisible(true);
			pas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(false);
		}
		}
	}
	
