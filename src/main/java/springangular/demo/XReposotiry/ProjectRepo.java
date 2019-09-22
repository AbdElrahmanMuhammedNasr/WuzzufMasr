package springangular.demo.XReposotiry;

import org.springframework.data.jpa.repository.JpaRepository;
import springangular.demo.ZModel.AProject;
import springangular.demo.ZModel.AnUser;

import java.util.List;

public interface ProjectRepo extends JpaRepository<AProject,Long> {
    List<AProject> findByUser(AnUser user);
}
