package demenagement;

public class Demenagement {
    public static void main(String[] args) {

        int old=34;
        int camion=0;
        int newloc=0;
        System.out.println("nous arrivons a l'ancien local");
        while(old>0)
        {
            while (old>0 && camion<=8)
            {
                camion++;
                old--;
            }
            System.out.println("Nous remplissons le camion de " + camion +"carton");
            System.out.println("il reste" + old +" carton dans l'ancien local");
            System.out.println("nous partons vers le nouveau local");
            System.out.println("Nous vidons le camion de " + camion + " carton");
            System.out.println("nous remplissons le nouveau local de " + camion +"cartons");
            while(newloc<34 && camion>0)
            {
                camion--;
                newloc++;
            }
            System.out.println("nous partons pour l'ancien local");
            System.out.println("nous arrivons à l'ancien local");
        }
        if (old==0)
        {
            System.out.print("le demenagement est fini on se retrouve au bar");
        }

    }
}