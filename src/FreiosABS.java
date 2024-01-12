import javax.swing.JOptionPane;

public class FreiosABS extends Freios {
    public FreiosABS(int i) {
        super(i);
        super.setVidaUtilTotal(2000);
    }
    public void usarFreios(int distancia, int velocidade){
        if(velocidade>119){
            if(super.getVidaFreio()<=super.getVidaUtilTotal()){
                    super.setVidaFreio(distancia);
            }else{
                JOptionPane.showMessageDialog(null,"Parada de emergencia para trocar os freios");
                super.arrumar();
            }
        }else{
            //if(super.getVidaFreio()<=(super.getVidaUtilTotal()-1)-10*80) caso queira reparar o freio antes de chegar na vida maxima
            if(super.getVidaFreio()<=super.getVidaUtilTotal()){//reparar sempre que ultrapassar a vida maxima
                    super.setVidaFreio(distancia);
            }else{
                JOptionPane.showMessageDialog(null,"Parada de emergencia para trocar os freios");
                super.arrumar();
            }
        }
}
}
