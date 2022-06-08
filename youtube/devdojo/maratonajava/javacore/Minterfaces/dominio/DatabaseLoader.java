package youtube.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do Banco de Dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no Banco de Dados.");
    }
}
