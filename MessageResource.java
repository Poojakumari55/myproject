package org.pooja.learningRest.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
//import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.pooja.learningRest.messenger.model.Message;
import org.pooja.learningRest.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return messageService.getAllMessages();
	}
	
	//@POST
	//@Produces(MediaType.APPLICATION_JSON)
	//public String addMessage()
	//{
	//	return "Post works";
	//}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public Message getMessage (@PathParam("messageId") long messageId) {
		
		return messageService.getMessage(messageId);
		
	}

}
