package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JLabel label1, label2;
    JTextField field1;
    JPasswordField field2;
    JButton button1, button2;

    Login(){
        label1 = new JLabel("Username");
        label1.setBounds(40, 20, 100, 30);
        add(label1);

        label1 = new JLabel("Password");
        label1.setBounds(40, 60, 100, 30);
        add(label1);

        field1 = new JTextField();
        field1.setBounds(130, 20, 200, 25);
        add(field1);

        field1 = new JPasswordField();
        field1.setBounds(130, 60, 200, 25);
        add(field1);

        button1 = new JButton("Login");
        button1.setBackground(Color.DARK_GRAY);
        button1.setForeground(Color.WHITE);
        button1.setBounds(40, 100, 130, 30);
        add(button1);

        button2 = new JButton("Cancel");
        button2.setBackground(Color.DARK_GRAY);
        button2.setForeground(Color.WHITE);
        button2.setBounds(200, 100, 130, 30);
        add(button2);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/second.jpg"));
        Image image2 = image.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel label3 = new JLabel(image3);
        label3.setBounds(350, 20, 100, 110);
        add(label3);


        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(450, 250, 510, 200);
        setVisible(true);
    }

     public static void main(String[] args){
        new Login();
     }
}
