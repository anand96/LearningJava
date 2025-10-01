package SINGLETON;

public class DBConnectionLAZY {
    private static DBConnectionLAZY connectionLAZY;

    private DBConnectionLAZY(){
    }

    public static DBConnectionLAZY getInstance(){
        //thread safety
        if(connectionLAZY == null)
        {
            connectionLAZY = new DBConnectionLAZY();
        }
        return connectionLAZY;
    }
    //Disadvantage 2 thread start at same time.
}
