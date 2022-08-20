package by.vzanevsky.streamAPI;

import java.util.Date;

public class Animal {

    private String name;
    private String species;
    private Integer weight;
    private Integer feed;
    private Date receiptDate;

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
        System.out.print("��������: " + name + '\n' +
                              "���: " + species + '\n' +
                              "���: " + weight + '\n' +
                "���� �����������: " + receiptDate + '\n');
    }

}
