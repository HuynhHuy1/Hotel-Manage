package org.example;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {
    public ConnectionDB connectionDB;
    public JButton back;
    public JTable table;

    public CustomerInfo() {
        initializeUI();
        loadDataFromDatabase();
    }

    private void initializeUI() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        table = new JTable();
        table.setBounds(10, 40, 900, 450);
        table.setBackground(new Color(3, 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        JLabel id = new JLabel("ID");
        id.setBounds(31, 11, 100, 14);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(id);

        JLabel number = new JLabel("Number");
        number.setBounds(150, 11, 100, 14);
        number.setForeground(Color.WHITE);
        number.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(number);

        JLabel name = new JLabel("Name");
        name.setBounds(270, 11, 100, 14);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(360, 11, 100, 14);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(480, 11, 100, 25);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(country);

        JLabel room = new JLabel("Room");
        room.setBounds(600, 11, 100, 14);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(room);

        JLabel Time = new JLabel("CI Time");
        Time.setBounds(680, 11, 100, 14);
        Time.setForeground(Color.WHITE);
        Time.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Time);

        JLabel Deposit = new JLabel("Deposit");
        Deposit.setBounds(800, 11, 100, 25);
        Deposit.setForeground(Color.WHITE);
        Deposit.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Deposit);

        back = new JButton("Back");
        back.setBounds(450, 510, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
    }

    private void loadDataFromDatabase() {
        try {
            ResultSet resultSet = connectionDB.statement.executeQuery("select * from Customer");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setConnectionDB(ConnectionDB connectionDB) {
        this.connectionDB = connectionDB;
    }

    public JButton getBackButton() {
        return back;
    }

    public JTable getTable() {
        return table;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomerInfo customerInfo = new CustomerInfo();
            ConnectionDB connectionDB = new ConnectionDB();
            customerInfo.setConnectionDB(connectionDB);
            customerInfo.setVisible(true);
        });
    }
}
