package com.javastudy.Basic.Logical;

import com.javastudy.Basic.UDDT.Book;
import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book b = new Book();
        System.out.print("책 제목을 입력 하시오 : ");
        b.title = scan.nextLine();
        System.out.print("가격을 입력 하시오 : ");
        b.price = scan.nextInt();
        scan.nextLine();
        System.out.print("출판사를 입력 하시오 : ");
        b.company = scan.nextLine();
        System.out.print("저자를 입력 하시오 : ");
        b.author = scan.nextLine();
        System.out.print("페이지 수를 입력 하시오 : ");
        b.page = scan.nextInt();
        scan.nextLine();
        System.out.print("ISBN 번호를 입력 하시오 : ");
        b.isbn = scan.nextLine();

        scan.close();
        System.out.println(b.title + "\t" + b.price
                + "\t" + b.company + "\t" + b.author
                + "\t" + b.page + "\t" + b.isbn);
    }
}
