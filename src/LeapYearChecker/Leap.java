package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leap extends JFrame {
    private JTextField yearTextField;
    private JPanel mainPanel;
    private JButton checkYearButton;

    public Leap() {
        setContentPane(mainPanel);
        setTitle("Leap Year Checker");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        //mainPanel = new JPanel();
        mainPanel.setLayout(null); // Set to your layout preference
        //yearTextField = new JTextField();
        yearTextField.setBounds(50, 30, 200, 30);
        yearTextField.setName("yearTextField");
        add(yearTextField);

        checkYearButton.setBounds(50, 80, 200, 30);
        checkYearButton.setName("checkYearButton");
        add(checkYearButton);
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = yearTextField.getText();
                int year = Integer.parseInt(input);
                String message = isLeapYear(year) ? "Leap year" : "Not a leap year";
                JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Leap frame = new Leap();
            frame.setVisible(true); // Make the JFrame visible
        });
    }
}
