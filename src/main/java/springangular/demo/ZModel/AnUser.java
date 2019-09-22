package springangular.demo.ZModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class AnUser {

    @Id
    @GeneratedValue
    private Long id ;
    private String email;
    private String username;
    private Date dataOfBirth;
    private String phone;
    private String gender;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ACourse> courses  = new ArrayList<ACourse>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL/*,fetch = FetchType.EAGER*/)
    @JsonIgnore
//    @Fetch(value = FetchMode.SUBSELECT)
    private List<AProject> projects  = new ArrayList<AProject>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL/*,fetch = FetchType.EAGER*/)
    @JsonIgnore
//    @Fetch(value = FetchMode.SUBSELECT)
    private List<AnExperience> experiences = new ArrayList<AnExperience>();


    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    @JsonIgnore
    private List<APostData> postData = new ArrayList<APostData>();

    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Friends> friends = new ArrayList<Friends>();

}
