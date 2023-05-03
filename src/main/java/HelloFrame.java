import javax.swing.*;
import java.awt.*;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        // window's title
        super("Hello App");
        // set default close operation --> result when close button clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set size of window in pixels
        setSize(300,300);
        // default position of window to CENTER
        setLocationRelativeTo(null);

        initComponents();

        // default position of components to CENTER
        setLayout(null);
        // visibility of windows
        setVisible(true);
    }

    private void initComponents() {
        // label next to text field
        JLabel nameLabel = new JLabel("Your Name");
        nameLabel.setBounds(40,20, 100,30);
        add(nameLabel);

        // create text field
        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(140,20, 120,30);
        add(nameTextField);

        // create small GREEN container beneath text field
        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40,150,220,70);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBackground(Color.GREEN);
        add(greenPanel);

        // create button
        JButton acceptButton = new JButton("Enter");
        acceptButton.setBounds(100,70,80,20);
        add(acceptButton);

        // create a label inside the GREEN container
        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setBounds(50,20, 100,30);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        // customize font style and size of label
        Font font = new Font("Courier", Font.ITALIC,12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(16f));

        greenPanel.add(helloLabel);

        // create actions after clicking button
        acceptButton.addActionListener(e -> {
            String helloText = "Hello";
            String name = nameTextField.getText().toUpperCase();
            if (name.trim().length() > 0) {
                helloText += String.format(", %s", name);
            }
            helloLabel.setText(helloText);
        });

    }

}