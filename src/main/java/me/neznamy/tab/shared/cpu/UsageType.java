package me.neznamy.tab.shared.cpu;

/**
 * Enum containing all reasons features require CPU time
 */
public enum UsageType {

	//events
	PLAYER_JOIN_EVENT("PlayerJoinEvent"),
	PLAYER_QUIT_EVENT("PlayerQuitEvent"),
	WORLD_SWITCH_EVENT("PlayerChangedWorldEvent"),
	PLAYER_TOGGLE_SNEAK_EVENT("PlayerToggleSneakEvent"),
	PLAYER_MOVE_EVENT("PlayerMoveEvent"),
	PLAYER_TELEPORT_EVENT("PlayerTeleportEvent"),
	PLAYER_RESPAWN_EVENT("PlayerRespawnEvent"),
	COMMAND_PREPROCESS("PlayerCommandPreprocessEvent"),
	
	//packets
	PACKET_READING("Packet reading"),
	PACKET_MOUNT("Mount packet"),
	PACKET_ENTITY_DESTROY("PacketPlayOutEntityDestroy"),
	PACKET_ENTITY_MOVE("PacketPlayOutEntity"),
	PACKET_NAMED_ENTITY_SPAWN("PacketPlayOutNamedEntitySpawn"),
	
	//nametags
	REFRESHING_COLLISION("Refreshing collision rule"),
	REFRESHING_NAMETAG_VISIBILITY("Refreshing nametag visibility"),
	
	//bossbar
	TELEPORTING_ENTITY("Teleporting entity"),
	
	//other
	REFRESHING("Refreshing"),
	REPEATING_TASK("Repeating task"),
	v1_8_0_BUG_COMPENSATION("Compensating for 1.8.0 bugs");
	
	//user-friendly name to be used in /tab cpu
	private String friendlyName;

	private UsageType(String friendlyName){
		this.friendlyName = friendlyName;
	}

	@Override
	public String toString() {
		return friendlyName;
	}
}