package taller11;
import paquete2.Cuenta;
import paquete2.Menu;
import paquete3.MenuCa;
import paquete3.MenuD;
import paquete3.MenuEconomia;
import paquete3.MenuNi;
import java.util.ArrayList;


public class ejecutor03 {
public static void main(String[] args) {
    // TODO code application logic here
    ArrayList <Menu> listamenu = new ArrayList<>();
    MenuD mDia= new MenuD();
    mDia.establecerNombrePlato("Dia 001");
    mDia.establecerValorInicial(5);
    mDia.establecerValorPostre(1);
    mDia.establecerValorBebida(1);
    mDia.calcularValorTotal();

    //Menu de niños
    MenuNi mNinios01 = new MenuNi();
    mNinios01.establecerNombrePlato("Niños 01");
    mNinios01.establecerValorInicial(2);
    mNinios01.setHelado(1);
    mNinios01.setPastel(1.50);
    mNinios01.calcularValorTotal();

    MenuNi mNinios02 = new MenuNi();
    mNinios02.establecerNombrePlato("Niños 02");
    mNinios02.establecerValorInicial(3);
    mNinios02.setHelado(1);
    mNinios02.setPastel(1.50);
    mNinios02.calcularValorTotal();

    //Menu economico
    MenuEconomia mEcono = new MenuEconomia();
    mEcono.establecerNombrePlato("Econo 001");
    mEcono.establecerValorInicial(4);
    mEcono.establecerDescuentoP(25);
    mEcono.calcularValorTotal();

    //Menu Carta
    MenuCa mCarta= new MenuCa();
    mCarta.establecerNombrePlato("Carta 001");
    mCarta.establecerValorInicial(6);
    mCarta.establecerValorGuarnicion(1.5);
    mCarta.establecerValorBebida(2);
    mCarta.establecerPorcentajeServicio(10);
    mCarta.calcularValorTotal();

    // El ArrayList

    listamenu.add(mNinios01);
    listamenu.add(mNinios02);
    listamenu.add(mEcono);
    listamenu.add(mDia);
    listamenu.add(mCarta);

    Cuenta c= new Cuenta();

    c.establecerListaMenu(listamenu);
    c.establecerNombCli("René Elizalde");
    c.establecerSubTotal(15);
    c.establecerIva(15);
    c.establecerValorCancelar();

    System.out.println("Fatura");
    System.out.println(c);
}
}