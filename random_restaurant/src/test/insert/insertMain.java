package test.insert;

import test.random.Data;
import test.random.RestaurantDto;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class insertMain {

    public static void main(String[] args) throws IOException {
        List<RestaurantDto> result = new ArrayList<>();

        List<String> list = Files.readAllLines(new File("./random_restaurant/src/test/insert/abc.txt").toPath(), Charset.defaultCharset() );
        for (int i=0; i < list.size(); i++){
            String[] asd = list.get(i).split("\t");
            RestaurantDto restaurantDto = new RestaurantDto();
            restaurantDto.setId(asd[0]);
            restaurantDto.setAddressName(asd[1]);
            restaurantDto.setCategoryDetail(asd[2]);
            restaurantDto.setCategoryName(asd[3]);
            restaurantDto.setPhone(asd[4]);
            restaurantDto.setPlaceBest(asd[5]);
            result.add(restaurantDto);
        }
    }
}
