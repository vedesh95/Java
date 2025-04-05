//eager
//public class Cache {
//    public static Cache cache = new Cache();
//    private Cache(){
//        System.out.println("initialized");
//    }
//    public static Cache getCache(){
//        return cache;
//    }
//}

//lazy
//public class Cache {
//    public static Cache cache;
//    private Cache(){
//        System.out.println("initialized");
//    }
//    public static Cache getCache(){
//        if(cache == null){
//            cache = new Cache();
//        }
//        return cache;
//    }
//}

//synchronized
//public class Cache {
//    public static Cache cache;
//    private Cache(){
//        System.out.println("initialized");
//    }
//    synchronized public static Cache getCache(){
//        if(cache == null){
//            cache = new Cache();
//        }
//        return cache;
//    }
//}

//volatile
public class Cache {
    public static volatile Cache cache;
    private Cache(){
        System.out.println("initialized");
    }
    synchronized public static Cache getCache(){
        if(cache == null){
            cache = new Cache();
        }
        return cache;
    }
}

//immutable
