import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener{

    JTextField jtext;
    JPanel p;
    JLabel lab;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPlus,bMinus,bMul,bPoint,bClear,bEqual;
    public Calculator(){

        b0=(new JButton("0"));
        b1=(new JButton("1"));
        b2=(new JButton("2"));
        b3=(new JButton("3"));
        b4=(new JButton("4"));
        b5=(new JButton("5"));
        b6=(new JButton("6"));
        b7=(new JButton("7"));
        b8=(new JButton("8"));
        b9=(new JButton("9"));
        bPlus=(new JButton("+"));
        bMinus=(new JButton("-"));
        bMul=(new JButton("*"));
        bPoint=(new JButton("."));
        bClear=(new JButton("C"));
        bEqual=(new JButton("="));
        jtext=new JTextField(15);
        lab=new JLabel("My Calculator");
        p=new JPanel(new GridLayout(4,4));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bClear);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bMul);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bMinus);
        p.add(b0);
        p.add(bPoint);
        p.add(bPlus);
        p.add(bEqual);
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        c.add(p,BorderLayout.CENTER);
        c.add(jtext,BorderLayout.NORTH);
        c.add(lab,BorderLayout.SOUTH);
        setTitle("Calculator");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMul.addActionListener(this);
        bPoint.addActionListener(this);
        bClear.addActionListener(this);
        bEqual.addActionListener(this);
    }
public static void main(String ss[]){

        Calculator cal=new Calculator();
    }
    public void actionPerformed(ActionEvent e){

        String result=" ";
        String out[]=new String[1];
        double res,num1,num2;
        int counter=0;
        if(e.getSource()==b0)
            jtext.setText(jtext.getText() + "0");

        else if(e.getSource()==b1)
            jtext.setText(jtext.getText() + "1");

        else if(e.getSource()==b2)
            jtext.setText(jtext.getText() + "2");

        else if(e.getSource()==b3)
            jtext.setText(jtext.getText() + "3");

        else if(e.getSource()==b4)
            jtext.setText(jtext.getText() + "4");

        else if(e.getSource()==b5)
            jtext.setText(jtext.getText() + "5");

        else if(e.getSource()==b6)
            jtext.setText(jtext.getText() + "6");

        else if(e.getSource()==b7)
            jtext.setText(jtext.getText() + "7");

        else if(e.getSource()==b8)
            jtext.setText(jtext.getText() + "8");

        else if(e.getSource()==b9)
            jtext.setText(jtext.getText() + "9");

        else if(e.getSource()==bPlus){

            counter=1;
            if(jtext.getText().contains("+"))
                jtext.setText(jtext.getText());
            else
                jtext.setText(jtext.getText()+"+");
        }
        else if(e.getSource()==bMinus){

            if(jtext.getText().contains("-"))
                jtext.setText(jtext.getText());
            else
                jtext.setText(jtext.getText()+"-");
            counter=2;
        }
        else if(e.getSource()==bMul){

            if(jtext.getText().contains("*"))
                jtext.setText(jtext.getText());
            else
                jtext.setText(jtext.getText()+"*");
            counter=3;
        }
        else if(e.getSource()==bPoint){

            if(jtext.getText().contains("."))
                jtext.setText(jtext.getText());

            else
                jtext.setText(jtext.getText()+".");
        }
        else if(e.getSource()==bClear){

            jtext.setText("");
            counter=0;
            result="";
            res=0.0;
        }
        else if(e.getSource()==bEqual){

            if(counter==1){

                result=jtext.getText();
                out=result.split("+");
                num1=Double.parseDouble(out[0]);
                num2=Double.parseDouble(out[2]);
                res=num1+num2;
                
                jtext.setText(String.valueOf(res));
				 
            }
          
        }
    }
}
