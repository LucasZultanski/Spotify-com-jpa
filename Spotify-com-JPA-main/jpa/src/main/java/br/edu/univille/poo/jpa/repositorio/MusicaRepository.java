package br.edu.univille.poo.jpa.repositorio;

import br.edu.univille.poo.jpa.modelo.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}
