package SINGLETON;

public class DBConnectionBillPugh {

    private DBConnectionBillPugh()
    {
    }

    // Helper class created only when required hence used as a nested class so that cannot be used outside the class.
    private static class DBConnectionHelper{
        private static final DBConnectionBillPugh INSTANCE_OBJECT = new DBConnectionBillPugh();
    }

    public static DBConnectionBillPugh getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT;
    }
}
