package springangular.demo.AinitData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springangular.demo.XReposotiry.*;
import springangular.demo.ZModel.*;

import java.util.ArrayList;
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
        u1.setMyJob("Java Devleoper");
        u1.setUsername("abdo Nasr");
        u1.setEmail("abdo@gmail.com");
        u1.setDataOfBirth(new Date(8/8/1998));
        u1.setPhone("01550449049");
        u1.setCity("tanta");
        u1.setGender("male");
        u1.setShortCut("i am java developer   graduate from FCI  ");

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
            ArrayList<String> a = new ArrayList<>();
            a.add("springBoot");
            postData1.setRequire(a);
        postData1.setNumberOfEmp(new Long(2));
        postData1.setField("web");
        postData1.setPostedIn(new Date());

        postData1.setExperienceYears("2");
        postData1.setLevel("experience");
        postData1.setJopType("part Time / freelancer");
        postData1.setSalary(1000);
        postData1.setLanguage("arablc / English");

        postData1.setCvSender(new Long(5));

        postData1.setUser(u1);



        /*******************************************************************************************************/

        AnUser u2 = new AnUser();
        u2.setMyJob("C++ Devleoper");
        u2.setUsername("El-Tarek Ragab");
        u2.setEmail("tarel@gmail.com");
        u2.setDataOfBirth(new Date(8/8/1998));
        u2.setPhone("01050669049");
        u2.setCity("cairo - giza");
        u2.setGender("male");
        u2.setShortCut("i am java developer   graduate from FCI  ");



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
            ArrayList<String> a2 = new ArrayList<>();
            a2.add("springBoot");
            a2.add("c++");
            a2.add("python");
            a2.add("html");
            a2.add("css");

        postData2.setRequire(a2);
        postData2.setNumberOfEmp(new Long(5));
        postData2.setField("web");
        postData2.setPostedIn(new Date());
        postData2.setCvSender(new Long(3));
        postData2.setExperienceYears("6+");
        postData2.setLevel("experience");
        postData2.setJopType("part Time" );
        postData2.setSalary(500);
        postData2.setLanguage(" English");

        postData2.setUser(u2);


        APostData postData3 = new APostData();
        postData3.setJobName("php Developer");
        postData2.setRequire(a2);
        postData3.setNumberOfEmp(new Long(8));
        postData3.setField("web");
        postData3.setPostedIn(new Date());
        postData3.setCvSender(new Long(0));
        postData3.setExperienceYears("1+");
        postData3.setLevel("beginner");
        postData3.setJopType(" freelancer");
        postData3.setSalary(1000);
        postData3.setLanguage(" English");


        postData3.setUser(u2);

        /**********************************************************************************************/
        AnUser u3 = new AnUser();
        u3.setMyJob("PHP Devleoper");
        u3.setUsername("Mustafa Abdallah");
        u3.setEmail("mustafa@gmail.com");
        u3.setDataOfBirth(new Date(8/8/1998));
        u3.setPhone("01155559040");
        u3.setCity("Dubai");
        u3.setGender("male");
        u3.setShortCut("i am java developer  graduate from FCI  ");


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
        postData4.setRequire(a2);
        postData4.setNumberOfEmp(new Long(8));
        postData4.setField("web");
        postData4.setPostedIn(new Date());
        postData4.setCvSender(new Long(1));
        postData4.setExperienceYears("2+");
        postData4.setLevel("experience");
        postData4.setJopType("part Time / freelancer");
        postData4.setSalary(1000);
        postData4.setLanguage("arablc / English");

        postData4.setUser(u3);


        APostData postData5 = new APostData();
        postData5.setJobName("php Developer");
        postData5.setRequire(a2);
        postData5.setNumberOfEmp(new Long(8));
        postData5.setField("web");
        postData5.setPostedIn(new Date());
        postData5.setCvSender(new Long(0));
        postData5.setExperienceYears("3+");
        postData5.setLevel("experience");
        postData5.setJopType("part Time / freelancer");
        postData5.setSalary(1000);
        postData5.setLanguage("arablc / English");

        postData5.setUser(u3);


        APostData postData6 = new APostData();
        postData6.setJobName("php Developer");
        postData6.setRequire(a2);
        postData6.setNumberOfEmp(new Long(8));
        postData6.setField("web");
        postData6.setPostedIn(new Date());
        postData2.setCvSender(new Long(6));
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

