import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandomBankStatementDate {
    
    public Date getRandomDate() {
        // Set the range of years for random date generation
        int startYear = 2023;
        int endYear = 2030;

        // Create a Calendar instance and set it to a random date within the specified range
        Calendar calendar = Calendar.getInstance();
        int randomYear = startYear + new Random().nextInt(endYear - startYear + 1);
        int randomMonth = 1 + new Random().nextInt(12);
        int randomDay = 1 + new Random().nextInt(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        int randomHour = new Random().nextInt(24);
        int randomMinute = new Random().nextInt(60);

        calendar.set(randomYear, randomMonth - 1, randomDay, randomHour, randomMinute);

        // Return the generated random date
        return calendar.getTime();
    }
}
