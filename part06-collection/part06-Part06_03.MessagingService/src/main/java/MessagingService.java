
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author raymo
 */
public class MessagingService {

    private ArrayList<Message> message;

    public MessagingService() {
        this.message = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.message.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        /*for(int i = 0; i < this.message.size(); i++){
            return this.message.get(i).getContent();
        }*/
        return this.message;
    }
}
