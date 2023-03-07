import java.time.LocalTime;

public class Musica {
    private String titulo;
    private String artista;
    private LocalTime duracao;
    private String estilo;

    public void mostrarDados(){
        System.out.println("\n Título: "+ titulo +
                           "\n Artista: " + artista +
                            "\n Duração: " + duracao +
                             "\n Estilo: "+ estilo);
    }

    public Musica() {
    }

    public Musica(String titulo, String artista, LocalTime duracao, String estilo) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.estilo = estilo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
