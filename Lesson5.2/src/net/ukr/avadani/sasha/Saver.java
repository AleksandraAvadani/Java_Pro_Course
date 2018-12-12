package net.ukr.avadani.sasha;

import java.io.*;

public class Saver {
    @MyAnnotationOne(text="C:\\Users\\Aleksandra\\IdeaProjects\\Lesson5.2\\text.txt")
    private String text;

    public Saver(File file, String text) {
        this.text = text;
    }
    public Saver() {
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @MyAnnotationTwo
    public void saveToFile(String m) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(text))) {
            pw.println(m);
        } catch (IllegalArgumentException| IOException e) {
            e.printStackTrace();
        }
    }
}
