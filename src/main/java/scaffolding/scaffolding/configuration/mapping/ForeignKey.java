package scaffolding.scaffolding.configuration.mapping;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ForeignKey {
    String annotation;
    String manyToOne;
    String manyToMany;
    String oneToMany;
    String oneToOne;
}
