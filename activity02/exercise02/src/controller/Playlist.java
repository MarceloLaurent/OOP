package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {

    private String donoPlaylist;
    private final List<Musica> playlist = new ArrayList<>();

    public Playlist() {
    }

    public String getDonoPlaylist() {
        return donoPlaylist;
    }

    public void setDonoPlaylist(String donoPlaylist) {
        this.donoPlaylist = donoPlaylist;
    }

    public String tocarMusica(){
        return playlist.get((int) (Math.random() * (playlist.size()))).getNome();
    }

   public void adicionarMusica(Musica musica){
        playlist.add(musica);
   }
}
