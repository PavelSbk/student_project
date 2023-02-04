package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacalearning.studentorder.domain.Person;

public interface CityRegisterChecker {

    CityRegisterCheckerResponse checkPerson(Person person);
}
