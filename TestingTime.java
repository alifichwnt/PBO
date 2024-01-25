public class TestingTime {
    public static void main(String[] args) {
        // Contoh penggunaan
        Time time = new Time(10, 0, 30);
        System.out.println("Current Time: " + time);

        // Next second
        time.nextSecond();
        System.out.println("Next Second: " + time);

        // Previous second
        time.previousSecond();
        System.out.println("Previous Second: " + time);
    }
}