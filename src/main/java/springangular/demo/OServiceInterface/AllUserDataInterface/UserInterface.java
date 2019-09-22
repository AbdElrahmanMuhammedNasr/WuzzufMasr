package springangular.demo.OServiceInterface.AllUserDataInterface;

import springangular.demo.ZModel.AnUser;

import java.util.List;

public interface UserInterface {

    AnUser saveUser(AnUser user);
    List<AnUser> getAllUsers();
    AnUser getOneUser(Long id);

    AnUser getOneUser(String username);

}
