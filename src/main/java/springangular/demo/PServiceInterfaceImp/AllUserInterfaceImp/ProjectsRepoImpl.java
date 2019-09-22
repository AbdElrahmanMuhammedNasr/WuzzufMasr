package springangular.demo.PServiceInterfaceImp.AllUserInterfaceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springangular.demo.OServiceInterface.AllUserDataInterface.ProjectsInterface;
import springangular.demo.XReposotiry.ProjectRepo;
import springangular.demo.ZModel.AProject;
import springangular.demo.ZModel.AnUser;

import java.util.List;

@Service
public class ProjectsRepoImpl implements ProjectsInterface {
    @Autowired
    private ProjectRepo projectRepo;
    @Override
    public List<AProject> getUserProjects(AnUser user) {
        return projectRepo.findByUser(user);
    }

    @Override
    public AProject addProject(AProject project) {
        return projectRepo.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepo.deleteById(id);
    }

    @Override
    public AProject getOneProject(Long id) {
        return projectRepo.findById(id).get();
    }
}
