package StudentDomen;

import java.util.Comparator;

/**
 * Класс для сравнения пользователей с параметрическим типом T,
 * причем T может быть только потомком класса Пользователь, с добавлением
 * интерфейса для сравнения
 */
public class UserComparator<T extends User> implements Comparator<T> {
    /* перегрузка метода сравнения */
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }

}