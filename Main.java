
public class Main
{
	public static void main(String[] args) {
		Pneu pneu = new Pneu(123, "Pirelli", 110);
		
		System.out.println("Id do pneu: " + pneu.getIdPneu());
		System.out.println("Modelo do pneu: " + pneu.getModelo());
		System.out.println("Indice de uso: " + pneu.getIndiceDeUso());
		System.out.println("Estado do pneu: " + pneu.getEstado());
		System.out.println("Horas de uso do pneu: " + pneu.getHorasDeUso());
		
		System.out.println();
		
		if(pneu.desgastar(4, 14)){
		    System.out.println("Indice de uso: " + pneu.getIndiceDeUso());
		}else{
		    System.out.println("Pneu fora de uso!");
		}
    
		if(pneu.desgastar(15, 20)){
		    System.out.println("Indice de uso: " + pneu.getIndiceDeUso());
		}else{
		    System.out.println("Pneu fora de uso!");
		}
		
		if(pneu.desgastar(21, 23)){
		    System.out.println("Indice de uso: " + pneu.getIndiceDeUso());
		}else{
		    System.out.println("Pneu fora de uso!");
		}
    }
}
