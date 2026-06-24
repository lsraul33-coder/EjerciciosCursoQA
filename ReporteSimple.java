
//1.	Crea un archivo ReporteSimple.java con una clase ReporteSimple.
//2.	Declara variables para: nombre del tester (texto), casos ejecutados (entero), casos exitosos (entero), si todos pasaron (booleano) y la tasa de éxito en porcentaje (decimal).
//3.	Imprime un reporte legible en consola.


public class ReporteSimple {
    public static void main (String[] args){
        String nombreTester = "Raul";
        int casosEjecutados = 100;
        int casosExitosos = 25;
        boolean pasaronTodos = false;
        double tasaDeExito;


        //% Tasa de éxito = (casosExitosos/casosEjecutados)*100
        // investigar que es un casting a double
        tasaDeExito = ((double)casosExitosos/casosEjecutados)*100;         
        
        System.out.println("***** REPORTE *****");
        System.out.println ("Tester: " + nombreTester);
        System.out.println ("Casos Ejecutados: " + casosEjecutados);
        System.out.println ("Casos Exitosos: " + casosExitosos);
        System.out.println ("¿Pasaron todos?: " + pasaronTodos);
        System.out.println ("Tasa de Éxito: " + tasaDeExito + "%");

    }
}
