public class Pneu
{
    private int idPneu;
    private String modelo;
    private double indiceDeUso;
    private char estado = 'N';
    private int horasDeUso = 0;
    
    
    public Pneu(int idPneu, String modelo, double indiceDeUso){
        this.idPneu = idPneu;
        this.modelo = modelo;
        this.indiceDeUso = indiceDeUso;
    }
    
    public int getIdPneu(){
        return this.idPneu;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getIndiceDeUso(){
        return this.indiceDeUso;
    }
    public char getEstado(){
        return this.estado;
    }
    public int getHorasDeUso(){
        return this.horasDeUso;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    
    public boolean desgastar(int horaInicio, int horaFim){
        if(estado == 'N' || estado == 'U'){
            if(estado == 'N'){
                estado = 'U';
            }
            indiceDeUso -= (60 * (horaFim - horaInicio) * 0.12345);
            if(indiceDeUso <= 0){
                estado = 'F';
            }
            horasDeUso += (horaFim - horaInicio);
            return true;
        }else{
            return false;
        }
    }
}