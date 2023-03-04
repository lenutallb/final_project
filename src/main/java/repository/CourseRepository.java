package repository;

import entities.Course;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public class CourseRepository implements CrudRepository<Course, Long> {

    @Override
    public <S extends Course> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Course> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Course> findById(Long integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long integer) {
        return false;
    }

    public Course findByEmail(String email) {return null;}

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Iterable<Course> findAllById(Iterable<Long> longs) {
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
    public void delete(Course entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Course> entities) {

    }

    @Override
    public void deleteAllById (Iterable<? extends Long> integers){
    }

    @Override
    public void deleteAll() {

    }
}

