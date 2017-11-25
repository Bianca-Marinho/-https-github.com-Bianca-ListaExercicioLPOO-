package lista;
public abstract class CartaoWeb {
    String destinatario;
    String remetente;

    public CartaoWeb() {
        this.destinatario = destinatario;
        this.remetente = remetente;
    }
    
    public void retornarMensagem (){
        
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }
    
}
