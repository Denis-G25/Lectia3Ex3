public class Main {
    public static void main(String[] args) {
       
        Patrat patrat1 = new Patrat(); 
        Patrat patrat2 = new Patrat("5"); 

        System.out.println(patrat1.calculeazaAria());
        System.out.println(patrat2.calculeazaAria());

        patrat1.setLatura("8");
        System.out.println("După modificare, " + patrat1.calculeazaAria());
    }
}




