package springangular.demo.XReposotiry;

import org.springframework.data.jpa.repository.JpaRepository;
import springangular.demo.ZModel.APostData;

public interface PostDataRepo extends JpaRepository<APostData,Long> {
}
