
package exercici6;

import java.io.*;

class Exercici6 {

    static void main(String[] args) {
        
        BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in));
        String nom;
        int edat;
        float pes;
        char sexe;
        
        try{
            System.out.print("Quin es el teu nom ? ");
            nom = teclat.readLine();
            System.out.print("Quina es la teua edat? " );
            edat = Integer.parseInt( teclat.readLine() );
            System.out.print("Quin es el teu pes? ");
            pes = Float.parseFloat( teclat.readLine() );
            System.out.print("Quin es el teu sexe (h/d/a)? ");
            sexe = teclat.readLine().charAt(0);

            System.out.println("Hola "+ " " + nom + " tens " + edat + " anys i peses " + pes + "kg " + "eres" + " "+ sexe);
        }catch (IOException | NumberFormatException ex) {
            System.out.println("Ha hagut algun error d'entrada de dades");
    }
    
}
}
///anem a fer una divisio per cero per a que mos done error o algo aixina hem entes de abdo