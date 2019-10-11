package springangular.demo.ZModel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;

@Data
@Entity
public class APostData {

    @Id
    @GeneratedValue
    private Long id;
    private String jobName;
//    private String require;
    private ArrayList<String> require;
    private Long numberOfEmp;
    private String field;
    private Date postedIn;
    private Long cvSender;
    private String experienceYears;
    private String level;
    private String jopType;
    private int salary;
    private String language;




    @ManyToOne
    private  AnUser user;


}
