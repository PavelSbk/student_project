package edu.javacalearning.studentorder.exception;

/**
 * при обращении за получение регистрационных данных,
 * может возникнуть ряд проблем, их лучше отобразить с помощью Exception
 *
 * CityRegisterException наследует Exception
 *
 *
 */
public class CityRegisterException extends Exception {
    /**
     * пустой конструктор с Exception
     */
    public CityRegisterException() {
    }
    /**
     * конструктор с message
     */
    public CityRegisterException(String message) {
        super(message);
    }
    /**
     * конструктор с message и cause - причиной
     */
    public CityRegisterException(String message, Throwable cause) {
        super(message, cause);
    }
}
