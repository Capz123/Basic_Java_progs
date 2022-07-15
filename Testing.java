import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Testing extends JFrame implements ActionListener
{
	private Container con;
	private JTextField textInput;
	private JButton buttonDisplay;
	private JLabel labeldisplay;
	private String fullname = "";
	
	Testing()
	{
		setTitle("Testing GUI");
		setSize(300,200);
		setLocationRelativeTo(null);
		
		con = getContentPane();
		con.setLayout(new GridLayout(3,1));
		
		textInput = new JTextField();
		
		buttonDisplay = new JButton("Click To Display");
		buttonDisplay.addActionListener(this);
		labeldisplay = new JLabel("Entered Text will be displayed here");
		
		con.add(textInput);
		con.add(buttonDisplay);
		con.add(labeldisplay);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == buttonDisplay)
		{
			fullname = textInput.getText();
	
			labeldisplay.setText(fullname);
		}
	}
}