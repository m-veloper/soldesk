package utils;

import javax.swing.*;

public interface ButtonService {

    /**
     * ���, �׵θ��� ���� ��ư�� �����մϴ�.
     * @param imgPath
     * @param x
     * @param y
     * @param width
     * @param height
     * @return
     */
    JButton setTransparencyButton(String imgPath, int x, int y, int width, int height);

    /**
     * ���� ��ư
     * @return
     */
    JButton appIcon();

    /**
     * ���� ��ư
     * @return
     */
    JButton start();

    /**
     * ���� ��ư
     * @return
     */
    JButton close();

    /**
     * �ڷ� ���� ��ư
     * @return
     */
    JButton back();

    /**
     * ���� ��ư
     * @return
     */
    JButton random();

    /**
     * ī�װ� ��ư
     * @return
     */
    JButton category();
}
