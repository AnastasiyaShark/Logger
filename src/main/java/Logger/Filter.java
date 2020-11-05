package Logger;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            int value = source.get(i);
            if (threshold > value) {
                logger.log(String.format("Элемент %d не проходит%n", value));
            } else {
                result.add(value);
                logger.log(String.format("Элемент %d проходит%n", value));
            }
        }
        logger.log(String.format("Прошло фильтр %d элемента из %d %n", result.size(), source.size()));

        logger.log(String.format("Выводим результат на экран.%n Отфильтрованный список:%s", result.toString()));

        return result;
    }
}
