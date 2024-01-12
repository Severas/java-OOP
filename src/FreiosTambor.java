import javax.swing.JOptionPane;

public class FreiosTambor extends Freios  {
    public FreiosTambor(int i) {
        super(i);
        super.setVidaUtilTotal(1000);
    }
    public void usarFreios(int distancia, int velocidade){
        if(velocidade>99){
            if(super.getVidaFreio()<=super.getVidaUtilTotal()){
                    setDuploDesgaste(distancia);
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
    public void setDuploDesgaste(int quilometragem){
        super.setVidaFreio(quilometragem*2);
    }
}
