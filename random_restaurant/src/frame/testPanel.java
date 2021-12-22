package frame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class testPanel {

    public static void main(String[] args) {
        JFrame frame =new JFrame();

        JPanel panel = new JPanel();

        JLabel label = new JLabel("SunRise");
        JPanel btnpanel = new JPanel();

        JButton btn1 = new JButton("DearFriend");
        JButton btn2 = new JButton("EXID");

        JTextArea txtArea = new JTextArea();

        panel.setLayout(new BorderLayout());

        btnpanel.add(btn1);
        btnpanel.add(btn2);
//        panel.add(btn1 , BorderLayout.WEST);
//        panel.add(btn2 , BorderLayout.WEST);

        panel.add(btnpanel , BorderLayout.WEST) ;
        panel.add(label , BorderLayout.NORTH);


        panel.add(txtArea , BorderLayout.CENTER);

        btn1.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {

                txtArea.append("PangPangMan\n");

            }

        }  );


        frame.add(panel);

        frame.setResizable(false);

        frame.setVisible(true);

        frame.setPreferredSize(new Dimension( 840 , 840/12*9));

        frame.setSize(840, 840/12*9);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
