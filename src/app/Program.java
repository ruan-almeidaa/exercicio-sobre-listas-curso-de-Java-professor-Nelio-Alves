package app;

import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        
        System.out.println("informe quantos funcionarios serão cadastrados: ");
        int contador = sc.nextInt();
        
        for(int i = 0; i < contador; i++){
            System.out.println("Informe o ID do funcionario");
            int temp_id = sc.nextInt();
            System.out.println("Informe o nome do funcionario");
            sc.nextLine();
            String temp_nome = sc.nextLine();
            System.out.println("informe o salario do funcionario");
            double temp_salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario(temp_id, temp_nome, temp_salario);
            listaFuncionarios.add(funcionario);
            
        }
        System.out.println("entre com o ID do funcionario que deve receber aumento");
        int idAumentarSalario = sc.nextInt();
        Integer posicao = posicaoID(listaFuncionarios, idAumentarSalario);
        if(posicao == null){
            System.out.println("esse id nao existe");
        }
        else{
            System.out.println("entre com a porcentagem");
            double temp_porcentagem = sc.nextDouble();
            listaFuncionarios.get(posicao).AumentaSalario(temp_porcentagem);
        }
        
        System.out.println("");
        System.out.println("Lista de funcionarios");
        for (Funcionario funcionario: listaFuncionarios){
            System.out.println(funcionario);
        }
        
        
           
        sc.close();
        }
    
    public static Integer posicaoID(List<Funcionario> lista, int id){
        for(int i = 0; i < lista.size(); i++){
            if (lista.get(i).getId()== id){
                return i;
            }
        }
        return null;
        
    }
    
}
