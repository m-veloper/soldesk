package utils;

import model.RestaurantDto;
import service.Restaurant;
import service.RestaurantDB;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PanelUtils implements Panel{

    private RestaurantDto restaurantDto;
    private Restaurant restaurant;

    @Override
    public JLabel setJLabelSettings(String data, int x, int y, int width, int height) {
        JLabel jLabel = new JLabel(data);
        jLabel.setBounds(x, y, width, height);
        jLabel.setFont(new Font("", Font.BOLD, 17));
        jLabel.setForeground(Color.PINK);
        return jLabel;
    }

    @Override
    public List<JLabel> makeRandomResultByJLabel(RestaurantDB restaurantDB) {

        ArrayList<JLabel> jLabelList = new ArrayList<>();
        restaurantDto = new RestaurantDto();
        restaurant = new Restaurant();
        restaurantDto = restaurant.getRandomRestaurant(restaurantDB);
        JLabel menuImg = this.setJLabelSettings(HtmlUtils.createImgHtml(restaurantDto.getImgUrl()),45,150, 300, 300);
        JLabel placeName = this.setJLabelSettings("상호 : "+restaurantDto.getPlaceName(), 60, 500, 300, 50);
        JLabel placeBest = this.setJLabelSettings("대표 메뉴 : "+restaurantDto.getPlaceBest(), 60, 520, 300, 50);
        JLabel phone = this.setJLabelSettings("연락처: "+restaurantDto.getPhone(), 60, 540, 300, 50);
        JLabel roadAddressName = this.setJLabelSettings("주소: "+restaurantDto.getRoadAddressName(), 60, 560, 300, 50);
        JLabel placeUrl = new JLabel(restaurantDto.getPlaceUrl());

        jLabelList.add(menuImg);
        jLabelList.add(placeName);
        jLabelList.add(placeBest);
        jLabelList.add(phone);
        jLabelList.add(roadAddressName);
        jLabelList.add(placeUrl);
        return jLabelList;
    }
}
