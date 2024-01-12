public abstract class Veiculo {
    private int quilometragem=0;
    TanqueCombustivel tanqueCombustivel;
    
    public void setTamanhoTankCombutivel(int tamanho){
        tanqueCombustivel=new TanqueCombustivel(tamanho);
    }
    public void abastecer(int quantidade, Combustivel combustivel){
        tanqueCombustivel.receber(quantidade,combustivel);
    }
    public void andar(int distancia, int velocidade){
        quilometragem+=distancia;
    }
    public int getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    public TanqueCombustivel getTanqueCombustivel() {
        return tanqueCombustivel;
    }
    public void setTanqueCombustivel(TanqueCombustivel tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }
    
}
