/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fl1pc17
 */

public class FormularioValidator {

    // Validar Nombre (no vacío)
    public static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    // Validar Edad (debe ser un número entero positivo)
    public static boolean validarEdad(String edad) {
        try {
            int edadInt = Integer.parseInt(edad);
            return edadInt > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Validar Correo Electrónico (usando expresión regular)
    public static boolean validarCorreo(String correo) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    // Validar Contraseña (al menos 6 caracteres)
    public static boolean validarContraseña(String contraseña) {
        return contraseña != null && contraseña.length() >= 6;
    }

    // Método principal para probar las validaciones
    public static void main(String[] args) {
        // Ejemplos de datos
        String nombre = "Juan Pérez";
        String edad = "25";
        String correo = "juan.perez@email.com";
        String contraseña = "abc123";

        // Validaciones
        if (validarNombre(nombre)) {
            System.out.println("Nombre válido.");
        } else {
            System.out.println("Nombre inválido.");
        }

        if (validarEdad(edad)) {
            System.out.println("Edad válida.");
        } else {
            System.out.println("Edad inválida.");
        }

        if (validarCorreo(correo)) {
            System.out.println("Correo válido.");
        } else {
            System.out.println("Correo inválido.");
        }

        if (validarContraseña(contraseña)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida.");
        }
    }
}
    
