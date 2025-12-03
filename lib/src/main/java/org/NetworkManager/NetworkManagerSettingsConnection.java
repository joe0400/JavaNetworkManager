package org.NetworkManager;

import java.util.Map;

class NetworkManagerSettingsConnection{

	public native void update(Map<String, Map<String, Object>> properties);
	public native void updateUnsaved(Map<String, Map<String, Object>> properties);
	public native void delete();
	public native Map<String, Map<String, Object>> getSettings();
	public native Map<String, Map<String, Object>> getSecrets(String settings_name);
	public native void clearSecrets();
	public native void save();
}
