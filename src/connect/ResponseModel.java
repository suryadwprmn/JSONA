package connect;

public class ResponseModel {
    private String message;
    private String status;
    private String comment;

    public ResponseModel(String message, String status, String comment) {
        this.message = message;
        this.status = status;
        this.comment = comment;
    }

    public ResponseModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
