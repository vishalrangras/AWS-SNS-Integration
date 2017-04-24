package com.cd.coe.sns.bean;

public abstract class Message {
	
	public abstract String getType();
	public abstract String getMessageId();
	
	public abstract String getTopicArn();
	public abstract String getMessage();
	public abstract String getTimestamp();
	public abstract String getSignatureVersion();
	public abstract String getSignature();
	public abstract String getSigningCertURL();
	
	public String getSubject(){return "";}
	public String getUnsubscribeURL(){return "";}
	public String getToken(){return "";}
	public String getSubscribeURL(){return "";}
}
