package lab6;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final int MILLISECONDS_PER_SECOND = 1000,SECONDS_PER_MINUTES = 60,
                MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24, TIME_ZONE = 7;
        long totalSeconds, totalMilliseconds, currentSecond, totalMinutes, currentMinute, totalHours, currentHour;

        //  totalNanoseconds = System.nanoTime();

        totalMilliseconds = System.currentTimeMillis();

        totalSeconds = totalMilliseconds/MILLISECONDS_PER_SECOND;
        currentSecond = totalSeconds % SECONDS_PER_MINUTES;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTES;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        currentHour = totalHours % HOURS_PER_DAY;

        System.out.println("Текущее время: " + (currentHour + TIME_ZONE) + ":" + currentMinute + ":" + currentSecond);
    }
}

