package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JButton addEmployee, addRoom, addDrivers, logout, back;

    public Admin() {
        addEmployee = new JButton("ADD EMPLOYEE");
        addEmployee.setBounds(250, 230, 200, 30);
        addEmployee.setBackground(Color.white);
        addEmployee.setForeground(Color.black);
        addEmployee.setFont(new Font("Tahoma", Font.BOLD, 15));
        addEmployee.addActionListener(this);
        add(addEmployee);
        ImageIcon imageEmployee = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image image = imageEmployee.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon =new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70, 180, 120, 120);
        add(label);

        addRoom = new JButton("ADD ROOM");
        addRoom.setBounds(250, 380, 200, 30);
        addRoom.setBackground(Color.white);
        addRoom.setForeground(Color.black);
        addRoom.setFont(new Font("Tahoma", Font.BOLD, 15));
        addRoom.addActionListener(this);
        add(addRoom);
        ImageIcon imageRoom = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image1 = imageRoom.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 =new ImageIcon(image1);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(70, 340, 120, 120);
        add(label1);

        addDrivers = new JButton("ADD DRIVERS");
        addDrivers.setBounds(250, 530, 200, 30);
        addDrivers.setBackground(Color.white);
        addDrivers.setForeground(Color.black);
        addDrivers.setFont(new Font("Tahoma", Font.BOLD, 15));
        addDrivers.addActionListener(this);
        add(addDrivers);
        ImageIcon imageDriver = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image2 = imageDriver.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 =new ImageIcon(image2);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(70, 500, 120, 120);
        add(label2);

        logout = new JButton("Logout");
        logout.setBounds(10, 750, 95, 30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton("Back");
        back.setBounds(110, 750, 95, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);


        ImageIcon imageLogin = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image image3 = imageLogin.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 =new ImageIcon(image3);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(1000, 250, 400, 400);
        add(label3);

        getContentPane().setBackground(new Color(3, 45, 48));
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addEmployee) {
            new AddEmployee();
        } else if (e.getSource() == addRoom) {
            new AddRoom();
        } else if (e.getSource() == addDrivers) {
            new AddDriver();
        } else if (e.getSource() == logout) {
            System.exit(0);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Admin();
    }
}
