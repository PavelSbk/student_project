package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacalearning.studentorder.domain.Person;
import edu.javacalearning.studentorder.exception.CityRegisterException;

/**
 * Класс заглушка
 *
 * в случае ошибки вернёт CityRegisterException
 */
public class FakeCityRegisterChecker implements CityRegisterChecker{

    @Override
    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}
