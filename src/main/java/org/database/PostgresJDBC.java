package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresJDBC {
public void  connection(){
    System.out.println("-------- PostgreSQL "
            + "JDBC Connection Testing ------------");




    //  you should first create app db by terminal psql
    try {

        Class.forName("org.postgresql.Driver");

    } catch (ClassNotFoundException e) {

        System.out.println("Where is your PostgreSQL JDBC Driver? "
                + "Include in your library path!");
        e.printStackTrace();
        return;

    }

    System.out.println("PostgreSQL JDBC Driver Registered!");

    Connection connection = null;

    try {

        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/app",  "ahmedfatnassi",
                "0000");

    } catch (SQLException e) {

        System.out.println("Connection Failed! Check output console");
        e.printStackTrace();
        return;

    }

    if (connection != null) {
        System.out.println("You made it, take control your database now!");
    } else {
        System.out.println("Failed to make connection!");
    }

}
}
