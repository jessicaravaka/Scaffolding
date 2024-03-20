package scaffolding.scaffolding.configuration.main;

import scaffolding.scaffolding.configuration.Configuration;
import scaffolding.scaffolding.configuration.mapping.TypeMapping;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
public class TypeProperties extends Configuration {
    HashMap<String, TypeMapping> listProperties;

    @Override
    public void init() throws Exception {
        setJsonPath("typeProperties.json");
        TypeProperties typeProperties = this.read();
        setListProperties(typeProperties.getListProperties());
    }
}
