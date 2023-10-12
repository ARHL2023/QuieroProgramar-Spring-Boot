package com.bolsadeideas.springboot.form.app.validations.validationsApellido;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;


public class RequeridoRegexValidador implements ConstraintValidator<Requerido,String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        if( value==null || !StringUtils.hasText(value)){ //value.isEmpty() || value.isBlank() eslo mismo que !StringUtils.hasText(value)
            return false;
        }
        return true;
    }//

}
