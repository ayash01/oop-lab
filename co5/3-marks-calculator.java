import java.awt.*;
import java.awt.event.*;

class MarksCalculator extends Frame {
    private final TextField[] marksText;
    private final Label result;

    public MarksCalculator() {
        setTitle("Calculate marks");
        setSize(300, 200);
        setLayout(new FlowLayout());

        marksText = new TextField[5];
        for (int i = 0; i < 5; i++) {
            Label lblSubject = new Label("Subject " + (i + 1) + ":");
            marksText[i] = new TextField(10);
            add(lblSubject);
            add(marksText[i]);
        }

        Button calcBtn = new Button("Calculate");
        calcBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                for (int i = 0; i < 5; i++) {
                    int marks = Integer.parseInt(marksText[i].getText());
                    total += marks;
                }

                double percentage = (total / 500.0) * 100;

                if (percentage > 50) {
                    result.setText("\uD83D\uDE00");
                } else {
                    result.setText("\uD83D\uDE41");
                }
            }
        });

        result = new Label();

        add(calcBtn);
        add(result);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MarksCalculator();
    }
}
