package repository;

import repository.util.DbConnector;
import user.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by developer on 30/10/2016.
 */
public class UserRepository {
    User addUser(User user){
        ResultSet resultSet;
        DbConnector dbConector=new DbConnector("jdbc:mysql://localhost:3306/devgraph","root","root");
        try {
           // resultSet=dbConector.getStatement().executeQuery("SELECT  FROM user where password='"+user.getPassword()+"'"+"OR id='" +user.getId()+"'");
//            if(resultSet.next())
//            {
//                throw new Exception();
//            }

            dbConector.getStatement().execute("INSERT INTO USER (id,firstName,lastName,mail,PASSWORD) VALUES(12`user`,\"dfgvfd\", \"vdvdf\",\"sdfcsd\",\"password\");");
        }
        catch (SQLException e){System.out.print("error unexpected Query");}
        return user;
    }
}
