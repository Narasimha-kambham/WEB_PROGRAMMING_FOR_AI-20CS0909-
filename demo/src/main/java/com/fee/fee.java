package com.fee;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class fee extends JFrame {
    // Declare labels, text fields, etc.
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
    JTextArea area1, area2;
    JRadioButton rb1, rb2, rb3, rb4, rb5, rb6;
    JComboBox<String> cb, cb1, cb2;
    ButtonGroup bg, bg1, bg2;

    fee() {
        // Labels and fields
        l1 = new JLabel("Fee Report");
        l1.setBounds(550, 100, 250, 20);
        l2 = new JLabel("Name of the Student:");
        l2.setBounds(50, 150, 250, 20);
        tf1 = new JTextField();
        tf1.setBounds(250, 150, 250, 20);
        l3 = new JLabel("Name of the Father:");
        l3.setBounds(50, 200, 250, 20);
        tf2 = new JTextField();
        tf2.setBounds(250, 200, 250, 20);
        l4 = new JLabel("Roll Number:");
        l4.setBounds(50, 250, 250, 20);
        tf3 = new JTextField();
        tf3.setBounds(250, 250, 250, 20);
        l5 = new JLabel("Email ID:");
        l5.setBounds(50, 300, 250, 20);
        tf4 = new JTextField();
        tf4.setBounds(250, 300, 250, 20);
        l6 = new JLabel("Contact Number:");
        l6.setBounds(50, 350, 250, 20);
        tf5 = new JTextField();
        tf5.setBounds(250, 350, 250, 20);
        l7 = new JLabel("Address:");
        l7.setBounds(50, 400, 250, 20);
        area1 = new JTextArea();
        area1.setBounds(250, 400, 250, 90);

        // Gender
        l9 = new JLabel("Gender:");
        l9.setBounds(50, 500, 250, 20);
        rb5 = new JRadioButton(" Male");
        rb6 = new JRadioButton(" Female");
        rb5.setBounds(250, 500, 100, 30);
        rb6.setBounds(350, 500, 100, 30);
        bg = new ButtonGroup();
        bg.add(rb5);
        bg.add(rb6);

        // Nationality & Years
        l10 = new JLabel("Nationality:");
        l10.setBounds(50, 550, 250, 20);
        tf6 = new JTextField();
        tf6.setBounds(250, 550, 250, 20);

        l11 = new JLabel("Year of passing 10th");
        l11.setBounds(50, 600, 250, 20);
        String[] years10 = {"2020", "2021", "2022"};
        cb1 = new JComboBox<>(years10);
        cb1.setBounds(250, 600, 90, 20);

        l12 = new JLabel("Year of passing 12th");
        l12.setBounds(50, 650, 250, 20);
        String[] years12 = {"2022", "2023", "2024"};
        cb2 = new JComboBox<>(years12);
        cb2.setBounds(250, 650, 90, 20);

        l13 = new JLabel("Points Secured in 10th:");
        l13.setBounds(50, 700, 250, 20);
        tf7 = new JTextField();
        tf7.setBounds(250, 700, 250, 20);

        l14 = new JLabel("Percentage in 12th:");
        l14.setBounds(50, 750, 250, 20);
        tf8 = new JTextField();
        tf8.setBounds(250, 750, 250, 20);

        // Group and Hostel
        l8 = new JLabel("Groups Offered here are:");
        l8.setBounds(800, 150, 250, 20);
        rb1 = new JRadioButton("SEAS");
        rb1.setBounds(550, 150, 100, 30);
        rb2 = new JRadioButton("SLABS");
        rb2.setBounds(650, 150, 100, 30);
        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);

        rb3 = new JRadioButton("HOSTELLER");
        rb3.setBounds(550, 200, 100, 30);
        rb4 = new JRadioButton("DAY SCHOLAR");
        rb4.setBounds(650, 200, 120, 30);
        bg2 = new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);

        String[] courses = {"CSE", "ECE", "EEE", "CIVIL", "MECH"};
        cb = new JComboBox<>(courses);
        cb.setBounds(800, 200, 90, 20);

        JButton b = new JButton("Show");
        b.setBounds(1000, 300, 80, 30);

        DefaultListModel<String> li1 = new DefaultListModel<>();
        li1.addElement("CSE(2, 50, 000)");
        li1.addElement("ECE(2, 50, 000)");
        li1.addElement("EEE(2, 50, 000)");
        li1.addElement("MECH(2, 50, 000)");
        li1.addElement("CIVIL(2, 50, 000)");
        JList<String> list1 = new JList<>(li1);
        list1.setBounds(600, 300, 125, 125);

        DefaultListModel<String> li2 = new DefaultListModel<>();
        li2.addElement("2 SHARE(1, 50, 000)");
        li2.addElement("3 SHARE(1, 40, 000)");
        li2.addElement("5 SHARE(1, 20, 000)");
        li2.addElement("8 SHARE(1, 10, 000)");
        li2.addElement("bus(40, 000)");
        JList<String> list2 = new JList<>(li2);
        list2.setBounds(800, 300, 125, 125);

        JButton Receipt = new JButton("Generate Receipt");
        Receipt.setBounds(600, 490, 150, 30);
        JButton b2 = new JButton("Reset");
        b2.setBounds(750, 490, 150, 30);
        JButton Print = new JButton("Print");
        Print.setBounds(900, 490, 150, 30);

        area2 = new JTextArea();
        area2.setBounds(600, 540, 450, 240);

        // Add all components
        add(l1); add(l2); add(l3); add(l4); add(l5); add(l6); add(l7); add(l8);
        add(l9); add(l10); add(l11); add(l12); add(l13); add(l14);
        add(tf1); add(tf2); add(tf3); add(tf4); add(tf5); add(tf6);
        add(tf7); add(tf8); add(area1); add(area2);
        add(rb1); add(rb2); add(rb3); add(rb4); add(rb5); add(rb6);
        add(cb); add(cb1); add(cb2); add(list1); add(list2);
        add(b); add(Receipt); add(b2); add(Print);

        setLayout(null);
        setSize(1100, 850);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Reset button
        b2.addActionListener(e -> {
            tf1.setText(""); tf2.setText(""); tf3.setText(""); tf4.setText("");
            tf5.setText(""); tf6.setText(""); tf7.setText(""); tf8.setText("");
            area1.setText(""); area2.setText("");
            bg.clearSelection(); bg1.clearSelection(); bg2.clearSelection();
            cb.setSelectedIndex(0); cb1.setSelectedIndex(0); cb2.setSelectedIndex(0);
            list1.clearSelection(); list2.clearSelection();
        });

        // Receipt button
        Receipt.addActionListener(e -> {
            try (FileWriter writer = new FileWriter("fee_receipt.txt")) {
                writer.write("Fee Receipt\n");
                writer.write("Name: " + tf1.getText() + "\n");
                writer.write("Father's Name: " + tf2.getText() + "\n");
                writer.write("Roll No: " + tf3.getText() + "\n");
                writer.write("Email: " + tf4.getText() + "\n");
                writer.write("Contact: " + tf5.getText() + "\n");
                writer.write("Address: " + area1.getText() + "\n");
                writer.write("Gender: " + (rb5.isSelected() ? "Male" : rb6.isSelected() ? "Female" : "Not Selected") + "\n");
                writer.write("Nationality: " + tf6.getText() + "\n");
                writer.write("10th Passing Year: " + cb1.getSelectedItem() + "\n");
                writer.write("12th Passing Year: " + cb2.getSelectedItem() + "\n");
                writer.write("Points in 10th: " + tf7.getText() + "\n");
                writer.write("Percentage in 12th: " + tf8.getText() + "\n");
                writer.write("Group: " + (rb1.isSelected() ? "SEAS" : rb2.isSelected() ? "SLABS" : "Not Selected") + "\n");
                writer.write("Hostel Status: " + (rb3.isSelected() ? "Hosteller" : rb4.isSelected() ? "Day Scholar" : "Not Selected") + "\n");
                writer.write("Course: " + cb.getSelectedItem() + "\n");
                area2.setText("Receipt generated and saved to fee_receipt.txt");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        new fee();
    }
}
