package paquete2;

public abstract class menu {
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
        String inicio = String.format("Nombre del plato: %s\n"
                        + "Valor del menu inicial: %.2f\n"
                ,obtenerNombrePlato()
                ,obtenerValorInicial()
        );
        return inicio;
    }
}

