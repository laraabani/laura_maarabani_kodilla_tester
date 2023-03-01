public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook (int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
        }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight(){
        if (this.weight <= 600) {
            System.out.println("This notebook is light");
        } else if (this.weight > 600 && this.weight <= 1200) {
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is heavy");
        }
    }
    public void checkPriceAndYear(){
        if (this.price == 1000 && this.year == 2010) {
            System.out.println("Not the best one");
        } else if (this.price ==1500 && this.year == 2017) {
            System.out.println("Worth buying");
        } else {
            System.out.println("Don't buy this one");
        }
    }
    }
