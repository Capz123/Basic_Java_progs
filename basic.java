import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class basic extends JFrame implements ActionListener
{
	
	double s1, s2,s3;
	int op;
	double out;
	private Container con;
	private JTextField text1;
	private JLabel labelOp;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	private JButton plus, minus, devide, multi, dot, equals,clear,clearAll,x2,x3,sin,cos,exp;
	private JRadioButton on,off;
	private ButtonGroup bg;



	basic()
	{
		setTitle("Calculator");
		setLocationRelativeTo(null);
		setSize(300,300);
		
		text1 = new JTextField(20);
		text1.setEditable(false);
		
		labelOp = new JLabel("Operation");
	
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4= new JButton("4");
		b5= new JButton("5");
		b6= new JButton("6");
		b7=new JButton("7");
		b8= new JButton("8");
		b9= new JButton("9");
		b0= new JButton("0");

		plus = new JButton("+");
		minus = new JButton("-");
		multi = new JButton("*");
		devide = new JButton("/");
		equals = new JButton("=");
		x2 = new JButton("x²");
		x3 = new JButton("x³");
		sin = new JButton("sin");
		cos = new JButton("cos");
		exp = new JButton("Exp");
		
		clear = new JButton("Clear Last");
		clearAll = new JButton("Clear All");
		
		JPanel clears = new JPanel();
		clears.add(clear);
		clears.add(clearAll);

		dot = new JButton(".");
		
		on = new JRadioButton("On");
		off = new JRadioButton("Off");
		
		bg = new ButtonGroup();
		bg.add(on);
		bg.add(off);
			
		JPanel but = new JPanel();
		but.add(on);
		but.add(off);
	
		JPanel top = new JPanel();
		top.setLayout(new GridLayout(1,2));
		top.add(text1);
		top.add(labelOp);
	
		JPanel all = new JPanel();
		all.setLayout(new GridLayout(6,4));
		
		all.add(x2);
		all.add(x3);
		all.add(sin);
		all.add(cos);
		all.add(b7);
		all.add(b8);
		all.add(b9);
		all.add(plus);
		all.add(b4);
		all.add(b5);
		all.add(b6);
		all.add(minus);
		all.add(b1);
		all.add(b2);
		all.add(b3);
		all.add(multi);
		all.add(dot);
		all.add(b0);
		all.add(equals);
		all.add(devide);
		
		
		con = getContentPane();

		con.setLayout(new BorderLayout());	
		con.add(clears,BorderLayout.LINE_START);
		con.add(but,BorderLayout.AFTER_LINE_ENDS);
		con.add(top,BorderLayout.NORTH);
		con.add(all,BorderLayout.PAGE_END);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		equals.addActionListener(this);
		devide.addActionListener(this);
		multi.addActionListener(this);
		clear.addActionListener(this);
		clearAll.addActionListener(this);
		x2.addActionListener(this);
		x3.addActionListener(this);
		dot.addActionListener(this);
		sin.addActionListener(this);
		cos.addActionListener(this);
		on.addActionListener(this);
		off.addActionListener(this);		
		
	}
		
	public static void main (String[] args)
	{
		basic b = new basic();

		b.setVisible(true);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public void actionPerformed(ActionEvent e)
	{
	
		if(e.getSource() == b1)
		{
			text1.setText(text1.getText()+"1");
		}
		
		else if(e.getSource() == b2)
		{
			text1.setText(text1.getText()+"2");
		}
		else if(e.getSource() == b3)
		{
			text1.setText(text1.getText()+"3");
		}
		else if(e.getSource() == b4)
		{
			text1.setText(text1.getText()+"4");
		}
		else if(e.getSource() == b5)
		{
			text1.setText(text1.getText()+"5");
		}
		else if(e.getSource() == b6)
		{
			text1.setText(text1.getText()+"6");
		}
		else if(e.getSource() == b7)
		{
			text1.setText(text1.getText()+"7");
		}
		else if(e.getSource() == b8)
		{
			text1.setText(text1.getText()+"8");
		}
		else if(e.getSource() == b9)
		{
			text1.setText(text1.getText()+"9");
		}
		else if(e.getSource() == b0)
		{
			text1.setText(text1.getText()+"0");
		}
		else if(e.getSource() == dot)
		{
			text1.setText(text1.getText()+ ".");
		}
		
		else if (e.getSource() == plus)
		{
			s1 = Double.parseDouble(text1.getText());
			labelOp.setText("+");
			text1.setText("");
			op = 1;
		
		}	
			
		else if(e.getSource() == minus)
		{
			s1 = Double.parseDouble(text1.getText());
			labelOp.setText("-");
			text1.setText("");
			op = 2;
		}
		else if(e.getSource() == multi)
		{
			s1 = Double.parseDouble(text1.getText());
			labelOp.setText("*");
			text1.setText("");
			op = 3;
		}
		else if(e.getSource() == devide)
		{
			s1 = Double.parseDouble(text1.getText());
			labelOp.setText("/");
			text1.setText("");
			op = 4;
		}
		else if(e.getSource() == on)
		{
				b0.setEnabled(true);
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				x2.setEnabled(true);
				x3.setEnabled(true);
				dot.setEnabled(true);
				plus.setEnabled(true);
				minus.setEnabled(true);
				multi.setEnabled(true);
				devide.setEnabled(true);
				sin.setEnabled(true);
				cos.setEnabled(true);
				clear.setEnabled(true);
				clearAll.setEnabled(true);			
				equals.setEnabled(true);
		}
		else if(e.getSource() == off)
		{
				b0.setEnabled(false);
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				x2.setEnabled(false);
				x3.setEnabled(false);
				dot.setEnabled(false);
				plus.setEnabled(false);
				minus.setEnabled(false);
				multi.setEnabled(false);
				devide.setEnabled(false);
				sin.setEnabled(false);
				cos.setEnabled(false);
				clear.setEnabled(false);
				clearAll.setEnabled(false);			
				equals.setEnabled(false);
		}
		else if(e.getSource() == x2)
		{
			if(text1.getText().equals(""))
			{
				labelOp.setText("No Value Added");
			}
			else
			{	
				s1 = Math.pow(Double.parseDouble(text1.getText()),2);
				text1.setText("");
				text1.setText(String.valueOf(s1));
			}
		}
		else if(e.getSource() == x3)
		{
			if(text1.getText().equals(""))
			{
				labelOp.setText("No Value Added");
			}
			else
			{
			
				s1 = Math.pow(Double.parseDouble(text1.getText()),3);
				text1.setText("");
				text1.setText(String.valueOf(s1));
			}
		}
		else if(e.getSource() == sin)
		{
			if(text1.getText().equals(""))
			{
				labelOp.setText("No Value Added");
			}
			else
			{
				s1 = Math.sin(Double.parseDouble(text1.getText()));
				text1.setText("");
				text1.setText(String.valueOf(s1));
			}
		}
		
		else if(e.getSource() == cos)
		{
			if(text1.getText().equals(""))
			{
				labelOp.setText("No Value Added");
			}
			else
			{
				s1 = Math.cos(Double.parseDouble(text1.getText()));
				text1.setText("");
				text1.setText(String.valueOf(s1));
			}
		}

		else if(e.getSource() == equals)
		{
			s2 = Double.parseDouble(text1.getText());
			labelOp.setText("=");
			
			
			switch(op)
			{
				case 1:	out = s1+s2;
						text1.setText(String.valueOf(out));
						break;
				case 2:	out = s1-s2;
						text1.setText(String.valueOf(out));
						break;
				case 3:	out = s1*s2;
						text1.setText(String.valueOf(out));
						break;
				case 4:	out = s1/s2;
						text1.setText(String.valueOf(out));
						break;
					
			}
			
	
		
		}
		else if(e.getSource() == clear)
		{
			String s = text1.getText();
			text1.setText("");
			for(int i = 0;i < s.length()-1; i++)
			text1.setText(text1.getText()+s.charAt(i));
		}
		else if(e.getSource() == clearAll)
		{
			text1.setText("");
		}
	}
}

	



