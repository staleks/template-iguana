package rs.in.staleks.template.iguana.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.in.staleks.template.iguana.service.management.UserPersistencePort;
import rs.in.staleks.template.iguana.service.management.UserQueryService;

@Configuration
public class ApplicationServiceFactory {

    @Bean
    UserQueryService userQueryService(final UserPersistencePort userPersistencePort) {
        return new UserQueryService(userPersistencePort);
    }

}
