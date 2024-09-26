package br.edu.univille.poo.jpa.repositorio;

import br.edu.univille.poo.jpa.modelo.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepositorio extends JpaRepository<Album, Long> {
}
