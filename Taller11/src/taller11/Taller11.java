/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;
import paquete2.Cuenta;
import paquete2.Menu;
import paquete3.MenuCa;
import paquete3.MenuD;
import paquete3.MenuEconomia;
import paquete3.MenuNi;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
public class Taller11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> listamenu=new ArrayList<>();

        //Menu Carta
        MenuCa cart= new MenuCa();
        cart.establecerNombrePlato("Encebollado");
        cart.establecerValorInicial(1.50);
        cart.establecerValorGuarnicion(2.50);
        cart.establecerValorBebida(2.00);
        cart.establecerPorcentajeServicio(15);
        cart.calcularValorTotal();

        //Menu del dia
        MenuD di= new MenuD();
        di.establecerNombrePlato("Guata");
        di.establecerValorInicial(2.75);
        di.establecerValorPostre(1.00);
        di.establecerValorBebida(0.50);
        di.calcularValorTotal();

        //Menu de niños
        MenuNi munNi1 =new MenuNi();
        MenuNi munNi2 =new MenuNi();

        munNi1.establecerNombrePlato("Mote pillo");
        munNi1.establecerValorInicial(3.50);
        munNi1.setHelado(1.00);
        munNi1.setPastel(1.00);
        munNi1.calcularValorTotal();

        munNi2.establecerNombrePlato("Continental");
        munNi2.establecerValorInicial(2.75);
        munNi2.setHelado(2.00);
        munNi2.setPastel(3.00);
        munNi2.calcularValorTotal();

        //Menu economico
        MenuEconomia econo = new MenuEconomia();
        econo.establecerNombrePlato("Agachadito: Arroz con carne asada");
        econo.establecerValorInicial(2.00);
        econo.establecerDescuentoP(15);
        econo.calcularValorTotal();


        // El ArrayList
        listamenu.add(cart);
        listamenu.add(di);
        listamenu.add(munNi1);
        listamenu.add(munNi2);
        listamenu.add(econo);

        Cuenta c= new Cuenta();

        c.establecerListaMenu(listamenu);
        c.establecerIva(15);
        c.establecerNombCli("Rene Elizalde");
        c.establecerValorCancelar();

        System.out.println(c);
    }
    
}
