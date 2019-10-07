package springangular.demo.XReposotiry;

import org.springframework.data.jpa.repository.JpaRepository;
import springangular.demo.ZModel.APostData;
import springangular.demo.ZModel.AnUser;

public interface PostDataRepo extends JpaRepository<APostData,Long> {


}
