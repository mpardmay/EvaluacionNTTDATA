public class Main {
    public static void main(String[] args){
        Cuenta miCuenta = new Cuenta("michael");
        miCuenta.ingresar(20000);
        System.out.println(miCuenta.getCantidad());
        miCuenta.retirar(60000);
        miCuenta.retirar(0);
    }
}
