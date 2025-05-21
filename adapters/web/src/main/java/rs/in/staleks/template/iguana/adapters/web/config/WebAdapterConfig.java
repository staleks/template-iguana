package rs.in.staleks.template.iguana.adapters.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rs.in.staleks.template.iguana.adapters.web.config.rest.RestControllerFactory;
import rs.in.staleks.template.iguana.adapters.web.config.rest.RestResourcesConfig;

@Configuration
@Import({
        RestResourcesConfig.class,
        RestControllerFactory.class
})
public class WebAdapterConfig {
    //~
}
