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

    /**
     * 모든 데이터중 에서 랜덤 데이터 1개를 추출
     * @param restaurantDB
     * @return
     */
    RestaurantDto getRandomRestaurant(RestaurantDB restaurantDB);

    /**
     * 특정 카테고리 데이터 중에서 1개의 데이터를 추출
     * @param restaurantDB
     * @param category
     * @return
     */
    RestaurantDto getRandomRestaurantByCategory(RestaurantDB restaurantDB, String category);
}
