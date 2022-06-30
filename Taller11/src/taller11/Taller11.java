/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;
import paquete2.cuenta;
import paquete2.menu;
import paquete3.menuCa;
import paquete3.menuD;
import paquete3.menuEconomia;
import paquete3.menuNi;

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
        ArrayList<menu> listamenu=new ArrayList<>();

        //Menu Carta
        menuCa cart= new menuCa();
        cart.establecerNombrePlato("Encebollado");
        cart.establecerValorInicial(1.50);
        cart.establecerValorGuarnicion(2.50);
        cart.establecerValorBebida(2.00);
        cart.establecerPorcentajeServicio(15);
        cart.calcularValorTotal();

        //Menu del dia
        menuD di= new menuD();
        di.establecerNombrePlato("Guata");
        di.establecerValorInicial(2.75);
        di.establecerValorPostre(1.00);
        di.establecerValorBebida(0.50);
        di.calcularValorTotal();

        //Menu de niños
        menuNi munNi1 =new menuNi();
        menuNi munNi2 =new menuNi();

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
        menuEconomia econo = new menuEconomia();
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

        cuenta c= new cuenta();

        c.establecerListaMenu(listamenu);
        c.establecerNombCli("Frank Sarango");
        c.establecerValorCancelar();

        System.out.println(c);
    }
    
}
