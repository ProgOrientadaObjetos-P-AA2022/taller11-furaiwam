package taller11;

import paquete2.Cuenta;
import paquete2.Menu;
import paquete3.MenuCa;
import paquete3.MenuD;
import paquete3.MenuEconomia;
import paquete3.MenuNi;
import java.util.ArrayList;


public class Ejecutor02 {
    public static void main(String[] args) {

            String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
                    {"Niños 02", "3.00", "1", "1.5"},
                    {"Niños 03", "2.00", "2", "0.5"},
            };

            String[][] datos002 = {{"Econo 001", "4", "25"},
                    {"Econo 002", "4", "15"},
                    {"Econo 003", "4", "35"}
            };

            String[][] datos003 = { {"Dia 001", "5", "1", "1"},
                    {"Dia 002", "6", "2", "2"},
                    {"Dia 003", "5.5", "3", "1"},
            };

            String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
                    {"Carta 002", "7", "1.7", "2.1", "5"},
                    {"Carta 003", "8", "1.9", "2.2", "5"},
                    {"Carta 004", "9", "2.5", "2.9", "5"},
            };


            // Lista de Menus
            ArrayList lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día,
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado,
        agregar al ArrayList lista*/
            // Inicio de solución

            // Fin de solución
        for (int i=0 < datos001.length; i++){
            String nPlatos = datos001[1][0];
            double vInicial = Double.parseDouble(datos001)
        }


            for (int i = 0; i < lista.size(); i++) {
                lista.get(i).establecerValorMenu();
            }

            // Un objeto de tipo Cuenta
            Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
            miCuenta.establecerSubtotal();
            miCuenta.establecerValorCancelar();
            System.out.printf("%s\n", miCuenta);



        }
}
