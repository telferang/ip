package nova;

public class Todo extends Task{

    public Todo (String description) {
        super(description);
        printAcknowledgementMessage(getTaskInfo());
    }

    public String getTaskInfo() {
        return "[T][" + this.getStatusIcon() + "] " + description;
    }

}
