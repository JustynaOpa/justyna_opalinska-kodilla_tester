public class Notebook {
    int weight;
    int price;
    int year;
   public Notebook(int weight, int price, int year) {
       this.weight = weight;
       this.price = price;
       this.year = year;
   }
       public void checkPrice() {
           if(this.price < 600) {
               System.out.println("This notebook is cheap");
           } else if (this.price > 600 && this.price < 1000){
               System.out.println("This price is good");
           } else {
               System.out.println("This notebook is expensive");
           }
       }
       public void checkWeight(){
            if (this.weight < 600){
                System.out.println("This notebook is light");
            } else if (this.weight > 600 && this.price < 1900){
                System.out.println("This notebook is medium heavy");
            } else {
                System.out.println("This notebook is heavy");
            }
       }
       public void checkYear(){
       if (this.price <1500){
          System.out.println("Price is ok");
       } else if (this.year > 2019 && this.weight <2500){
           System.out.println("Notebook is super duper");
       } else if (this.price > 2000 && this.year >2019){
           System.out.println("Extremely good notebook");
       } else {
           System.out.println("Notebook do not make the grade");
       }
       }

   }

