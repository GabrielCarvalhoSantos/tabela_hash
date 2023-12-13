public class Main {

    public static void main(String[] args) {

        ListaTelefonica listaTelefonica = new ListaTelefonica();

        // Adicionando alguns contatos
        listaTelefonica.adicionarContato("Gabriel", "79 010101001");
        listaTelefonica.adicionarContato("Jao", "79 101001010");
        listaTelefonica.adicionarContato("Jose", "79 000111000");

        // Listando os contatos
        listaTelefonica.listarContatos();

        // Obtendo o número de telefone de um contato
        String numeroJao = listaTelefonica.getNumero("Jao");
        System.out.println("Numero de telefone de Maria: " + numeroJao);

        // Removendo um contato
        listaTelefonica.removerContato("Jose");

        // Listando os contatos após a remoção
        listaTelefonica.listarContatos();
    }
}
