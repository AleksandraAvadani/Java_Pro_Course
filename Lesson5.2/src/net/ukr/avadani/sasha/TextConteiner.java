package net.ukr.avadani.sasha;

public class TextConteiner {
    private String text;

    public TextConteiner(String text) {
        this.text = text;
}

    public TextConteiner() {
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
