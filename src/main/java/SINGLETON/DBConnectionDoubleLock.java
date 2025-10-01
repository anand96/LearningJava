package SINGLETON;

public class DBConnectionDoubleLock {
    private static volatile DBConnectionDoubleLock dbConnectionDoubleLock;

    private DBConnectionDoubleLock()
    {

    }

    public static DBConnectionDoubleLock getInstance(){
        if(dbConnectionDoubleLock==null)
        {
            synchronized (DatabaseConnection.class){
                if(dbConnectionDoubleLock ==null)
                {
                    dbConnectionDoubleLock = new DBConnectionDoubleLock();
                }
            }
        }
        return dbConnectionDoubleLock;
    }
    //solve problem of concurrency
    // Still little slow
    // Disadvantage Memory Issue   Each core has cache access to Memory Issue (use of volatile solves the issue all reads happens from memory not cache).
}
