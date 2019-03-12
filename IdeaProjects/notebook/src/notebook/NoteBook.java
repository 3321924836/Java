package notebook;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(int location, String s) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNotes(int index) {
        return notes.get(index);
    }

    public void removeNotes(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        NoteBook n = new NoteBook();
        Scanner in = new Scanner(System.in);
        while (true) {
            switch (in.next()) {
                case "ad":
                    n.add(in.next());
                    System.out.println("Done.");
                    break;
                case "adl":
                    n.add(in.nextInt(), in.next());
                    System.out.println("Done.");
                    break;
                case "sz":
                    System.out.println(n.getSize()+" note(s) in the notebook.");
                    break;
                case "pr":
                    System.out.println("Note: "+n.getNotes(in.nextInt()));
                case "dl":
                    n.removeNotes(in.nextInt());
                    System.out.println("Done.");
            }
        }
    }

}