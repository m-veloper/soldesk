package utils;

import javax.swing.*;
import java.awt.*;

public class ButtonUtils implements ButtonService {

    @Override
    public JButton setTransparencyButton(String imgPath, int x, int y, int width, int height) {
        JButton jButton = new JButton();
        if (imgPath != null) {
            Image image = new ImageIcon(imgPath).getImage();
            ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jButton.setIcon(imageIcon);
        }
        jButton.setBackground(Color.WHITE);
        jButton.setBounds(x, y, width, height);
        jButton.setBorderPainted(false);
        jButton.setFocusPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setOpaque(true);
        return jButton;
    }

    @Override
    public JButton appIcon() {
        return this.setTransparencyButton("./random_restaurant/resources/img/app_icon.png", 46, 465, 62, 62);
    }

    @Override
    public JButton start() {
        return this.setTransparencyButton("./random_restaurant/resources/img/start.png", 80, 550, 230, 50);
    }

    @Override
    public JButton close() {
        return this.setTransparencyButton("./random_restaurant/resources/img/close.png", 80, 620, 230, 50);
    }

    @Override
    public JButton back() {
        return this.setTransparencyButton("./random_restaurant/resources/img/back.png", 50, 100, 80, 20);
    }

    @Override
    public JButton random() {
        return this.setTransparencyButton("./random_restaurant/resources/img/random.png", 50, 175, 300, 225);
    }

    @Override
    public JButton category() {
        return this.setTransparencyButton("./random_restaurant/resources/img/category.png", 50, 425, 300, 225);
    }
}
