package interface_noyau_fonctionnel;

public class InterfaceNoyauFonctionnel {

    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
        if (nombrePersonnes == 2) {
            return new String[]{"Table 1"};
        } else if (nombrePersonnes >= 3 && nombrePersonnes <= 4) {
            return new String[]{"Table 2", "Table 3", "Table 4", "Table 5"};
        } else if (nombrePersonnes >= 5) {
            return new String[]{"Table 6"};
        }
        return new String[]{};
    }
}
