/**
 * Created by puvn on 12.04.16.
 */
public class Sun {
    private volatile static Sun sun;

    private Sun() {
    }

    public static Sun getInstance() {
        if (sun == null) {
            synchronized (Sun.class) {
                if (sun == null)
                    sun = new Sun();
            }
        }
        return sun;
    }

}
