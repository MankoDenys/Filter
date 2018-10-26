import java.time.LocalDate;
import java.util.function.Predicate;

public class DateAfterPredicate implements Predicate<LocalDate> {

    private final LocalDate minDate;

    public DateAfterPredicate(LocalDate minDate) {
        this.minDate = minDate;
    }

    @Override
    public boolean test(LocalDate date) {
        return date.compareTo(minDate) > 0;
    }

    @Override
    public String toString() {
        return "DateAfterPredicate{" +
                "minDate=" + minDate +
                '}';
    }
}
