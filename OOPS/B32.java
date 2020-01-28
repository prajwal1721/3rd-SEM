import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="B32" height=300 width=200></applet>*/
public class B32 extends Applet
{
    String s="";
    public void init()
    {
        addMouseListener(new  MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                s="Welcome";
                repaint();
            }
            public void mouseReleased(MouseEvent me)
            {
                s="GoodBye";
                repaint();
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString(s,10,15);
    }
}