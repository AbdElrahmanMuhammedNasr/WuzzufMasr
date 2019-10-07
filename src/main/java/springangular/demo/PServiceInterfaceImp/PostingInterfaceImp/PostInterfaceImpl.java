package springangular.demo.PServiceInterfaceImp.PostingInterfaceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springangular.demo.OServiceInterface.PostingInterface.PostInterface;
import springangular.demo.XReposotiry.PostDataRepo;
import springangular.demo.ZModel.APostData;
import springangular.demo.ZModel.AnUser;

import java.util.List;

@Service
public class PostInterfaceImpl implements PostInterface {

    @Autowired
    private PostDataRepo postDataRepo;

    @Override
    public APostData savePost(APostData post) {
        return postDataRepo.save(post);
    }

    @Override
    public List<APostData> getAllPosts() {
        return postDataRepo.findAll();
    }

    @Override
    public void deletePost(Long id) {
        postDataRepo.deleteById(id);
    }
}
