package com.javastudy.OthersAPI.StartModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExample {
    public static void main(String[] args) throws IOException {
        String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023-07-20";
        Document document = Jsoup.connect(url).get();

        try {
            Element bibleText = document.getElementById("bible_text");
            Element bibleInfoBox = document.getElementById("bibleinfo_box");

            System.out.println(bibleText.text());
            System.out.println(bibleInfoBox.text());

            Elements num = document.select(".num");
            Elements info = document.select(".info");

            for(int i = 0; i<num.size(); i++) {
                System.out.println(num.get(i).text() + ":" + info.get(i).text());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
