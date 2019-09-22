package springangular.demo.OServiceInterface.AllUserDataInterface;

import springangular.demo.ZModel.AnExperience;
import springangular.demo.ZModel.AnUser;

import java.util.List;

public interface ExperenceInterface {

   List<AnExperience> getUserExper(AnUser user);
   AnExperience addExperience(AnExperience experience);
   void deleteExperience(Long id);
   AnExperience getOneExperience(Long id);

}
