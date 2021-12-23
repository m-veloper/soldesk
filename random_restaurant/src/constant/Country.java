package constant;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static constant.Constant.*;


public enum Country {

    KOREAN("한식", ROOT_IMG_PATH + KOREAN_IMG, 86, 200, 225, 80),
    JAPANESE("일식", ROOT_IMG_PATH + JAPANESE_IMG, 86, 300, 225, 80),
    CHINESE("중식", ROOT_IMG_PATH + CHINESE_IMG, 86, 400, 225, 80),
    WESTERN("양식", ROOT_IMG_PATH + WESTERN_IMG, 86, 500, 225, 80),
    ASIAN("아시안", ROOT_IMG_PATH + ASIAN_IMG, 86, 600, 225, 80);

    private String value;
    private String img;
    private int x;
    private int y;
    private int width;
    private int height;

    Country(String value, String img, int x, int y, int width, int height) {
        this.value = value;
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String getValue() {
        return value;
    }

    private static final List<Map<String, String>> country = Arrays.stream(values())
            .map(Country -> {
                Map<String, String> m = new HashMap<>();
                m.put("name", Country.name());
                m.put("imgPath", Country.img);
                m.put("x", String.valueOf(Country.x));
                m.put("y", String.valueOf(Country.y));
                m.put("width", String.valueOf(Country.width));
                m.put("height", String.valueOf(Country.height));
                return m;
            })
            .collect(Collectors.toList());

    /**
     * name 목록을 리턴
     */
    private static final List<String> getNameList =
            Arrays.stream(values()).map(Country -> {
                return Country.name();
            }).collect(Collectors.toList());

    /**
     * value 목록을 리턴
     */
    private static final List<String> getValueList =
            Arrays.stream(values()).map(Country -> {
                return Country.value;
            }).collect(Collectors.toList());

    public static List<String> getCountryName() {
        return getNameList;
    }

    public static List<String> getCountryValue() {
        return getValueList;
    }

    public static List<Map<String, String>> getCountry() {
        return country;
    }
}
