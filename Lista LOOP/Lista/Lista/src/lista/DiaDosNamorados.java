package lista;
 
public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados() {
        super ();
    }
    public void retornarMensagem (){
        System.out.println("Querida "+this.destinatario+",");
        System.out.println("Feliz Dia dos Namorados!");
        System.out.println("O teu amor me faz forte! Teu amor me entende,me acalma, me acolhe! Você me fazmais feliz a cada dia!");
        System.out.println("De todo meu coração, "+this.remetente);
    }
    
}
