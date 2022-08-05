public class Main {
    public static void main(String[] args){
        Cuenta miCuenta = new Cuenta("michael");
        miCuenta.ingresar(20000);
        miCuenta.retirar(60000);


        //este ejercicio hace parte de la rama main
        Cuenta cuentaNuevaEnMain = new Cuenta("main");
        cuentaNuevaEnMain.ingresar(2000);
        cuentaNuevaEnMain.retirar(60000);
    }
}
