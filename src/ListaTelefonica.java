import java.util.HashMap;
import java.util.Map;

public class ListaTelefonica {

    private Map<String, String > contatos;

    public ListaTelefonica(){
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String numero){
        contatos.put(nome, numero);
    }

    public String getNumero(String nome){
        return contatos.get(nome);
    }

    public void removerContato(String nome){
        contatos.remove(nome);
    }

    public void listarContatos(){
        System.out.println("Lista telefonica: ");
        for (Map.Entry<String, String> entry : contatos.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
