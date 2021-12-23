package utils;

import frame.AppFrame;
import model.ButtonActionStatusDto;

import javax.swing.*;
import java.util.ArrayList;

public interface ButtonUtilsService {

    ButtonActionStatusDto buttonActionStatusDto = new ButtonActionStatusDto();

    /**
     * ���, �׵θ��� ���� ��ư�� �����մϴ�.
     * @param btnName : ��ư �ؽ�Ʈ
     * @param imgPath : �̹��� ���
     * @param x : x ��ǥ
     * @param y : y ��ǥ
     * @param width : ����
     * @param height : ����
     * @return
     */
    JButton setTransparencyButton(String btnName, String imgPath, int x, int y, int width, int height);

    /**
     * �� ���� ��ư
     * @param appFrame
     * @return
     */
    JButton runApp(AppFrame appFrame);

    /**
     * ���� ���� ��ư
     * @param appFrame
     * @return
     */
    JButton start(AppFrame appFrame);

    /**
     * ���� ��ư
     * @param appFrame
     * @return
     */
    JButton close(AppFrame appFrame);

    /**
     * ���� ��ư
     * @param appFrame
     * @param fromPanel
     * @return
     */
    JButton goBack(AppFrame appFrame, String fromPanel);

    /**
     * ���� �г� ���� ��ư
     * @param appFrame
     * @return
     */
    JButton goRandom(AppFrame appFrame);

    /**
     * ī�װ� �г� ���� ��ư
     * @param appFrame
     * @return
     */
    JButton goCategory(AppFrame appFrame);

    ArrayList<JButton> getCountryBtn(AppFrame appFrame, ButtonActionStatusDto buttonActionStatusDto);

    JButton startRandom(AppFrame appFrame);

    JButton korean();
    JButton japanese();
    JButton chinese();
    JButton western();
    JButton asian();
}
