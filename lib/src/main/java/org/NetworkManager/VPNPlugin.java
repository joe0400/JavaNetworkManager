package org.NetworkManager;

import java.util.Map;

class VPNPlugin{

	public native void connect(Map<String,Map<String, Object>> connection);
	public native void connetInteractive(Map<String, Map<String, Object>> connection,
			Map<String, Object> details);
	public native String needSecrets(Map<String, Map<String, Objects>> settings);
	public native void disconnect();
	public native void setConfig(Map<String, Object> config);
	public native void setIP4Config(Map<String, Object> config);
	public native void setIP6Config(Map<String, Object> config);
	public native void setFailure(String reason);
	public native void newSecrets(Map<String, Map<String, Object>> connection);
}
