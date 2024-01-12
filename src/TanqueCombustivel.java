enum Combustivel{
    GASOLINA,   
    ALCOOL,
    DIESEL;
}
public class TanqueCombustivel{
    private int capacidadeMaxima;
    private int combustivelAtual=1;
    private Combustivel combustivelUtillizado = Combustivel.GASOLINA;

    public TanqueCombustivel(int i ){
        this.capacidadeMaxima=i;
    }
    public void setEsvaziarTank(){
        combustivelAtual=0;
        combustivelUtillizado=null;
    }
    public void comsumir(int quantidade){
        this.combustivelAtual-=quantidade;
    }
    public void receber(int quantidade, Combustivel tipo){
        if(tipo==combustivelUtillizado)
            this.combustivelAtual+=quantidade;
        else{
            this.combustivelAtual+=quantidade;
            this.combustivelUtillizado=tipo;
        }
    }
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    public Combustivel getCombustivelUtillizado() {
        return combustivelUtillizado;
    }
    public void setCombustivelUtillizado(Combustivel combustivelUtillizado) {
        this.combustivelUtillizado = combustivelUtillizado;
    }
    public int getCombustivelAtual() {
        return combustivelAtual;
    }
    public void setCombustivelAtual(int combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
    }
}
