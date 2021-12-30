package utils;

import model.RestaurantDto;
import service.Restaurant;
import service.RestaurantDB;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static constant.Constants.LOADING;
import static constant.Constants.RANDOM_STATUS;

public class PanelUtils implements Panel {

    private RestaurantDB restaurantDB;
    private RestaurantDto restaurantDto;
    private Restaurant restaurant;

    @Override
    public JLabel setJLabelSettings(String data, int x, int y, int width, int height) {
        JLabel jLabel = new JLabel(data);
        jLabel.setBounds(x, y, width, height);
        jLabel.setFont(new Font("", Font.BOLD, 17));
        return jLabel;
    }

    @Override
    public JLabel makeLoadingLabel() {
        return this.setJLabelSettings((HtmlUtils.createLabelHtml(LOADING)), 100, 470, 200, 200);
    }

    @Override
    public List<JLabel> getRestaurantResult(String status) {
        return this.makeRandomResultByJLabel(status);
    }

    @Override
    public List<JLabel> makeRandomResultByJLabel(String status) {

        // 리스트 객체 생성
        ArrayList<JLabel> jLabelList = new ArrayList<>();
        // 디비 객체 생성
        restaurantDB = new RestaurantDB();
        // dto 객체 생성
        restaurantDto = new RestaurantDto();

        restaurant = new Restaurant();

        if(status.equals(RANDOM_STATUS)){
            // 랜덤일 경우
            restaurantDto = restaurant.getRandomRestaurant(restaurantDB);
        }else {
            // 카테고리 선택일 경우
            restaurantDto = restaurant.getRandomRestaurantByCategory(restaurantDB, status);
        }

        JLabel menuImg = this.setJLabelSettings(HtmlUtils.createImgHtml(restaurantDto.getImgUrl()), 57, 150, 300, 300);
        JLabel placeName = this.setJLabelSettings(HtmlUtils.createLabelHtml(restaurantDto.getPlaceName()), 60, 500, 300, 50);
        JLabel placeBest = this.setJLabelSettings(HtmlUtils.createLabelHtml(restaurantDto.getPlaceBest()), 60, 520, 300, 50);
        JLabel phone = this.setJLabelSettings(HtmlUtils.createLabelHtml(restaurantDto.getPhone()), 60, 540, 300, 50);
        JLabel roadAddressName = this.setJLabelSettings(HtmlUtils.createLabelHtml(restaurantDto.getRoadAddressName()), 60, 560, 300, 50);
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
