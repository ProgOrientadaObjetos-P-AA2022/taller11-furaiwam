package paquete3;
import paquete2.menu;

public class menuNi extends menu{
    private double helado;
    private double pastel;

    public void setHelado(double n){
        helado = n;
    }

    public void setPastel(double n){
        pastel = n;
    }
    public double obtenerHelado(){
        return helado;
    }
    public double obtenerPastel(){
        return pastel;
    }

    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicial + helado + pastel;
    }

    public String toString() {
        String cadena = String.format("Menu de Niños\n%s\n"
                , super.toString()
        );
        cadena = String.format("%s\n"
                        + "Valor Porcion Helado: %.2f\n"
                        + "Valor Porcion Pastel: %.2f\n"
                        + "Valor Menu: %.2f\n"
                ,cadena
                ,helado
                ,pastel
                ,valorMenu
        );
        return cadena;
    }
}
