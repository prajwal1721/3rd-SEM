import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="m" height=500 width=300> </applet>*/

// import org.w3c.dom.events.MouseEvent;


public class m extends Applet 
{

    String s="";
    public void init()
    {
        // addMouseListener(this);
        // addMouseEventListener(this);
    
    addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent me){
        s="WELCOME";repaint();
        }
        public void mouseReleased(MouseEvent me)
        {
        s="GOODBYE";repaint();
        }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString(s,1, 15);
    }



}