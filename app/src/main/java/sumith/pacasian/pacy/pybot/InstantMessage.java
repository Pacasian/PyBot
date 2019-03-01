package sumith.pacasian.pacy.pybot;



class InstantMessage {

    private String message;
    private String author;

    InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {



    }

    String getMessage() {
        return message;
    }

    String getAuthor() {
        return author;
    }
}
