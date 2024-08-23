package Singleton;

public class Singleton {
    static Singleton instance;
    String name;

    private Singleton(String n) {
        name = n;
    }
    public static Singleton getInstance(String s) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton(s);
            }
        }
        return instance;
    }
}
