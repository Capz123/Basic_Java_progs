import java.awt.*;
import javax.swing.*;

public class calc extends JFrame
{
	private Container c;
	private JButton b1,b0,b2,b3,b4,b5,b6,b7,b8,b9;
	private JButton plus,minus,divide,multiply,eq;
	private JButton ac;
	private JTextField out;
	
	calc()
	{
		setTitle("Scientific Calculator");
		setLocationRelativeTo(null);
		setSize(350,450);
		
		c = getContentPane();
		
		b1 = new JButton("1");
		b1.setFont(new Font("Tahoma",Font.BOLD,15));
		b1.setPreferredSize(new Dimension(50,50));
		b2 = new JButton("2");
		b2.setFont(new Font("Tahoma",Font.BOLD,15));
		b2.setPreferredSize(new Dimension(50,50));
		b3 = new JButton("3");
		b3.setFont(new Font("Tahoma",Font.BOLD,15));
		b3.setPreferredSize(new Dimension(50,50));
		b4 = new JButton("4");
		b4.setFont(new Font("Tahoma",Font.BOLD,15));
		b4.setPreferredSize(new Dimension(50,50));
		b5 = new JButton("5");
		b5.setFont(new Font("Tahoma",Font.BOLD,15));
		b5.setPreferredSize(new Dimension(50,50));
		b6 = new JButton("6");	
		b6.setFont(new Font("Tahoma",Font.BOLD,15));
		b6.setPreferredSize(new Dimension(50,50));
		b7 = new JButton("7");
		b7.setFont(new Font("Tahoma",Font.BOLD,15));
		b7.setPreferredSize(new Dimension(50,50));
		b8 = new JButton("8");
		b8.setFont(new Font("Tahoma",Font.BOLD,15));
		b8.setPreferredSize(new Dimension(50,50));
		b9 = new JButton("9");
		b9.setFont(new Font("Tahoma",Font.BOLD,15));
		b9.setPreferredSize(new Dimension(50,50));
		b0 = new JButton("0");
		b0.setFont(new Font("Tahoma",Font.BOLD,15));
		b0.setPreferredSize(new Dimension(75,50));
		b0.setForeground(Color.RED);
		
		out = new JTextField("0");
		out.setPreferredSize(new Dimension (335,60));
		out.setFont(new Font("Tahoma",Font.BOLD,20));
		out.selectAll();
		
		plus = new JButton("+");
		plus.setPreferredSize(new Dimension (50,50));
		minus = new JButton("-");
		minus.setPreferredSize(new Dimension (50,50));
		divide = new JButton("/");
		divide.setPreferredSize(new Dimension (50,50));
		multiply = new JButton("*");
		multiply.setPreferredSize(new Dimension (50,50));
		eq = new JButton("=");
		eq.setPreferredSize(new Dimension(75,50));
		eq.setForeground(Color.BLUE);
		
		ac = new JButton("AC");
		ac.setForeground(Color.RED);
		
		JPanel zq = new JPanel();
		zq.add(b0);
		zq.add(eq);
		zq.add(plus);
	
		
		JPanel ott = new JPanel();
		ott.add(b1);
		ott.add(b2);
		ott.add(b3);
		ott.add(multiply);
		
		JPanel ffs = new JPanel();
		ffs.add(b4);
		ffs.add(b5);
		ffs.add(b6);
		ffs.add(minus);
		
		
		JPanel sen = new JPanel();
		sen.add(b7);
		sen.add(b8);
		sen.add(b9);
		sen.add(divide);
		
		c.setLayout(new FlowLayout());
		
		c.add(out);
		c.add(sen);
		c.add(ffs);
		c.add(ott);
		c.add(zq);
		
		
	
	}	
		
		public static void main (String[] args) 
	{
		calc cal = new calc();
		cal.setVisible(true);
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
}