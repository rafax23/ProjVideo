/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projvideo;

/**
 *
 * @author Rafael
 */
public class ProjVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //VIDEO implementa inteface AcoesVideo
        Video v1 = new Video("Filme Click", 10, 99, 5, false);
        v1.teste();
        
        //UsoPessoa estende a abstrata Pessoa
        //UsoPessoa p1 = new UsoPessoa("Login Rafal", 1);
        
        //!! Construtor incorreto
        //UsoPessoa p1 = new UsoPessoa("Login Rafal", 1, "Pessoa Rafael", "M", 0);
        
        UsoPessoa p1 = new UsoPessoa("Login Rafael", "Nome Rafael", 23, "M");
        //superclasse abstrata
        p1.teste(); 
        p1.ganhaXp();
        //subclasse
        p1.testeSub(); 
        p1.viuMaisUm();
        p1.ver();
        
        
        
    }
    
}
