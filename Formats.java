import java.awt.*;
import javax.swing.*;

public class Formats extends JFrame
{
	private Container con;
	private JTextField textSubject;
	private JLabel labelFormat, labelColor, labelStyle, labelSize;
	private JRadioButton colorBlack,colorBlue,colorOrange,colorPink;
	private JRadioButton styleArial,styleVerdana,styleTahoma,styleCalibri;
	private JCheckBox fontPlain,fontBold,fontItalic,fontBoldItalic;
	private JCheckBox size12,size14,size16,size18,size20;
	
	Formats()
	{
		setTitle("Formatting Text");
		setSize(450,150);
		setLocationRelativeTo(null);
		con = getContentPane();	
	
		textSubject = new JTextField();	
		labelFormat = new JLabel("Format Font:");
		labelFormat.setForeground(Color.RED);
		labelColor = new JLabel("Font Color:");
		labelColor.setForeground(Color.RED);
		labelSize = new JLabel("Font Style:");
		labelSize.setForeground(Color.RED);
		labelStyle = new JLabel("Font Size:");
		labelStyle.setForeground(Color.RED);
		
		colorBlack = new JRadioButton("Black");
		colorBlue = new JRadioButton("Blue");
		colorOrange = new JRadioButton("Orange");
		colorPink = new JRadioButton("Pink");
		
		styleArial = new JRadioButton("Arial");
		styleVerdana = new JRadioButton("Verdana");
		styleCalibri = new JRadioButton("Calibri");
		styleTahoma = new JRadioButton("Tahoma");
		
		fontPlain = new JCheckBox("Plain");
		fontItalic = new JCheckBox("Italic");
		fontBold = new JCheckBox("Bold");
		fontBoldItalic = new JCheckBox("Bold-Italic");
		
		size12 = new JCheckBox("12");
		size14 = new JCheckBox("14");
		size16 = new JCheckBox("16");
		size18 = new JCheckBox("18");
		size20 = new JCheckBox("20");
		
		
		JPanel c = new JPanel(new GridLayout(3,5));
		c.add(labelFormat);	
		c.add(fontPlain);
		c.add(fontBold);
		c.add(fontItalic);
		c.add(fontBoldItalic);
		
		c.add(labelColor);
		c.add(colorBlack);
		c.add(colorBlue);
		c.add(colorOrange);
		c.add(colorPink);
		
		c.add(labelStyle);
		c.add(styleArial);
		c.add(styleVerdana);
		c.add(styleTahoma);
		c.add(styleCalibri);
		
		JPanel s = new JPanel(new GridLayout(1,6));
		s.add(labelSize);
		s.add(size12);
		s.add(size14);
		s.add(size16);
		s.add(size18);
		s.add(size20);
		
		con.setLayout(new BorderLayout());
		con.add(textSubject, BorderLayout.NORTH);
		con.add(c,BorderLayout.CENTER);
		con.add(s,BorderLayout.SOUTH);
		
	}
}