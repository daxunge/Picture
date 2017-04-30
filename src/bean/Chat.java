package bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/5/1.
 */
@Entity
public class Chat {
    private int chatId;
    private Integer chatFrom;
    private Integer chatTo;
    private String chatContent;
    private Timestamp chatTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id", nullable = false)
    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    @Basic
    @Column(name = "chat_from", nullable = true)
    public Integer getChatFrom() {
        return chatFrom;
    }

    public void setChatFrom(Integer chatFrom) {
        this.chatFrom = chatFrom;
    }

    @Basic
    @Column(name = "chat_to", nullable = true)
    public Integer getChatTo() {
        return chatTo;
    }

    public void setChatTo(Integer chatTo) {
        this.chatTo = chatTo;
    }

    @Basic
    @Column(name = "chat_content", nullable = true, length = 100)
    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    @Basic
    @Column(name = "chat_time", nullable = true)
    public Timestamp getChatTime() {
        return chatTime;
    }

    public void setChatTime(Timestamp chatTime) {
        this.chatTime = chatTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (chatId != chat.chatId) return false;
        if (chatFrom != null ? !chatFrom.equals(chat.chatFrom) : chat.chatFrom != null) return false;
        if (chatTo != null ? !chatTo.equals(chat.chatTo) : chat.chatTo != null) return false;
        if (chatContent != null ? !chatContent.equals(chat.chatContent) : chat.chatContent != null) return false;
        if (chatTime != null ? !chatTime.equals(chat.chatTime) : chat.chatTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chatId;
        result = 31 * result + (chatFrom != null ? chatFrom.hashCode() : 0);
        result = 31 * result + (chatTo != null ? chatTo.hashCode() : 0);
        result = 31 * result + (chatContent != null ? chatContent.hashCode() : 0);
        result = 31 * result + (chatTime != null ? chatTime.hashCode() : 0);
        return result;
    }
}
