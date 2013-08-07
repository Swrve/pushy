package com.relayrides.pushy.apns;

import java.util.Date;

import com.relayrides.pushy.apns.ApnsPushNotification;

public class SimpleApnsPushNotification implements ApnsPushNotification {
	
	private final byte[] token;
	private final String payload;
	private final Date expiration;
	
	public SimpleApnsPushNotification(final byte[] token, final String payload, final Date expiration) {
		this.token = token;
		this.payload = payload;
		this.expiration = expiration;
	}

	public byte[] getToken() {
		return this.token;
	}

	public String getPayload() {
		return this.payload;
	}

	public Date getDeliveryInvalidationTime() {
		return this.expiration;
	}
}