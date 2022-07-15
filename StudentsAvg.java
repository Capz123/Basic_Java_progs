import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class StudentsAvg extends JFrame implements ActionListener
{
	DecimalFormat F = new DecimalFormat("##.00");
	
	private Container con;
	private JTextField textFirst,textLast,textMiddle;
	private JLabel labelsubject,labelgrade,labelblank;
	private JLabel labelObject,labelDesign,labelDifferential,labelProgramming,labelSpeech,labelGeneral,labelLiteraturel;
	private JLabel labelStudent,labelGeneralAverage,labelDisplay,labelPoint;
	private JButton buttonDisplay;
	private JTextField fieldObject,fieldDesign,fieldDifferential,fieldProgramming,fieldSpeech,fieldGeneral,fieldLiterature;
	private JLabel west,east;
	private String fullname;
	
	
	
	StudentsAvg()
	{
		setTitle("Student's Average");
		setSize(700,500);
		setLocationRelativeTo(null);
		
		textFirst = new JTextField("Enter FirstName");
		textFirst.setPreferredSize(new Dimension(175,20));
		textLast = new JTextField("Enter Last Name");
		textLast.setPreferredSize(new Dimension (175,20));
		textMiddle = new JTextField("Enter MiddleInitial");
		textMiddle.setPreferredSize(new Dimension (175,20));
		
		labelsubject = new JLabel("Subject");
		labelsubject.setPreferredSize(new Dimension (175,20));
		labelgrade = new JLabel("Grade");
		labelgrade.setPreferredSize(new Dimension (100,20));
		labelblank = new JLabel(" ");
		labelblank.setPreferredSize(new Dimension (175,20));
		labelObject = new JLabel("Object Oriented Programming:");
		labelObject.setPreferredSize(new Dimension (270,20));
		labelDesign = new JLabel("Design and Analysis of Algorithm:");
		labelDesign.setPreferredSize(new Dimension (270,20));
		labelDifferential = new JLabel("Differential and Integral Calculus:");
		labelDifferential.setPreferredSize(new Dimension (270,20));
		labelProgramming = new JLabel("Programming Languages:");
		labelProgramming.setPreferredSize(new Dimension (270,20));
		labelSpeech = new JLabel("Speech Communication:");
		labelSpeech.setPreferredSize(new Dimension (270,20));
		labelGeneral = new JLabel("General Psychology:");
		labelGeneral.setPreferredSize(new Dimension (270,20));
		labelLiteraturel = new JLabel("Literature of the Philippines:");
		labelLiteraturel.setPreferredSize(new Dimension (270,20));
		buttonDisplay = new JButton("Display Complete Name and Compute the Average");
		buttonDisplay.setBackground(Color.BLACK);
		buttonDisplay.setForeground(Color.WHITE);
		buttonDisplay.setPreferredSize(new Dimension (500,20));
		buttonDisplay.addActionListener(this);
		
		labelStudent = new JLabel("Student's Name:");
		labelStudent.setForeground(Color.RED);
		labelStudent.setPreferredSize(new Dimension(270,20));
		labelDisplay = new JLabel("--Display the complete name here--");
		labelDisplay.setForeground(Color.BLUE);
		labelDisplay.setPreferredSize(new Dimension (270,20));
		labelGeneralAverage = new JLabel("General Average:");
		labelGeneralAverage.setForeground(Color.RED);
		labelGeneralAverage.setPreferredSize(new Dimension (270,20));
		labelPoint = new JLabel("0.00");
		labelPoint.setForeground(Color.BLUE);
		labelPoint.setPreferredSize(new Dimension (270,20));
		
		fieldObject = new JTextField();
		fieldObject.setPreferredSize(new Dimension (270,20));
		fieldDesign = new JTextField();
		fieldDesign.setPreferredSize(new Dimension (270,20));
		fieldDifferential = new JTextField();
		fieldDifferential.setPreferredSize(new Dimension (270,20));
		fieldGeneral = new JTextField();
		fieldGeneral.setPreferredSize(new Dimension (270,20));
		fieldLiterature = new JTextField();
		fieldLiterature.setPreferredSize(new Dimension (270,20));
		fieldProgramming = new JTextField();
		fieldProgramming.setPreferredSize(new Dimension (270,20));
		fieldSpeech = new JTextField();
		fieldSpeech.setPreferredSize(new Dimension (270,20));
	
		JPanel north = new JPanel(new FlowLayout());
		north.add(textLast);
		north.add(textFirst);
		north.add(textMiddle);	
		
		
		JPanel cen = new JPanel(new FlowLayout());
		cen.add(labelsubject);
		cen.add(labelblank);
		cen.add(labelgrade);
		cen.add(labelObject);
		cen.add(fieldObject);
		cen.add(labelDesign);
		cen.add(fieldDesign);
		cen.add(labelDifferential);
		cen.add(fieldDifferential);
		cen.add(labelGeneral);
		cen.add(fieldGeneral);
		cen.add(labelLiteraturel);
		cen.add(fieldLiterature);
		cen.add(labelProgramming);
		cen.add(fieldProgramming);
		cen.add(labelSpeech);
		cen.add(fieldSpeech);
		cen.add(buttonDisplay);
		cen.add(labelStudent);
		cen.add(labelDisplay);
		cen.add(labelGeneralAverage);	
		cen.add(labelPoint);
	
		con = getContentPane();
		
		con.setLayout(new BorderLayout());
		con.add(north,BorderLayout.NORTH);
		con.add(cen,BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == buttonDisplay);
		{
			fullname = textLast.getText() + ", "+textFirst.getText()+ " "+textMiddle.getText() ;
			String ob = fieldObject.getText();
			double obj = Double.parseDouble(ob);
			String des = fieldDesign.getText();
			double dess = Double.parseDouble(des);
			String  dif = fieldDifferential.getText();
			double diff = Double.parseDouble(dif);
			String pro = fieldProgramming.getText();
			double prog = Double.parseDouble(pro);
			String sp = fieldSpeech.getText();
			double spe = Double.parseDouble(sp);
			String ge = fieldGeneral.getText();
			double gen = Double.parseDouble(ge);
			String li = fieldLiterature.getText();
			double lit = Double.parseDouble(li);
			
			double avg = obj + dess + diff + prog + spe + gen + lit;
			double ave = avg/7;
			labelPoint.setText(""+F.format(ave));
			labelDisplay.setText(fullname);
		}
	}
}