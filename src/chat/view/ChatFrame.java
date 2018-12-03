package chat.view;

import chat.controller.ChatController;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatController appController)
	{
		super();
		
		this.appController = appController;
		appPanel = new ChatPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(500,500);
		this.setTitle("Chatbot");
		this.setResizable(false);
		this.setVisible(true);
	}

}
