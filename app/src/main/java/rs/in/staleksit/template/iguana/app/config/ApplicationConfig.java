package rs.in.staleksit.template.iguana.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rs.in.staleks.template.iguana.adapters.persistence.config.PersistenceConfig;
import rs.in.staleks.template.iguana.adapters.web.config.WebAdapterConfig;

@Import({
        PersistenceConfig.class,
        WebAdapterConfig.class
})
@Configuration
public class ApplicationConfig {
    //~
}
