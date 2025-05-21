package rs.in.staleks.template.iguana.adapters.web.config.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rs.in.staleks.template.iguana.adapters.web.endpoint.management.UserController;
import rs.in.staleks.template.iguana.service.config.ApplicationServiceFactory;
import rs.in.staleks.template.iguana.service.management.UserQuery;

@Configuration
@Import({ApplicationServiceFactory.class})
public class RestControllerFactory {

    @Bean
    UserController userController(final UserQuery userQuery) {
        return new UserController(userQuery);
    }

}
