package com.michin.ai.common.util.notification;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
	private Logger log = LoggerFactory.getLogger(NotificationManager.class);
	private final MatterMostSender mmSender;

	public NotificationManager(MatterMostSender mmSender) {
		this.mmSender = mmSender;
	}

	public void sendNotification(Exception e, String uri, String params) {
		log.info("#### send Notification.");
		mmSender.sendMessage(e, uri, params);
	}

}