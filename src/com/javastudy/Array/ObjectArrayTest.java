package com.javastudy.Array;
import com.javastudy.UDDT.Book;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        String[] title = {"자바", "공룡책", "패캠"};
        int[] price = {30000, 25000, 24000};
        String[] company = {"패스트캠퍼스", "OS", "FC"};
        String[] author = {"박매일", "누군가", "FC사장"};
        int[] page = {700, 500, 300};
        String[] isbn = {"111990011", "1010101", "202020"};

        for(int i = 0; i<b.length; i++) {
            b[i] = new Book();
            b[i].title = title[i];
            b[i].price = price[i];
            b[i].company = company[i];
            b[i].author = author[i];
            b[i].page = page[i];
            b[i].isbn = "ISBN - " + isbn[i];
        }

        for(int i = 0; i<b.length; i++) {
            System.out.println(b[i].title + "\t" + b[i].price
                    + "\t" + b[i].company + "\t" + b[i].author
                    + "\t" + b[i].page + "\t" + b[i].isbn);
        }
    }
}
