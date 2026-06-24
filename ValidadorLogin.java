/*
1.	Crea ValidadorLogin.java con una clase ValidadorLogin.
2.	Declara String usuario y String password con valores de prueba.
3.	Aplica estas reglas: 
    El usuario no puede estar vacío.
    La contraseña debe tener al menos 8 caracteres.
4.	Imprime "Login válido" si cumple ambas reglas. Si no, imprime un mensaje que diga 
cuál regla falló.
*/

public class ValidadorLogin {

    public static void main (String[] args){
        String usuario = "raul";
        String password = "00001111";
        int longPwd;
        boolean usuarioVacio; 

        longPwd = password.length();
        usuarioVacio = usuario.isEmpty();

        if (usuarioVacio==true){
            System.out.println("El usuario NO puede estar vacío");
        }

        if (longPwd < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        }

        if (usuarioVacio == false && longPwd >= 8){
            System.out.println("Login válido");
        }

        //Usando operador ternario
        String mensajeLogin = (usuarioVacio == false && longPwd >= 8) ? "ACCESO PERMITIDO" : "ACCESO RECHAZADO";
        System.out.println(mensajeLogin);

        //System.out.println("longitud de password: " + password.length());
        //System.out.println("usuario vacío: " + usuarioVacio);
    }
    
}
