package com.company;

import java.sql.Connection;
import java.sql.DriverManager;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {

    public static void main(String[] args) {


        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "3715";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();

             ResultSet rs = st.executeQuery("select * from public.actor limit 3;")) {

            while (rs.next()) {

                System.out.print(rs.getInt(1));
                System.out.print(", ");
                System.out.println(rs.getString(2));
                System.out.print("\n ");
                System.out.println(rs.getString(3));

            }
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(ConnectDB.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}

