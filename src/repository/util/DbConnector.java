/**
 * Created by developer on 30/10/2016.
 */

package repository.util;
        import com.mysql.cj.api.jdbc.Statement;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.SQLException;

public class DbConnector {
    private Connection connection;
    private Statement statement;
    public DbConnector(final String URL,final String PASSWORD,final String LOGIN)
    {
        try {
            connection =  DriverManager.getConnection(URL, PASSWORD, LOGIN);
            statement = (Statement) connection.createStatement();

        }
        catch (SQLException e){
            System.out.print("error connect db");
        }
    }
    public Statement getStatement(){
        return statement;
    }
    public void close(){
        try {
            connection.close();
            statement.close();
        }
        catch (SQLException e){
            System.out.print("error connect db");
        }
    }


}