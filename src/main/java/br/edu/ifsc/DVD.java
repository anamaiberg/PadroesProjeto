package br.edu.ifsc;

import java.io.Serializable;

public class DVD extends MediaOptica implements Serializable{
    public DVD(String descricao, String nomeArtista, String nomeAlbum, Integer duracao){
        super(descricao, nomeArtista, nomeAlbum, duracao);
    }
}
