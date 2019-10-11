package springangular.demo.ZModel;

import lombok.Data;

@Data
public class Messages {
    private String content;
    private String sender;
    private messageType type;

    public enum messageType{
        CHAT, LEAVE ,JOIN
    }
}
