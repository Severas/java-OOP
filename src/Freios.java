import javax.swing.JOptionPane;

public class Freios {
    private int vidaUtilTotal;
    private int vidaFreio;
    
    public Freios(int i) {
        this.vidaUtilTotal=i;
    }
    public void arrumar(){
        JOptionPane.showMessageDialog(null,"A vida util dos Freios do seu carro esta acabando, vamos fazer uma parada de emergencia para troca los");
        this.vidaFreio=0;
        JOptionPane.showMessageDialog(null,"Pronto!!!\nNovos freios foram instalados.");
    }
    public void setVidaFreio(int freioAtual){
        vidaFreio+=freioAtual;
    }
    public int getVidaFreio(){
        return vidaFreio;
    }
    public int getVidaUtilTotal() {
        return vidaUtilTotal;
    }
    public void setVidaUtilTotal(int vidaUtilTotal) {
        this.vidaUtilTotal = vidaUtilTotal;
    }
}
