package service;

import model.RestaurantDto;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDB {


    private ArrayList<RestaurantDto> restaurantDtos;

    public RestaurantDB() {
        makeList();
    }

    public List<RestaurantDto> makeList(){

        restaurantDtos = new ArrayList<>();

        restaurantDtos.add(new RestaurantDto("샤오바오우육면", "중식", "중화요리", "02-723-7788",
                "서울 종로구 관철동 12-24", "우육면, 마라탕면", "서울 종로구 삼일대로17길 15", "http://place.map.kakao.com/2053098478",
                "2053098478"));

        restaurantDtos.add(new RestaurantDto("우육면관", "중식", "중화요리", "070-4213-5678",
                "서울 종로구 관철동 11-11", "우육면(특), 우육면", "서울 종로구 청계천로 75-2", "http://place.map.kakao.com/2143988257",
                "2143988257"));

        restaurantDtos.add(new RestaurantDto("갓덴스시", "일식", "초밥,롤", "02-730-1477",
                "서울 종로구 관철동 19-1", "점심 특선 초밥, 회전초밥", "서울 종로구 종로12길 14", "http://place.map.kakao.com/15204021",
                "15204021"));

        restaurantDtos.add(new RestaurantDto("양연화로", "한식", "육류,고기", "02-3210-0808",
                "서울 종로구 관철동 13-5", "삼겹살, 특목살, 가브리살", "서울 종로구 삼일대로17길 18", "http://place.map.kakao.com/1619274444",
                "1619274444"));

        restaurantDtos.add(new RestaurantDto("신도세기", "한식", "육류,고기", "02-739-8114",
                "서울 종로구 관철동 180", "SGP 통삽겹, SGP숄더랙", "서울 종로구 삼일대로17길 51", "http://place.map.kakao.com/811272424",
                "811272424"));

        restaurantDtos.add(new RestaurantDto("롤링파스타", "양식", "이탈리안", "02-2261-5973",
                "서울 종로구 관철동 5-5", "크림 수프 파스타, 매운 크림 파스타", "서울 종로구 삼일대로 392", "http://place.map.kakao.com/829236335",
                "829236335"));

        restaurantDtos.add(new RestaurantDto("종로돈부리", "일식", "돈부리", "02-722-2384",
                "서울 종로구 관철동 7-15", "가츠동, 믹스가츠동, 규동", "서울 종로구 삼일대로 385", "http://place.map.kakao.com/24725107",
                "24725107"));

        restaurantDtos.add(new RestaurantDto("VIP참치", "일식", "참치회", "02-720-3888",
                "서울 종로구 관철동 11-13", "점심특선 참치 정식", "서울 종로구 삼일대로15길 25", "http://place.map.kakao.com/149543887",
                "149543887"));

        restaurantDtos.add(new RestaurantDto("황소고집", "한식", "육류,고기", "02-722-5747",
                "서울 종로구 관철동 11-11", "고추장 불고기 백반", "서울 종로구 청계천로 75-1", "http://place.map.kakao.com/8696442",
                "8696442"));

        restaurantDtos.add(new RestaurantDto("쟁반집8292", "한식", "육류,고기", "0507-1389-8384",
                "서울 종로구 관철동 43-13", "고기정식, 두루치기", "서울 종로구 종로8길 17", "http://place.map.kakao.com/735673283",
                "735673283"));

        restaurantDtos.add(new RestaurantDto("숙달돼지", "한식", "육류,고기", "02-737-5201",
                "서울 종로구 관철동 43-15", "국내산 숙성 통삼겹, 부대찌개", "서울 종로구 종로8길 15", "http://place.map.kakao.com/650374759",
                "650374759"));

        restaurantDtos.add(new RestaurantDto("남대문막내회집", "한식", "해물생선회", "02-737-5115",
                "서울 종로구 관철동 263", "활어회", "서울 종로구 우정국로 4-1", "http://place.map.kakao.com/13272050",
                "13272050"));

        restaurantDtos.add(new RestaurantDto("종로불돼지", "한식", "육류고기", "02-734-1190",
                "서울 종로구 관철동 155", "간돼지, 불돼지", "서울 종로구 청계천로 67", "http://place.map.kakao.com/17278908",
                "17278908"));

        restaurantDtos.add(new RestaurantDto("르브와", "양식", "이탈리안", "02-739-8208",
                "서울 종로구 관철동 19-11", "파스타, 리조또, 화덕피자", "서울 종로구 우정국로2길 42", "http://place.map.kakao.com/18283622",
                "18283622"));

        restaurantDtos.add(new RestaurantDto("포탈라레스토랑", "아시아음식", "인도음식", "02-318-0094",
                "서울 종로구 관철동 35-2", "카레, 스프, 국수", "서울 종로구 청계천로 99", "http://place.map.kakao.com/11834063",
                "11834063"));

        restaurantDtos.add(new RestaurantDto("뚝배기집", "한식", "찌개전골", "02-2265-5744",
                "서울 종로구 관철동 5-1", "우렁된장, 된장찌개, 순두부", "서울 종로구 종로16길 12", "http://place.map.kakao.com/10374336",
                "10374336"));

        restaurantDtos.add(new RestaurantDto("더피자필", "양식", "피자", "02-795-3283",
                "서울 종로구 관철동 42-4", "마르게리따, 페페로니, 슈프림", "서울 종로구 종로10길 21", "http://place.map.kakao.com/1397192634",
                "1397192634"));

        restaurantDtos.add(new RestaurantDto("장수촌", "한식", "해물생선장어", "02-722-3149",
                "서울 종로구 관철동 7-5", "장어 소금 구이, 바지락칼국수", "서울 종로구 삼일대로17길 8", "http://place.map.kakao.com/221545425",
                "221545425"));

        restaurantDtos.add(new RestaurantDto("신촌황소곱창", "한식", "곱창막창", "02-735-6698",
                "서울 종로구 관철동 12-23", "황소곱창, 대창, 막창", "서울 종로구 삼일대로17길 17", "http://place.map.kakao.com/9631798",
                "9631798"));

        restaurantDtos.add(new RestaurantDto("반쿤콴", "아시아음식", "태국음식", "02-725-1688",
                "서울 종로구 관철동 43-7", "태국식 소고기 쌀국수, 카오팟", "서울 종로구 종로10길 20", "http://place.map.kakao.com/208592301",
                "208592301"));

        restaurantDtos.add(new RestaurantDto("미도갈비", "한식", "육류고기", "02-725-9233",
                "서울 종로구 관철동 11-13", "고베모듬, 오겹살", "서울 종로구 삼일대로15길 25", "http://place.map.kakao.com/1969790364",
                "1969790364"));

        restaurantDtos.add(new RestaurantDto("미친닭", "한식", "치킨", "02-722-9992",
                "서울 종로구 관철동 44-1", "미친통쌈닥, 순살콤보", "서울 종로구 우정국로2길 16", "http://place.map.kakao.com/26884480",
                "26884480"));

        restaurantDtos.add(new RestaurantDto("원조우정낙지", "한식", "해물생선", "02-720-7991",
                "서울 종로구 관철동 19-16", "낚지볶음, 감자탕", "서울 종로구 삼일대로17길 46", "http://place.map.kakao.com/8458646",
                "8458646"));

        restaurantDtos.add(new RestaurantDto("대찬횟집", "한식", "해물생선회", "02-738-8588",
                "서울 종로구 관철동 256", "모듬회, 활어회", "서울 종로구 우정국로2길 10", "http://place.map.kakao.com/27491757",
                "27491757"));

        restaurantDtos.add(new RestaurantDto("교대이층집", "한식", "육류고기", "02-732-8188",
                "서울 종로구 관철동 14-1", "통삼겹, 통목살", "서울 종로구 삼일대로19길 16", "http://place.map.kakao.com/170372666",
                "170372666"));

        restaurantDtos.add(new RestaurantDto("일편등심", "한식", "육류고기", "070-4104-9922",
                "서울 종로구 관철동 180", "한우 눈꽃 등심, 안심", "서울 종로구 삼일대로17길 51", "http://place.map.kakao.com/916261841",
                "916261841"));

        restaurantDtos.add(new RestaurantDto("종로양꼬치", "중식", "양꼬치", "02-720-8168",
                "서울 종로구 관철동 13-7", "양모듬, 고급양갈비", "서울 종로구 삼일대로17길 20-2", "http://place.map.kakao.com/15864091",
                "15864091"));

        restaurantDtos.add(new RestaurantDto("당산오돌", "한식", "육류고기", "02-723-3590",
                "서울 종로구 관철동 44-5", "꼬들살, 눈꽃갈비", "서울 종로구 종로8길 20", "http://place.map.kakao.com/3678525",
                "3678525"));

        restaurantDtos.add(new RestaurantDto("오로지라멘", "일식", "일본식라면", "02-733-9279",
                "서울 종로구 관철동 13-2", "돈코츠라멘, 오로지라멘", "서울 종로구 종로14길 16", "http://place.map.kakao.com/1414375847",
                "1414375847"));

        restaurantDtos.add(new RestaurantDto("왕비집", "한식", "육류고기", "02-720-3066",
                "서울 종로구 관철동 12-11", "소갈비정식, 한우불고기정식", "서울 종로구 삼일대로15길 24", "http://place.map.kakao.com/15232887",
                "15232887"));

        restaurantDtos.add(new RestaurantDto("고메식당", "한식", "육류고기", "02-723-0999",
                "서울 종로구 관철동 43-5", "이베리코 돼지 꽃목살, 명품 숙성 삼겹살", "서울 종로구 종로10길 14", "http://place.map.kakao.com/2131396403",
                "2131396403"));

        restaurantDtos.add(new RestaurantDto("싱싱해물나라", "한식", "해물생선회", "02-733-1226",
                "서울 종로구 관철동 11-1", "활고등어회, 갈고회, 광고회", "서울 종로구 삼일대로15길 13", "http://place.map.kakao.com/7977978",
                "7977978"));

        restaurantDtos.add(new RestaurantDto("촌놈숯불닭갈비", "한식", "치킨", "02-722-3852",
                "서울 종로구 관철동 6-4", "닭목살구이, 허브숙성양념", "서울 종로구 삼일대로19길 6", "http://place.map.kakao.com/1750296031",
                "1750296031"));

        restaurantDtos.add(new RestaurantDto("차돌박힌쭈꾸미", "한식", "해물생선", "02-732-8806",
                "서울 종로구 관철동 175", "쭈꾸미 덮밥, 차쭈스페셜구이 세트", "서울 종로구 삼일대로17길 47-1", "http://place.map.kakao.com/26432860",
                "26432860"));

        restaurantDtos.add(new RestaurantDto("종로황소곱창", "한식", "곱창막창", "02-723-5157",
                "서울 종로구 관철동 18-8", "소곱창구이, 냉면", "서울 종로구 우정국로2길 31", "http://place.map.kakao.com/21396905",
                "21396905"));

        restaurantDtos.add(new RestaurantDto("이강순실비집", "한식", "해물생선", "02-737-7880",
                "서울 종로구 관철동 11-11", "산낙지볶음, 낙지볶음", "서울 종로구 청계천로 75-1", "http://place.map.kakao.com/27146280",
                "27146280"));

        return restaurantDtos;
    }

}
