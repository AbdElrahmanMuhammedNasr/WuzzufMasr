package springangular.demo.ZModel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class ACourse {

    @Id
    @GeneratedValue
    private Long id;
    private String courseName;

    @ManyToOne
    private AnUser user;
}
