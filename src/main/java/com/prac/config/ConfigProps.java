package com.prac.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.prac.model.Credentials;

@Component
@ConfigurationProperties("app")
public class ConfigProps {

	String hostname;
	String port;
	List<String> list;
	Map<String, String> errorCodes;
	Credentials credentials;

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getErrorCodes() {
		return errorCodes;
	}

	public void setErrorCodes(Map<String, String> errorCodes) {
		this.errorCodes = errorCodes;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	@Override
	public String toString() {
		return "ConfigProps [hostname=" + hostname + ", port=" + port + ", list=" + list + ", errorCodes=" + errorCodes
				+ ", credentials=" + credentials + "]";
	}

}
