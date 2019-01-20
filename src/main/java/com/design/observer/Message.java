package com.design.observer;

public class Message {
	public Message(String messageId, String messageDetails) {
		super();
		this.messageId = messageId;
		this.messageDetails = messageDetails;
	}

	private String messageId;
	private String messageDetails;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageDetails() {
		return messageDetails;
	}

	public void setMessageDetails(String messageDetails) {
		this.messageDetails = messageDetails;
	}

}