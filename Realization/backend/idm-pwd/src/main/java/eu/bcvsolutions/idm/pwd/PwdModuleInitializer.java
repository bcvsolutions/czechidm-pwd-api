package eu.bcvsolutions.idm.pwd;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Initialize Pwd module
 *
 * @author Ondrej Kopr
 *
 */
@Component
@DependsOn("initApplicationData")
public class PwdModuleInitializer implements ApplicationListener<ContextRefreshedEvent> {

	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(PwdModuleInitializer.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		LOG.info("Module [{}] initialization", PwdModuleDescriptor.MODULE_ID);
	}
}
