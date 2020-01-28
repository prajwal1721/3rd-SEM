import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.*;
import java.applet.Applet;

/*
 * <applet code="MouseEvents" width=300 height=100></applet>
 * */
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
		int mx,my;
	public void init()
	{
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent  me)
	{
		msg="Mouse Entered";
		repaint();
	}
	        public void mouseEntered(MouseEvent  me)
        {
                msg="Mouse Entered";
                mx=me.getX();
                my=me.getY();
                repaint();
        }
        public void mouseMoved(MouseEvent  me)
        {
                msg="Mouse Moved";
                mx=me.getX();
                my=me.getY();
                repaint();
        }

	public void mouseExited(MouseEvent  me)
	{
                msg="Mouse Exited";
		mx=me.getX();
		my=me.getY();
                repaint();
        }
        public void mousePressed(MouseEvent  me)
        {
                mx=me.getX();
                my=me.getY();
                msg="Mouse Pressed";
                repaint();
        }
        public void mouseReleased(MouseEvent  me)
        {
                msg="Mouse Released";
                repaint();
        }
        public void mouseDragged(MouseEvent  me)
        {
		showStatus("Dragged at"+me.getX()+","+me.getY());
                msg="Mouse Entered";
                repaint();
        }
	public void paint(Graphics g)
	{
		g.drawString(msg,12,13);
	}
}

