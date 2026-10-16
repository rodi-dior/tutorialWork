package uk.ac.westminster.tutorialWork;

public class DigitalProduct extends Product{

    private String downloadURL;
    private int filesizeMB;


    public DigitalProduct(){} //jackson deserialisation

    public DigitalProduct(Long id, String name, double price, String downloadURL, int filesizeMB){
        super(id, name, price);
        this.downloadURL = downloadURL;
        this.filesizeMB = filesizeMB;
    }

    public String getDownloadURL(){return downloadURL;}
    public int getFilesizeMB(){return filesizeMB;}



}
