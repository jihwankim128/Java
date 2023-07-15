package com.javastudy.API.Model;

public class OracleDriver implements Conntection {
    public void getConnection(String url,
                              String username,
                              String password) {
        System.out.println("Oracle DB에 접속 시도");
    }
}
