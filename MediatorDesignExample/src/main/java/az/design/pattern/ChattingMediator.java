package az.design.pattern;

public interface ChattingMediator {
    void sendMessage(String message,User user);
    void addUser(User user);
}
