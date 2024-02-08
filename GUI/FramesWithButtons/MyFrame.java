package GUI.FramesWithButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
        JButton button;
        JLabel label;
        MyFrame(){

            ImageIcon icon=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-apple-logo-64.png");
            ImageIcon icon2=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-valorant-48.png");

            label=new JLabel();
            label.setIcon(icon2);
            label.setVisible(false);
            label.setBounds(100,200,250,100);
            label.setText("This is Valorant");
            label.setHorizontalTextPosition(JLabel.RIGHT);
            label.setVerticalTextPosition(JLabel.CENTER);

            button =new JButton();
            button.setBounds(50,50,250,100);
            button.setText("Click Here");
            button.setFont(new Font("Comic sans",Font.ITALIC,25));
            button.setFocusable(false);
            button.addActionListener(this);
            button.setIcon(icon);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setBackground(new Color(217,210,233));
            button.setForeground(new Color(103,78,167));
            button.setIconTextGap(-10);


            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(500,500);
            this.setVisible(true);
            this.getContentPane().setBackground(new Color(159,197,232));
            this.add(button);
            this.add(label);

        }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Hello");
            label.setVisible(true);
        }
    }
}
