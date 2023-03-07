import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Musica m1 = new Musica("Espelho","João Nogueira",
                LocalTime.of(0,4,29),"samba");
        m1.mostrarDados();

        Musica m2 = new Musica("O Mundo é um Moinho", "Cartola",
                LocalTime.of(0,3,53),"samba");
        m2.mostrarDados();

        Playlist playlist = new Playlist("Sambas");
        playlist.adiconarMusica(m1);
        playlist.adiconarMusica(m2);
        playlist.mostrarDados();
        System.out.println("Tempo total da playlist "+ playlist.getNome()
                       +": " + playlist.calcularDuracao());

    }
}