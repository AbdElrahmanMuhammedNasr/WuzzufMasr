package springangular.demo.ZModel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Entity
public class APostData {

    @Id
    @GeneratedValue
    private Long id;

    private String jobName;

    private String require;

    private Long numberOfEmp;

    private String field;

    private Date postedIn;

    @ManyToOne
    private  AnUser user;


}
