package Tests;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SignalListenerExample extends JFrame implements ActionListener {

    private JButton button;

    public SignalListenerExample() {
        super("Signal Listener Example");

        JPanel panel = new JPanel();

        button = new JButton("Click me!");
        button.addActionListener(this);

        panel.add(button);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button clicked!");
        }
    }

    public static void main(String[] args) {
        new SignalListenerExample();
    }
}

