package org.NetworkManager;

import java.util.Map;

class Wireless{

	public native Object[] getAccessPoints();
	public native Object[] getAllAccessPoints();
	public native void requestScan(Map<String, Object> options);

}
