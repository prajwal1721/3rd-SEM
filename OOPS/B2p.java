import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="B2p" height=300 width=300></applet>*/
public class B2p extends Applet implements KeyListener
{
    Label l1;
    TextField t1;
    public void init()
    {
        setLayout(null);
        l1=new Label("Enter Number");
        l1.setBounds(10,20,130,130);
        add(l1);
        t1=new TextField(30);
        t1.setBounds(150,20,130,130);
        add(t1);
        t1.addKeyListener(this);
    }
    public void keyPressed(KeyEvent k)
    {

    }
    public void keyReleased(KeyEvent k)
    {

    }
    public void keyTyped(KeyEvent k)
    {
        if(k.getKeyChar()=='R'|| k.getKeyChar()=='r')
        {
            StringBuffer b=new StringBuffer(t1.getText());
            String s=new String(b.reverse());
            showStatus(s);
        }
    }
}