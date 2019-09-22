package springangular.demo.ZModel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class AProject {

    @Id
    @GeneratedValue
    private Long id;
    private String projectName;
    private String toWho;
    private String members;
    private String role;
    private String link;

    @ManyToOne
    private AnUser user;
}
