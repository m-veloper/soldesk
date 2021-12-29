package constant;

/**
 * 각 패널명을 정의합니다.
 */
public enum PanelCode {

    APP_BASE("appBase"),
    APP_START("appStart"),
    APP_MAIN("appMain"),
    APP_RANDOM("appRandom"),
    APP_CATEGORY("appCategory"),
    APP_RANDOM_RESULT("appRandomResult");

    private String value;

    PanelCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
