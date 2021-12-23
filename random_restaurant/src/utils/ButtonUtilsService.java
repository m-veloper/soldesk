package utils;

import frame.AppFrame;
import model.ButtonActionStatusDto;

import javax.swing.*;
import java.util.ArrayList;

public interface ButtonUtilsService {

    ButtonActionStatusDto buttonActionStatusDto = new ButtonActionStatusDto();

    /**
     * 배경, 테두리가 없는 버튼을 설정합니다.
     * @param btnName : 버튼 텍스트
     * @param imgPath : 이미지 경로
     * @param x : x 좌표
     * @param y : y 좌표
     * @param width : 길이
     * @param height : 높이
     * @return
     */
    JButton setTransparencyButton(String btnName, String imgPath, int x, int y, int width, int height);

    /**
     * 앱 실행 버튼
     * @param appFrame
     * @return
     */
    JButton runApp(AppFrame appFrame);

    /**
     * 진행 시작 버튼
     * @param appFrame
     * @return
     */
    JButton start(AppFrame appFrame);

    /**
     * 종료 버튼
     * @param appFrame
     * @return
     */
    JButton close(AppFrame appFrame);

    /**
     * 종료 버튼
     * @param appFrame
     * @param fromPanel
     * @return
     */
    JButton goBack(AppFrame appFrame, String fromPanel);

    /**
     * 랜덤 패널 진입 버튼
     * @param appFrame
     * @return
     */
    JButton goRandom(AppFrame appFrame);

    /**
     * 카테고리 패널 진입 버튼
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
