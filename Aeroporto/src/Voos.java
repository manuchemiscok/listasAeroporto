public class Voos<X> implements Cloneable {
    private Double peso;
    private Aeroporto<X> inicio;
    private Aeroporto<X> fim;

    public Voos(Double peso, Aeroporto<X> inicio, Aeroporto<X> fim){
        this.peso   = peso;
        this.inicio = inicio;
        this.fim    = fim;
    }

    public Double getPeso(){
        return this.peso;
    }

    public void setPeso(Double peso){
        this.peso = peso;
    }

    public Aeroporto<X> getInicio() {
        return inicio;
    }

    public void setInicio(Aeroporto<X> inicio) {
        this.inicio = inicio;
    }

    public Aeroporto<X> getFim() {
        return fim;
    }

    public void setFim(Aeroporto<X> fim) {
        this.fim = fim;
    }
}
