package ar.com.karkanis.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.karkanis.api.entity.Album;
import ar.com.karkanis.api.repository.AlbumsRepository;
import ar.com.karkanis.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;

	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

}
