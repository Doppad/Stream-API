package Level_Easy_MetaUniverce;

public class Notification {
    String type;
    String message;

    public Notification(String type, String message) {
        this.message = message;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
