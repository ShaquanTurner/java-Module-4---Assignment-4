package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.*;
//Shaquan Turner 1817001436 //Chevon McIntosh 2017001610 //Jahvaughn Binns 2017001833
public class Main {

    public static void main(String[] args) {



           JFrame frame = new JFrame("Currencyconvertor");
        frame.setContentPane(new Currencyconvertor().currencyconvertorView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);






    }
}
