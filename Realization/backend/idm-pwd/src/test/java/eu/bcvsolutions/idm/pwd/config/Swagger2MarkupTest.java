
package eu.bcvsolutions.idm.pwd.config;

import org.junit.Test;

import eu.bcvsolutions.idm.pwd.PwdModuleDescriptor;
import eu.bcvsolutions.idm.test.api.AbstractSwaggerTest;


/**
 * Static swagger generation to sources - will be used as input for swagger2Markup build
 *
 * @author Ondrej Kopr
 *
 */
public class Swagger2MarkupTest extends AbstractSwaggerTest {

	@Test
	public void testConvertSwagger() throws Exception {
		super.convertSwagger(PwdModuleDescriptor.MODULE_ID);
	}

}
