package logger;

/**
 * Реализация интерфейса Logger, выполняющая логирование в консоль.
 */
public class ConsoleLogger implements Logger {
    /**
     * Выводит логовое сообщение в консоль.
     *
     * @param message Логовое сообщение.
     */
    @Override
    public void log(String message) {
        System.out.println("[ConsoleLogger] " + message);
    }
}
