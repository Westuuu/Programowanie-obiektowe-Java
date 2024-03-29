package org.example;


public class Application {
    public static void main(String[] args){

        String url = args[0];

        String downloaded = PageDownloadingUtility.download(url);
        String cleaned = StringHtmlCleaner.cleanHtml(downloaded);
        System.out.println(cleaned);
    }
}
