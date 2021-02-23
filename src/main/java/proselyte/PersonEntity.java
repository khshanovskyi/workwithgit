package proselyte;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class PersonEntity extends BaseEntity{
    private String firstName;
    private String lastName;
    private String email;
}
