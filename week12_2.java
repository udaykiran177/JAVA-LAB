import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class week12_2 extends Applet implements KeyListener{
    public void init(){
        Label l=new Label("enter");
        add(l);
        TextField tf=new TextField(120 );
        tf.addKeyListener(this);
        add(tf);
    }
    public void keyPressed(KeyEvent e){
        showStatus("key is being pressed");
    }
    public void keyReleased(KeyEvent e){
        showStatus("key was released");
    }
    public void keyTyped(KeyEvent e){
        showStatus(e.getKeyChar()+" is typed");
    }
}

/*
<applet code="week12_2.class" width="480" height="480">
</applet>
*/