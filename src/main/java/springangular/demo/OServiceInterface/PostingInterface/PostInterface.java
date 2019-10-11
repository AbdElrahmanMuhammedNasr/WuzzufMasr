package springangular.demo.OServiceInterface.PostingInterface;

import springangular.demo.ZModel.APostData;
import springangular.demo.ZModel.AnUser;

import java.util.List;

public interface PostInterface {
    APostData savePost (APostData post);
    List<APostData> getAllPosts ();
    void deletePost( Long id);
    APostData getPost(Long id);
}
