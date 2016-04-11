/**
 * Created by puvn on 12.04.16.
 * Паттерн одиночка гарантирует, что в программе будет существовать только один экземпляр данного класса.
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("Getting sun");
        Sun.getInstance();
    }
}
