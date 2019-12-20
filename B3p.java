import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code= "B3p" height=500 width=200> </applet>
*/
public class B3p extends Applet
{
    String s="";
    int x,y;
    public void init()
    {
        addMouseListener(new MouseAdapter() {
        
            public void mouseClicked(MouseEvent m)
            {
                s="Welcome";
                x=m.getX();
                y=m.getY();
                repaint();
            }
            public void mouseReleased(MouseEvent m)
            {
                s="GoodBye";
                x=m.getX();
                y=m.getY();
                repaint();
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString(s,x, y);
    }
}