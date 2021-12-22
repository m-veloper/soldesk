package service;

import model.RestaurantDto;
import java.util.Random;

public interface RestaurantService {

    /**
     * 랜덤 숫자를 생성
     * @param size
     * @return
     */
    static int getRandomNumber(int size){
        return new Random().nextInt(size);
    };

    RestaurantDto getRandomRestaurant(RestaurantDB restaurantDB);
    RestaurantDto getRandomRestaurantByCategory(RestaurantDB restaurantDB, String category);
}
