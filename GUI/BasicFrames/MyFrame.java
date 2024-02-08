package GUI.BasicFrames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("First Frame");//Sets the frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits the frame when close button is pressed
        this.setResizable(false);//turna of the permission to resize
        this.setSize(500,600);//sets frame size wrt x and y axis
        this.setVisible(true);//sets the visibility
        Image image=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\1332406.png").getImage();//creates a new image icon
        this.setIconImage(image);//sets the above image icon
        this.getContentPane().setBackground(new Color(70,132,153));//change color of the background
    }
}
