package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {
    public JTextField jtf_room_number;
    public ConnectionDB connectionDB;
    JTextField jtf_price;
    public JComboBox jcb_availability;
    JComboBox jcb_clean;
    JComboBox jcb_type;

    public JButton btn_add;
    public JButton btn_back;

    public AddRoom() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel label1 = new JLabel("Add Room");
        label1.setBounds(194, 10, 160, 22);
        label1.setFont(new Font("Tahoma", Font.BOLD, 22));
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2 = new JLabel("Room Number");
        label2.setBounds(64, 70, 152, 22);
        label2.setFont(new Font("Tahoma", Font.BOLD, 14));
        label2.setForeground(Color.white);
        panel.add(label2);
        jtf_room_number = new JTextField();
        jtf_room_number.setBounds(200, 70, 156, 20);
        jtf_room_number.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jtf_room_number.setForeground(Color.white);
        jtf_room_number.setBackground(new Color(16, 108, 115));
        panel.add(jtf_room_number);

        JLabel label3 = new JLabel("Availability");
        label3.setBounds(64, 110, 152, 22);
        label3.setFont(new Font("Tahoma", Font.BOLD, 14));
        label3.setForeground(Color.white);
        panel.add(label3);
        jcb_availability = new JComboBox(new String[]{"Available", "Occupied"});
        jcb_availability.setBounds(200, 110, 156, 20);
        jcb_availability.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jcb_availability.setForeground(Color.white);
        jcb_availability.setBackground(new Color(16, 108, 115));
        panel.add(jcb_availability);

        JLabel label4 = new JLabel("Price");
        label4.setBounds(64, 150, 152, 22);
        label4.setFont(new Font("Tahoma", Font.BOLD, 14));
        label4.setForeground(Color.white);
        panel.add(label4);
        jtf_price = new JTextField();
        jtf_price.setBounds(200, 150, 156, 20);
        jtf_price.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jtf_price.setForeground(Color.white);
        jtf_price.setBackground(new Color(16, 108, 115));
        panel.add(jtf_price);

        JLabel label5 = new JLabel("Cleaning Status");
        label5.setBounds(64, 190, 152, 22);
        label5.setFont(new Font("Tahoma", Font.BOLD, 14));
        label5.setForeground(Color.white);
        panel.add(label5);
        jcb_clean = new JComboBox(new String[]{"Cleaned", "Dirty"});
        jcb_clean.setBounds(200, 190, 156, 20);
        jcb_clean.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jcb_clean.setForeground(Color.white);
        jcb_clean.setBackground(new Color(16, 108, 115));
        panel.add(jcb_clean);

        JLabel label6 = new JLabel("Bed Type");
        label6.setBounds(64, 230, 152, 22);
        label6.setFont(new Font("Tahoma", Font.BOLD, 14));
        label6.setForeground(Color.white);
        panel.add(label6);
        jcb_type = new JComboBox(new String[]{"Single Bed", "Double Bed"});
        jcb_type.setBounds(200, 230, 156, 20);
        jcb_type.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jcb_type.setForeground(Color.white);
        jcb_type.setBackground(new Color(16, 108, 115));
        panel.add(jcb_type);

        btn_add = new JButton("Add");
        btn_add.setBounds(64, 321, 111, 33);
        btn_add.setBackground(Color.black);
        btn_add.setForeground(Color.white);
        btn_add.addActionListener(this);
        panel.add(btn_add);

        btn_back = new JButton("Back");
        btn_back.setBounds(198, 321, 111, 33);
        btn_back.setBackground(Color.black);
        btn_back.setForeground(Color.white);
        btn_back.addActionListener(this);
        panel.add(btn_back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);

        setUndecorated(true);
        setLocation(20, 200);
        setLayout(null);
        setSize(885, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btn_add) {
            try {
                ConnectionDB connectionDB = new ConnectionDB();
                String room = jtf_room_number.getText();
                String ava = (String) jcb_availability.getSelectedItem();
                String status = (String) jcb_clean.getSelectedItem();
                String price = jtf_price.getText();
                String type = (String) jcb_type.getSelectedItem();

                String sql = "insert into room values ('"+room+"', '"+ava+"', '"+status+"', '"+price+"', '"+type+"')";
                connectionDB.statement.executeUpdate(sql);

                JOptionPane.showMessageDialog(this, "Room Successfully Added");
                setVisible(false);

            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddRoom();
    }
}
