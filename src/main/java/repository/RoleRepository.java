package repository;

import entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public class RoleRepository implements CrudRepository<Role, Long> {

    @Override
    public <S extends Role> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Role> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Role> findById(Long integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long integer) {
        return false;
    }

    public Role findByEmail(String email) {return null;}

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Iterable<Role> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long integer) {
    }

    @Override
    public void delete(Role entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Role> entities) {

    }

    @Override
    public void deleteAllById (Iterable<? extends Long> integers){
    }

    @Override
    public void deleteAll() {

    }
}

