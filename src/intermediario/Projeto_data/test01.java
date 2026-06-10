package intermediario.Projeto_data;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class diasUlteis implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch (dayOfWeek) {
            case THURSDAY -> addDays = 4;
            case FRIDAY -> addDays = 3;
            case SATURDAY -> addDays = 2;
            default -> addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class test01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 1, 1);
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        LocalDate date2 = LocalDate.now().with(new diasUlteis());
        System.out.println(date2);
        System.out.println(date2.getDayOfWeek());
        date2 = LocalDate.of(2026,5,7).with(new diasUlteis());
        System.out.println(date2);
        System.out.println(date2.getDayOfWeek());
        date2 = LocalDate.of(2026,5,8).with(new diasUlteis());
        System.out.println(date2);
        System.out.println(date2.getDayOfWeek());
        date2 = LocalDate.of(2026,5,9).with(new diasUlteis());
        System.out.println(date2);
        System.out.println(date2.getDayOfWeek());
        date2 = LocalDate.of(2026,5,10).with(new diasUlteis());
        System.out.println(date2);
        System.out.println(date2.getDayOfWeek());
    }
}
