package org.NetworkManager;

import java.util.Map;

class Device{

	public native void reapply(Map<String, Map<String, Object>> connection, long version_id, int flags);
	public native Map<String, Map<String, Object>> getAppliedConnection(int flags);
	public native void disconnect();
	public native void delete();

}
