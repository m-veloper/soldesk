package constant;

import java.util.*;
import java.util.stream.Collectors;

import static constant.Constants.*;

/**
 * 카테고리 버튼을 위한 enum을 정의합니다.
 */
public enum CategoryBtnCode {

    KOREAN(Constants.KOREAN, KOREAN_IMG, KOREAN_FOOD_IMG, 130, 200, 150, 80),
    JAPANESE(Constants.JAPANESE, JAPANESE_IMG, JAPANESE_FOOD_IMG, 130, 300, 150, 80),
    CHINESE(Constants.CHINESE, CHINESE_IMG, CHINESE_FOOD_IMG, 130, 400, 150, 80),
    WESTERN(Constants.WESTERN,  WESTERN_IMG, WESTERN_FOOD_IMG, 130, 500, 150, 80),
    ASIAN(Constants.ASIAN, ASIAN_IMG, ASIAN_FOOD_IMG, 130, 600, 150, 80);

    private String value;
    private String categoryImg;
    private String foodImg;
    private int x;
    private int y;
    private int width;
    private int height;

    CategoryBtnCode(String value, String categoryImg, String foodImg, int x, int y, int width, int height) {
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
     * value 정보 출력
     *
     * @return
     */
    public String getName(CategoryBtnCode text) {
        switch (text){
            case KOREAN:{

            }
        }
        return value;
    }

    /**
     * enum 의 정보중 필요한 정보만을 담는다.
     */
    private static final List<Map<String, String>> makeCategoryInfo = Arrays.stream(values())
            .map(CategoryBtnCode -> {
                Map<String, String> m = new HashMap<>();
                m.put("name", CategoryBtnCode.name());
                m.put("categoryImgPath", CategoryBtnCode.categoryImg);
                m.put("foodImgPath", CategoryBtnCode.foodImg);
                m.put("x", String.valueOf(CategoryBtnCode.x));
                m.put("y", String.valueOf(CategoryBtnCode.y));
                m.put("width", String.valueOf(CategoryBtnCode.width));
                m.put("height", String.valueOf(CategoryBtnCode.height));
                return m;
            })
            .collect(Collectors.toList());

    /**
     * name 목록을 생성
     */
    private static final List<String> getNameList =
            Arrays.stream(values()).map(CategoryBtnCode -> {
                return CategoryBtnCode.name();
            }).collect(Collectors.toList());

    /**
     * value 목록을 생성
     */
    private static final List<String> getValueList =
            Arrays.stream(values()).map(CategoryBtnCode -> {
                return CategoryBtnCode.value;
            }).collect(Collectors.toList());

    /**
     * name 목록을 호출
     * @return
     */
    public static List<String> getCountryName() {
        return getNameList;
    }

    /**
     * value 목록을 호출
     * @return
     */
    public static List<String> getCountryValue() {
        return getValueList;
    }

    /**
     * 만들어진 카테고리 정보를 호출
     * @return
     */
    public static List<Map<String, String>> getCategoryInfo() {
        return makeCategoryInfo;
    }
}
