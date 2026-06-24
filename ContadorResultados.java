/*
1.	Crea ContadorResultados.java con una clase ContadorResultados.
2.	Declara un array de String con varios resultados, por ejemplo:
java
   String[] resultados = {"PASS", "FAIL", "PASS", "PASS", "FAIL"};
3.	Recorre el array y cuenta cuántos "PASS" y cuántos "FAIL" hay.
4.	Imprime el total de pruebas, cuántas pasaron, cuántas fallaron y la tasa de éxito en porcentaje.
*/

public class ContadorResultados {

    public static void main(String[] args) {
        String[] resultados = {"PASS","FAIL","PASS","PASS","FAIL"};
        int contadorPASS = 0;
        int contadorFAIL = 0;

        for (String estatus : resultados) {
            if (estatus.equals("PASS")){
                contadorPASS++;
            }
             if (estatus.equals("FAIL")){
                contadorFAIL++;
            }

           // System.out.println("Estatus " + estatus);
         
        }

        System.out.println("CP Pasados: " + contadorPASS);
        System.out.println("CP Fallados: " + contadorFAIL);
        System.out.println("Total de CP: " + (contadorPASS + contadorFAIL));
        System.out.println("Tasa de éxito: " + (((double)contadorPASS/(contadorPASS+contadorFAIL)*100)) + "%");


    }
    
}
