package br.com.santander.mssx.mssx.repository;

import br.com.santander.mssx.mssx.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IAlunoRepository extends JpaRepository<Aluno,Integer> {
    @Override
    List<Aluno> findAllById(Iterable<Integer> integers);

}
