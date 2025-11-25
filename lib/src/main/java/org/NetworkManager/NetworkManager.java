package org.NetworkManager;

import java.util.logging.Level;

public class NetworkManager{
	
	public static final long PLATFORM = 1;
	public static final long RFKILL = 1 << 1;
	public static final long ETHER = 1 << 2;
	public static final long WIFI = 1 << 3;
	public static final long BT = 1 << 4;
	public static final long MB = 1 << 5;
	public static final long DHCP4 = 1 << 6;
	public static final long DHCP6 = 1 << 7;
	public static final long PPP = 1 << 8;
	public static final long WIFI_SCAN = 1 << 9;
	public static final long IP4 = 1 << 10;
	public static final long IP6 = 1 << 11;
	public static final long AUTOIP4 = 1 << 12;
	public static final long DNS = 1 << 13;
	public static final long VPN = 1 << 14;
	public static final long SHARING = 1 << 15;
	public static final long SUPPLICANT = 1 << 16;
	public static final long AGENTS = 1 << 17;
	public static final long SETTINGS = 1 << 18;
	public static final long SUSPEND = 1 << 19;
	public static final long CORE = 1 << 20;
	public static final long DEVICE = 1 << 21;
	public static final long OLPC = 1 << 22;
	public static final long WIMAX = 1 << 23;
	public static final long INFINIBAND = 1 << 24;
	public static final long FIREWALL = 1 << 25;
	public static final long ADSL = 1 << 26;
	public static final long BOND = 1 << 27;
	public static final long VLAN = 1 << 28;
	public static final long BRIDGE = 1 << 29;
	public static final long DBUS_PROPS = 1 << 30;
	public static final long TEAM = 1 << 31;
	public static final long CONCHECK = 1 << 32;
	public static final long DCB = 1 << 33;
	public static final long DISPATCH = 1 << 34;
	public static final long AUDIT = 1 << 35;	
	
	public static final long NONE = 0;
	public static final long ALL = 
		PLATFORM | RFILL | ETHER | WIFI | BT | MB | DHCP4 |
		DHCP6 | PPP | WIFI_SCAN | IP4 | IP6 | AUTOIP4 | 
		DNS | VPN | SHARING | SUPPLICANT | AGENTS |
		SETTING | SUSPEND | CORE | DEVICE | OLPC | 
		WIMAX | INFINIBAND | FIREWALL | ADSL_BOND |
		TEAM | CONCHECK | DCB | DISPATCH | AUDIT;

	public static final long DHCP = DHCP4 | DHCP6;
	public static final long IP = IP4 | IP6 | AUTOIP4;


	public native void reload(int flags);
	
	public native List<String> getDevices();
	public native List<String> getAllDevices();

	public native String getDeviceByIPIfcae(String iface);

	public native String activateConnection(String connection, String device, String specificObject);

	/**
	 * Sets the level of the logger for the NetworkManager from D-Bus
	 * @param level the level of the logger
	 * @param domain the domain of what to log, a bitmask or just NONE to disable logging
	 * */
	public native void setLogging(Level level, long domain);
	
	/**
	 * 
	 * */
	public native LoggingDomain getLogging(); 
	
	public native Pair<String, String> addAndActivateConnection(
		Map<String,Map<String,Object>> connection,
		String device,
		Strinbg specific_object};
	
	public native void deactivateConnection(String connection);
	
	/**
	 * This method is capitalized to not override the built in method in java.
	 * */
	public native void Sleep(boolean sleep);

	public native void enable(boolean enable);

