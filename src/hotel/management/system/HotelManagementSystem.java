package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem(){
        setBounds(0, 100, 1366, 565);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
        JLabel label1 = new JLabel(image1);
        label1.setBounds(0,0,1366, 565);
        add(label1);

        JLabel label2 = new JLabel("Hotel Management System");
        label2.setBounds(780, 60, 1000, 70);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Sans", Font.PLAIN, 40));

        label1.add(label2);

        JButton button1 = new JButton("Enter");
        button1.setBackground(Color.DARK_GRAY);
        button1.setForeground(Color.WHITE);
        button1.setBorder(null);
        button1.setFont(new Font("Sans", Font.PLAIN, 20));
        button1.setBounds(930, 450, 150, 40);
        button1.addActionListener(this);
        label1.add(button1);

        setLayout(null);
        setVisible(true);

        while(true){
            label2.setVisible(false);
            try{
                Thread.sleep(500);
            }catch (Exception e){}
            label2.setVisible(true);
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }


    }

    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args){
        new HotelManagementSystem();
    }

}
