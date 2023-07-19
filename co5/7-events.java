import java.awt.*;
import java.awt.event.*;

class eventsDemo extends Frame implements MouseListener, MouseMotionListener, WindowListener {
    public eventsDemo() {
        setTitle("Event Handling Program");
        setSize(400, 400);
        setLayout(null);

        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        new eventsDemo();
    }
}