package org.NetworkManager;

import java.util.Map;

class PointToPoint{

	public native Map<String, String> needSecrets();

	public native void setIP4Config(Map<String, Object> config);

	public native void setIP6Config(Map<String, Object> config);

	public native void setState(int state);

}
