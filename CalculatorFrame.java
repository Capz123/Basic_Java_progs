import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CalculatorFrame extends JFrame {

    /**
     * All the buttons that will be used in the calculator have been initialized 
     */
    private JButton button1;
    private JButton button2; 
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6; 
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0; 

    private JButton buttonEqual;
    private JButton buttonDot;

    private JButton buttonClearLast;
    private JButton buttonClearAll;

    private JButton buttonAdd;
    private JButton buttonSub;
    private JButton buttonMul;
    private JButton buttonDiv;

    private JTextArea textArea; 


    public CalculatorFrame(){


	setSize(200,300);
	setLocationRelativeTo(null);
    JPanel panel2 = new JPanel();       
    panel2.setLayout(new GridLayout(1,1));
    panel2.add(buttonClearLast = new JButton ("Clear Last"));
    panel2.add(buttonClearAll = new JButton ("Clear All"));
    add(panel2, BorderLayout.PAGE_START);

    JPanel panel3 = new JPanel();
    textArea = new JTextArea(2,10);
//  textArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    panel3.add(scrollPane);
    add(panel3, BorderLayout.LINE_START);



    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayout(4,4));      

    panel1.add(button7 = new JButton ("7"));
    panel1.add(button8 = new JButton ("8"));
    panel1.add(button9 = new JButton ("9"));
    panel1.add(buttonAdd = new JButton ("+"));
    panel1.add(button4 = new JButton ("4"));
    panel1.add(button5 = new JButton ("5"));
    panel1.add(button6 = new JButton ("6"));
    panel1.add(buttonSub = new JButton ("-"));
    panel1.add(button1 = new JButton ("1"));
    panel1.add(button2 = new JButton ("2"));
    panel1.add(button3 = new JButton ("3"));
    panel1.add(buttonMul = new JButton ("*"));
    panel1.add(button0 = new JButton ("0"));
    panel1.add(buttonDot = new JButton ("."));
    panel1.add(buttonEqual = new JButton ("="));
    panel1.add(buttonDiv = new JButton ("/"));

    add(panel1, BorderLayout.PAGE_END);


    }
    
    public static void main (String[] args) {
    	CalculatorFrame c = new CalculatorFrame();
    	c.setVisible(true);
    	c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    }
