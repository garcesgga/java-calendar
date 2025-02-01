package agenda;

public class UsaAgenda {
    public static void main(String[] args) {
        
        Agenda ag = new Agenda();
        
        ag.inserir("Vinicius", "7777-7777");
        ag.inserir("Rosalen", "8888-8888");
        ag.inserir("Maria", "66666-66666");
        
        System.out.println(ag.buscar("Rosalen"));
        
        System.out.println(ag.tamanho());
    }
}
