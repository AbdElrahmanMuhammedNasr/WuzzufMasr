package springangular.demo.OServiceInterface.AllUserDataInterface;

import springangular.demo.ZModel.AProject;
import springangular.demo.ZModel.AnUser;

import java.util.List;

public interface ProjectsInterface {
  List<AProject> getUserProjects(AnUser user);
  AProject addProject (AProject project);
  void deleteProject(Long id);
  AProject getOneProject(Long id);
}
