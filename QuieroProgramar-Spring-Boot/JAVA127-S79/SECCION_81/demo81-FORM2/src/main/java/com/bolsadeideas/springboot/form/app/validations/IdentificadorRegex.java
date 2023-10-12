package com.bolsadeideas.springboot.form.app.validations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = IdentificadorRegexValidador.class)
@Retention(RUNTIME)
@Target({FIELD,METHOD})
public @interface IdentificadorRegex {

    String message() default  "Identificador invalido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
