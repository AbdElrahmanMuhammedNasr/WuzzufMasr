package springangular.demo.PServiceInterfaceImp.AllUserInterfaceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springangular.demo.OServiceInterface.AllUserDataInterface.CourseInterface;
import springangular.demo.XReposotiry.CourseRepo;
import springangular.demo.ZModel.ACourse;
import springangular.demo.ZModel.AnUser;

import java.util.List;

@Service
public class CourseInterfaceImpl implements CourseInterface {
    @Autowired
    private CourseRepo courseRepo;
    @Override
    public List<ACourse> getUserCourse(AnUser user) {
        return courseRepo.findByUser(user);
    }

    @Override
    public ACourse addCourse(ACourse course) {
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }

    @Override
    public ACourse getOneCourse(Long id) {
        return courseRepo.findById(id).get();
    }


}
