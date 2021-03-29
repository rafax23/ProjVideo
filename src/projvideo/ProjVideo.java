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
        //String oTitulo, float oAvaliacao, int oViewes, int oCurtidas, boolean oReproduzir
        Video v1 = new Video("Filme Click", 1, 99, 5, false);
        v1.teste();
        
        //UsoPessoa estende a abstrata Pessoa
        //UsoPessoa p1 = new UsoPessoa("Login Rafal", 1);
        
        //!! Construtor incorreto pois não usou o construtor na Super
        //UsoPessoa p1 = new UsoPessoa("Login Rafal", 1, "Pessoa Rafael", "M", 0);
        
        UsoPessoa p1 = new UsoPessoa("Login Rafael", "Nome Rafael", 23, "M");
        //superclasse abstrata
        p1.teste(); 
        p1.ganhaXp();
        //subclasse
        p1.testeSub(); 
        p1.viuMaisUm();
        p1.ver();
        
        //Visualizacao agrega as duas classes
        //p1 e v1 são objetos, para o toString de Visualização funcionar
        //precisa ter toString dentro de UsoPessoa e de Video
        //se não, retorna o nome do objetoda na memória e aí... 
        //tem que acessar os getters de cada classe para pegar os nomes
        Visualizacao ver1 = new Visualizacao(p1,v1);
        System.out.println(ver1.toString());
        
        ver1.avaliar(87f);
        System.out.println(ver1.toString());
        
        
        
    }
    
}
