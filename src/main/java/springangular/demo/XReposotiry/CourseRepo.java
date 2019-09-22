package springangular.demo.XReposotiry;

import org.springframework.data.jpa.repository.JpaRepository;
import springangular.demo.ZModel.ACourse;
import springangular.demo.ZModel.AnUser;

import java.util.List;

public interface CourseRepo extends JpaRepository<ACourse,Long> {
    List<ACourse> findByUser(AnUser user);
}
