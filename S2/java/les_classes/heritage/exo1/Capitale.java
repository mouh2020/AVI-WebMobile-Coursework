package S2.java.les_classes.heritage.exo1;

public class Capitale  extends Ville {
    private String monument;

    public Capitale() {
        monument = "Casbah";
    }

    public Capitale(String nomVille, String nomPays, int nbrHabitants,String monument) {
        super(nomVille,nomPays,nbrHabitants);
        this.monument = monument;
    }

    @Override
    public String description() {
        return super.description() + " Capitale : {" +
        " monument='" + this.monument + "'" +
        "}";
    }

    }
