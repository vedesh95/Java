public class SwitchDemo {
    enum DAY{
        MONDAY,
        TUESDAY,
        WEDNESDAY
    }

    String getDesc(DAY day){
        switch (day){
            case MONDAY:
                return "first";
            case TUESDAY:
                return "lets work";
            case WEDNESDAY:
                return "lets review";
            default:
                return "default";
        }
    }

    public static void main(String[] args) {
        DAY day = DAY.WEDNESDAY;
        String desc = switch (day){
            case MONDAY -> "first";
            case TUESDAY -> "lets work";
            case WEDNESDAY -> {
//                some logic here
                yield "lets review";
            }
            default -> "default";
        };
        System.out.println(desc);
    }
}
