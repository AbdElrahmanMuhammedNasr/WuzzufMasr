package springangular.demo.XReposotiry;

import org.springframework.data.jpa.repository.JpaRepository;
import springangular.demo.ZModel.AnUser;

public interface UserRepo extends JpaRepository<AnUser,Long> {

    AnUser  findByUsername(String username);
}
