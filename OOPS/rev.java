import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="rev" height=600 width=630>
</applet>*/
public class rev  extends Applet implements KeyListener
{
    TextField t1;
    Label l;
    public void init()
    {
        // setLayout(null);
        l=new Label("ENTER NUMEBR");
        // l.setBounds(20,50,120,20);
        add(l);
        t1=new TextField(20);
        // t1.setBounds(150,50,100,20);
        add(t1);
        t1.addKeyListener(this);
    }
    public void keyPressed(KeyEvent e)
    {

        if(e.getKeyChar()=='R' || e.getKeyChar()=='r')
        {
            StringBuilder s=new StringBuilder(t1.getText());
            String d=new String(s.reverse());
            showStatus(d);
        }
    }
    public void keyReleased(KeyEvent k)
    {
        // showStatus("released");
        
    }

    public void keyTyped(KeyEvent k)
    {
        // showStatus("typed");
    }

}