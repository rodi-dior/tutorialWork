package uk.ac.westminster.tutorialWork;

public class PhysicalProduct extends Product{

    private double weightinKG;
    private String dimension;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightinKG, String dimension){
        super(id, name, price);
        this.weightinKG = weightinKG;
        this.dimension = dimension;
    }

    public double getWeightinKG(){return weightinKG;}
    public String getDimension(){return dimension;}


}
