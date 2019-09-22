package springangular.demo.XReposotiry;

import org.springframework.data.jpa.repository.JpaRepository;
import springangular.demo.ZModel.AnExperience;
import springangular.demo.ZModel.AnUser;

import java.util.List;

public interface ExperienceRepo extends JpaRepository<AnExperience,Long> {

    List<AnExperience> findByUser(AnUser user);
}
