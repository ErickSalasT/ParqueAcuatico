public class Compra {

    private double precioEntrada;
    private double precioComidaBuffet;
    private double precioEspectaculo;
    private double precioNadoDelfines;
    private double precioVIP;
    private double precioBalcon;

    public Compra(double precioEntrada, double precioComidaBuffet, double precioEspectaculo, double precioVIP, double precioBalcon, double precioNadoDelfines) {
        this.precioEntrada = precioEntrada;
        this.precioComidaBuffet = precioComidaBuffet;
        this.precioEspectaculo = precioEspectaculo;
        this.precioNadoDelfines = precioNadoDelfines;
        this.precioVIP = precioVIP;
        this.precioBalcon = precioBalcon;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public double getPrecioComidaBuffet() {
        return precioComidaBuffet;
    }

    public void setPrecioComidaBuffet(double precioComidaBuffet) {
        this.precioComidaBuffet = precioComidaBuffet;
    }

    public double getPrecioEspectaculo() {
        return precioEspectaculo;
    }

    public void setPrecioEspectaculo(double precioEspectaculo) {
        this.precioEspectaculo = precioEspectaculo;
    }

    public double getPrecioVIP() {
        return precioVIP;
    }

    public void setPrecioVIP(double precioVIP) {
        this.precioVIP = precioVIP;
    }

    public double getPrecioBalcon() {
        return precioBalcon;
    }

    public void setPrecioBalcon(double precioBalcon) {
        this.precioBalcon = precioBalcon;
    }
    public double getPrecioNadoDelfines() {
        return precioNadoDelfines;
    }

    public void setPrecioNadoDelfines(double precioNadoDelfines) {
        this.precioNadoDelfines = precioNadoDelfines;
    }


    public double calcularTotal(double precioEntrada) {
        return precioEntrada;
    }

    public double calcularTotal(double precioEntrada, double precioComidaBuffet) {
        return precioEntrada + precioComidaBuffet;
    }

    public double calcularTotal(double precioEntrada, double precioComidaBuffet, double precioEspectaculo) {
        return precioEntrada + precioComidaBuffet + precioEspectaculo;
    }

    public double calcularTotal(double precioEntrada, double precioComidaBuffet, double precioEspectaculo, double precioNadoDelfines) {
        return precioEntrada + precioComidaBuffet + precioEspectaculo + precioNadoDelfines;
    }

    public double getPrecioEspectaculo(String seccionLugar) {
        if (seccionLugar.equalsIgnoreCase("VIP")) {
            return precioVIP;
        } else if (seccionLugar.equalsIgnoreCase("Balcón")) {
            return precioBalcon;
        } else {
            return precioEspectaculo;
        }
    }
}

