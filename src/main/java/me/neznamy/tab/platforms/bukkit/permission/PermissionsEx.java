package me.neznamy.tab.platforms.bukkit.permission;

import java.lang.reflect.InvocationTargetException;

import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.shared.permission.PermissionPlugin;

/**
 * PEX hook
 */
public class PermissionsEx implements PermissionPlugin {

	private String version;
	
	public PermissionsEx(String version) {
		this.version = version;
	}
	@Override
	public String getPrimaryGroup(TabPlayer p) throws Throwable {
		String[] groups = getAllGroups(p);
		if (groups.length == 0) return "null";
		return groups[0];
	}

	@Override
	public String[] getAllGroups(TabPlayer p) throws Throwable {
		try {
			Object user = Class.forName("ru.tehkode.permissions.bukkit.PermissionsEx").getMethod("getUser", String.class).invoke(null, p.getName());
			return (String[]) user.getClass().getMethod("getGroupNames").invoke(user);
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}

	@Override
	public String getVersion() {
		return version;
	}
}