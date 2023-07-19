import java.awt.*;
import java.awt.event.*;

class KeyEventDemo extends Dialog implements KeyListener {
    public KeyEventDemo(Frame owner) {
        super(owner, false);
        setTitle("Key Event Handling Program");
        setSize(1, 1);
        setLayout(null);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key pressed: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key released: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("Key typed: " + keyChar);
    }

    public void startListening() {
        setVisible(true);
    }

    public static void main(String[] args) {
        Frame owner = new Frame();
        owner.setVisible(true);
        KeyEventDemo demo = new KeyEventDemo(owner);
        demo.startListening();
    }
}
