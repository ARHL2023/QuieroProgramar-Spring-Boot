package com.bolsadeideas.springboot.form.app.models.domain;

//import com.bolsadeideas.springboot.form.app.validations.IdentificadorRegex;
import com.bolsadeideas.springboot.form.app.validations.IdentificadorRegex;
import com.bolsadeideas.springboot.form.app.validations.validationsApellido.Requerido;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Usuario {

//     3 dígitos seguidos de un punto, seguidos de 3 dígitos, seguidos de un punto, seguidos de 3 dígitos,
//    seguidos de un guión y, finalmente, seguidos de una letra mayúscula.
 //   @Pattern(regexp ="[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")


    @IdentificadorRegex
    private String identificador;

    //@NotEmpty
    private String nombre;

//    @NotEmpty
    @Requerido
    private String apellido;

    @NotEmpty(message = "nuestro USUARIO no puede estar vasio (luego se mejorara en el properties)")
    @Size(min = 3, max = 8)
    @NotBlank //VALIDA NO ESTE VADIO
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    @Email
    private String email;

    @NotNull// para objetos clases etc , si fuera int seria  solo con min y max
    @Min(5)
    @Max(5000)
    private Integer cuenta;

//    @Future
//    @Past
    @NotNull
   // @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimeinto;

}
