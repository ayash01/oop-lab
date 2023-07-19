import java.awt.*;
import java.awt.event.*;

class maxThreeNum extends Frame {
    private final TextField num1text, num2text, num3text;
    private final Label result;

    public maxThreeNum() {
        setTitle("Find maximum number");
        setSize(600, 300);
        setLayout(new FlowLayout());

        Label num1Label = new Label("Number 1:");
        num1text = new TextField(10);

        Label num2Label = new Label("Number 2:");
        num2text = new TextField(10);

        Label num3Label = new Label("Number 3:");
        num3text = new TextField(10);

        Button findMaxBtn = new Button("Find maximum");
        findMaxBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1text.getText());
                int num2 = Integer.parseInt(num2text.getText());
                int num3 = Integer.parseInt(num3text.getText());

                int max = Math.max(Math.max(num1, num2), num3);
                result.setText("Maximum number: " + max);
            }
        });

        result = new Label();

        add(num1Label);
        add(num1text);
        add(num2Label);
        add(num2text);
        add(num3Label);
        add(num3text);
        add(findMaxBtn);
        add(result);

        setVisible(true);
    }

    public static void main(String[] args) {
        new maxThreeNum();
    }
}