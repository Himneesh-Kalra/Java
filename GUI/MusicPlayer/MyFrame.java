package GUI.MusicPlayer;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFrame extends JFrame implements ActionListener {
    JButton play;
    JButton pause;
    JButton rewind;
    JButton quit;
    JLabel label;
    MyFrame() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner in =new Scanner(System.in);
        String filepath="C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\AudioManipulation\\Solarwaltz.wav";
        File file=new File(filepath);


        AudioInputStream audioinput = AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioinput);





        ImageIcon playbutton=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-circled-play-48.png");
        ImageIcon pausebutton=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-pause-48.png");
        ImageIcon rewindbutton=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-rewind-50.png");
        ImageIcon quitbutton=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-close-50.png");
        ImageIcon logo=new ImageIcon("C:\\Users\\phoen\\IdeaProjects\\Himneesh\\src\\GUI\\Images\\icons8-spotify-48.png");

//        label=new JLabel();
//        label.setIcon(pausebutton);
//        label.setVisible(false);
//        label.setBounds(100,200,250,100);
//        label.setText("This is Valorant");
//        label.setHorizontalTextPosition(JLabel.RIGHT);
//        label.setVerticalTextPosition(JLabel.CENTER);

        play =new JButton();
        play.setBounds(50,50,250,100);
        play.setText("Play");
        play.setFont(new Font("Comic sans",Font.ITALIC,25));
        play.setFocusable(false);
        play.addActionListener(e ->clip.start());
        play.setIcon(playbutton);
        play.setHorizontalTextPosition(JButton.CENTER);
        play.setVerticalTextPosition(JButton.BOTTOM);
        play.setBackground(new Color(217,210,233));
        play.setForeground(new Color(103,78,167));
        play.setIconTextGap(-10);

        pause=new JButton();
        pause.setBounds(50,150,250,100);
        pause.setText("Pause");
        pause.setFont(new Font("Comic sans",Font.ITALIC,25));
        pause.setFocusable(false);
        pause.addActionListener(e ->clip.stop());
        pause.setIcon(pausebutton);
        pause.setHorizontalTextPosition(JButton.CENTER);
        pause.setVerticalTextPosition(JButton.BOTTOM);
        pause.setBackground(new Color(217,210,233));
        pause.setForeground(new Color(103,78,167));
        pause.setIconTextGap(-10);

        rewind=new JButton();
        rewind.setBounds(50,250,250,100);
        rewind.setText("Rewind");
        rewind.setFont(new Font("Comic sans",Font.ITALIC,25));
        rewind.setFocusable(false);
        rewind.addActionListener(e ->clip.setMicrosecondPosition(0));
        rewind.setIcon(rewindbutton);
        rewind.setHorizontalTextPosition(JButton.CENTER);
        rewind.setVerticalTextPosition(JButton.BOTTOM);
        rewind.setBackground(new Color(217,210,233));
        rewind.setForeground(new Color(103,78,167));
        rewind.setIconTextGap(-10);

        quit=new JButton();
        quit.setBounds(50,350,250,100);
        quit.setText("Close");
        quit.setFont(new Font("Comic sans",Font.ITALIC,25));
        quit.setFocusable(false);
        quit.addActionListener(e -> System.exit(0));
        quit.setIcon(quitbutton);
        quit.setHorizontalTextPosition(JButton.CENTER);
        quit.setVerticalTextPosition(JButton.BOTTOM);
        quit.setBackground(new Color(217,210,233));
        quit.setForeground(new Color(103,78,167));
        quit.setIconTextGap(-10);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Music Player");
        this.setSize(500,500);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(96,190,211));
        this.add(play);
        this.add(pause);
        this.add(rewind);
        this.add(quit);
        this.setIconImage(logo.getImage());
//        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


