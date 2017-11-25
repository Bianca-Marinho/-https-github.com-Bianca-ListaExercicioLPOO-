package lista;

public class Aniversario extends CartaoWeb {
    
    public Aniversario() {
        super ();
    }
    
    public void retonarMensagem (){
        System.out.println("Querida "+this.getDestinatario());
        System.out.println("Feliz Aniversário!");
        System.out.println("Te desejo um dia lindo cheio de diversão e muita alegria junto das pessoas que você ama!");
        System.out.println("De todo meu coração!"+this.getRemetente());
    }
}
