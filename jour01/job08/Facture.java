public class Facture {
    public static void main(String[] args){
        final float tva = 0.2f;
        float prix = 49.99f; int quantite = 3;

        float tarifHT = prix * (float) quantite;
        float taxe = tarifHT * tva;
        float tarifTTC = tarifHT + taxe;

        System.out.println("Le montant total est: " + tarifHT);
        System.out.println("Le montant de la taxe est de: " + taxe);
        System.out.println("Le montant TTC est: " + tarifTTC);
    }
}