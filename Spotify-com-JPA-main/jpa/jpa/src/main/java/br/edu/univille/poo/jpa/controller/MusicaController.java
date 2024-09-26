package br.edu.univille.poo.jpa.controller;

import br.edu.univille.poo.jpa.modelo.Usuario;
import br.edu.univille.poo.jpa.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio usuarioRepository;

    // 1. Metodo para registrar um novo usuário
    @PostMapping("/register")
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioRepository.save(usuario));
    }

    // 2. Metodo para fazer login
    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
        Usuario encontrado = usuarioRepository.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
        return encontrado != null ? ResponseEntity.ok(encontrado) : ResponseEntity.status(401).build();
    }

    // 3. Metodo para listar todos os usuários
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }
}
