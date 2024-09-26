package br.edu.univille.poo.jpa.repositorio;

import br.edu.univille.poo.jpa.modelo.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepositorio extends JpaRepository<Artista, Long> {
}
