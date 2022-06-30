package paquete3;
import paquete2.menu;
public class menuCa extends menu{
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public void establecerValorGuarnicion(double c){
        valorGuarnicion = c;
    }

    public void establecerValorBebida(double c){
        valorBebida = c;
    }

    public void establecerPorcentajeServicio(double n){
        porcentajeServicio = (n * obtenerValorMenu())/100;
    }
    public double obtenerValorGuarnicion(){
        return valorGuarnicion;
    }
    public double obtenerValorBebida() {
        return valorBebida;
    }
    public double obtenerPorcentajeAdicional(){
        return porcentajeServicio;
    }
    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicial + valorGuarnicion + valorBebida
                + porcentajeServicio;
    }
    public String toString() {
        String c = String.format("Menu a la carta\n%s\n",super.toString());
        c = String.format("%s\n"
                        + "Valor porcion guarnicion: %.2f\n"
                        + "Valor bebida: %.2f\n"
                        + "Porcentaje Adicional: %.2f\n"
                        + "Valor menu: %.2f\n"
                ,c
                ,obtenerValorGuarnicion()
                ,obtenerValorBebida()
                ,obtenerPorcentajeAdicional()
                ,obtenerValorMenu()
        );
        return c;
    }
}
