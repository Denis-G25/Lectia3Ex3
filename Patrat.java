
public class Patrat {
    private String latura;

   
    public Patrat() {
        this.latura = "10";
    }

    
    public Patrat(String latura) {
        this.latura = latura;
    }

   
    public String getLatura() {
        return latura;
    }

   
    public void setLatura(String latura) {
        this.latura = latura;
    }

   
    public String calculeazaAria() {
        return toString;
    }

    public String toString() {
        int l = Integer.parseInt(latura); 
        int aria = l * l;
        return "Patrat: l = " + latura + ", Aria = " + aria;
    
}

}
