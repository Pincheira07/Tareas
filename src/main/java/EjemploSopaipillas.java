public class EjemploSopaipillas {
    public static void main(String[] args) {
        VendedorSopapipillas miVendedor = new VendedorSopapipillas("Tio", "Aceite");
        miVendedor.hacerSopaipillas();
        miVendedor.venderSopaipillas();
        System.out.println("Dinero: " + miVendedor.getDinero());
        System.out.println("Sopaipillas "+ miVendedor.getSopaipillas());






    }
}
