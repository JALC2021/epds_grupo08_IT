/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

public class LoginCheck extends ActionSupport {

    private String dni;
    private String nombre;
    private String apellidos;
    private String password;
    private String email;
    private int edad;
    private String telefono;
    private String comentario;
    private String condiciones;

    public LoginCheck() {
    }

    public LoginCheck(String dni, String nombre, String apellidos, String password, String email, int edad, String telefono, String comentario, String condiciones) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.password = password;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
        this.comentario = comentario;
        this.condiciones = condiciones;
    }

    
    @Override
    public String execute() throws Exception {

        return SUCCESS;

    }

    public String getDni() {
        return dni;
    }
@StringLengthFieldValidator(type = ValidatorType.SIMPLE, trim = true, minLength="9" , maxLength = "9", fieldName = "needstringlength", message = "You must enter a 9 digits.")
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "stringisrequired", message = "You must enter a value for string.")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "stringisrequired", message = "You must enter a value for string.")
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPassword() {
        return password;
    }
@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "stringisrequired", message = "You must enter a value for string.")
@StringLengthFieldValidator(type = ValidatorType.SIMPLE, trim = true, minLength="6" , maxLength = "8", fieldName = "needstringlength", message = "You must enter a 6 - 8 digits.")
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
 @RequiredStringValidator(message = "Please enter your e-mail address.")
 @EmailValidator(type = ValidatorType.SIMPLE, fieldName = "emailaddress", message = "You must enter a value for email.")
    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }
@IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "intfield", min = "0", max = "120", message = "bar must be between ${min} and ${max}, current value is ${bar}.")
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }
@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "stringisrequired", message = "You must enter a value for string.")
@StringLengthFieldValidator(type = ValidatorType.SIMPLE, trim = true, minLength="9" , maxLength = "9", fieldName = "needstringlength", message = "You must enter a 9 digits.")
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getComentario() {
        return comentario;
    }
@StringLengthFieldValidator(type = ValidatorType.SIMPLE, trim = true, minLength="10" , maxLength = "500", fieldName = "needstringlength", message = "You must enter a 10 - 500 .")
@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "stringisrequired", message = "You must enter a value for string.")
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }


}
