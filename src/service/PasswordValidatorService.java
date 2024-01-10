package service;

public class PasswordValidatorService {

    /*(por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
    Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
    correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.*/

    public int longitudMin(PasswordValidator pv){

        return pv.getPassword().length();
    }

    public boolean tienesCaracteresEspeciales(PasswordValidator pv){

        boolean tiene = false;

        for (int i = 0; i < pv.getPassword().length(); i++) {
            if (pv.getPassword().substring(i,i+1).contains(pv.getCaracteresEspeciales()[i])) {
                tiene = true;
            }
        }

        return tiene;
    }
}
