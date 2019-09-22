package springangular.demo.OServiceInterface.AllUserDataInterface;

import springangular.demo.ZModel.ACourse;
import springangular.demo.ZModel.AnUser;

import java.util.List;

public interface CourseInterface {
    List<ACourse> getUserCourse (AnUser user);
    ACourse addCourse (ACourse course);
    void deleteCourse(Long id);
    ACourse getOneCourse(Long id);
}
