package br.com.gustavosimoes.storeauthserver.repository;

import br.com.gustavosimoes.storeauthserver.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Authority findByName(String name);

}
