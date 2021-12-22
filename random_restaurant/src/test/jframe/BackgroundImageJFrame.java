package test.jframe;

import javax.swing.*;
import java.awt.*;

class BackgroundImageJFrame extends JFrame
{
    JButton b1;
    JLabel l1;
    public BackgroundImageJFrame() {
        setTitle("Background Color for JFrame");
//        setSize(400,400);
//        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
/*
	One way
	-----------------
	setLayout(new BorderLayout());
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png"));
	add(background);
	background.setLayout(new FlowLayout());
	l1=new JLabel("Here is a button");
	b1=new JButton("I am a button");
	background.add(l1);
	background.add(b1);
*/
// Another way

        setContentPane(new JLabel(new ImageIcon("./random_restaurant/resources/img/base_img.png")));
        setLayout(new BorderLayout());
        setLayout(new FlowLayout());
        l1=new JLabel("Here is a button");
        b1=new JButton("I am a button");
        b1.setLocation(100, 100);
        add(l1);
        add(b1);
        // Just for refresh :) Not optional!
        setSize(399, 399);
//        setSize(400,400);
    }
    public static void main(String args[])
    {
        new BackgroundImageJFrame();
    }
}
