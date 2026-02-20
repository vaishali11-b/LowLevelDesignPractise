
// Singleton Design Pattern Example in Java
//It is created when we want to ensure that only one instance of a class is created and provide a global point of access to that instance.
//uses: Logger, Configuration Manager, Database Connection Pool, etc.
//Four ways to implement Singleton Design Pattern in Java:
//1. Eager Initialization
//2. Lazy Initialization
//3. Synchronized Method
//4. Double-Checked Locking


public class SingletonExample {
// Lazy Initialization Singleton Example , not thread-safe.
class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void someMethod() {
        System.out.println("Executing some method in Singleton instance.");
    }
} 
//Eager Initialization Singleton Example , it is thread-safe but may lead to resource wastage if the instance is never used.
class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void someMethod() {
        System.out.println("Executing some method in Singleton instance.");
    }
}
//Synchronized Method Singleton Example , it is thread-safe but can be slow due to synchronization overhead.
class Singleton {
    private static Singleton instance;
    private Singleton() {
        // Private constructor to prevent instantiation
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
//Double-Checked Locking Singleton Example , it is thread-safe and efficient, but can be complex to implement correctly.
class Singleton {
    private static volatile Singleton instance;
    private Singleton() {
        // Private constructor to prevent instantiation
    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }        
        return instance;
    }
}
 public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(); 
    }
}  