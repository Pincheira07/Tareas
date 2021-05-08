import java.util.Scanner;

public class VendedorSopapipillas {
    private String nombre;
    private String apellido;
    private String rut;
    private int dinero;
    private int sopaipillas;

    public VendedorSopapipillas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.dinero=500000;
    }

    public static int leerCantidad(){
        Scanner input = new Scanner(System.in);
        int cantidad = input.nextInt();
        return cantidad;
    }

    public int hacerSopaipillas(){
        System.out.println("Cantidad de sopaipillas a hacer: ");
        int cantidad = leerCantidad();
        this.sopaipillas += cantidad;
        return this.sopaipillas;
    }

    public void venderSopaipillas(){
        System.out.println("¿Cuantas sopaipillas quiere comprar?");
        int cantidad = leerCantidad();
        restarSopaipillas(cantidad);
        cobrar(cantidad);
    }

    public int recibirDinero(int valor) {
        return this.dinero += valor;
    }

    public static int calcularMonto(int cantidad){
        int valorSopaipilla = 300;
        int valorCantidad = cantidad * valorSopaipilla;
        System.out.println("Serían " + valorCantidad);
        return valorCantidad;
    }

    public void cobrar(int cantidad){
        Scanner input = new Scanner(System.in);
        int valorCantidad = calcularMonto(cantidad);
        System.out.println("Introducir monto: ");
        int pago = input.nextInt();
        System.out.println("Su vuelto: " + calcularVuelto(pago, valorCantidad));
        recibirDinero(pago);

    }

    public int calcularVuelto(int pago, int valorReal){
        int vuelto = 0;
        if (valorReal < pago){
         vuelto = pago-valorReal;
         darVuelto(vuelto);
        }
        return vuelto;
    }

    public void darVuelto(int vuelto){
        this.dinero-=vuelto;
    }


    public void restarSopaipillas(int cantidad) {
        this.sopaipillas -=cantidad;
    }

    public int getSopaipillas() {
        return sopaipillas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setSopaipillas(int sopaipillas) {
        this.sopaipillas = sopaipillas;
    }
}
