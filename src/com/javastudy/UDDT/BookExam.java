package com.javastudy.UDDT;

public class BookExam {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "패스트캠퍼스";
        b.author = "박매일";
        b.page = 700;
        b.isbn = "ISBN - 111990011";
        System.out.println(b.title + "\t" + b.price
                + "\t" + b.company + "\t" + b.author
                + "\t" + b.page + "\t" + b.isbn);
    }
}
