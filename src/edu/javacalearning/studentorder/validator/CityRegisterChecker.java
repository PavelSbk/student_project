package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacalearning.studentorder.domain.Person;
import edu.javacalearning.studentorder.exception.CityRegisterException;

/**
 * В случае ошибки вернёт CityRegisterException
 */

public interface CityRegisterChecker {

    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
