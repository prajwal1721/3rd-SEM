import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="B1p" height =300 width=200>
</applet>
*/
public class B1p extends Applet implements ActionListener
{
    Button b1,b2,b3,b4;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    public void init()
    {
        setLayout(null);
        l1=new Label("Enter num1");
        l1.setBounds(10,20,50,25);
        add(l1);
        t1=new TextField(15);
        t1.setBounds(80,20,50,25);
        add(t1);
        
        l2=new Label("Enter num2");
        l2.setBounds(10,50,50,25);
        add(l2);
        t2=new TextField(15);
        t2.setBounds(80,50,50,25);
        add(t2);
        l3=new Label("Enter num1");
        l3.setBounds(10,90,50,25);
        add(l3);
        t3=new TextField(15);
        t3.setBounds(80,90,50,25);
        add(t3);
        Button b1=new Button("ADD");
        Button b2=new Button("SUB");
        Button b3=new Button("MUL");
        Button b4=new Button("DIV");
        add(b1);
        b1.setBounds(10,130,15,15);
        add(b2);
        b2.setBounds(30,130,15,15);
        add(b3);
        b3.setBounds(60,130,15,15);
        add(b4);
        b4.setBounds(90,130,15,15);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String action=ae.getActionCommand();
        if(action.equals("ADD"))
        {
            t3.setText(String.valueOf((Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()))));
        }
        else if(action.equals("SUB"))
        {
            t3.setText(String.valueOf((Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText()))));

        }
        else if(action.equals("MUL"))
        {
            t3.setText(String.valueOf((Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())))); 
        }
        else
        {
            if(Integer.parseInt(t2.getText())!=0)
            {
                t3.setText(String.valueOf((Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText()))));
            }
            else
            {
                t3.setText("Division by zero error");
            }
        }
    }
}