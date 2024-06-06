package parcial2;

public class Motocicleta extends Vehiculo{
    private TipoMotocicleta tipoMotocicleta;

    public Motocicleta(TipoMotocicleta tipoMotocicleta, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.tipoMotocicleta = tipoMotocicleta;
    }
    public String imprimirInformacion(){
        return tipoMotocicleta;
    }  
}
