package utils;

import javax.swing.*;

public class HtmlUtils {

    public static String imgHtmlParser(String url){
        StringBuilder htmlParse = new StringBuilder();
        htmlParse.append("<HTML>");
        htmlParse.append("<body>");
        htmlParse.append("<div style='border-radius: 100px; border: 2px solid #68efb9;  width: 210px; height: 210px; padding: 5px;'>");
        htmlParse.append("<img width='270' height='270'  src=");
        htmlParse.append(url);
        htmlParse.append(">");
        htmlParse.append("</div>");
        htmlParse.append("</body>");
        htmlParse.append("</HTML>");
        return String.valueOf(htmlParse);
    }

    public static String labelHtmlParser(String text){
        StringBuilder htmlParse = new StringBuilder();
        htmlParse.append("<HTML>");
        htmlParse.append("<body>");
        htmlParse.append("<p style='color: #68efb9;'>");
        htmlParse.append(text);
        htmlParse.append("</p>");
        htmlParse.append("</body>");
        htmlParse.append("</HTML>");
        return String.valueOf(htmlParse);
    }

    public static String createImgHtml(String url){
        return imgHtmlParser(url);
    }

    public static String createLabelHtml(String url){
        return labelHtmlParser(url);
    }
}

