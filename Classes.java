//Criação da classe principal
public class Main {
   
// Método q inicia o código
    public static void main (String[] args){
       
//Instâcia ou seja, a crição do objeto
        Pessoa pessoa1 = new Pessoa();
       
//inserindo o valor no atributo nome, da Classe Pessoa
        pessoa1.nome = "Davi";
        
//Inserindo o valor no atributo idade, da classe Pessoa
        pessoa1.idade = 37;
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Cris";
        pessoa2.idade = 29; 
        
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
    }
}

//Criação da classe Pessoa 
class Pessoa{
    String nome;
    int idade;
}
