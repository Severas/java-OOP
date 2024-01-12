import javax.swing.JOptionPane;

public class CarroSedan extends Veiculo{
    FreiosTambor freiosTambor;
    private int kmPorLitro;
    private int combustivelNecessario;
    private String entradaTipoCombustivel;
    private int entradaCombustivel;
    private int tempo;
    private String auxiliar;
    
    public CarroSedan() {
        setTamanhoTankCombutivel(120);
        this.freiosTambor =  new FreiosTambor(1000);
    }
    
    @Override
    public void andar(int distancia, int velocidade){
        if(velocidade>99){
            kmPorLitro = 10;
            setCombustivelNecessario(-1*(distancia/kmPorLitro));
            
            while(getCombustivelNecessario() < 0){
                entradaTipoCombustivel=JOptionPane.showInputDialog("Precisamos parar para abastecer para finalizar o percurso\nTipo de Combustivel no tanque "+tanqueCombustivel.getCombustivelUtillizado()+"\nLitros de combustivel no tanque "+tanqueCombustivel.getCombustivelAtual()+" L\nEspaco disponivel no tanque "+(tanqueCombustivel.getCapacidadeMaxima()-tanqueCombustivel.getCombustivelAtual())+" L \nLitros de Combustivel necessarios para finalizar o percurso "+(this.combustivelNecessario*-1)+" L\nQual Combustivel deseja utilizar?\n1)Gasolina\n2)Alcool\n3)Diesel");
                auxiliar=JOptionPane.showInputDialog("Temos "+(tanqueCombustivel.getCapacidadeMaxima()-tanqueCombustivel.getCombustivelAtual())+" Litros de espaco disponivel, quantos litros gostaria de abastecer?");
                entradaCombustivel=Integer.parseInt(auxiliar);
                
                if(entradaTipoCombustivel.equals("Gasolina") || entradaTipoCombustivel.equals("1") || entradaTipoCombustivel.equals("1)") || entradaTipoCombustivel.equals("1)Gasolina")){
                    if(tanqueCombustivel.getCombustivelUtillizado() == Combustivel.GASOLINA){
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 * (this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.GASOLINA);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.GASOLINA);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }else{
                        tanqueCombustivel.setEsvaziarTank();
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 *(this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.GASOLINA);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.GASOLINA);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }
                }else  if(entradaTipoCombustivel.equals("Alcool")||entradaTipoCombustivel.equals("2")||entradaTipoCombustivel.equals("2)")||entradaTipoCombustivel.equals("2)Alcool")){
                    if(tanqueCombustivel.getCombustivelUtillizado() == Combustivel.ALCOOL){
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 * (this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.ALCOOL);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.ALCOOL);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }else{
                        tanqueCombustivel.setEsvaziarTank();
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 *(this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.ALCOOL);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.ALCOOL);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }
                }else if((entradaTipoCombustivel.equals("Diesel")||entradaTipoCombustivel.equals("3"))||entradaTipoCombustivel.equals("3)")||entradaTipoCombustivel.equals("3)Diesel")){
                    if(tanqueCombustivel.getCombustivelUtillizado() == Combustivel.DIESEL){
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 * (this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.DIESEL);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.DIESEL);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }else{
                        tanqueCombustivel.setEsvaziarTank();
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 *(this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.DIESEL);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.DIESEL);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }
                
                }
            }
        }else{
            kmPorLitro = 25;
            setCombustivelNecessario(-1*(distancia/kmPorLitro));
            
            while(getCombustivelNecessario() < 0){
                entradaTipoCombustivel=JOptionPane.showInputDialog("Precisamos parar para abastecer para finalizar o percurso\nTipo de Combustivel no tanque "+tanqueCombustivel.getCombustivelUtillizado()+"\nLitros de combustivel no tanque "+tanqueCombustivel.getCombustivelAtual()+" L\nEspaco disponivel no tanque "+(tanqueCombustivel.getCapacidadeMaxima()-tanqueCombustivel.getCombustivelAtual())+" L \nLitros de Combustivel necessarios para finalizar o percurso "+(this.combustivelNecessario*-1)+" L\nQual Combustivel deseja utilizar?\n1)Gasolina\n2)Alcool\n3)Diesel");
                auxiliar=JOptionPane.showInputDialog("Temos "+(tanqueCombustivel.getCapacidadeMaxima()-tanqueCombustivel.getCombustivelAtual())+" Litros de espaco disponivel, quantos litros gostaria de abastecer?");
                entradaCombustivel=Integer.parseInt(auxiliar);
                
                if(entradaTipoCombustivel.equals("Gasolina") || entradaTipoCombustivel.equals("1") || entradaTipoCombustivel.equals("1)") || entradaTipoCombustivel.equals("1)Gasolina")){
                    if(tanqueCombustivel.getCombustivelUtillizado() == Combustivel.GASOLINA){
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 * (this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.GASOLINA);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.GASOLINA);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }else{
                        tanqueCombustivel.setEsvaziarTank();
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 *(this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.GASOLINA);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.GASOLINA);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }
                }else  if(entradaTipoCombustivel.equals("Alcool")||entradaTipoCombustivel.equals("2")||entradaTipoCombustivel.equals("2)")||entradaTipoCombustivel.equals("2)Alcool")){
                    if(tanqueCombustivel.getCombustivelUtillizado() == Combustivel.ALCOOL){
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 * (this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.ALCOOL);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.ALCOOL);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }else{
                        tanqueCombustivel.setEsvaziarTank();
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 *(this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.ALCOOL);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.ALCOOL);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }
                }else if((entradaTipoCombustivel.equals("Diesel")||entradaTipoCombustivel.equals("3"))||entradaTipoCombustivel.equals("3)")||entradaTipoCombustivel.equals("3)Diesel")){
                    if(tanqueCombustivel.getCombustivelUtillizado() == Combustivel.DIESEL){
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 * (this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.DIESEL);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.DIESEL);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }else{
                        tanqueCombustivel.setEsvaziarTank();
                        if(entradaCombustivel < (tanqueCombustivel.getCapacidadeMaxima() + tanqueCombustivel.getCombustivelAtual())){
                                if(this.combustivelNecessario < 0 && (-1 *(this.combustivelNecessario)) > entradaCombustivel){
                                    tanqueCombustivel.receber(entradaCombustivel,Combustivel.DIESEL);
                                    super.andar((((entradaCombustivel*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(entradaCombustivel*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(entradaCombustivel);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }else {
                                    tempo=(combustivelNecessario*-1);
                                    tanqueCombustivel.receber(tempo,Combustivel.DIESEL);
                                    super.andar((((tempo*kmPorLitro))), velocidade);
                                    freiosTambor.usarFreios(tempo*kmPorLitro, velocidade);
                                    tanqueCombustivel.comsumir(tempo);
                                    JOptionPane.showMessageDialog(null,"Vida atual dos Freios "+freiosTambor.getVidaFreio()+" km\nQuilometragem Atual  "+getQuilometragem()+" km");
                                }
                                setCombustivelNecessario(entradaCombustivel);
                        }else{
                            JOptionPane.showMessageDialog(null,"Desculpe, nao entendi sua resposta.");
                        }
                    }
                }
            }
        }
    }
    public int getCombustivelNecessario() {
        return combustivelNecessario;
    }
    public void setCombustivelNecessario(int combustivelNecessario) {
        this.combustivelNecessario += combustivelNecessario;
    }
}