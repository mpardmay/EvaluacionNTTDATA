public class Cuenta{
    private String titular;
    private double cantidad = 0;

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        //this.cantidad = (cantidad > 0) ? this.cantidad += cantidad : this.cantidad;
        if (cantidad > 0){
            this.cantidad += cantidad;
            System.out.println("Haz ingresado " + cantidad + " a tu cuenta.");
        } else {
            System.out.println("El monto ingresado no es valido");
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0){
            if (cantidad <= this.cantidad){
                this.cantidad -= cantidad;
                System.out.println("Haz retirado " + cantidad + " de tu cuenta.");
            } else {
                System.out.println("No tienes suficiente dinero en tu cuenta.");
            }
        } else {
            System.out.println("El monto retirado no es valido");
        }
    }


}
