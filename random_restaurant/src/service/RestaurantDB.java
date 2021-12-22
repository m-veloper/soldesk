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
                "2053098478"));

        restaurantDtos.add(new RestaurantDto("�������", "�߽�", "��ȭ�丮", "070-4213-5678",
                "���� ���α� ��ö�� 11-11", "������(Ư), ������", "���� ���α� û��õ�� 75-2", "http://place.map.kakao.com/2143988257",
                "2143988257"));

        restaurantDtos.add(new RestaurantDto("��������", "�Ͻ�", "�ʹ�,��", "02-730-1477",
                "���� ���α� ��ö�� 19-1", "���� Ư�� �ʹ�, ȸ���ʹ�", "���� ���α� ����12�� 14", "http://place.map.kakao.com/15204021",
                "15204021"));

        restaurantDtos.add(new RestaurantDto("�翬ȭ��", "�ѽ�", "����,���", "02-3210-0808",
                "���� ���α� ��ö�� 13-5", "����, Ư���, ���긮��", "���� ���α� ���ϴ��17�� 18", "http://place.map.kakao.com/1619274444",
                "1619274444"));

        restaurantDtos.add(new RestaurantDto("�ŵ�����", "�ѽ�", "����,���", "02-739-8114",
                "���� ���α� ��ö�� 180", "SGP ����, SGP�����", "���� ���α� ���ϴ��17�� 51", "http://place.map.kakao.com/811272424",
                "811272424"));

        restaurantDtos.add(new RestaurantDto("�Ѹ��Ľ�Ÿ", "���", "��Ż����", "02-2261-5973",
                "���� ���α� ��ö�� 5-5", "ũ�� ���� �Ľ�Ÿ, �ſ� ũ�� �Ľ�Ÿ", "���� ���α� ���ϴ�� 392", "http://place.map.kakao.com/829236335",
                "829236335"));

        restaurantDtos.add(new RestaurantDto("���ε��θ�", "�Ͻ�", "���θ�", "02-722-2384",
                "���� ���α� ��ö�� 7-15", "������, �ͽ�������, �Ե�", "���� ���α� ���ϴ�� 385", "http://place.map.kakao.com/24725107",
                "24725107"));

        restaurantDtos.add(new RestaurantDto("VIP��ġ", "�Ͻ�", "��ġȸ", "02-720-3888",
                "���� ���α� ��ö�� 11-13", "����Ư�� ��ġ ����", "���� ���α� ���ϴ��15�� 25", "http://place.map.kakao.com/149543887",
                "149543887"));

        restaurantDtos.add(new RestaurantDto("Ȳ�Ұ���", "�ѽ�", "����,���", "02-722-5747",
                "���� ���α� ��ö�� 11-11", "������ �Ұ�� ���", "���� ���α� û��õ�� 75-1", "http://place.map.kakao.com/8696442",
                "8696442"));

        restaurantDtos.add(new RestaurantDto("�����8292", "�ѽ�", "����,���", "0507-1389-8384",
                "���� ���α� ��ö�� 43-13", "�������, �η�ġ��", "���� ���α� ����8�� 17", "http://place.map.kakao.com/735673283",
                "735673283"));

        restaurantDtos.add(new RestaurantDto("���޵���", "�ѽ�", "����,���", "02-737-5201",
                "���� ���α� ��ö�� 43-15", "������ ���� ����, �δ��", "���� ���α� ����8�� 15", "http://place.map.kakao.com/650374759",
                "650374759"));

        restaurantDtos.add(new RestaurantDto("���빮����ȸ��", "�ѽ�", "�ع�����ȸ", "02-737-5115",
                "���� ���α� ��ö�� 263", "Ȱ��ȸ", "���� ���α� �������� 4-1", "http://place.map.kakao.com/13272050",
                "13272050"));

        restaurantDtos.add(new RestaurantDto("���κҵ���", "�ѽ�", "�������", "02-734-1190",
                "���� ���α� ��ö�� 155", "������, �ҵ���", "���� ���α� û��õ�� 67", "http://place.map.kakao.com/17278908",
                "17278908"));

        restaurantDtos.add(new RestaurantDto("�����", "���", "��Ż����", "02-739-8208",
                "���� ���α� ��ö�� 19-11", "�Ľ�Ÿ, ������, ȭ������", "���� ���α� ��������2�� 42", "http://place.map.kakao.com/18283622",
                "18283622"));

        restaurantDtos.add(new RestaurantDto("��Ż�󷹽����", "�ƽþ�����", "�ε�����", "02-318-0094",
                "���� ���α� ��ö�� 35-2", "ī��, ����, ����", "���� ���α� û��õ�� 99", "http://place.map.kakao.com/11834063",
                "11834063"));

        restaurantDtos.add(new RestaurantDto("�ҹ����", "�ѽ�", "�����", "02-2265-5744",
                "���� ���α� ��ö�� 5-1", "�췷����, �����, ���κ�", "���� ���α� ����16�� 12", "http://place.map.kakao.com/10374336",
                "10374336"));

        restaurantDtos.add(new RestaurantDto("��������", "���", "����", "02-795-3283",
                "���� ���α� ��ö�� 42-4", "�����Ը���, ����δ�, ������", "���� ���α� ����10�� 21", "http://place.map.kakao.com/1397192634",
                "1397192634"));

        restaurantDtos.add(new RestaurantDto("�����", "�ѽ�", "�ع��������", "02-722-3149",
                "���� ���α� ��ö�� 7-5", "��� �ұ� ����, ������Į����", "���� ���α� ���ϴ��17�� 8", "http://place.map.kakao.com/221545425",
                "221545425"));

        restaurantDtos.add(new RestaurantDto("����Ȳ�Ұ�â", "�ѽ�", "��â��â", "02-735-6698",
                "���� ���α� ��ö�� 12-23", "Ȳ�Ұ�â, ��â, ��â", "���� ���α� ���ϴ��17�� 17", "http://place.map.kakao.com/9631798",
                "9631798"));

        restaurantDtos.add(new RestaurantDto("������", "�ƽþ�����", "�±�����", "02-725-1688",
                "���� ���α� ��ö�� 43-7", "�±��� �Ұ�� �ұ���, ī����", "���� ���α� ����10�� 20", "http://place.map.kakao.com/208592301",
                "208592301"));

        restaurantDtos.add(new RestaurantDto("�̵�����", "�ѽ�", "�������", "02-725-9233",
                "���� ���α� ��ö�� 11-13", "�����, �����", "���� ���α� ���ϴ��15�� 25", "http://place.map.kakao.com/1969790364",
                "1969790364"));

        restaurantDtos.add(new RestaurantDto("��ģ��", "�ѽ�", "ġŲ", "02-722-9992",
                "���� ���α� ��ö�� 44-1", "��ģ��Ӵ�, �����޺�", "���� ���α� ��������2�� 16", "http://place.map.kakao.com/26884480",
                "26884480"));

        restaurantDtos.add(new RestaurantDto("������������", "�ѽ�", "�ع�����", "02-720-7991",
                "���� ���α� ��ö�� 19-16", "��������, ������", "���� ���α� ���ϴ��17�� 46", "http://place.map.kakao.com/8458646",
                "8458646"));

        restaurantDtos.add(new RestaurantDto("����Ƚ��", "�ѽ�", "�ع�����ȸ", "02-738-8588",
                "���� ���α� ��ö�� 256", "���ȸ, Ȱ��ȸ", "���� ���α� ��������2�� 10", "http://place.map.kakao.com/27491757",
                "27491757"));

        restaurantDtos.add(new RestaurantDto("����������", "�ѽ�", "�������", "02-732-8188",
                "���� ���α� ��ö�� 14-1", "����, ����", "���� ���α� ���ϴ��19�� 16", "http://place.map.kakao.com/170372666",
                "170372666"));

        restaurantDtos.add(new RestaurantDto("������", "�ѽ�", "�������", "070-4104-9922",
                "���� ���α� ��ö�� 180", "�ѿ� ���� ���, �Ƚ�", "���� ���α� ���ϴ��17�� 51", "http://place.map.kakao.com/916261841",
                "916261841"));

        restaurantDtos.add(new RestaurantDto("���ξ粿ġ", "�߽�", "�粿ġ", "02-720-8168",
                "���� ���α� ��ö�� 13-7", "����, ��޾簥��", "���� ���α� ���ϴ��17�� 20-2", "http://place.map.kakao.com/15864091",
                "15864091"));

        restaurantDtos.add(new RestaurantDto("������", "�ѽ�", "�������", "02-723-3590",
                "���� ���α� ��ö�� 44-5", "�����, ���ɰ���", "���� ���α� ����8�� 20", "http://place.map.kakao.com/3678525",
                "3678525"));

        restaurantDtos.add(new RestaurantDto("���������", "�Ͻ�", "�Ϻ��Ķ��", "02-733-9279",
                "���� ���α� ��ö�� 13-2", "���������, ���������", "���� ���α� ����14�� 16", "http://place.map.kakao.com/1414375847",
                "1414375847"));

        restaurantDtos.add(new RestaurantDto("�պ���", "�ѽ�", "�������", "02-720-3066",
                "���� ���α� ��ö�� 12-11", "�Ұ�������, �ѿ�Ұ������", "���� ���α� ���ϴ��15�� 24", "http://place.map.kakao.com/15232887",
                "15232887"));

        restaurantDtos.add(new RestaurantDto("��޽Ĵ�", "�ѽ�", "�������", "02-723-0999",
                "���� ���α� ��ö�� 43-5", "�̺����� ���� �ɸ��, ��ǰ ���� ����", "���� ���α� ����10�� 14", "http://place.map.kakao.com/2131396403",
                "2131396403"));

        restaurantDtos.add(new RestaurantDto("�̽��ع�����", "�ѽ�", "�ع�����ȸ", "02-733-1226",
                "���� ���α� ��ö�� 11-1", "Ȱ����ȸ, ����ȸ, ����ȸ", "���� ���α� ���ϴ��15�� 13", "http://place.map.kakao.com/7977978",
                "7977978"));

        restaurantDtos.add(new RestaurantDto("�̳𽡺Ҵ߰���", "�ѽ�", "ġŲ", "02-722-3852",
                "���� ���α� ��ö�� 6-4", "�߸�챸��, ���������", "���� ���α� ���ϴ��19�� 6", "http://place.map.kakao.com/1750296031",
                "1750296031"));

        restaurantDtos.add(new RestaurantDto("���������޲ٹ�", "�ѽ�", "�ع�����", "02-732-8806",
                "���� ���α� ��ö�� 175", "�޲ٹ� ����, ���޽���ȱ��� ��Ʈ", "���� ���α� ���ϴ��17�� 47-1", "http://place.map.kakao.com/26432860",
                "26432860"));

        restaurantDtos.add(new RestaurantDto("����Ȳ�Ұ�â", "�ѽ�", "��â��â", "02-723-5157",
                "���� ���α� ��ö�� 18-8", "�Ұ�â����, �ø�", "���� ���α� ��������2�� 31", "http://place.map.kakao.com/21396905",
                "21396905"));

        restaurantDtos.add(new RestaurantDto("�̰����Ǻ���", "�ѽ�", "�ع�����", "02-737-7880",
                "���� ���α� ��ö�� 11-11", "�곫������, ��������", "���� ���α� û��õ�� 75-1", "http://place.map.kakao.com/27146280",
                "27146280"));

        return restaurantDtos;
    }

}
