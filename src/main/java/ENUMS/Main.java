package ENUMS;

public class Main {
    public static void main(String args[])
    {
        Days days = Days.getDaysFromValue(107);
        System.out.println(days.getComment());

        EnumSample enumSample = EnumSample.FRIDAY;
        enumSample.dummyMethod();

        EnumAbstract enumAbstract = EnumAbstract.MONDAY;
        enumAbstract.dummyMethod();

        EnumInterface enumInterface = EnumInterface.FRIDAY;
        System.out.println(enumInterface.toLowerCase());
    }
}
