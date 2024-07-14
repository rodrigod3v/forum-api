package br.com.forum_hub_api.forum.api.repository;

import br.com.forum_hub_api.forum.api.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}