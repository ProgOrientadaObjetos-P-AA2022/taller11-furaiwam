package paquete3;
import paquete2.Menu;

public class MenuD extends Menu {
    private double valorPos;
    private double valorBeb;
    public void establecerValorPostre(double v) {
        valorPos = v;
    }
    public void establecerValorBebida(double vB) {
        valorBeb = vB;
    }

    public double obtenerValorPostre() {
        return valorPos;
    }
    public double obtenerValorBebida() {
        return valorBeb;
    }


    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicial + valorPos + valorBeb;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu del dia\n%s",super.toString());
        cadena=String.format("%s"
                        + "Valor Postre: %.2f\n"
                        + "Valor Bebida: %.2f\n"
                        + "Valor Menu: %.2f\n"
                ,cadena
                ,obtenerValorPostre()
                ,obtenerValorBebida()
                ,obtenerValorMenu()
        );
        return cadena;
    }
}