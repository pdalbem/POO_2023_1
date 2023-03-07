import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Musica m1 = new Musica("Musica1","artista",
                LocalTime.of(0,3,20),"rock");
        m1.mostrarDados();

        Musica m2 = new Musica("Musica2", "artista",
                LocalTime.of(0,3,50),"rock");
        m2.mostrarDados();

        Playlist playlist = new Playlist("Minha playlist");
        playlist.adiconarMusica(m1);
        playlist.adiconarMusica(m2);
        playlist.mostrarDados();
        System.out.println("Duracao: "+ playlist.calcularDuracao());

    }
}