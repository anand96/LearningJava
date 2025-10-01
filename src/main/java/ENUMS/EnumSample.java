package ENUMS;

// enum with method override
public enum EnumSample {
    MONDAY{
        @Override
        public void dummyMethod() {
            System.out.println("Default Dummy Method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){
        System.out.println("Default Dummy Method");
    }
}
