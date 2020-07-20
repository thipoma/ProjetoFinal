package br.com.isidrocorp.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.projetofinal.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	public Usuario findByEmailAndSenha(String email, String senha);

}
