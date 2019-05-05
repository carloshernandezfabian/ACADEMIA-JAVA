package CursoJava;

public class EstructuraIf {
	
	public static void main(String [] args) {
	
	int temperatura = 10;
    boolean haceSol=true, nevando=false;
    
    if(temperatura >25){
    System.out.println("A la playa !!");
    }
    // Si hace sol es verdadero
    if(haceSol){
    System.out.println("No te olvides la sombrilla");
    }
    // si esta nevando o hace sol
    if(nevando || haceSol){
    System.out.println("Que bien !");
    }
    //  si nevando y la temperatura esta entre 20 y 30
    if(nevando && (temperatura >= 20 && temperatura <= 30)){
    System.out.println("No me lo creo");
    }
    // si la temperatura es menor que 0 o masyor que 30 y hace sol
    if ((temperatura < 0 || temperatura > 30) && haceSol){
    System.out.println("Mejor me quedo en casa");
    }
  }
}
