package springangular.demo.ZModel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class AnExperience {

    @Id
    @GeneratedValue
    private Long id;
    private String fields;
    private Long years;
    private String companyName;

    @ManyToOne
    private AnUser user;

}
