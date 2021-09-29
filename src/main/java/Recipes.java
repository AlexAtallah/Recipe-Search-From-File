/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
import java.util.ArrayList;

public class Recipes {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipes(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }

}
