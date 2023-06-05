import javax.swing.*;

public class Team {
    public int Number;
    public String name;
    public String photo;

    public String getNumber() {
        return String.valueOf(Number);
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Team(int number, String name, String photo) {
        ImageIcon icon = new ImageIcon(photo);
        JLabel label = new JLabel(icon);
        this.name = name;
        this.Number = number;
        this.photo = photo;

    }
}
