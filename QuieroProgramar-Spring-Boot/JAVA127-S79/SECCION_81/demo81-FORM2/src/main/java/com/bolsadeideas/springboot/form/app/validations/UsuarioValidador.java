package com.bolsadeideas.springboot.form.app.validations;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


//LOS METODOS EL ID NOS AYUDA A GENERARLOS
@Component
public class UsuarioValidador implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Usuario.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Usuario usuario = (Usuario) target;
        //nombre no vacio
        ValidationUtils.rejectIfEmpty(errors,"nombre","NotEmpty.usuario.nombre");
    }//

}
