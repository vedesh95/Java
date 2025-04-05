enum EnumSample{
    MONDAY,
    TUESDAY,
    WEDNESDAY
}

enum Week implements EnumInterface{
    MONDAY(101, "first"){
        @Override
        public void dummyMethdod(){
            System.out.println("override - this is dummy method");
        }
        public void implement(){}
    },
    TUESDAY(102,"second"){
        public void implement(){}
    },
    WEDNESDAY(103, "third"){
        public void implement(){}
    };

    private int id;
    private String desc;
    Week(int id, String desc){
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public static Week getEnumFromValue(int value){
        for(Week day: Week.values()){
            if(day.getId() == value){
                return day;
            }
        }
        return null;
    }

    public void dummyMethdod(){
        System.out.println("this is dummy method");
    }

    public abstract void implement();
    @Override
    public String getLowercase(){
        return this.name().toLowerCase();
    }
}

public class EnumDemo{
    public static void main(String[] args) {
        for(EnumSample enumSample: EnumSample.values()){
            System.out.println(enumSample.name() + " " + enumSample.ordinal());
        }
        System.out.println(EnumSample.valueOf("MONDAY"));

        System.out.println(Week.getEnumFromValue(101));

        Week monday = Week.MONDAY;
        monday.dummyMethdod();
        System.out.println(monday.getLowercase());
    }

}