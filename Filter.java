import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> predicList = new ArrayList<T>();
        for(T elem : list) {
            if (predicate.test(elem)) {
                predicList.add(elem);
            }
        }
        return predicList;
    }
}
