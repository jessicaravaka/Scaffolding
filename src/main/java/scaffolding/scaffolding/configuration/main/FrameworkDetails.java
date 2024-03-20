package scaffolding.scaffolding.configuration.main;

import scaffolding.scaffolding.configuration.Configuration;
import scaffolding.scaffolding.configuration.mapping.FrameworkProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

/**
 * @author rakharrs
 */
@Getter @Setter
public class FrameworkDetails extends Configuration {
    HashMap<String, FrameworkProperties> frameworks;
    @Override
    public void init() throws Exception {
        setJsonPath("frameworkDetails.json");
        FrameworkDetails frameworkDetails = this.read();
        setFrameworks(frameworkDetails.getFrameworks());
    }
}
