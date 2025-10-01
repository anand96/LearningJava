package SINGLETON;

public class DBConnetionSynch {
    private static DBConnetionSynch connetionSynch;

    private DBConnetionSynch()
    {

    }

    synchronized public static DBConnetionSynch getInstance()
    {
        if(connetionSynch==null)
        {
            connetionSynch = new DBConnetionSynch();
        }
        return connetionSynch;
    }
    // Disadvantage Lock is sequential hence the time taken for thread execution is more cause every time it is being used it will lock.
}
