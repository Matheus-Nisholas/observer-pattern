import java.util.ArrayList;
import java.util.List;

public class CanalDeNoticias implements Subject {
    private List<Observer> usuarios = new ArrayList<>();

    @Override
    public void registrarObservador(Observer o) {
        usuarios.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        usuarios.remove(o);
    }

    @Override
    public void notificarObservadores(String noticia) {
        for (Observer usuario : usuarios) {
            usuario.atualizar(noticia);
        }
    }

    public void novaNoticia(String noticia) {
        System.out.println("Nova notícia publicada: " + noticia);
        notificarObservadores(noticia);
    }
}
