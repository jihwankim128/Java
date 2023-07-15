package com.javastudy.API.Model;

public class MySQLDriver implements Conntection{
    public void getConnection(String url,
                              String username,
                              String password) {
        System.out.println("MYSQL DB에 접속 시도");
    }
}
