import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*<applet code="Button1" height=200 width=200></applet>*/
public class Button1 extends Applet implements ActionListener
{
	String msg="";
	public void init()
	{
		Button b1=new Button("Ok");
		Button b2=new Button("Cancel");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,12,50);
	}
	public void actionPerformed(ActionEvent e)
	{
		String action=e.getActionCommand();
		if(action.equals("Ok"))
				msg="Ok";
		else if(action.equals("Cancel"))
				msg="Cancel";
		repaint();
	}
}
