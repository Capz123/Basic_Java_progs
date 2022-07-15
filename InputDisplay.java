import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class InputDisplay extends JFrame implements ActionListener
{
	private Container con;
	private JTextField textFirst;
	private JTextField textLast;
	private JButton buttonClick;
	public JLabel labelFirst;
	public JLabel labelLast;
	public JLabel labelComplete;
	
	InputDisplay()
	{
		setTitle("Name");
		setSize(500,110);
		setLocationRelativeTo(null);
		
		con = getContentPane();
		con.setLayout(new GridLayout(3,2));
		
		textFirst = new JTextField();
		textLast = new JTextField();
	
		buttonClick = new JButton("Click");
		buttonClick.addActionListener(this);
	
		labelFirst = new JLabel();
		labelFirst.setText("First Name:");
		
		labelLast = new JLabel();
		labelLast.setText("Last Name:");
	
		labelComplete = new JLabel();
		labelComplete.setText("-- Complete Name--");
	
		con.add(labelFirst);
		con.add(textFirst);
		con.add(labelLast);
		con.add(textLast);
		con.add(buttonClick);
		con.add(labelComplete);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == buttonClick);
		{
			String fullname = textFirst.getText() + " " + textLast.getText();
			labelComplete.setText(fullname);
		}
	}
}


 