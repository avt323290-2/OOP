package StudentDomen;

import java.util.List;

/**
 * Обобщенный класс AverageAge для подсчета среднего возраста студентов,
 * учителей и работников
 */
public class AverageAge<T extends User> {
  // поле люди
  private List<T> persons;

  // конструктор класса, принимает параметр - список людей
  public AverageAge(List<T> persons) {
    this.persons = persons;
  }

  // метод вычисления среднего возраста
  public double calculateAverageAge() {
    int sum = 0;
    for (T person : persons) {
      sum += person.getAge();
    }
    return (double) sum / persons.size();
  }
}
