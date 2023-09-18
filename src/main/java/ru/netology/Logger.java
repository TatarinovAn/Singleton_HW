package ru.netology;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    String dateTime = DateTimeFormatter.ofPattern("dd.mm.yyyy hh:mm:ss")
            .format(LocalDateTime.now());


    private Logger() {
    }

    public void log(String msg) {
        System.out.println("[" + dateTime + " " + num + "] " + msg);
        this.num++;
    }

    // В этом поле храним ссылку на тот
    // единственный объект этого класса
    // который будем отдавать пользователям


    // Пользователи которым нужен объект
    // нашего класса получают всегда один
    // и тот же объект, который мы храним
    // в приватном статичном поле, которое
    // мы заполняем в этом методе если оно
    // до того не было заполнено
    public static Logger getInstance() {
        if (logger == null) {
            return new Logger();
        }
        return logger;
    }
}