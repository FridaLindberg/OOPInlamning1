package växthotellet;

import växthotellet.Kaktus;
import växthotellet.KöttätandeVäxt;
import växthotellet.Palm;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Växt> växter = new ArrayList<>();
        växter.add(new Kaktus("Igge", 0.20));
        växter.add(new Palm("Laura", 5));
        växter.add(new KöttätandeVäxt("Meatloaf", 0.7));
        växter.add(new Palm("Putte", 1));
        while (true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få mat?");
            boolean found = false;
            try {
                for (Växt växt : växter) {
                    if (växt.getNamn().equalsIgnoreCase(input)) {
                        växt.skrivUt();
                        found = true;
                    }
                }

                if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Skriv in en växt!");
                } else if (found == false) {
                    JOptionPane.showMessageDialog(null, "Denna växt finns inte");
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Avbröt");
                System.exit(0);
            }

        }
    }
}

