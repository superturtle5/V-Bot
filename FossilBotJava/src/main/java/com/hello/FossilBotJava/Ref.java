package com.hello.FossilBotJava;

import net.dv8tion.jda.core.entities.Channel;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import java.util.ArrayList;
import java.util.List;


public class Ref {
	public static final String token = "nope";
	public static final String prefix = "<";
	public static MessageChannel here = null;
	public static List<Guild> List = new ArrayList<Guild>();
	public static Guild main;
	public static List<MessageChannel> portal = new ArrayList<MessageChannel>();
	public static List<Message> answeres = new ArrayList<Message>();
	public static Message prev = null;
}
