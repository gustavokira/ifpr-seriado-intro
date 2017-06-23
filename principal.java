import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    Ator a1 = new Ator();
    a1.nome = "Bryan Cranston";
    
    Ator a2 = new Ator();
    a2.nome = "Aaron Paul";
    
    Ator a3 = new Ator();
    a3.nome = "Anna Gunn";
    
    Ator a4 = new Ator();
    a4.nome = "Betsy Brandt";
    
    Ator a5 = new Ator();
    a5.nome = "Benedict Cumberbatch";
    
    Ator a6 = new Ator();
    a6.nome = "Martin Freeman";
    
    Ator a7 = new Ator();
    a7.nome = "Amanda Abbington";
    
    Ator a8 = new Ator();
    a8.nome = "Colin Hanks";
    
    Ator a9 = new Ator();
    a9.nome = "Allison Tolman";
    
    Seriado s1 = new Seriado();
    s1.nome = "Breaking Bad";
    
    Personagem p1 = new Personagem();
    p1.nome = "Walter White";
    p1.ator = a1;
    
    Personagem p2 = new Personagem();
    p2.nome = "Jesse Pinkman";
    p2.ator = a2;
    
    Personagem p3 = new Personagem();
    p3.nome = "Skyler White";
    p3.ator = a3;
    
    Personagem p4 = new Personagem();
    p4.nome = "Marie Schrader";
    p4.ator = a4;
    
    s1.personagens.add(p1);
    s1.personagens.add(p2);
    s1.personagens.add(p3);
    s1.personagens.add(p4);
    
    Seriado s2 = new Seriado();
    s2.nome = "Sherlock";
    
    Personagem p5 = new Personagem();
    p5.nome = "Sherlock Holmes";
    
    Personagem p6 = new Personagem();
    p6.nome = "Dr. John Watson";
    
    Personagem p7 = new Personagem();
    p7.nome = "Mary Watson";
    
    s2.personagens.add(p5);
    s2.personagens.add(p6);
    s2.personagens.add(p7);
    
    Seriado s3 = new Seriado();
    s3.nome = "Fargo";
    
    Personagem p8 = new Personagem();
    p8.nome = "Gus Grimly";
    p8.ator = a8;
    
    Personagem p9 = new Personagem();
    p9.nome = "Molly Solverson";
    p9.ator = a9;
    
    Personagem p10 = new Personagem();
    p10.nome = "Lester Nygaard";
    p10.ator = a6;
    
    s3.personagens.add(p7);
    s3.personagens.add(p8);
    s3.personagens.add(p9);
    s3.personagens.add(p10);
    
    System.out.println(s1.nome);
    s1.listarTodosOsNomesDosPersonagens();
    System.out.println("");
    
    System.out.println(s2.nome);
    s2.listarTodosOsNomesDosPersonagens();
    System.out.println("");
    
    System.out.println(s3.nome);
    s3.listarTodosOsNomesDosPersonagens();
  }
}

class Seriado{
  String nome;
  ArrayList<Personagem> personagens;
  
  public Seriado(){
    this.personagens = new ArrayList<Personagem>();
  }
  
  public void listarTodosOsNomesDosPersonagens(){
    for(int i =0;i<this.personagens.size();i++){
      String nomeAtual = this.personagens.get(i).nome;
      System.out.println(nomeAtual);
    }
  }
}

class Personagem{
  String nome;
  Ator ator;

  public Personagem(){

  }

  public String pegarNomeDoAtor(){
    return this.ator.nome;
  }
}

class Ator{
  String nome;

  public Ator(){
    
  }
}