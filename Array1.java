/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

import java.util.Scanner;

/**
 *
 * @author 17214290023
 */
public class Array1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nAlunos, nNotas;
        
        //lê número de alunos e notas a serem lidas
        System.out.println("Informe a quantidade de alunos que serão lidos: ");
        nAlunos = scan.nextInt();
        
        System.out.println("Informe a quantidade de notas a serem lidas");
        nNotas = scan.nextInt();
        
        //int[] alunos = new int[nAlunos];
        double[][] notas = new double[nAlunos][nNotas];
        
        String[] nomeAluno = new String[nAlunos];
        int alunoLista;
        
        
        for(int i = 0; i < nAlunos; i++){
            System.out.println("Digite o nome do "+(i+1)+"ª aluno: ");  //Pegando os nomes dos alunos
            nomeAluno[i] = scan.next();
        }
        
        int continua = 0;
        do{
            
            System.out.println("- - - - - LISTA DE ALUNOS - - - - -");      //Lista com os nomes dos alunos 
            for (int i = 0; i < nAlunos; i++) {
                System.out.println(i + ". " + nomeAluno[i]);
        }
            
            
            //Informe para escolher o número do aluno na lista ou sai do programa
            System.out.println("Digite o número do aluno desejado, [-1 para sair]: ");
            alunoLista = scan.nextInt();
            continua = alunoLista;
            
            //escolha sair do programa ou escolher um aluno da lista
            if (alunoLista == -1) {
                System.out.println("Você saiu do programa.");
            } else {                                        //pega as notas do aluno escolhido
                for (int j = 0; j < nNotas; j++) {
                    System.out.println("Digite a " + (j + 1) + "ª nota do " + nomeAluno[alunoLista]);
                    notas[alunoLista][j] = scan.nextDouble();
                }
                
                System.out.println("- - - - - LISTA DE ALUNOS - - - - -");      //Lista com os nomes dos alunos 
                for (int i = 0; i < nAlunos; i++) {
                    System.out.println(i + ". " + nomeAluno[i]);
        }   
                int alunoMedia;
                System.out.println("Escolha o número do aluno que deseja saber a média: ");
                alunoMedia = scan.nextInt();
                double soma = 0;
                for(int i = 0; i < nNotas; i++){
                    soma += notas[alunoMedia][i];
                }
                System.out.println("Média do "+nomeAluno[alunoMedia]+": "+(soma/nNotas));
                
                
            }
        }while(continua >= 0);
        
        //mostra o nome do aluno e todas as suas notas
        System.out.println("\n\n- - - - Notas dos alunos - - - -");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("- " + nomeAluno[i] + ": ");
            for (int j = 0; j < nNotas; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
            }
        }
        System.out.println("Programa encerrado!");
        }
        
        
        
        
    }

