package com.bolsadeideas.springboot.form.app.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdentificadorRegexValidador implements ConstraintValidator<IdentificadorRegex,String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value.matches("\\d{3}\\.\\d{3}\\.\\d{3}-[A-Z]")==false) {
            return true;
        }
        return false;
    }
}
