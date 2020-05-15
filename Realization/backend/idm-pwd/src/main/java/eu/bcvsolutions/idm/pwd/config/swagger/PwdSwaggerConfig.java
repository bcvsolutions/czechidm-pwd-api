package eu.bcvsolutions.idm.pwd.config.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eu.bcvsolutions.idm.core.api.config.swagger.AbstractSwaggerConfig;
import eu.bcvsolutions.idm.core.api.domain.ModuleDescriptor;
import eu.bcvsolutions.idm.pwd.PwdModuleDescriptor;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Pwd module swagger configuration
 *
 * @author Ondrej Kopr
 */
@Configuration
@ConditionalOnProperty(prefix = "springfox.documentation.swagger", name = "enabled", matchIfMissing = true)
public class PwdSwaggerConfig extends AbstractSwaggerConfig {

	@Autowired private PwdModuleDescriptor moduleDescriptor;

	@Override
	protected ModuleDescriptor getModuleDescriptor() {
		return moduleDescriptor;
	}

	@Bean
	public Docket pwdApi() {
		return api("eu.bcvsolutions.idm.rest");
	}
}
