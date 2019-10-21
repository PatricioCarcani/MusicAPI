package ar.com.karkanis.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.karkanis.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
