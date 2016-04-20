/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gusteau.menu;

/**
 *
 * @author EAST SOUND
 */
public class MenuItem {
    private int id;
    private String name;
    private String Descrption;
    private double price;
    private Category category;
    private String imageURL;
    /**
     * to add new menu item without id will add in database
     * @param name
     * @param Descrption
     * @param price 
     * @param category 
     */
    public MenuItem(String name, String Descrption, double price,Category category,String imageURL) {
        this.name = name;
        this.Descrption = Descrption;
        this.price = price;
        this.category = category;
        this.imageURL = imageURL;
    }
    
    /**
     * to get data from backend 
     * @param id
     * @param name
     * @param Descrption
     * @param price 
     */
    public MenuItem(int id, String name, String Descrption, double price) {
        this.id = id;
        this.name = name;
        this.Descrption = Descrption;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String Descrption) {
        this.Descrption = Descrption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
   
}
