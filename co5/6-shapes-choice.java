import java.awt.*;
import java.awt.event.*;

class shapesDemo extends Frame implements ItemListener {
    private final Choice shapeChoice;

    public shapesDemo() {
        setTitle("Shape Drawing Program");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setResizable(false);

        shapeChoice = new Choice();
        shapeChoice.add("Rectangle");
        shapeChoice.add("Triangle");
        shapeChoice.add("Square");
        shapeChoice.add("Circle");
        shapeChoice.addItemListener(this);
        add(shapeChoice);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == shapeChoice) {
            String selectedShape = shapeChoice.getSelectedItem();
            switch (selectedShape) {
                case "Rectangle" -> drawRectangle();
                case "Triangle" -> drawTriangle();
                case "Square" -> drawSquare();
                case "Circle" -> drawCircle();
            }
        }
    }

    private void drawRectangle() {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 200, 150);
    }

    private void drawTriangle() {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        int[] xPoints = {200, 100, 300};
        int[] yPoints = {100, 250, 250};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    private void drawSquare() {
        Graphics g = getGraphics();
        g.setColor(Color.GREEN);
        g.fillRect(100, 100, 150, 150);
    }

    private void drawCircle() {
        Graphics g = getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(150, 150, 200, 200);
    }

    public static void main(String[] args) {
        new shapesDemo();
    }
}