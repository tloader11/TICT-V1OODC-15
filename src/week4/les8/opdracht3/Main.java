package week4.les8.opdracht3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 730, 489);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(128, 28, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(65, 31, 46, 14);
        frame.getContentPane().add(lblName);

        JLabel lblPhone = new JLabel("adres");
        lblPhone.setBounds(65, 68, 46, 14);
        frame.getContentPane().add(lblPhone);

        textField_1 = new JTextField();
        textField_1.setBounds(128, 65, 86, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblEmailId = new JLabel("aankomst");
        lblEmailId.setBounds(65, 115, 46, 14);
        frame.getContentPane().add(lblEmailId);

        textField_2 = new JTextField();
        textField_2.setBounds(128, 112, 247, 17);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);


        JLabel lblVertrek = new JLabel("vertrek");
        lblVertrek.setBounds(65, 155, 46, 14);
        frame.getContentPane().add(lblVertrek);

        textField_3 = new JTextField();
        textField_3.setBounds(128, 152, 247, 17);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);



        JButton btnSubmit = new JButton("submit");

        btnSubmit.setBackground(Color.BLUE);
        btnSubmit.setForeground(Color.MAGENTA);
        btnSubmit.setBounds(65, 387, 89, 23);
        frame.getContentPane().add(btnSubmit);


        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty()))
                    JOptionPane.showMessageDialog(null, "Data Missing");
                else
                    JOptionPane.showMessageDialog(null, "Data Submitted");
            }
        });
    }
}
