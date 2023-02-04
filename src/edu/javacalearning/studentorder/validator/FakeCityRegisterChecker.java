package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacalearning.studentorder.domain.Person;

/**
 * Класс заглушка
 */
public class FakeCityRegisterChecker implements CityRegisterChecker{

    @Override
    public CityRegisterCheckerResponse checkPerson(Person person) {
        return null;
    }
}
