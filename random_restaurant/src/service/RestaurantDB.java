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

        restaurantDtos.add(new RestaurantDto("�����ٿ�������", "�߽�", "��ȭ�丮", "02-723-7788",
                "���� ���α� ��ö�� 12-24", "������, ��������", "���� ���α� ���ϴ��17�� 15", "http://place.map.kakao.com/2053098478",
                "2053098478","https://mblogthumb-phinf.pstatic.net/MjAxOTAxMjdfMjg2/MDAxNTQ4NTc3NTE3ODA3.jyQh1Fb1ZaDOve3moocv4hNA1KRZZ5xqVtm6VKc72bAg.dv325fcLyIGnIgE_Va8Sn2RKWG2Omr6QgMN4n-4zcr4g.JPEG.tjgmlek86/20190123123624_IMG_2498-01-01.jpeg?type=w800"));

        restaurantDtos.add(new RestaurantDto("�������", "�߽�", "��ȭ�丮", "070-4213-5678",
                "���� ���α� ��ö�� 11-11", "������(Ư), ������", "���� ���α� û��õ�� 75-2", "http://place.map.kakao.com/2143988257",
                "2143988257","https://img.siksinhot.com/place/1605152744017465.PNG?w=307&h=300&c=Y"));

        restaurantDtos.add(new RestaurantDto("��������", "�Ͻ�", "�ʹ�,��", "02-730-1477",
                "���� ���α� ��ö�� 19-1", "���� Ư�� �ʹ�, ȸ���ʹ�", "���� ���α� ����12�� 14", "http://place.map.kakao.com/15204021",
                "15204021","https://media-cdn.tripadvisor.com/media/photo-s/12/05/3d/a2/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("�翬ȭ��", "�ѽ�", "����,���", "02-3210-0808",
                "���� ���α� ��ö�� 13-5", "����, Ư���, ���긮��", "���� ���α� ���ϴ��17�� 18", "http://place.map.kakao.com/1619274444",
                "1619274444","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTbDQhKh4uMunnB4EE5kH6Lu1OF4YpRJywpA&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("�ŵ�����", "�ѽ�", "����,���", "02-739-8114",
                "���� ���α� ��ö�� 180", "SGP ����, SGP�����", "���� ���α� ���ϴ��17�� 51", "http://place.map.kakao.com/811272424",
                "811272424","http://www.seoulwire.com/news/photo/201807/19120_14600_5630.jpg"));

        restaurantDtos.add(new RestaurantDto("�Ѹ��Ľ�Ÿ", "���", "��Ż����", "02-2261-5973",
                "���� ���α� ��ö�� 5-5", "ũ�� ���� �Ľ�Ÿ, �ſ� ũ�� �Ľ�Ÿ", "���� ���α� ���ϴ�� 392", "http://place.map.kakao.com/829236335",
                "829236335","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0w6gPHp_Q-I-qQf0zEulEOUmG5KK6zRmygzgNGx7aR-lHlLi_V1QNQsZtgW2MomVo3vk&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("���ε��θ�", "�Ͻ�", "���θ�", "02-722-2384",
                "���� ���α� ��ö�� 7-15", "������, �ͽ�������, �Ե�", "���� ���α� ���ϴ�� 385", "http://place.map.kakao.com/24725107",
                "24725107","https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/459460_1498928329342661.jpg"));

        restaurantDtos.add(new RestaurantDto("VIP��ġ", "�Ͻ�", "��ġȸ", "02-720-3888",
                "���� ���α� ��ö�� 11-13", "����Ư�� ��ġ ����", "���� ���α� ���ϴ��15�� 25", "http://place.map.kakao.com/149543887",
                "149543887","https://ssproxy.ucloudbiz.olleh.com/v1/AUTH_e59809eb-bdc9-44d7-9d8f-2e7f0e47ba91/post_card/67041_1592286979_uZtHVD65.jpg"));

        restaurantDtos.add(new RestaurantDto("Ȳ�Ұ���", "�ѽ�", "����,���", "02-722-5747",
                "���� ���α� ��ö�� 11-11", "������ �Ұ�� ���", "���� ���α� û��õ�� 75-1", "http://place.map.kakao.com/8696442",
                "8696442","https://img.siksinhot.com/place/1508728090055419.jpg"));

        restaurantDtos.add(new RestaurantDto("�����8292", "�ѽ�", "����,���", "0507-1389-8384",
                "���� ���α� ��ö�� 43-13", "�������, �η�ġ��", "���� ���α� ����8�� 17", "http://place.map.kakao.com/735673283",
                "735673283","https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjNfMTYg/MDAxNjAwODMzNTI1NzIz.FBvpIkAm8uopIJL-kKCXt3Dg03RSBmurjJ2DEtXZxu8g.7Ugue12BSZdKVLD2X2K_OM7CypMwMHMGtn5A0Cf9Kb8g.JPEG.lin1210/IMG_9661.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("���޵���", "�ѽ�", "����,���", "02-737-5201",
                "���� ���α� ��ö�� 43-15", "������ ���� ����, �δ��", "���� ���α� ����8�� 15", "http://place.map.kakao.com/650374759",
                "650374759","https://cdn.imweb.me/thumbnail/20200513/480e99982a163.png"));

        restaurantDtos.add(new RestaurantDto("���빮����ȸ��", "�ѽ�", "�ع�����ȸ", "02-737-5115",
                "���� ���α� ��ö�� 263", "Ȱ��ȸ", "���� ���α� �������� 4-1", "http://place.map.kakao.com/13272050",
                "13272050","https://mblogthumb-phinf.pstatic.net/20160601_249/bbi_yu_1464745684610p3cSv_PNG/tyle.io-CRpDviQwP8k8sZEJM-1_%2814%29.png?type=w800"));

        restaurantDtos.add(new RestaurantDto("���κҵ���", "�ѽ�", "�������", "02-734-1190",
                "���� ���α� ��ö�� 155", "������, �ҵ���", "���� ���α� û��õ�� 67", "http://place.map.kakao.com/17278908",
                "17278908","https://www.chadorri.com/wp-content/uploads/2013/08/20130812_127.jpg"));

        restaurantDtos.add(new RestaurantDto("�����", "���", "��Ż����", "02-739-8208",
                "���� ���α� ��ö�� 19-11", "�Ľ�Ÿ, ������, ȭ������", "���� ���α� ��������2�� 42", "http://place.map.kakao.com/18283622",
                "18283622","https://media-cdn.tripadvisor.com/media/photo-s/1a/a9/94/45/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("��Ż�󷹽����", "�ƽþ�����", "�ε�����", "02-318-0094",
                "���� ���α� ��ö�� 35-2", "ī��, ����, ����", "���� ���α� û��õ�� 99", "http://place.map.kakao.com/11834063",
                "11834063","https://modo-phinf.pstatic.net/20181201_136/1543648648445496se_JPEG/mosazRWPN5.jpeg?type=a1100"));

        restaurantDtos.add(new RestaurantDto("�ҹ����", "�ѽ�", "�����", "02-2265-5744",
                "���� ���α� ��ö�� 5-1", "�췷����, �����, ���κ�", "���� ���α� ����16�� 12", "http://place.map.kakao.com/10374336",
                "10374336","https://mblogthumb-phinf.pstatic.net/MjAxODA1MjlfMjcy/MDAxNTI3NTUyOTA0MTA2.5-hNYc39kEPiiyJqd_yws_bXucW8eutfvf4sqQwzQa0g.3ZzwYW4hl4ysIGA0hbMQ9cOmCcm5NdGDWfaEdbue0lUg.JPEG.sherinks/20180527_185701.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("��������", "���", "����", "02-795-3283",
                "���� ���α� ��ö�� 42-4", "�����Ը���, ����δ�, ������", "���� ���α� ����10�� 21", "http://place.map.kakao.com/1397192634",
                "1397192634","http://www.seoulwire.com/news/photo/201810/31169_25058_17.jpg"));

        restaurantDtos.add(new RestaurantDto("�����", "�ѽ�", "�ع��������", "02-722-3149",
                "���� ���α� ��ö�� 7-5", "��� �ұ� ����, ������Į����", "���� ���α� ���ϴ��17�� 8", "http://place.map.kakao.com/221545425",
                "221545425","https://t1.daumcdn.net/cfile/tistory/994E93345BFF35F733"));

        restaurantDtos.add(new RestaurantDto("����Ȳ�Ұ�â", "�ѽ�", "��â��â", "02-735-6698",
                "���� ���α� ��ö�� 12-23", "Ȳ�Ұ�â, ��â, ��â", "���� ���α� ���ϴ��17�� 17", "http://place.map.kakao.com/9631798",
                "9631798","https://mblogthumb-phinf.pstatic.net/MjAxNzExMTlfMTUg/MDAxNTExMDIwMjk0NDQ1.KM9dSD3E9Y3CT_Kjn1tdeRsDi-pQ4v89YPQYurjOaecg.uQf8IItml3XGLaB6HTJ-TvV5KKb66-ZTVSgWZGKEc6wg.JPEG.h00000n/IMG_5015.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("������", "�ƽþ�����", "�±�����", "02-725-1688",
                "���� ���α� ��ö�� 43-7", "�±��� �Ұ�� �ұ���, ī����", "���� ���α� ����10�� 20", "http://place.map.kakao.com/208592301",
                "208592301","https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20180219014039886_photo0_087b3dd4c395.jpg"));

        restaurantDtos.add(new RestaurantDto("�̵�����", "�ѽ�", "�������", "02-725-9233",
                "���� ���α� ��ö�� 11-13", "�����, �����", "���� ���α� ���ϴ��15�� 25", "http://place.map.kakao.com/1969790364",
                "1969790364","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROHOQfJlJmOFXw1OAa8ucN8z1Zso_jbUTaEw&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("��ģ��", "�ѽ�", "ġŲ", "02-722-9992",
                "���� ���α� ��ö�� 44-1", "��ģ��Ӵ�, �����޺�", "���� ���α� ��������2�� 16", "http://place.map.kakao.com/26884480",
                "26884480","https://mblogthumb-phinf.pstatic.net/MjAxNzA1MTZfMzIg/MDAxNDk0OTIzNTY5NDMz.NuPqvJEoe-JDJO3B1bvyfE-eCeGsWots9uXkLkeGJc4g.-sQLWWJiCzzFWtCGJCYFnwQeoKRc6ML3rgP5ohQwVR8g.JPEG.22woom/KakaoTalk_20170516_172037615%EC%A2%85%EB%A1%9C%EB%A7%9B%EC%A7%91%EC%A2%85%EB%A1%9C%EB%AF%B8%EC%B9%9C%EB%8B%AD_%EC%A2%85%EA%B0%81%EB%A7%9B%EC%A7%91%EC%A2%85%EA%B0%81%EC%97%AD%EB%A7%9B%EC%A7%91_%EC%A2%85%EB%A1%9C%EC%B9%98%ED%82%A8%EC%A7%91_%EC%A2%85.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("������������", "�ѽ�", "�ع�����", "02-720-7991",
                "���� ���α� ��ö�� 19-16", "��������, ������", "���� ���α� ���ϴ��17�� 46", "http://place.map.kakao.com/8458646",
                "8458646","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGfiQVRuEvdbUPddu28qWm4tCXql57VCcs7w&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("����Ƚ��", "�ѽ�", "�ع�����ȸ", "02-738-8588",
                "���� ���α� ��ö�� 256", "���ȸ, Ȱ��ȸ", "���� ���α� ��������2�� 10", "http://place.map.kakao.com/27491757",
                "27491757","https://t1.daumcdn.net/cfile/tistory/993DAF415E108D5C0A"));

        restaurantDtos.add(new RestaurantDto("����������", "�ѽ�", "�������", "02-732-8188",
                "���� ���α� ��ö�� 14-1", "����, ����", "���� ���α� ���ϴ��19�� 16", "http://place.map.kakao.com/170372666",
                "170372666","https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/707338_1492362614652656.jpg"));

        restaurantDtos.add(new RestaurantDto("������", "�ѽ�", "�������", "070-4104-9922",
                "���� ���α� ��ö�� 180", "�ѿ� ���� ���, �Ƚ�", "���� ���α� ���ϴ��17�� 51", "http://place.map.kakao.com/916261841",
                "916261841","https://static.hubzum.zumst.com/hubzum/2020/11/12/09/06cfa004abc84093ab683f5ce7b5bd45.jpg"));

        restaurantDtos.add(new RestaurantDto("���ξ粿ġ", "�߽�", "�粿ġ", "02-720-8168",
                "���� ���α� ��ö�� 13-7", "����, ��޾簥��", "���� ���α� ���ϴ��17�� 20-2", "http://place.map.kakao.com/15864091",
                "15864091","http://cdn.ksilbo.co.kr/news/photo/201904/691501_364918_269.jpg"));

        restaurantDtos.add(new RestaurantDto("������", "�ѽ�", "�������", "02-723-3590",
                "���� ���α� ��ö�� 44-5", "�����, ���ɰ���", "���� ���α� ����8�� 20", "http://place.map.kakao.com/3678525",
                "3678525","https://emmaru.com/matzip/include/pics/2020/01/21/m_19852O213741_7.jpg"));

        restaurantDtos.add(new RestaurantDto("���������", "�Ͻ�", "�Ϻ��Ķ��", "02-733-9279",
                "���� ���α� ��ö�� 13-2", "���������, ���������", "���� ���α� ����14�� 16", "http://place.map.kakao.com/1414375847",
                "1414375847","https://t1.daumcdn.net/cfile/tistory/99EF96375CE16DF009"));

        restaurantDtos.add(new RestaurantDto("�պ���", "�ѽ�", "�������", "02-720-3066",
                "���� ���α� ��ö�� 12-11", "�Ұ�������, �ѿ�Ұ������", "���� ���α� ���ϴ��15�� 24", "http://place.map.kakao.com/15232887",
                "15232887","https://media-cdn.tripadvisor.com/media/photo-s/07/ff/ac/d7/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("��޽Ĵ�", "�ѽ�", "�������", "02-723-0999",
                "���� ���α� ��ö�� 43-5", "�̺����� ���� �ɸ��, ��ǰ ���� ����", "���� ���α� ����10�� 14", "http://place.map.kakao.com/2131396403",
                "2131396403","https://mblogthumb-phinf.pstatic.net/MjAxNzA3MTdfMjA4/MDAxNTAwMjU4Mzk0OTE1.Zodr30xmueDpTJWHB8T6N_BYQdS4A_a8hCtDDvu_K0Qg.22FaJZp-zsGm1b4rj4J0MX9ZKqu9HZCVgcIOSoEmFKwg.JPEG.dieunjjang/image_955702301500258372498.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("�̽��ع�����", "�ѽ�", "�ع�����ȸ", "02-733-1226",
                "���� ���α� ��ö�� 11-1", "Ȱ����ȸ, ����ȸ, ����ȸ", "���� ���α� ���ϴ��15�� 13", "http://place.map.kakao.com/7977978",
                "7977978","https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20211019104417_photo1_Nm0ULH5g8GOd.jpg"));

        restaurantDtos.add(new RestaurantDto("�̳𽡺Ҵ߰���", "�ѽ�", "ġŲ", "02-722-3852",
                "���� ���α� ��ö�� 6-4", "�߸�챸��, ���������", "���� ���α� ���ϴ��19�� 6", "http://place.map.kakao.com/1750296031",
                "1750296031","https://mblogthumb-phinf.pstatic.net/MjAxOTA5MjhfMjIg/MDAxNTY5Njc3NTM5MTcx.WZ4M7VVgCSN_cgnzFLwJKOVpmPLHVn0Z4yaSOFHKWvUg.3Xy8rKF71HPWDM2QP_vRUlGeCVSUq92otg4AIOVy-1Qg.JPEG.7533004/%EC%B4%8C%EB%86%88%EC%88%AF%EB%B6%88%EB%8B%AD%EA%B0%88%EB%B9%84.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("���������޲ٹ�", "�ѽ�", "�ع�����", "02-732-8806",
                "���� ���α� ��ö�� 175", "�޲ٹ� ����, ���޽���ȱ��� ��Ʈ", "���� ���α� ���ϴ��17�� 47-1", "http://place.map.kakao.com/26432860",
                "26432860","https://mblogthumb-phinf.pstatic.net/MjAyMDAzMjRfMjAy/MDAxNTg1MDQ4NTEzNjEy.Ww2o2mUBjJzzvWV5k68NTNx3HXoUpN0e9dJ45nJpHLkg.vu4vF1hMhDENgJ6y8x5nUJeYFPzvCIc8MHUTn5vR5mYg.JPEG.noty9240/1585048513241.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("����Ȳ�Ұ�â", "�ѽ�", "��â��â", "02-723-5157",
                "���� ���α� ��ö�� 18-8", "�Ұ�â����, �ø�", "���� ���α� ��������2�� 31", "http://place.map.kakao.com/21396905",
                "21396905","https://d2uja84sd90jmv.cloudfront.net/posts/LJ_IYGvldp6xqfk7mQhaKw/m.jpg"));

        restaurantDtos.add(new RestaurantDto("�̰����Ǻ���", "�ѽ�", "�ع�����", "02-737-7880",
                "���� ���α� ��ö�� 11-11", "�곫������, ��������", "���� ���α� û��õ�� 75-1", "http://place.map.kakao.com/27146280",
                "27146280","https://t1.daumcdn.net/cfile/tistory/253EDF3F532338B30A"));

        return restaurantDtos;
    }

}
