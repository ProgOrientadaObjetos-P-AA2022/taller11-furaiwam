package paquete3;
import paquete2.menu;


public class menuEconomia extends menu{
    private double descuentoP;

    public void establecerDescuentoP(double n){
        descuentoP = (n * valorInicial)  / 100;
    }
    public double obtenerPorcentajeDescuento() {
        return descuentoP;
    }
    public void calcularValorTotal() {
        valorMenu = valorInicial - descuentoP;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n%s\n"
                , super.toString()
        );

        cadena = String.format("%s"
                        + "Porcentaje descuento %.2f\n"
                        + "Valor Menu: %.2f\n"
                ,cadena
                ,obtenerPorcentajeDescuento()
                ,obtenerValorMenu()
        );
        return cadena;
    }

}
