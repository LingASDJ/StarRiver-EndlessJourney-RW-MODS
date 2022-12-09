//[core]

@SuppressWarnings 'All'
public void RTSEffect(MessageReceivedEvent event)
{
    Message msg = event.getMessage();
    if (msg.getContentRaw().equals(Send Package()))
    {
        MessageChannel channel = event.getChannel();
        channel.sendMessage(Check Bug());
    }
    public class Effect {
        int effect=1; 
        float customid=2;
    }
}
