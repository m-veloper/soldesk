package service;

import model.RestaurantDto;

import java.util.ArrayList;

public class Restaurant implements RestaurantService {

    private RestaurantDto restaurantDto;

    @Override
    public RestaurantDto getRandomRestaurant(RestaurantDB restaurantDB) {
        int i = RestaurantService.getRandomNumber(restaurantDB.makeList().size());
        return restaurantDto = restaurantDB.makeList().get(i);
    }

    @Override
    public RestaurantDto getRandomRestaurantByCategory(RestaurantDB restaurantDB, String category) {
        ArrayList<RestaurantDto> categorys = new ArrayList<>();
        for (int i = 0; i < restaurantDB.makeList().size(); i++) {
            if (restaurantDB.makeList().get(i).getCategoryName().equals(category)) {
                categorys.add(restaurantDB.makeList().get(i));
            }
        }
        int i = RestaurantService.getRandomNumber(categorys.size());
        restaurantDto = categorys.get(i);
        return restaurantDto;
    }
}
