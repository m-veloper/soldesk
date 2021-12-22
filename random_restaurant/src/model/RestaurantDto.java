package model;

public class RestaurantDto {

    private String placeName;
    private String categoryName;
    private String categoryDetail;
    private String phone;
    private String addressName;
    private String placeBest;
    private String roadAddressName;
    private String placeUrl;
    private String id;

    public RestaurantDto(){

    }

    public RestaurantDto(String placeName, String categoryName, String categoryDetail, String phone, String addressName, String placeBest, String roadAddressName, String placeUrl, String id) {
        this.placeName = placeName;
        this.categoryName = categoryName;
        this.categoryDetail = categoryDetail;
        this.phone = phone;
        this.addressName = addressName;
        this.placeBest = placeBest;
        this.roadAddressName = roadAddressName;
        this.placeUrl = placeUrl;
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getPlaceBest() {
        return placeBest;
    }

    public void setPlaceBest(String placeBest) {
        this.placeBest = placeBest;
    }

    public String getRoadAddressName() {
        return roadAddressName;
    }

    public void setRoadAddressName(String roadAddressName) {
        this.roadAddressName = roadAddressName;
    }

    public String getPlaceUrl() {
        return placeUrl;
    }

    public void setPlaceUrl(String placeUrl) {
        this.placeUrl = placeUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ü ������ ���
     */
    public void print() {
        System.out.println("| ���� �̸� : " + placeName + "\t|");
        System.out.println("| ī�װ� : " + categoryName + " > " + categoryDetail + "\t|");
        System.out.println("| �ּ� : " + roadAddressName + "\t|");
        System.out.println("| ��ǥ �޴� : " + placeBest + "\t|");
        System.out.println("| ���� ����ó : " + phone + "\t|");
        System.out.println("| ��ũ : " + placeUrl + "\t|");

    }
}

