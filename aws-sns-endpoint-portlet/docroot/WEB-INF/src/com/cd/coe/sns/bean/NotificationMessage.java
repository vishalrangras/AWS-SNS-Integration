package com.cd.coe.sns.bean;

import com.fasterxml.jackson.annotation.JsonSetter;

public class NotificationMessage extends Message{
	
	private String Type;
	private String MessageId;
	private String TopicArn;
	private String Subject;
	private String Message;
	private String Timestamp;
	private String SignatureVersion;
	private String Signature;
	private String SigningCertURL;
	private String UnsubscribeURL;
	public String getType() {
		return Type;
	}
	
	@JsonSetter("Type")
	public void setType(String type) {
		Type = type;
	}
	
	public String getMessageId() {
		return MessageId;
	}
	@JsonSetter("MessageId")
	public void setMessageId(String messageId) {
		MessageId = messageId;
	}
	public String getTopicArn() {
		return TopicArn;
	}
	
	@JsonSetter("TopicArn")
	public void setTopicArn(String topicArn) {
		TopicArn = topicArn;
	}
	
	public String getSubject() {
		return Subject;
	}
	
	@JsonSetter("Subject")
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getMessage() {
		return Message;
	}
	
	@JsonSetter("Message")
	public void setMessage(String message) {
		Message = message;
	}
	public String getTimestamp() {
		return Timestamp;
	}
	
	@JsonSetter("Timestamp")
	public void setTimestamp(String timestamp) {
		Timestamp = timestamp;
	}
	public String getSignatureVersion() {
		return SignatureVersion;
	}
	
	@JsonSetter("SignatureVersion")
	public void setSignatureVersion(String signatureVersion) {
		SignatureVersion = signatureVersion;
	}
	public String getSignature() {
		return Signature;
	}
	
	@JsonSetter("Signature")
	public void setSignature(String signature) {
		Signature = signature;
	}
	public String getSigningCertURL() {
		return SigningCertURL;
	}
	
	@JsonSetter("SigningCertURL")
	public void setSigningCertURL(String signingCertURL) {
		SigningCertURL = signingCertURL;
	}
	public String getUnsubscribeURL() {
		return UnsubscribeURL;
	}
	
	@JsonSetter("UnsubscribeURL")
	public void setUnsubscribeURL(String unsubscribeURL) {
		UnsubscribeURL = unsubscribeURL;
	}
	
	
	
}
