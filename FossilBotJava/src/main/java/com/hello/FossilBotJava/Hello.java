package com.hello.FossilBotJava;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Hello extends ListenerAdapter {
	 public static void hi(Message m) {
		 String[] words  = m.getContentRaw().split(" ");
		if(words[0].equalsIgnoreCase(Ref.prefix+"hello")
		    || words[0].equalsIgnoreCase(Ref.prefix+"hi")
		    || words[0].equalsIgnoreCase(Ref.prefix+"sup")
		    || words[0].equalsIgnoreCase(Ref.prefix+"yo")
		    || words[0].equalsIgnoreCase(Ref.prefix+"good moring")) {
			 	m.getChannel().sendMessage("Greetings!").queue();
		    	}
		if(m.getGuild().getTextChannelById("482384287513968665") != null) {
			Ref.here = m.getGuild().getTextChannelById("482384287513968665");
		} if(m.getContentRaw().equalsIgnoreCase(Ref.prefix + "die")) {
			m.getChannel().sendMessage("Beatings!").queue();
		}
	}
}