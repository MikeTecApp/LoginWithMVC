package com.Arjang.View;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class View {
    private JFrame frame;
    private JTextField textUserName;
    private JPasswordField textPassword;
    private JButton btnContinue;

    // Generate Getter and Setter

    public JButton getBtnContinue() {
        return btnContinue;
    }

    public void setBtnContinue(JButton btnContinue) {
        this.btnContinue = btnContinue;
    }

    public JTextField getTextUserName() {
        return textUserName;
    }

    public void setTextUserName(JTextField textUserName) {
        this.textUserName = textUserName;
    }

    public JPasswordField getTextPassword() {
        return textPassword;
    }

    public void setTextPassword(JPasswordField textPassword) {
        this.textPassword = textPassword;
    }

    /**
     * Create the application.
     */
    public View() {
        initialize();
        frame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 814, 483);
        frame.setTitle("  Login page ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(0, 0, 366, 446);
        leftPanel.setBackground(new Color(25, 25, 112));
        frame.getContentPane().add(leftPanel);
        leftPanel.setLayout(null);

        JLabel lblWelcome = new JLabel(
                "<html>Welcome to the <FONT COLOR=\"#34b36d\"> ShareCode <FONT COLOR=\"#FFFFFF\"> with everyOne </html>");
        lblWelcome.setForeground(Color.WHITE);
        lblWelcome.setIcon(new ImageIcon("src/com/Images/icons8_login_48px.png"));
        lblWelcome.setFont(new Font("Book Antiqua", Font.BOLD, 24));
        lblWelcome.setBounds(10, 93, 344, 161);
        leftPanel.add(lblWelcome);

        JPanel panelLine = new JPanel();
        panelLine.setBackground(new Color(173, 255, 47));
        panelLine.setBounds(63, 217, 197, 10);
        leftPanel.add(panelLine);

        JLabel lblContinue = new JLabel("<html>Login to continue with your account</html>");
        lblContinue.setFont(new Font("Segoe Script", Font.PLAIN, 16));
        lblContinue.setForeground(new Color(245, 245, 220));
        lblContinue.setBounds(63, 251, 296, 47);
        leftPanel.add(lblContinue);

        textUserName = new JTextField();
        textUserName.setToolTipText("userName");
        textUserName.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textUserName.setBounds(434, 91, 309, 39);
        frame.getContentPane().add(textUserName);
        textUserName.setColumns(10);

        textPassword = new JPasswordField();
        textPassword.setToolTipText("password");
        textPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textPassword.setBounds(434, 179, 309, 39);
        frame.getContentPane().add(textPassword);

        JLabel lblNewLabel = new JLabel("Password");
        lblNewLabel.setIcon(new ImageIcon("src/com/images/icons8_sign_in_form_password_22px.png"));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(434, 150, 116, 31);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("User Name");
        lblNewLabel_1.setIcon(new ImageIcon(("src/com/images/icons8_customer_22px.png")));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(434, 60, 116, 31);
        frame.getContentPane().add(lblNewLabel_1);

        btnContinue = new JButton("continue");

        btnContinue.setIcon(new ImageIcon(("src/com/images/icons8_login_as_user_22px.png")));
        btnContinue.setForeground(new Color(255, 255, 255));
        btnContinue.setBackground(new Color(25, 25, 112));
        btnContinue.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnContinue.setBounds(515, 270, 142, 39);
        frame.getContentPane().add(btnContinue);

        JCheckBox chckbxNewCheckBox = new JCheckBox("save user Name / password for next time.");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
        chckbxNewCheckBox.setBounds(461, 315, 252, 21);
        frame.getContentPane().add(chckbxNewCheckBox);

        JLabel lblNewLabel_2 = new JLabel(
                "<html> Forgot your password <b> <FONT COLOR = \"#2f62b5\"> Click here</b> </html>\r\n<FONT COLOR=\"#34b36d\"> ");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblNewLabel_2.setBounds(434, 415, 308, 31);
        frame.getContentPane().add(lblNewLabel_2);
    }

}
