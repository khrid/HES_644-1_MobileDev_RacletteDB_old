package ch.hevs.students.raclettedb.data;

public class Fromage {
    private int id;
    private int fkAlpage;
    private String name;
    private String type;
    private String description;
    private boolean isActive;

    public Fromage(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFkAlpage() {
        return fkAlpage;
    }

    public void setFkAlpage(int fkAlpage) {
        this.fkAlpage = fkAlpage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
