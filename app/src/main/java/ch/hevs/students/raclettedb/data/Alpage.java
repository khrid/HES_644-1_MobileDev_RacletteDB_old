package ch.hevs.students.raclettedb.data;

public class Alpage {

    private int id;

    private int valley;

    private String name;
    private String description;
    private boolean isActive;

    public Alpage(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public int getValley() {
        return valley;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValley(int valley) {
        this.valley = valley;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
