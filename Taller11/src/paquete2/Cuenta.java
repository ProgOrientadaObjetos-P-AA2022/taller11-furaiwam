package paquete2;
import java.util.ArrayList;

public class Cuenta {
    private String nombCli;
    private ArrayList<Menu> listaMenu = new ArrayList<>();
    private double valorCancelar;
    private double subTotal;
    private double iva;

    public void establecerNombCli(String n){
        nombCli = n;
    }
    public void establecerListaMenu(ArrayList<Menu> lm){
        listaMenu = lm;
    }
    public void establecerSubTotal(double s){
        subTotal = s;
    }
    public void establecerIva(){
        iva = 10;
    }
    public void establecerValorCancelar(){
        for(int i = 0; i < listaMenu.size(); i++){
            subTotal = subTotal + listaMenu.get(i).obtenerValorMenu();
        }
    }

    public String obtenerNombCli(){
        return nombCli;
    }
    public ArrayList<Menu> obtenerListaMenu(){
        return listaMenu;
    }
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    public double obtenerSubTotal(){
        return subTotal;
    }
    public double obtenerIva(){
        return iva;
    }

    @Override
    public String toString() {
        String c = String.format("Factura\n"
                        + "Cliente : %2s\n"
                ,obtenerNombCli()
        );

        for(int i = 0; i < obtenerListaMenu().size();i++){
            c = String.format("%s" + "%s\n"
                    ,c
                    ,obtenerListaMenu().get(i)
            );
        }
        c = String.format("\n%s"
                        + "Subtotal: %.2f\n"
                        + "Iva: %.2f\n"
                        + "Total a pagar: %.2f\n"
                ,c
                ,obtenerSubTotal()
                ,obtenerIva()
                ,obtenerValorCancelar()
        );

        return c;
    }

}
