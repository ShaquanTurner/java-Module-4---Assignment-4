package com.company;
import javax.swing.JFrame;
//Shaquan Turner 1817001436 //Chevon McIntosh 2017001610 //Jahvaughn Binns 2017001833

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Currencyconvertor extends JFrame {
    //JPanel panel;
    //public Container currencyconvertorView;

    private JTextField txtinput;
    private JComboBox cmbcurrencytype;
    private JTextField txtjmdamount;
    private JButton convertBtn;
    private JButton clearBtn;
    private JLabel lblinput;
    private JLabel lblcurrencyType;
    private JLabel lbljmdamount;
    JPanel currencyconvertorView;
    public  Currencyconvertor() {



        convertBtn.addActionListener(new ConvertBtnClicked());
        clearBtn.addActionListener(new ClearBtnClicked());



    }
    private class ConvertBtnClicked implements ActionListener {


       @Override
        public void actionPerformed(ActionEvent e) {
            double value;
           // JComboBox cmbcurrencytype = (JComboBox)e.getSource();
           if (cmbcurrencytype.getSelectedItem()=="CAN") {
                value = Double.parseDouble(txtinput.getText());

               double canvalue = (value * 97.50);
               String str1 = String.valueOf(canvalue);
               txtjmdamount.setText(str1);
           }

                 else if (cmbcurrencytype.getSelectedItem()=="US"){
                      value = Double.parseDouble(txtinput.getText());
                     double usvalue = (value* 129.02);
                     String str2 = String.valueOf(usvalue);
                     txtjmdamount.setText(str2);


                 }

                 else if (cmbcurrencytype.getSelectedItem()=="Euro") {
               value = Double.parseDouble(txtinput.getText());
               double eurovalue = (value* 164.33);
               String str3 = String.valueOf(eurovalue);
               txtjmdamount.setText(str3);
           }
       }




        }
    private class ClearBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            txtinput.setText("");
            txtjmdamount.setText("");

        }
    }

    }


