package proselyte;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class BaseEntity {

    @Getter
    @Setter
    private Long id;

    public boolean isNew(){
        return this.id == null;
    }
}
