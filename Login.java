package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JTextField jtf_usename;
    JPasswordField passwordField;
    JButton btn_login, btn_cancel;

    public Login() {
        super("Login!");
        JLabel label1 = new JLabel("Username");
        label1.setBounds(40, 20, 100, 30);
        label1.setFont(new Font("Tahoma", Font.BOLD, 16));
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(40, 70, 100, 30);
        label2.setFont(new Font("Tahoma", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        add(label2);

        jtf_usename = new JTextField();
        jtf_usename.setBounds(150, 20, 150, 30);
        jtf_usename.setForeground(Color.WHITE);
        setFont(new Font("Tahoma", Font.PLAIN, 15));
        jtf_usename.setBackground(new Color(26, 104, 110));
        add(jtf_usename);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 150, 30);
        passwordField.setForeground(Color.WHITE);
        passwordField.setBackground(new Color(26, 104, 110));
        add(passwordField);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(255, 300, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(318, -30, 255, 300);
        add(label);

        btn_login = new JButton("Login");
        btn_login.setBounds(40, 140, 120, 30);
        btn_login.setFont(new Font("serif", Font.BOLD, 15));
        btn_login.setBackground(Color.BLACK);
        btn_login.setForeground(Color.white);
        btn_login.addActionListener(this);
        add(btn_login);

        btn_cancel = new JButton("Cancel");
        btn_cancel.setBounds(180, 140, 120, 30);
        btn_cancel.setFont(new Font("serif", Font.BOLD, 15));
        btn_cancel.setBackground(Color.BLACK);
        btn_cancel.setForeground(Color.white);
        btn_cancel.addActionListener(this);
        add(btn_cancel);

        getContentPane().setBackground(new Color(3, 45, 48));
        setLayout(null);
        setLocation(400, 270);
        setSize(600, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_login) {
            try {
                ConnectionDB connectionDB = new ConnectionDB();
                String user = jtf_usename.getText();
                String pass = passwordField.getText();

                String sql = "Select * from login where username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = connectionDB.statement.executeQuery(sql);

                if (resultSet.next()) {
                    new Dashboard();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            }catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
