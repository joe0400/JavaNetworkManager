package org.NetworkManager;

class AgentManager{

	public native void register(String identifier);

	public native void registerWithCapabilities(String identifier,
		int capabilities);

	public native void unregister();

};
