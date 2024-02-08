package GUI.FramesWithPanels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon appleicon =new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-apple-logo-64.png");
        ImageIcon valoicon=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-valorant-48.png");
        ImageIcon steamicon=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-steam-circled-48.png");

        JLabel label=new JLabel();
        label.setText("Apple Store");
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIcon(appleicon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JLabel label2=new JLabel();
        label2.setText("Valorant");
        label2.setVerticalTextPosition(JLabel.BOTTOM);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setIcon(valoicon);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);

        JLabel label3=new JLabel();
        label3.setText("Steam");
        label3.setVerticalTextPosition(JLabel.BOTTOM);
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setIcon(steamicon);
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);


        JPanel cyanpanel=new JPanel();
        cyanpanel.setBackground(Color.CYAN);
        cyanpanel.setBounds(200,0,150,400);

        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(350,0,200,400);

        JPanel greenpanel=new JPanel();
        greenpanel.setBounds(0,0,200,400);
        greenpanel.setBackground(Color.green);

        JFrame frame =new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,880);
        frame.getContentPane().setBackground(Color.black);
        redpanel.add(label);
        greenpanel.add(label2);
        cyanpanel.add(label3);
        frame.add(redpanel);
        frame.add(cyanpanel);
        frame.add(greenpanel);

    }
}
