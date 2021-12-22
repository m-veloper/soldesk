package utils;

import javax.swing.*;

public interface ButtonService {

    /**
     * 배경, 테두리가 없는 버튼을 설정합니다.
     * @param imgPath
     * @param x
     * @param y
     * @param width
     * @param height
     * @return
     */
    JButton setTransparencyButton(String imgPath, int x, int y, int width, int height);

    /**
     * 시작 버튼
     * @return
     */
    JButton appIcon();

    /**
     * 시작 버튼
     * @return
     */
    JButton start();

    /**
     * 종료 버튼
     * @return
     */
    JButton close();

    /**
     * 뒤로 가기 버튼
     * @return
     */
    JButton back();

    /**
     * 랜덤 버튼
     * @return
     */
    JButton random();

    /**
     * 카테고리 버튼
     * @return
     */
    JButton category();
}
