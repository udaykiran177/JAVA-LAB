import java.awt.event.*;
import java.awt.*;
import java.applet.*;

class week_me extends Applet implements KeyListener{

	public void init(){

		Label l=new Label("enter a character:");
		add(l);
		TextField t=new TextField(120);
	        t.addKeyListener(this);
		add(t);
	}
	
	public void keyPressed(KeyEvent e){
		showStatus("pressed");
	}
	public void keyReleased(KeyEvent e){
		showStatus("Released");
	}
	public void keyTyped(KeyEvent e){

		showStatus(e.getKeyChar()+" ");
	}
}


/*
<applet code="week_me.class" width="480" height="480">
</applet>
*/