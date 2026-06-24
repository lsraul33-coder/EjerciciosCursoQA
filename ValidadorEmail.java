/*
1.	Crea ValidadorEmail.java con una clase ValidadorEmail.
2.	Escribe un método public static boolean esEmailValido(String email) que regrese true solo si el email: 
    - No está vacío,
    - Contiene un @,
    - Contiene un . (punto).
3.	Desde el main, llama tu método con al menos 4 emails distintos (válidos e inválidos) e imprime el resultado de cada uno.
*/

public class ValidadorEmail {

    public static boolean esEmailValido(String email){

        if(email.isEmpty()==false && email.contains("@") && email.contains(".")){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {

        String[] correos = {
            "raul@hotmail.com",//válido
            "raul.hotmail.com",//sin arroba - inválido
            "raul@gmail_com",//sin punto - inválido
            "" //vacío - inválido
        };
        
        for (String e : correos){
            System.out.println("Email: " + e + " ¿es válido? R= " + esEmailValido(e));
        }
    }
}
