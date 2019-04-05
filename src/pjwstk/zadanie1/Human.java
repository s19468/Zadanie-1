/*
    Zadanie 1: Stworzenie klasy Human.
    Autor: Rafał Tęcza
    Index: s19468 
*/
package pjwstk.zadanie1;

/**
 *
 * @author s19468
 */
public class Human {
    
    private String name;
    private String index;
    
    private boolean male;
    
    private int age;
    private int weight;
    private int height;
    private int feetsize;
 
    public Human(String name, String index, boolean male, int age, int weight, int height, int feetsize) {
        this.name = name;
        this.index = index;
        this.male = male;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.feetsize = feetsize;
    }

    public String toString() {
        String message = 
                "Imie: " + getName() + 
                "\nIndeks: " + getIndex() + 
                "\nPlec: " + getSex() +
                "\nWiek: " + getAge() + 
                "\nWaga: " + getWeight() +
                "\nWzrost: " + getHeight() +
                "\nRozmiar stopy: " + getFeetsize();
        return message;
    }
    
    public String getSex() {
        return isMale() ? "Mezczyzna" : "Kobieta";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFeetsize() {
        return feetsize;
    }

    public void setFeetsize(int feetsize) {
        this.feetsize = feetsize;
    }
}
