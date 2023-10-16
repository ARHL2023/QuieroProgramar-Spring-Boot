package com.bolsadeideas.springboot.form.app.editors;

import java.beans.PropertyEditorSupport;

public class NombreMayusculaEditors  extends PropertyEditorSupport {

    //podemos crear este metodo con el ide- generate-override y buscamos setAsText
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text.toUpperCase().trim());
    }

}
