package SINGLETON;

public class DBConnectionEAGER {
    private static DBConnectionEAGER connectionEAGER = new DBConnectionEAGER();

    private DBConnectionEAGER() {}

    public static DBConnectionEAGER getInstance()
    {
        return connectionEAGER;
    }

    //Even if it is not used it gets initialized  at start time.
}

class Main {
    public static void main(String args[])
    {
        DBConnectionEAGER connectionEAGER = DBConnectionEAGER.getInstance();
        System.out.println(connectionEAGER.hashCode());
    }
}
