package lista;

public class Natal extends CartaoWeb {

    public Natal() {
        super ();
    }
    
    public void retornarMensagem (){
        System.out.println("Querida "+this.destinatario+",");
        System.out.println("Feliz Natal!");
        System.out.println("Desejo que o seu Natal seja brilhante de alegria, iluminado de amor, paz e harmonia.");
        System.out.println("De todo meu coração"+this.remetente);
    }
    
}
