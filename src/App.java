import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        String fechar = "42",tipo,temporaria;
        int km = 0, velocidade=0;

        while(fechar.equalsIgnoreCase("Parar") != true){
            tipo=JOptionPane.showInputDialog("Deseja um percurso de Carro 'Sedan' ou 'Esportivo'?");

            temporaria=JOptionPane.showInputDialog("quantos km deseja percorrer?");
            km=Integer.parseInt(temporaria);

            temporaria=JOptionPane.showInputDialog("A qual velocidade deseja percorrer?");
            velocidade=Integer.parseInt(temporaria);

            if(tipo.equalsIgnoreCase("Sedan")){
                CarroSedan carroSedan = new CarroSedan();
                carroSedan.andar(km,velocidade);
            }else if(tipo.equalsIgnoreCase("Esportivo")){
                CarroEsportivo carroEsportivo = new CarroEsportivo();
                carroEsportivo.andar(km, velocidade);
            }else{
                JOptionPane.showInputDialog("Apenas o Carro 'Sedan' e o  'Esportivo' estao disponiveis");
            }
            fechar=JOptionPane.showInputDialog(" Se deseja encerrar digite 'Parar' caso contrario presione qualquer tecla");
        }
    }
}
