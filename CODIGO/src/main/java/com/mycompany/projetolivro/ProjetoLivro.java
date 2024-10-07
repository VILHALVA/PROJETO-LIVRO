package com.mycompany.projetolivro;

import java.util.Scanner;

public class ProjetoLivro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        for (int i = 0; i < p.length; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Nome:\n>>> ");
            String nome = input.nextLine();
            System.out.print("Idade:\n>>> ");
            int idade = input.nextInt();
            System.out.print("Gênero (M/F):\n>>> ");
            String genero = input.next();
            input.nextLine(); 
            p[i] = new Pessoa(nome, idade, genero);
        }

        for (int i = 0; i < l.length; i++) {
            System.out.println("\nLivro " + (i + 1));
            System.out.print("Título:\n>>> ");
            String titulo = input.nextLine();
            System.out.print("Autor:\n>>> ");
            String autor = input.nextLine();
            System.out.print("Número de páginas:\n>>> ");
            int paginas = input.nextInt();
            System.out.println("Escolha o dono do livro: 1 para " + p[0].getNome() + " ou 2 para " + p[1].getNome());
            int dono = input.nextInt() - 1; 
            input.nextLine(); 
            l[i] = new Livro(titulo, autor, paginas, p[dono]);
        }

        l[0].abrir();
        System.out.print("\nEscolha uma página para folhear no livro 1:\n>>> ");
        int pagina = input.nextInt();
        l[0].folhear(pagina);
        l[0].avancarPag();
        
        // Exibindo detalhes dos livros
        System.out.println("\nDetalhes dos livros:\n");
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        
        input.close();
    }
}
