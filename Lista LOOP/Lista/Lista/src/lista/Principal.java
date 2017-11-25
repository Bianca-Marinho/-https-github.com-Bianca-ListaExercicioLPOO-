package lista;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        DiaDosNamorados d = new DiaDosNamorados ();
        Aniversario a = new Aniversario ();
        Natal n = new Natal ();
        CartaoWeb c = new CartaoWeb () {};
        
        c.destinatario = JOptionPane.showInputDialog ("Qual o nome do Destinatário");
        c.remetente = JOptionPane.showInputDialog ("Qual o nome do Remetente"); 
        
        int [] cartaoweb = new int [3];
        int i;
        for (i =0; i <= 3; i++){
            if (i ==1){
                d.retornarMensagem();
            }
            if (i == 2){
                a.retonarMensagem();
            }
            if (i == 3){
                n.retornarMensagem();
            }
        }
    }
    
}
