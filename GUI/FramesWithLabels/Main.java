package GUI.FramesWithLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {


    public static void main(String[] args) {
        ImageIcon image =new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\instagram.png");
        Border border=BorderFactory.createLineBorder(Color.red,4);
        JLabel label=new JLabel();//create a label
        Image logo=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\instagram.png").getImage();


        label.setIcon(image);
        label.setText("Really nigga?Whats the number?");//set text of label
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left center or right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text top,center bottom of image icon
        label.setForeground(Color.white);//set font color of text
        label.setFont(new Font("MV Boli",Font.ITALIC,25));//set font name,style,size of text
        label.setIconTextGap(30);//determines the gap b/w text and image
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(false);//display background color
        label.setBorder(border);//sets border of label
        label.setVerticalAlignment(JLabel.TOP);//sets vertical position of icon+text within the label
        label.setHorizontalAlignment(JLabel.CENTER);//sets horizontal position of icon+text within the label
        //label.setBounds(500,0,500,889);//set x,y position within frame as well as dimensions

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Instagram");
        frame.setSize(500,889);
        //frame.setLayout(null);
        frame.add(label);
        frame.getContentPane().setBackground(new Color(120,50,250));
        frame.setIconImage(logo);
        frame.pack();
    }
}
