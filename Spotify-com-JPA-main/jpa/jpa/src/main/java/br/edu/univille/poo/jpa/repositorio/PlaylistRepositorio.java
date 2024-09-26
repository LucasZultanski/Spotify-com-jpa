package br.edu.univille.poo.jpa.repositorio;

import br.edu.univille.poo.jpa.modelo.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepositorio extends JpaRepository<Playlist, Long> {
}
