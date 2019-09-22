package springangular.demo.OServiceInterface.FriendsInterface;

import springangular.demo.ZModel.AnUser;
import springangular.demo.ZModel.Friends;

import java.util.List;

public interface FriendsInterface {
    List<Friends> getAllFriends(AnUser user);
}
