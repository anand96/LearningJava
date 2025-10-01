package ENUMS;

public enum EnumAbstract {

    MONDAY {
        public String dummyMethod() {
            System.out.println("in Monday Method");
            return null;
        }
    },
    TUESDAY {
        public String dummyMethod() {
            System.out.println("in Tuesday Method");
            return null;
        }
    },
    WEDNESDAY {
        public String dummyMethod() {
            System.out.println("in Wednesday Method");
            return null;
        }
    },
    THURSDAY {
        public String dummyMethod() {
            System.out.println("in Thursday Method");
            return null;
        }
    };

    public abstract String dummyMethod();
}


