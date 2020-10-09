package ch.hevs.students.raclettedb.data;

import java.io.Serializable;
import java.util.ArrayList;

public class FakeData implements Serializable {
    ArrayList<Alpage> alpages = new ArrayList<>();
    ArrayList<Fromage> fromages = new ArrayList<>();

    public FakeData() {
        generateAlpages();
        generateFromages();
    }

    private void generateFromages() {
        fromages.add(new Fromage("Verbier"));
        fromages.add(new Fromage("Montana"));
        fromages.add(new Fromage("Bagnes"));
        fromages.add(new Fromage("Turtmann"));
        fromages.add(new Fromage("Simplon"));
        fromages.add(new Fromage("Visp"));
        fromages.add(new Fromage("Anniviers"));
        fromages.add(new Fromage("Vissoie"));
        fromages.add(new Fromage("Lens"));
        fromages.add(new Fromage("Orsière"));
        fromages.add(new Fromage("Illiez"));
        fromages.add(new Fromage("Gomser"));
        fromages.add(new Fromage("Heida"));
        fromages.add(new Fromage("Mondralèche"));
        fromages.add(new Fromage("Tanay"));
        fromages.add(new Fromage("Champsot"));
        fromages.add(new Fromage("Les Haudères"));
        fromages.add(new Fromage("Vollèges"));
        fromages.add(new Fromage("Etiez"));
    }

    private void generateAlpages() {
        alpages.add(new Alpage("Verbier"));
        alpages.add(new Alpage("Montana"));
        alpages.add(new Alpage("Bagnes"));
        alpages.add(new Alpage("Turtmann"));
        alpages.add(new Alpage("Simplon"));
        alpages.add(new Alpage("Visp"));
        alpages.add(new Alpage("Anniviers"));
        alpages.add(new Alpage("Vissoie"));
        alpages.add(new Alpage("Lens"));
    }

    public ArrayList<Alpage> getAlpages() {
        return alpages;
    }

    public ArrayList<Fromage> getFromages() {
        return fromages;
    }
}
