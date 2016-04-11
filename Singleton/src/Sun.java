/**
 * Created by puvn on 12.04.16.
 */
public class Sun {
    private volatile static Sun uniqueSun;

    private Sun() {
    }

    public static Sun getInstance() {
        if (uniqueSun == null) {
            synchronized (Sun.class) {
                if (uniqueSun == null)
                    uniqueSun = new Sun();
            }
        }
        return uniqueSun;
    }

}
