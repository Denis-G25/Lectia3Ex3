// Patrat.java
public class Patrat {
    private String latura;

    // Constructor fără parametri (latura = 10)
    public Patrat() {
        this.latura = "10";
    }

    // Constructor cu parametru
    public Patrat(String latura) {
        this.latura = latura;
    }

    // Getter pentru latura
    public String getLatura() {
        return latura;
    }

    // Setter pentru latura
    public void setLatura(String latura) {
        this.latura = latura;
    }

    // Metodă pentru calcularea ariei
    public String calculeazaAria() {
        return toString;
    }

    public String toString() {
        int l = Integer.parseInt(latura); 
        int aria = l * l;
        return "Patrat: l = " + latura + ", Aria = " + aria;
    
}

}
