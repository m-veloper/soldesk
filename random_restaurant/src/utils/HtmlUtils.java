package utils;

import static constant.Constants.HTML;
import static constant.Constants.BODY;
import static constant.Constants.CLOSE_HTML;
import static constant.Constants.CLOSE_BODY;

public class HtmlUtils {

    /**
     * HTML, BODY를 제외한 태그는 바뀔 수도 있기 때문에 정의하지 않음.
     * @param url
     * @return
     */
    public static String imgHtmlParser(String url) {
        StringBuilder htmlParse = new StringBuilder();
        htmlParse.append(HTML);
        htmlParse.append(BODY);
        htmlParse.append("<div style='border-radius: 100px; border: 2px solid #ffcdf9;  width: 210px; height: 210px; padding: 5px;'>");
        htmlParse.append("<img width='270' height='270'  src=");
        htmlParse.append(url);
        htmlParse.append(">");
        htmlParse.append("</div>");
        htmlParse.append(CLOSE_BODY);
        htmlParse.append(CLOSE_HTML);
        return String.valueOf(htmlParse);
    }

    public static String labelHtmlParser(String text) {
        StringBuilder htmlParse = new StringBuilder();
        htmlParse.append(HTML);
        htmlParse.append(BODY);
        htmlParse.append("<p style='color: #ffcdf9;'>");
        htmlParse.append(text);
        htmlParse.append("</p>");
        htmlParse.append(CLOSE_BODY);
        htmlParse.append(CLOSE_HTML);
        return String.valueOf(htmlParse);
    }

    public static String createImgHtml(String url) {
        return imgHtmlParser(url);
    }

    public static String createLabelHtml(String url) {
        return labelHtmlParser(url);
    }

}

