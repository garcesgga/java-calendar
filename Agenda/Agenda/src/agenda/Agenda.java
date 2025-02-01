package agenda;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

       Map<String, String> colecaoDados = new HashMap<>();
        
       void inserir(String nome, String telefone){
           colecaoDados.put(nome, telefone);
       }
       
       String buscar(String nome){
           return colecaoDados.get(nome);
       }
   
       int tamanho(){
           return  colecaoDados.size();
       }
}

