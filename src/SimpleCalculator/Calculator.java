package SimpleCalculator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{

    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox<String> cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;

    public Calculator(){
        setTitle("Simple Calculator");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);

        cbOperations.addItem("+");
        cbOperations.addItem("-");
        cbOperations.addItem("*");
        cbOperations.addItem("/");

        btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(tfNumber1.getText());
                double number2 = Double.parseDouble(tfNumber2.getText());
                String operation = (String) cbOperations.getSelectedItem();
                double result = 0;

                switch (operation) {
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                    case "/":
                        result = number1 / number2;
                        break;
                }

                lblResult.setText("" + result);
        }
    });
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        Calculator frame;
        frame = new Calculator();
        frame.setVisible(true);
    });
}
}
