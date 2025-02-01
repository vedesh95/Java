public class Parent {
    public int id;
    public String name;
    public Parent(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Parent [id=" + id + ", name=" + name + "]";
    }

    
}
