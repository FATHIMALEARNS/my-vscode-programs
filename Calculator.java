import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
    JTextField textfield;
    double num1,num2,result;
    String operator;
    JButton addButton,subButton,mulButton,divButton,equButton,clrButton;

    public Calculator(){
        //Setting up GUI components
        textfield=new JTextField();
        textfield.setBounds(30,40,280,30);
        add(textfield);

        addButton=new JButton("+");
        addButton.setBounds(50,100,50,40);
        subButton=new JButton("-");
        subButton.setBounds(100,100,50,40);
        mulButton=new JButton("*");
        mulButton.setBounds(150,100,50,40);
        divButton=new JButton("/");
        divButton.setBounds(200,100,50,40);
        equButton=new JButton("=");
        equButton.setBounds(300,100,50,40);
        clrButton=new JButton("C");
        clrButton.setBounds(250,100,50,40);

        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(equButton);
        add(clrButton);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equButton.addActionListener(this);
        clrButton.addActionListener(this);

        setLayout(null);
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addButton){
            num1=Double.parseDouble(textfield.getText());
            operator="+";
            textfield.setText("");
        }
        if(e.getSource()==subButton){
            num1=Double.parseDouble(textfield.getText());
            operator="-";
            textfield.setText("");
        }
        if(e.getSource()==mulButton){
            num1=Double.parseDouble(textfield.getText());
            operator="*";
            textfield.setText("");
        }

        if(e.getSource()==divButton){
            num1=Double.parseDouble(textfield.getText());
            operator="/";
            textfield.setText("");
        }

        if(e.getSource()==equButton){
            num2=Double.parseDouble(textfield.getText());
            switch(operator){
                case "+":
                result=num1+num2;
                break;
                case "-":
                result=num1-num2;
                break;
                case "*":
                result=num1*num2;
                break;
                case "/":
                result=num1/num2;
                break;
            }
            textfield.setText(String.valueOf(result));
            num1=result;
        }

        if(e.getSource()==clrButton){
            textfield.setText("");
        }
    }
    public static void main(String args[]){
        new Calculator();
    }
}