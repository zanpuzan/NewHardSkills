package by.vzanevsky.streamAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

    private String name;
    private String species;
    private Integer weight;
    private Integer feed;
    private Date receiptDate;

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public Animal (String name, String species, Integer weight, Integer feed, Date receiptDate) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.feed = feed;
        this.receiptDate = receiptDate;
    }

    protected String getName() {
        return name;
    }

    protected String getSpecies() {
        return species;
    }

    protected Integer getWeight() {
        return weight;
    }

    protected Integer getFeed() {
        return feed;
    }

    protected Date getReceiptDate() {
        return receiptDate;
    }

    public void info() {
        System.out.print("\nНазвание: " + name + '\n' +
                                "Вид: " + species + '\n' +
                                "Вес: " + weight + '\n' +
                       "Корма в день: " + feed + " кг" + '\n' +
                   "Дата поступления: " + format.format(receiptDate) + '\n');
    }

   }
