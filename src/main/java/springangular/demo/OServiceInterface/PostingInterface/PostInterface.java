package springangular.demo.OServiceInterface.PostingInterface;

import springangular.demo.ZModel.APostData;

import java.util.List;

public interface PostInterface {
    APostData savePost (APostData post);
    List<APostData> getAllPosts ();
}
