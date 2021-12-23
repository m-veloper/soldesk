package constant;

import java.util.*;
import java.util.stream.Collectors;

import static constant.Constant.*;


public enum Country {

    KOREAN(Constant.KOREAN, ROOT_IMG_PATH + KOREAN_IMG, ROOT_IMG_PATH + KOREAN_FOOD_IMG, 86, 200, 225, 80),
    JAPANESE(Constant.JAPANESE, ROOT_IMG_PATH + JAPANESE_IMG, ROOT_IMG_PATH + JAPANESE_FOOD_IMG, 86, 300, 225, 80),
    CHINESE(Constant.CHINESE, ROOT_IMG_PATH + CHINESE_IMG, ROOT_IMG_PATH + CHINESE_FOOD_IMG, 86, 400, 225, 80),
    WESTERN(Constant.WESTERN, ROOT_IMG_PATH + WESTERN_IMG, ROOT_IMG_PATH + WESTERN_FOOD_IMG, 86, 500, 225, 80),
    ASIAN(Constant.ASIAN, ROOT_IMG_PATH + ASIAN_IMG, ROOT_IMG_PATH + ASIAN_FOOD_IMG, 86, 600, 225, 80);

    private String value;
    private String categoryImg;
    private String foodImg;
    private int x;
    private int y;
    private int width;
    private int height;

    Country(String value, String categoryImg, String foodImg, int x, int y, int width, int height) {
        this.value = value;
        this.categoryImg = categoryImg;
        this.foodImg = foodImg;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * value 정보 출력
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * enum 의 정보중 필요한 정보만을 담는다.
     */
    private static final List<Map<String, String>> country = Arrays.stream(values())
            .map(Country -> {
                Map<String, String> m = new HashMap<>();
                m.put("name", Country.name());
                m.put("categoryImgPath", Country.categoryImg);
                m.put("foodImgPath", Country.foodImg);
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
