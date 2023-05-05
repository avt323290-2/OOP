package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс Поток студентов, расширенный интерфейсом Iterable для возможности
 * перебора его элементов - групп
 */
public class StudentFlow implements Iterable<StudentGroup> {
  private List<StudentGroup> flow;

  /**
   * конструктор класса
   * 
   * @param flow список групп потока
   */
  public StudentFlow(List<StudentGroup> flow) {
    this.flow = flow;
  }

  /* получение списка групп в потоке */
  public List<StudentGroup> getFlow() {
    return flow;
  }

  /* установка списка групп в потоке */
  public void setFlow(List<StudentGroup> flow) {
    this.flow = flow;
  }

  /* перегрузка метода Итератора с использованием анонимного класса */
  @Override
  public Iterator<StudentGroup> iterator() {
    return new Iterator<StudentGroup>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < flow.size();
      }

      @Override
      public StudentGroup next() {
        if (!hasNext()) {
          return null;
        }
        // counter++;
        return flow.get(index++);
      }

    };
  }
}