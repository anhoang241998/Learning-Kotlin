public class Singleton11 {

    private static volatile Singleton11 instance = null;

    private Singleton11() {
    }

    public static Singleton11 getInstance() {
        if (instance == null) {
            synchronized (Singleton11.class) {
                if (instance == null) {
                    instance = new Singleton11();
                }
            }
        }
        return instance;
    }
}
