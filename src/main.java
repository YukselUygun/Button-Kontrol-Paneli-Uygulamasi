/* HAZIRLAYANLAR
Ad: Yüksel
Soyad: Uygun
Numara: 1220505036
----------------------
Ad: Ahmet
Soyad: Çalışkan
Numara: 1220505025
 */

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dugme Paneli");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(4, 4, 10, 10)); // Butonlar arasına boşlık tanımladık.

            OzelDugme[] dugmeler = new OzelDugme[16];// 16 tane butonu OzelDugme dizisine atadık
            for (int i = 0; i < 16; i++) {
                dugmeler[i] = new OzelDugme("Dugme " + (i + 1));

                frame.add(dugmeler[i]);

                dugmeler[i].setGraphQLSema("https://www.klu.edu.tr/"); // GraphQLSema her buton belirlediğimiz "https://www.klu.edu.tr/" url sine gitsin.


            }

            frame.setSize(400, 400);//Oluşturdğumuz butonlara yükseklik(Height) ve genişlik(Width) belirledik.
            frame.setVisible(true);
        });
    }
}
