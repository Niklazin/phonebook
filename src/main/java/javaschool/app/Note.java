package javaschool.app;

/**
 * Created by javacourses on 29.03.2017..
 */
public class Note extends Record {
    private String Note;

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getNote(); }


            public void createNote (String Note, String name){
            Note n = new Note();
            n.setNote(Note);
            n.setName(name);


        }

        }


