package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.ChatList;
import pages.ChatRoom;

public class ChatSteps extends BaseSteps {
    @Given("^(\\w+)\\s+on chatlist screen browse for\\s+(\\w+)\\s+and tap on it$")
        public void OpenChatRoom(String consumer, String user) throws Throwable {
        	ChatList chatList = new ChatList(getDriverInstanceFor(consumer));
        	chatList.scrollDownToThenTap(credentials.data.get(user)[1]);
    	}

    @And("^(\\w+)\\s+on chatroom screen send message\\s+(.*)$")
    	public void SendPlainMessage(String consumer, String message) throws Throwable {
    		ChatRoom chatRoom = new ChatRoom(getDriverInstanceFor(consumer));
    		chatRoom.typeMessage(message);
    	}

    @And("^(\\w+)\\s+on chatroom screen send message\\s+(.*)\\s+ and receiver product$")
    	public void SendMessageWithReceiverProduct(String consumer, String message) throws Throwable {
    		SendPlainMessage(consumer, message);
    	}

    @And("^(\\w+)\\s+on chatroom screen send message\\s+(.*)$\\s+ and sender product$")
    	public void SendMessageWithSenderProduct(String consumer, String message) throws Throwable {
    		SendPlainMessage(consumer, message);
    	}

    @And("^(\\w+)\\s+on chatroom screen send message\\s+(.*)$\\s+ and an image from gallery")
    	public void SendMessageWithGalleryImage(String consumer, String message) throws Throwable {
    		SendPlainMessage(consumer, message);
    	}

    @And("^(\\w+)\\s+on chatroom screen send message\\s+(.*)$\\s+ and captured image")
    	public void SendMessageWithCapturedImage(String consumer, String message) throws Throwable {
    		SendPlainMessage(consumer, message);
    	}
}
