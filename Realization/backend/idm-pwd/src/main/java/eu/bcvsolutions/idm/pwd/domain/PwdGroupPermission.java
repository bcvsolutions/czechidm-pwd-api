package eu.bcvsolutions.idm.pwd.domain;

import java.util.Arrays;
import java.util.List;

import eu.bcvsolutions.idm.core.security.api.domain.BasePermission;
import eu.bcvsolutions.idm.core.security.api.domain.IdmBasePermission;
import eu.bcvsolutions.idm.core.security.api.domain.GroupPermission;
import eu.bcvsolutions.idm.pwd.PwdModuleDescriptor;

/**
 * Aggregate base permission. Name can't contain character '_' - its used for joining to authority name.
 *
 * @author Ondrej Kopr
 *
 */
public enum PwdGroupPermission implements GroupPermission {

	/*
	 * Define your group permission there and example permission you can remove
	 */
	EXAMPLEPWD(
			IdmBasePermission.ADMIN);

	public static final String EXAMPLE_PWD_ADMIN = "EXAMPLEPWD" + BasePermission.SEPARATOR + "ADMIN";

	private final List<BasePermission> permissions;

	private PwdGroupPermission(BasePermission... permissions) {
		this.permissions = Arrays.asList(permissions);
	}
	
	@Override
	public List<BasePermission> getPermissions() {
		return permissions;
	}

	@Override
	public String getName() {
		return name();
	}

	@Override
	public String getModule() {
		return PwdModuleDescriptor.MODULE_ID;
	}
}
