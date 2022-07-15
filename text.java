import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class text extends JFrame implements KeyListener
{
	private Container con;
	private JTextField text1;
	private JTextField text2;
	
	text()
	{
		setLocationRelativeTo(null);
		setTitle("Text Editing");
		setSize(300,100);
		
	
		
		text1 = new JTextField();
		text2 = new JTextField();
		
		text1.addKeyListener(this);
		con = getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(text1);
		con.add(text2);
		
	}
	
	public void keyTyped(KeyEvent e)
	{
		if(e.getSource() == text1);
		{
			String word = text1.getText();
			
			text2.setText(word.toUpperCase());
		}
	}
		public void keyReleased(KeyEvent e)
	{
		if(e.getSource() == text1);
		{
			String word = text1.getText();
			
			text2.setText(word.toUpperCase());
		}
	}
		public void keyPressed(KeyEvent e)
	{
		if(e.getSource() == text1);
		{
			String word = text1.getText();
			
			text2.setText(word.toUpperCase());
		}
	}
}

