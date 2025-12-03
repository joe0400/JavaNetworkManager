package org.NetworkManager;

import java.util.Map;

class NetworkManagerSettings{

	public native String[] listConnections();

	public native String getConnectionByUUID(String uuid);

	public native String addConnection(Map<String, Map<String, Object>> connection);

	public native String addCOnnectionUnsaved(Map<String, Map<String, Object>> connection);
	public native String[] loadConnections(String[] files);

	public native boolean reloadConnections();

	public native void saveHostname(String hostname);


}
