//1.	Crea ValidadorStatus.java con una clase ValidadorStatus.
//2.	Declara una variable int statusCode con un valor de prueba (ej. 404).
//3.	Imprime a qué categoría pertenece: 
//	200–299 → Éxito (2xx)
//	300–399 → Redirección (3xx)
//	400–499 → Error del cliente (4xx)
//	500–599 → Error del servidor (5xx)
//	Cualquier otro → Código desconocido


public class ValidadorStatus {
    public static void main (String[] args){

        int statusCode = 500;
        String categoria = "";

        if (statusCode >= 200 && statusCode <= 299){
            categoria = "Éxito (2xx)";
        }

         if (statusCode >= 300 && statusCode <= 399){
            categoria = "Redirección (3xx)";
        }

         if (statusCode >= 400 && statusCode <= 499){
            categoria = "Error del cliente (4xx)";
        }

         if (statusCode >= 500 && statusCode <= 599){
            categoria = "Error del servidor (5xx)";
        }

        if (statusCode < 200 || statusCode > 599){
            categoria = "Código desconocido";
        }

        System.out.println("Código de error: " + statusCode);
        System.out.println("Categoría: " + categoria);
    }
}
