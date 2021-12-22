package service;

import model.RestaurantDto;
import test.random.Data;

public class Restaurant implements RestaurantService {

    private RestaurantDto restaurantDto;

    @Override
    public RestaurantDto getRandomRestaurant(RestaurantDB restaurantDB) {
//        restaurantDto = new RestaurantDto();
        int i = RestaurantService.getRandomNumber(restaurantDB.makeList().size());
        return restaurantDto = restaurantDB.makeList().get(i);
    }

    @Override
    public RestaurantDto getRandomRestaurantByCategory(RestaurantDB restaurantDB, String category) {
        return null;
    }
}
