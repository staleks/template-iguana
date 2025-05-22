package rs.in.staleks.template.iguana.adapters.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "rs.in.staleksit.template.iguana.persistence.management.model")
@EnableJpaRepositories(basePackages = "rs.in.staleksit.template.iguana.persistence.management.repository")
public class PersistenceConfig {

    /**
     * Translates {@link org.hibernate.HibernateException} instances to Spring's {@link
     * org.springframework.dao.DataAccessException} hierarchy.
     *
     * @return {@link HibernateExceptionTranslator}
     */
    @Bean
    HibernateExceptionTranslator hibernateExceptionTranslator() {
        return new HibernateExceptionTranslator();
    }

}
