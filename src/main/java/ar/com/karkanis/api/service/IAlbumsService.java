package ar.com.karkanis.api.service;

import java.util.List;

import ar.com.karkanis.api.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodos();
	
	void guardar(Album album);
	
	void eliminar(int idAlbum);
}
