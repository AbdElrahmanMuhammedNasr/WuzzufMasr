package springangular.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springangular.demo.OServiceInterface.AllUserDataInterface.CourseInterface;
import springangular.demo.OServiceInterface.AllUserDataInterface.ExperenceInterface;
import springangular.demo.OServiceInterface.AllUserDataInterface.ProjectsInterface;
import springangular.demo.OServiceInterface.AllUserDataInterface.UserInterface;
import springangular.demo.ZModel.ACourse;
import springangular.demo.ZModel.AProject;
import springangular.demo.ZModel.AnExperience;
import springangular.demo.ZModel.AnUser;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProfileControler {
    @Autowired
    private UserInterface userInterface;
    @Autowired
    private CourseInterface courseInterface;
    @Autowired
    private ExperenceInterface experenceInterface;
    @Autowired
    private ProjectsInterface projectsInterface;


    @PostMapping(value = {"/saveUser"})
    public void addUser(@RequestBody AnUser user){
        userInterface.saveUser(user);
    }

    /****************************************************/
    @GetMapping(value = {"/getAllUser"})
    public List<AnUser> getAll(){
          return userInterface.getAllUsers();
    }
    /*****************************************************/


    @GetMapping(value = {"/{username}/data"})
    public AnUser getUserinfo(@PathVariable("username") String username){
        return userInterface.getOneUser(username);
    }


    @GetMapping(value = {"/{username}/course"})
    public List<ACourse> getCourserUser(@PathVariable("username") String username){
        return courseInterface.getUserCourse(userInterface.getOneUser(username));
    }


    @GetMapping(value = {"/{username}/experience"})
    public List <AnExperience> getProjectUser(@PathVariable("username") String username){
        return experenceInterface.getUserExper(getUserinfo(username));
    }

    @GetMapping(value = {"/{username}/project"})
    public List<AProject> getProjectData(@PathVariable("username") String username){
        return projectsInterface.getUserProjects(getUserinfo(username));
    }
    /*********************************************************************************/
    @GetMapping(value = {"update/learn/{id}"})
    public ACourse getOneCourseToUpdate(@PathVariable("id") Long id){
        return courseInterface.getOneCourse(id);
    }

    @GetMapping(value = {"update/project/{id}"})
    public AProject getOneProjectToUpdate(@PathVariable("id") Long id){
        return projectsInterface.getOneProject(id);
    }

    @GetMapping(value = {"update/Experience/{id}"})
    public AnExperience getOneExperienceToUpdate(@PathVariable("id") Long id){
        return experenceInterface.getOneExperience(id);
    }


    /*******************************************************************************/

    @PostMapping(value = {"/{owner}/saveCourse/Save"})
    public void saveCourse(@PathVariable("owner") String owner, @RequestBody ACourse course){
        course.setUser(userInterface.getOneUser(owner));
         courseInterface.addCourse(course);
    }

    @PostMapping(value = {"/{owner}/saveExperience/Save"})
    public void saveExperience(@PathVariable("owner") String owner , @RequestBody AnExperience experience){
        experience.setUser(userInterface.getOneUser(owner));
        experenceInterface.addExperience(experience);
    }

    @PostMapping(value = {"/{owner}/saveProject/Save"})
    public void saveProject(@PathVariable("owner") String owner , @RequestBody AProject project){
        project.setUser(userInterface.getOneUser(owner));
        projectsInterface.addProject(project);
    }


    @DeleteMapping(value = {"deleteItem/{where}/{id}"})
    public boolean deleteItem(@PathVariable("where") String where,@PathVariable("id") Long id){
        System.out.println("Delete item s");
        switch (where){
            case "experience":  experenceInterface.deleteExperience(id); break;
            case "project" : projectsInterface.deleteProject(id); break;
            case "course":courseInterface.deleteCourse(id); break;
        }
        return true;
    }
}
