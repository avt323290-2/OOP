package logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Реализация интерфейса Logger, выполняющая логирование в файл.
 */
public class FileLogger implements Logger {
    private String fileName;

    /**
     * Конструктор класса FileLogger.
     *
     * @param fileName Имя файла, в который будет выполняться логирование.
     */
    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Записывает логовое сообщение в файл.
     *
     * @param message Логовое сообщение.
     */
    @Override
    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("[FileLogger] " + message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
