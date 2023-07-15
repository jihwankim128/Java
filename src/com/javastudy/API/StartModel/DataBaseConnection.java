package com.javastudy.API.StartModel;

import com.javastudy.API.Model.Conntection;
import com.javastudy.API.Model.MySQLDriver;
import com.javastudy.API.Model.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        Conntection conn = new OracleDriver();
        conn.getConnection("url", "jihwan", "1234");

        conn = new MySQLDriver();
        conn.getConnection("url", "jihwan", "1535");
    }
}
