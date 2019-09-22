package springangular.demo.PServiceInterfaceImp.AllUserInterfaceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springangular.demo.OServiceInterface.AllUserDataInterface.ExperenceInterface;
import springangular.demo.XReposotiry.ExperienceRepo;
import springangular.demo.ZModel.AnExperience;
import springangular.demo.ZModel.AnUser;

import java.util.List;

@Service
public class ExperenceInterfaceImpl implements ExperenceInterface {
    @Autowired
    private ExperienceRepo experienceRepo;

    @Override
    public List<AnExperience> getUserExper(AnUser user) {

        return experienceRepo.findByUser(user);
    }

    @Override
    public AnExperience addExperience(AnExperience experience) {
        return experienceRepo.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepo.deleteById(id);
    }

    @Override
    public AnExperience getOneExperience(Long id) {
        return experienceRepo.findById(id).get();
    }
}
