package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {
    public ConnectionDB connectionDB;
    public JButton checkOut;
    public JButton check;
    public JButton back;
    public Choice customerChoice;
    public JLabel roomNumberLabel;
    public JLabel checkInTimeLabel;

    public CheckOut() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 790, 390);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Check-Out");
        label.setBounds(100, 20, 100, 30);
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel userIdLabel = new JLabel("Customer Id");
        userIdLabel.setBounds(30, 80, 150, 30);
        userIdLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        userIdLabel.setForeground(Color.WHITE);
        panel.add(userIdLabel);

        customerChoice = new Choice();
        customerChoice.setBounds(200, 80, 150, 25);
        panel.add(customerChoice);

        JLabel roomNumLabel = new JLabel("Room Number");
        roomNumLabel.setBounds(30, 130, 150, 30);
        roomNumLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        roomNumLabel.setForeground(Color.WHITE);
        panel.add(roomNumLabel);

        roomNumberLabel = new JLabel();
        roomNumberLabel.setBounds(200, 130, 150, 30);
        roomNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        roomNumberLabel.setForeground(Color.WHITE);
        panel.add(roomNumberLabel);

        JLabel checkInTimeLabel = new JLabel("Check-In Time");
        checkInTimeLabel.setBounds(30, 180, 150, 30);
        checkInTimeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        checkInTimeLabel.setForeground(Color.WHITE);
        panel.add(checkInTimeLabel);

        this.checkInTimeLabel = new JLabel();
        this.checkInTimeLabel.setBounds(200, 180, 200, 30);
        this.checkInTimeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.checkInTimeLabel.setForeground(Color.WHITE);
        panel.add(this.checkInTimeLabel);

        // ... (các phần khác của code)

        checkOut = new JButton("Check-Out");
        checkOut.setBounds(30, 300, 120, 30);
        checkOut.setForeground(Color.WHITE);
        checkOut.setBackground(Color.BLACK);
        panel.add(checkOut);

        check = new JButton("Check");
        check.setBounds(300, 300, 120, 30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        panel.add(check);

        back = new JButton("Back");
        back.setBounds(170, 300, 120, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);

        // ... (thêm các phần khác của code)

        setUndecorated(true);
        setLayout(null);
        setSize(800, 400);
        setLocation(500, 210);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckOut();
    }

    public void performCheckOut() {
        try {
            ConnectionDB cv = new ConnectionDB();
            cv.statement.executeUpdate("delete from customer where number = '" + customerChoice.getSelectedItem() + "'");
            cv.statement.executeUpdate("update room set availability = 'Available', cleaning_status = 'Cleaned' where roomnumber = '" + roomNumberLabel.getText() + "'");
            JOptionPane.showMessageDialog(null, "Done");
            setVisible(false);
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public void performCheck() {
        ConnectionDB c = new ConnectionDB();
        try {
            ResultSet resultSet = c.statement.executeQuery("select * from customer where number = '" + customerChoice.getSelectedItem() + "'");
            while (resultSet.next()) {
                roomNumberLabel.setText(resultSet.getString("room"));
                checkInTimeLabel.setText(resultSet.getString("checkintime"));
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
