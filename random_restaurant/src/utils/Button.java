package utils;

import frame.AppFrame;
import model.ButtonActionStatusDto;

import javax.swing.*;
import java.util.ArrayList;

public interface Button {

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

    /**
     * �ѽ�,�߽�,�Ͻ�,���,�ƽþ� ��ư ����Ʈ
     * @param appFrame
     * @param buttonActionStatusDto
     * @return
     */
    ArrayList<JButton> getCountryBtn(AppFrame appFrame, ButtonActionStatusDto buttonActionStatusDto);

    /**
     * ���� ��õ ���� ��ư
     * @param appFrame
     * @return
     */
    JButton startRandom(AppFrame appFrame);

    /**
     * ��ư �̺�Ʈ�� �۵��Ǵ� �����忡
     * interrupt �� �߻����� ���� ��Ű��
     * ��ư�� �缳�� �ϰ� ���� ������� �����ִ� �гη� �̵� ��ŵ�ϴ�.
     * @param thread
     * @param jButton
     */
    void interruptRandomImgTread(Thread thread, JButton jButton, AppFrame appFrame);

    /**
     * īī���� ������ ȣ��
     * @param url
     * @return
     */
    JButton openBrowser(String url);
}
