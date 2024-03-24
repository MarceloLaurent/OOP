package main;

import controller.Musica;
import controller.Playlist;

public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.setDonoPlaylist("Marcelo");

        Musica musica1 = new Musica("Money For Nothing", "Mark Knopfler", "Vertigo");
        Musica musica2 = new Musica("Kickstart My Heart", "Nikki Sixx", "Warner");
        Musica musica3 = new Musica("Fortunate Son", "John Fogerty", "Fantasy Records");

        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);
        playlist.adicionarMusica(musica3);

        System.out.println(playlist.tocarMusica());
    }
}