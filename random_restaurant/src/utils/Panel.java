package utils;

import javax.swing.*;
import java.util.List;

public interface Panel {

    /**
     * 라벨에 대한 설정을 정의
     * @param data
     * @param x
     * @param y
     * @param width
     * @param height
     * @return
     */
    JLabel setJLabelSettings(String data, int x, int y, int width, int height);

    /**
     * 로딩 라벨 만들기
     * @return
     */
    JLabel makeLoadingLabel();

    /**
     * 최종 랜덤 결과 추출
     * @param status
     * @return
     */
    List<JLabel> getRestaurantResult(String status);

    /**
     * 라벨에 랜덤 결과를 만듬.
     * @return
     */
    List<JLabel> makeRandomResultByJLabel(String category);
}
