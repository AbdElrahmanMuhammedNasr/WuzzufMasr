package springangular.demo.AinitData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springangular.demo.XReposotiry.*;
import springangular.demo.ZModel.*;

import java.util.Date;

@Component
public class userDataInit implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ExperienceRepo experienceRepo;


    @Autowired
    private ProjectRepo projectRepo;


    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private PostDataRepo postDataRepo;

    @Autowired
    private FriendsRepo friendsRepo;


    @Override
    public void run(String... args) throws Exception {


        AnUser u1 = new AnUser();
        u1.setUsername("abdo Nasr");
        u1.setEmail("abdo@gmail.com");
        u1.setDataOfBirth(new Date(8/8/1998));
        u1.setPhone("01550449049");
        u1.setGender("male");

        Friends f1 = new Friends();
        f1.setFriends("El-Tarek Ragab");
        f1.setUser(u1);

        Friends f2 = new Friends();
        f2.setFriends("Mustafa Abdallah");
        f2.setUser(u1);




        ACourse c1 = new ACourse();
        c1.setCourseName("Java");
        c1.setUser(u1);

        AProject p1 = new AProject();
        p1.setProjectName("facebook");
        p1.setToWho("mark");
        p1.setMembers("mustafe-tarek");
        p1.setRole("admin");
        p1.setLink("www.facebook.com");
        p1.setUser(u1);



        AnExperience e1 = new AnExperience();
        e1.setFields("java");
        e1.setYears(new Long(5));
        e1.setCompanyName(".comCompany");
        e1.setUser(u1);


        APostData postData1 = new APostData();
        postData1.setJobName("java Developer");
        postData1.setRequire("spring boot");
        postData1.setNumberOfEmp(new Long(2));
        postData1.setField("web");
        postData1.setPostedIn(new Date());
        postData1.setUser(u1);



        /*******************************************************************************************************/

        AnUser u2 = new AnUser();
        u2.setUsername("El-Tarek Ragab");
        u2.setEmail("tarel@gmail.com");
        u2.setDataOfBirth(new Date(8/8/1998));
        u2.setPhone("01050669049");
        u2.setGender("male");


        ACourse c2 = new ACourse();
        c2.setCourseName("c++");
        c2.setUser(u2);

        AProject p2 = new AProject();
        p2.setProjectName("youtube");
        p2.setToWho("sadd");
        p2.setMembers("mustafe");
        p2.setRole("backend");
        p2.setLink("www.youtibe.com");
        p2.setUser(u2);



        AnExperience e2 = new AnExperience();
        e2.setFields("c++");
        e2.setYears(new Long(10));
        e2.setCompanyName("T.com");
        e2.setUser(u2);




        APostData postData2 = new APostData();
        postData2.setJobName("python Developer");
        postData2.setRequire("Django");
        postData2.setNumberOfEmp(new Long(5));
        postData2.setField("web");
        postData2.setPostedIn(new Date());
        postData2.setUser(u2);


        APostData postData3 = new APostData();
        postData3.setJobName("php Developer");
        postData3.setRequire("laravel");
        postData3.setNumberOfEmp(new Long(8));
        postData3.setField("web");
        postData3.setPostedIn(new Date());
        postData3.setUser(u2);

        /**********************************************************************************************/
        AnUser u3 = new AnUser();
        u3.setUsername("Mustafa Abdallah");
        u3.setEmail("mustafa@gmail.com");
        u3.setDataOfBirth(new Date(8/8/1998));
        u3.setPhone("01155559040");
        u3.setGender("male");

        Friends f3 = new Friends();
        f3.setFriends("abdo Nasr");
        f3.setUser(u3);


        ACourse c3 = new ACourse();
        c3.setCourseName("php");
        c3.setUser(u3);

        AProject p3 = new AProject();
        p3.setProjectName("whatsApp");
        p3.setToWho("jhin");
        p3.setMembers("abdo-tarek");
        p3.setRole("noThing");
        p3.setLink("www.whatsApp.com");
        p3.setUser(u3);



        AnExperience e3 = new AnExperience();
        e3.setFields("php");
        e3.setYears(new Long(2));
        e3.setCompanyName(null);
        e3.setUser(u3);

        APostData postData4 = new APostData();
        postData4.setJobName("php Developer");
        postData4.setRequire("laravel");
        postData4.setNumberOfEmp(new Long(8));
        postData4.setField("web");
        postData4.setPostedIn(new Date());
        postData4.setUser(u3);


        APostData postData5 = new APostData();
        postData5.setJobName("php Developer");
        postData5.setRequire("laravel");
        postData5.setNumberOfEmp(new Long(8));
        postData5.setField("web");
        postData5.setPostedIn(new Date());
        postData5.setUser(u3);


        APostData postData6 = new APostData();
        postData6.setJobName("php Developer");
        postData6.setRequire("laravel");
        postData6.setNumberOfEmp(new Long(8));
        postData6.setField("web");
        postData6.setPostedIn(new Date());
        postData6.setUser(u3);


        userRepo.save(u1);
        friendsRepo.save(f1);
        friendsRepo.save(f2);

        courseRepo.save(c1);
        projectRepo.save(p1);
        experienceRepo.save(e1);

        postDataRepo.save(postData1);

        userRepo.save(u2);
        courseRepo.save(c2);
        projectRepo.save(p2);
        experienceRepo.save(e2);
        postDataRepo.save(postData2);
        postDataRepo.save(postData3);


        userRepo.save(u3);
        courseRepo.save(c3);
        projectRepo.save(p3);
        experienceRepo.save(e3);
        postDataRepo.save(postData4);
        postDataRepo.save(postData5);
        postDataRepo.save(postData6);
        friendsRepo.save(f3);





    }
}

