package eu.bcvsolutions.idm.pwd.config.domain;

import org.springframework.stereotype.Component;

import eu.bcvsolutions.idm.core.api.config.domain.AbstractConfiguration;

/**
 * Pwd configuration - implementation
 *
 * @author Ondrej Kopr
 *
 */
@Component("pwdConfiguration")
public class DefaultPwdConfiguration
		extends AbstractConfiguration
		implements PwdConfiguration {
}
