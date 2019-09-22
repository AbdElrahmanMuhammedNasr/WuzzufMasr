package springangular.demo.PServiceInterfaceImp.FriendsInterfaceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springangular.demo.OServiceInterface.FriendsInterface.FriendsInterface;
import springangular.demo.XReposotiry.FriendsRepo;
import springangular.demo.ZModel.AnUser;
import springangular.demo.ZModel.Friends;

import java.util.List;

@Service
public class FriendsInterfaceImpl implements FriendsInterface {
    @Autowired
    private FriendsRepo friendsRepo;

    @Override
    public List<Friends> getAllFriends(AnUser user)
    {
        return friendsRepo.findByUser(user);
    }
}
