package constant;

public enum Panels {

    APP_BASE("appBase"),
    APP_START("appStart"),
    APP_MAIN("appMain"),
    APP_RANDOM("appRandom"),
    APP_CATEGORY("appCategory"),
    APP_CATEGORY_COMMON("appCategoryCommon");

    private String value;

    Panels(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
