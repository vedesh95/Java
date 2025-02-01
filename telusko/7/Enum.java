enum Status{
    Failed("red"), Running("blue"), Aborted("gray"), Pending("yellow"), Success("green"), Queued;
    private String color;

    private Status(){
        this.color = "black"; 
    }
    private Status(String color){
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

public class Enum {
    public static void main(String args[]){
        Status s = Status.Failed;
        System.out.println(s);

        Status ss [] = Status.values();
        for(Status i: ss){
            System.out.println(i + " " + i.ordinal() + " " + i.getColor());
        }

        /*
         * enum is also a class
         * ordinal to get index of enum
         * .vlaues()
         * even though enum is a class you cannot extend any other classes
         */
    }
}
