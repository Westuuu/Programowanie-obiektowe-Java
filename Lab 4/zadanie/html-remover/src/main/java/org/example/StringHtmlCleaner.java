package org.example;
import org.jsoup.*;
import org.jsoup.nodes.*;

public class StringHtmlCleaner {
    public static String cleanHtml(String text1) {
        String textToClean = text1;
        Document document = Jsoup.parse(textToClean);
        String textWithoutHtml = document.text();
        return textWithoutHtml;
    }

}
