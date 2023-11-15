package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    public Reception() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 5, 1238, 820);
        panel.setBackground(new Color(3, 45, 48));
        add(panel);
        ImageIcon imageRec = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i22 = imageRec.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(300, 20, 800, 800);
        panel.add(label11);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 820);
        panel1.setBackground(new Color(3, 45, 48));
        add(panel1);
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(5, 530, 250, 250);
        panel1.add(label);

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30, 30, 200, 30);
        btnNCF.setBackground(Color.black);
        btnNCF.setForeground(Color.white);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new NewCustomer();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30, 70, 200, 30);
        btnRoom.setBackground(Color.black);
        btnRoom.setForeground(Color.white);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Room();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30, 110, 200, 30);
        btnDepartment.setBackground(Color.black);
        btnDepartment.setForeground(Color.white);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30, 150, 200, 30);
        btnAEI.setBackground(Color.black);
        btnAEI.setForeground(Color.white);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30, 190, 200, 30);
        btnCI.setBackground(Color.black);
        btnCI.setForeground(Color.white);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CustomerInfo();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30, 230, 200, 30);
        btnMI.setBackground(Color.black);
        btnMI.setForeground(Color.white);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ManagerInfo();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnCO = new JButton("Check out");
        btnCO.setBounds(30, 270, 200, 30);
        btnCO.setBackground(Color.black);
        btnCO.setForeground(Color.white);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CheckOut();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnUC = new JButton("Update Check-In Details");
        btnUC.setBounds(30, 310, 200, 30);
        btnUC.setBackground(Color.black);
        btnUC.setForeground(Color.white);
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30, 350, 200, 30);
        btnURS.setBackground(Color.black);
        btnURS.setForeground(Color.white);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateRoom();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnPUS = new JButton("Pick Up Service");
        btnPUS.setBounds(30, 390, 200, 30);
        btnPUS.setBackground(Color.black);
        btnPUS.setForeground(Color.white);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new PickUp();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30, 430, 200, 30);
        btnSR.setBackground(Color.black);
        btnSR.setForeground(Color.white);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SearchRoom();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
