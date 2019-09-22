package springangular.demo.XReposotiry;

import org.springframework.data.jpa.repository.JpaRepository;
import springangular.demo.ZModel.AnUser;
import springangular.demo.ZModel.Friends;

import java.util.List;

public interface FriendsRepo extends JpaRepository<Friends,Long> {

    List<Friends> findByUser(AnUser user);
}
