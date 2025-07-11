public class ExemploObserver {
    public static void main(String[] args) {
        CanalDeNoticias canal = new CanalDeNoticias();

        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");

        canal.registrarObservador(joao);
        canal.registrarObservador(maria);

        canal.novaNoticia("Saiu a nova atualização do Java!");
        canal.novaNoticia("Notícia urgente: Padrões de Projeto caem na prova!");
    }
}
