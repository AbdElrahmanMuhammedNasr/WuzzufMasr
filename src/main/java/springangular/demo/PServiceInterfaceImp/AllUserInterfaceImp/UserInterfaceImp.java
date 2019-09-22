package springangular.demo.PServiceInterfaceImp.AllUserInterfaceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springangular.demo.OServiceInterface.AllUserDataInterface.UserInterface;
import springangular.demo.XReposotiry.UserRepo;
import springangular.demo.ZModel.AnUser;

import java.util.List;

@Service
public class UserInterfaceImp implements UserInterface {

    @Autowired
    private UserRepo userRepo;

    @Override
    public AnUser saveUser(AnUser user) {
        return userRepo.save(user);
    }

    @Override
    public List<AnUser> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public AnUser getOneUser(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public AnUser getOneUser(String username) {
        return userRepo.findByUsername(username);
    }
}
