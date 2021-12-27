package utils;

import model.RestaurantDto;
import service.RestaurantDB;

import javax.swing.*;
import java.util.List;

public interface Panel {

    JLabel setJLabelSettings(String data, int x, int y, int width, int height);
    List<JLabel> makeRandomResultByJLabel(RestaurantDB restaurantDB);
}
