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

        restaurantDtos.add(new RestaurantDto("샤오바오우육면", "CHINESE", "중화요리", "02-723-7788",
                "서울 종로구 관철동 12-24", "우육면, 마라탕면", "서울 종로구 삼일대로17길 15", "http://place.map.kakao.com/2053098478",
                "2053098478","https://mblogthumb-phinf.pstatic.net/MjAxOTAxMjdfMjg2/MDAxNTQ4NTc3NTE3ODA3.jyQh1Fb1ZaDOve3moocv4hNA1KRZZ5xqVtm6VKc72bAg.dv325fcLyIGnIgE_Va8Sn2RKWG2Omr6QgMN4n-4zcr4g.JPEG.tjgmlek86/20190123123624_IMG_2498-01-01.jpeg?type=w800"));

        restaurantDtos.add(new RestaurantDto("우육면관", "CHINESE", "중화요리", "070-4213-5678",
                "서울 종로구 관철동 11-11", "우육면(특), 우육면", "서울 종로구 청계천로 75-2", "http://place.map.kakao.com/2143988257",
                "2143988257","https://img.siksinhot.com/place/1605152744017465.PNG?w=307&h=300&c=Y"));

        restaurantDtos.add(new RestaurantDto("갓덴스시", "JAPANESE", "초밥,롤", "02-730-1477",
                "서울 종로구 관철동 19-1", "점심 특선 초밥, 회전초밥", "서울 종로구 종로12길 14", "http://place.map.kakao.com/15204021",
                "15204021","https://media-cdn.tripadvisor.com/media/photo-s/12/05/3d/a2/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("양연화로", "KOREAN", "육류,고기", "02-3210-0808",
                "서울 종로구 관철동 13-5", "삼겹살, 특목살, 가브리살", "서울 종로구 삼일대로17길 18", "http://place.map.kakao.com/1619274444",
                "1619274444","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTbDQhKh4uMunnB4EE5kH6Lu1OF4YpRJywpA&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("신도세기", "KOREAN", "육류,고기", "02-739-8114",
                "서울 종로구 관철동 180", "SGP 통삽겹, SGP숄더랙", "서울 종로구 삼일대로17길 51", "http://place.map.kakao.com/811272424",
                "811272424","http://www.seoulwire.com/news/photo/201807/19120_14600_5630.jpg"));

        restaurantDtos.add(new RestaurantDto("롤링파스타", "WESTERN", "이탈리안", "02-2261-5973",
                "서울 종로구 관철동 5-5", "크림 수프 파스타, 매운 크림 파스타", "서울 종로구 삼일대로 392", "http://place.map.kakao.com/829236335",
                "829236335","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0w6gPHp_Q-I-qQf0zEulEOUmG5KK6zRmygzgNGx7aR-lHlLi_V1QNQsZtgW2MomVo3vk&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("종로돈부리", "JAPANESE", "돈부리", "02-722-2384",
                "서울 종로구 관철동 7-15", "가츠동, 믹스가츠동, 규동", "서울 종로구 삼일대로 385", "http://place.map.kakao.com/24725107",
                "24725107","https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/459460_1498928329342661.jpg"));

        restaurantDtos.add(new RestaurantDto("VIP참치", "JAPANESE", "참치회", "02-720-3888",
                "서울 종로구 관철동 11-13", "점심특선 참치 정식", "서울 종로구 삼일대로15길 25", "http://place.map.kakao.com/149543887",
                "149543887","https://ssproxy.ucloudbiz.olleh.com/v1/AUTH_e59809eb-bdc9-44d7-9d8f-2e7f0e47ba91/post_card/67041_1592286979_uZtHVD65.jpg"));

        restaurantDtos.add(new RestaurantDto("황소고집", "KOREAN", "육류,고기", "02-722-5747",
                "서울 종로구 관철동 11-11", "고추장 불고기 백반", "서울 종로구 청계천로 75-1", "http://place.map.kakao.com/8696442",
                "8696442","https://img.siksinhot.com/place/1508728090055419.jpg"));

        restaurantDtos.add(new RestaurantDto("쟁반집8292", "KOREAN", "육류,고기", "0507-1389-8384",
                "서울 종로구 관철동 43-13", "고기정식, 두루치기", "서울 종로구 종로8길 17", "http://place.map.kakao.com/735673283",
                "735673283","https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjNfMTYg/MDAxNjAwODMzNTI1NzIz.FBvpIkAm8uopIJL-kKCXt3Dg03RSBmurjJ2DEtXZxu8g.7Ugue12BSZdKVLD2X2K_OM7CypMwMHMGtn5A0Cf9Kb8g.JPEG.lin1210/IMG_9661.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("숙달돼지", "KOREAN", "육류,고기", "02-737-5201",
                "서울 종로구 관철동 43-15", "국내산 숙성 통삼겹, 부대찌개", "서울 종로구 종로8길 15", "http://place.map.kakao.com/650374759",
                "650374759","https://cdn.imweb.me/thumbnail/20200513/480e99982a163.png"));

        restaurantDtos.add(new RestaurantDto("남대문막내회집", "KOREAN", "해물생선회", "02-737-5115",
                "서울 종로구 관철동 263", "활어회", "서울 종로구 우정국로 4-1", "http://place.map.kakao.com/13272050",
                "13272050","https://mblogthumb-phinf.pstatic.net/20160601_249/bbi_yu_1464745684610p3cSv_PNG/tyle.io-CRpDviQwP8k8sZEJM-1_%2814%29.png?type=w800"));

        restaurantDtos.add(new RestaurantDto("종로불돼지", "KOREAN", "육류고기", "02-734-1190",
                "서울 종로구 관철동 155", "간돼지, 불돼지", "서울 종로구 청계천로 67", "http://place.map.kakao.com/17278908",
                "17278908","https://www.chadorri.com/wp-content/uploads/2013/08/20130812_127.jpg"));

        restaurantDtos.add(new RestaurantDto("르브와", "WESTERN", "이탈리안", "02-739-8208",
                "서울 종로구 관철동 19-11", "파스타, 리조또, 화덕피자", "서울 종로구 우정국로2길 42", "http://place.map.kakao.com/18283622",
                "18283622","https://media-cdn.tripadvisor.com/media/photo-s/1a/a9/94/45/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("포탈라레스토랑", "ASIAN", "인도음식", "02-318-0094",
                "서울 종로구 관철동 35-2", "카레, 스프, 국수", "서울 종로구 청계천로 99", "http://place.map.kakao.com/11834063",
                "11834063","https://modo-phinf.pstatic.net/20181201_136/1543648648445496se_JPEG/mosazRWPN5.jpeg?type=a1100"));

        restaurantDtos.add(new RestaurantDto("뚝배기집", "KOREAN", "찌개전골", "02-2265-5744",
                "서울 종로구 관철동 5-1", "우렁된장, 된장찌개, 순두부", "서울 종로구 종로16길 12", "http://place.map.kakao.com/10374336",
                "10374336","https://mblogthumb-phinf.pstatic.net/MjAxODA1MjlfMjcy/MDAxNTI3NTUyOTA0MTA2.5-hNYc39kEPiiyJqd_yws_bXucW8eutfvf4sqQwzQa0g.3ZzwYW4hl4ysIGA0hbMQ9cOmCcm5NdGDWfaEdbue0lUg.JPEG.sherinks/20180527_185701.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("더피자필", "WESTERN", "피자", "02-795-3283",
                "서울 종로구 관철동 42-4", "마르게리따, 페페로니, 슈프림", "서울 종로구 종로10길 21", "http://place.map.kakao.com/1397192634",
                "1397192634","http://www.seoulwire.com/news/photo/201810/31169_25058_17.jpg"));

        restaurantDtos.add(new RestaurantDto("장수촌", "KOREAN", "해물생선장어", "02-722-3149",
                "서울 종로구 관철동 7-5", "장어 소금 구이, 바지락칼국수", "서울 종로구 삼일대로17길 8", "http://place.map.kakao.com/221545425",
                "221545425","https://t1.daumcdn.net/cfile/tistory/994E93345BFF35F733"));

        restaurantDtos.add(new RestaurantDto("신촌황소곱창", "KOREAN", "곱창막창", "02-735-6698",
                "서울 종로구 관철동 12-23", "황소곱창, 대창, 막창", "서울 종로구 삼일대로17길 17", "http://place.map.kakao.com/9631798",
                "9631798","https://mblogthumb-phinf.pstatic.net/MjAxNzExMTlfMTUg/MDAxNTExMDIwMjk0NDQ1.KM9dSD3E9Y3CT_Kjn1tdeRsDi-pQ4v89YPQYurjOaecg.uQf8IItml3XGLaB6HTJ-TvV5KKb66-ZTVSgWZGKEc6wg.JPEG.h00000n/IMG_5015.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("반쿤콴", "ASIAN", "태국음식", "02-725-1688",
                "서울 종로구 관철동 43-7", "태국식 소고기 쌀국수, 카오팟", "서울 종로구 종로10길 20", "http://place.map.kakao.com/208592301",
                "208592301","https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20180219014039886_photo0_087b3dd4c395.jpg"));

        restaurantDtos.add(new RestaurantDto("미도갈비", "KOREAN", "육류고기", "02-725-9233",
                "서울 종로구 관철동 11-13", "고베모듬, 오겹살", "서울 종로구 삼일대로15길 25", "http://place.map.kakao.com/1969790364",
                "1969790364","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROHOQfJlJmOFXw1OAa8ucN8z1Zso_jbUTaEw&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("미친닭", "KOREAN", "치킨", "02-722-9992",
                "서울 종로구 관철동 44-1", "미친통쌈닥, 순살콤보", "서울 종로구 우정국로2길 16", "http://place.map.kakao.com/26884480",
                "26884480","https://mblogthumb-phinf.pstatic.net/MjAxNzA1MTZfMzIg/MDAxNDk0OTIzNTY5NDMz.NuPqvJEoe-JDJO3B1bvyfE-eCeGsWots9uXkLkeGJc4g.-sQLWWJiCzzFWtCGJCYFnwQeoKRc6ML3rgP5ohQwVR8g.JPEG.22woom/KakaoTalk_20170516_172037615%EC%A2%85%EB%A1%9C%EB%A7%9B%EC%A7%91%EC%A2%85%EB%A1%9C%EB%AF%B8%EC%B9%9C%EB%8B%AD_%EC%A2%85%EA%B0%81%EB%A7%9B%EC%A7%91%EC%A2%85%EA%B0%81%EC%97%AD%EB%A7%9B%EC%A7%91_%EC%A2%85%EB%A1%9C%EC%B9%98%ED%82%A8%EC%A7%91_%EC%A2%85.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("원조우정낙지", "KOREAN", "해물생선", "02-720-7991",
                "서울 종로구 관철동 19-16", "낚지볶음, 감자탕", "서울 종로구 삼일대로17길 46", "http://place.map.kakao.com/8458646",
                "8458646","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGfiQVRuEvdbUPddu28qWm4tCXql57VCcs7w&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("대찬횟집", "KOREAN", "해물생선회", "02-738-8588",
                "서울 종로구 관철동 256", "모듬회, 활어회", "서울 종로구 우정국로2길 10", "http://place.map.kakao.com/27491757",
                "27491757","https://t1.daumcdn.net/cfile/tistory/993DAF415E108D5C0A"));

        restaurantDtos.add(new RestaurantDto("교대이층집", "KOREAN", "육류고기", "02-732-8188",
                "서울 종로구 관철동 14-1", "통삼겹, 통목살", "서울 종로구 삼일대로19길 16", "http://place.map.kakao.com/170372666",
                "170372666","https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/707338_1492362614652656.jpg"));

        restaurantDtos.add(new RestaurantDto("일편등심", "KOREAN", "육류고기", "070-4104-9922",
                "서울 종로구 관철동 180", "한우 눈꽃 등심, 안심", "서울 종로구 삼일대로17길 51", "http://place.map.kakao.com/916261841",
                "916261841","https://static.hubzum.zumst.com/hubzum/2020/11/12/09/06cfa004abc84093ab683f5ce7b5bd45.jpg"));

        restaurantDtos.add(new RestaurantDto("종로양꼬치", "CHINESE", "양꼬치", "02-720-8168",
                "서울 종로구 관철동 13-7", "양모듬, 고급양갈비", "서울 종로구 삼일대로17길 20-2", "http://place.map.kakao.com/15864091",
                "15864091","http://cdn.ksilbo.co.kr/news/photo/201904/691501_364918_269.jpg"));

        restaurantDtos.add(new RestaurantDto("당산오돌", "KOREAN", "육류고기", "02-723-3590",
                "서울 종로구 관철동 44-5", "꼬들살, 눈꽃갈비", "서울 종로구 종로8길 20", "http://place.map.kakao.com/3678525",
                "3678525","https://emmaru.com/matzip/include/pics/2020/01/21/m_19852O213741_7.jpg"));

        restaurantDtos.add(new RestaurantDto("오로지라멘", "JAPANESE", "일본식라면", "02-733-9279",
                "서울 종로구 관철동 13-2", "돈코츠라멘, 오로지라멘", "서울 종로구 종로14길 16", "http://place.map.kakao.com/1414375847",
                "1414375847","https://t1.daumcdn.net/cfile/tistory/99EF96375CE16DF009"));

        restaurantDtos.add(new RestaurantDto("왕비집", "KOREAN", "육류고기", "02-720-3066",
                "서울 종로구 관철동 12-11", "소갈비정식, 한우불고기정식", "서울 종로구 삼일대로15길 24", "http://place.map.kakao.com/15232887",
                "15232887","https://media-cdn.tripadvisor.com/media/photo-s/07/ff/ac/d7/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("고메식당", "KOREAN", "육류고기", "02-723-0999",
                "서울 종로구 관철동 43-5", "이베리코 돼지 꽃목살, 명품 숙성 삼겹살", "서울 종로구 종로10길 14", "http://place.map.kakao.com/2131396403",
                "2131396403","https://mblogthumb-phinf.pstatic.net/MjAxNzA3MTdfMjA4/MDAxNTAwMjU4Mzk0OTE1.Zodr30xmueDpTJWHB8T6N_BYQdS4A_a8hCtDDvu_K0Qg.22FaJZp-zsGm1b4rj4J0MX9ZKqu9HZCVgcIOSoEmFKwg.JPEG.dieunjjang/image_955702301500258372498.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("싱싱해물나라", "KOREAN", "해물생선회", "02-733-1226",
                "서울 종로구 관철동 11-1", "활고등어회, 갈고회, 광고회", "서울 종로구 삼일대로15길 13", "http://place.map.kakao.com/7977978",
                "7977978","https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20211019104417_photo1_Nm0ULH5g8GOd.jpg"));

        restaurantDtos.add(new RestaurantDto("촌놈숯불닭갈비", "KOREAN", "치킨", "02-722-3852",
                "서울 종로구 관철동 6-4", "닭목살구이, 허브숙성양념", "서울 종로구 삼일대로19길 6", "http://place.map.kakao.com/1750296031",
                "1750296031","https://mblogthumb-phinf.pstatic.net/MjAxOTA5MjhfMjIg/MDAxNTY5Njc3NTM5MTcx.WZ4M7VVgCSN_cgnzFLwJKOVpmPLHVn0Z4yaSOFHKWvUg.3Xy8rKF71HPWDM2QP_vRUlGeCVSUq92otg4AIOVy-1Qg.JPEG.7533004/%EC%B4%8C%EB%86%88%EC%88%AF%EB%B6%88%EB%8B%AD%EA%B0%88%EB%B9%84.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("차돌박힌쭈꾸미", "KOREAN", "해물생선", "02-732-8806",
                "서울 종로구 관철동 175", "쭈꾸미 덮밥, 차쭈스페셜구이 세트", "서울 종로구 삼일대로17길 47-1", "http://place.map.kakao.com/26432860",
                "26432860","https://mblogthumb-phinf.pstatic.net/MjAyMDAzMjRfMjAy/MDAxNTg1MDQ4NTEzNjEy.Ww2o2mUBjJzzvWV5k68NTNx3HXoUpN0e9dJ45nJpHLkg.vu4vF1hMhDENgJ6y8x5nUJeYFPzvCIc8MHUTn5vR5mYg.JPEG.noty9240/1585048513241.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("종로황소곱창", "KOREAN", "곱창막창", "02-723-5157",
                "서울 종로구 관철동 18-8", "소곱창구이, 냉면", "서울 종로구 우정국로2길 31", "http://place.map.kakao.com/21396905",
                "21396905","https://d2uja84sd90jmv.cloudfront.net/posts/LJ_IYGvldp6xqfk7mQhaKw/m.jpg"));

        restaurantDtos.add(new RestaurantDto("이강순실비집", "KOREAN", "해물생선", "02-737-7880",
                "서울 종로구 관철동 11-11", "산낙지볶음, 낙지볶음", "서울 종로구 청계천로 75-1", "http://place.map.kakao.com/27146280",
                "27146280","https://t1.daumcdn.net/cfile/tistory/253EDF3F532338B30A"));

        return restaurantDtos;
    }

}
