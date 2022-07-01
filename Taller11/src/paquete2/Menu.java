package paquete2;

public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public void establecerNombrePlato(String n){
        nombrePlato = n;
    }
    public void establecerValorMenu(double n){
        valorMenu = n;
    }

    public void establecerValorInicial(double n){
        valorInicial = n;
    }

    public abstract void calcularValorTotal();

    public String obtenerNombrePlato(){
        return nombrePlato;
    }

    public double obtenerValorMenu(){
        return valorMenu;
    }

    public double obtenerValorInicial(){
        return  valorInicial;
    }
    public String toString() {
        String inicio = String.format("Plato; : %s\n"
                        + "Niños: %2s"
                        + "Valor del menu inicial: %.2f\n"
                ,nombrePlato
                ,valorMenu
                ,valorInicial
        );
        return inicio;
    }
}

