package javaschool.app;


public class Note extends Record {
    private String Note;

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        this.Note = note;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getNote();
    }


}




