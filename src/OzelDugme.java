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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OzelDugme extends JButton {//OzelDugme sınıfı JButton sınıfına genişletildi.
    private String graphQLSema; // GraphQL şema adresi tanımlandı.
    private Color aktifRenk; // Aktif durumda kullanılacak renk tanımlandı.
    private Color pasifRenk; // Pasif durumda kullanılacak renk tanımland.
    private boolean aktifMi; // Düğmenin aktif durumu tanımlandı.

    public OzelDugme(String metin) {//Yapıcı metot kulandık
        super(metin);
        this.graphQLSema = ""; // Gerçek şema adresini ekleyin
        this.aktifRenk = Color.red; //aktif renk kırmızı olarak tanımlandı.
        this.pasifRenk = Color.lightGray;//pasif renk mavi olarak tanımlandı.
        this.aktifMi= false; //aktifMi değişkeninin varsayılanı false olarak atandı.

        pasifDurum(); // Başlangıçta pasif durumu ayarla
        addActionListener(new DugmeTiklama()); // Düğme tıklama aksiyonu eklendi.
    }

    public void setGraphQLSema(String sema) { //GraphQLSema set edildi.
        this.graphQLSema = sema;
    }

    private void pasifDurum() { // Başlangıçta pasif durumu ayarla
        setBackground(pasifRenk);
        setText("Pasif Buton");
        aktifMi = false;
    }

    private void aktifDurum() { // Başlangıçta aktif durumu ayarla
        setBackground(aktifRenk);
        setText("Aktif Buton");
        aktifMi = true;
    }

    private class DugmeTiklama implements ActionListener { //DugmeTiklama sınıfı ActionListener arayüzüne genişletildi.
        @Override
        public void actionPerformed(ActionEvent e) { // Aktiflik kontrolü ayarlandı.
            if (aktifMi) {
                mevcutDugmeHaricTumDugmeleriPasif();
            } else {
                aktifDurum();
                System.out.println("Mutation çalıştırıldı. graphQL şema adresi: " + graphQLSema); // Burada kendi belirlediğimiz GraphQL şemasında bir mutation çalıştırdık.
            }
        }
    }

    private void mevcutDugmeHaricTumDugmeleriPasif() { //Basıllan butın hariç diğer tüm butonları pasifleştirir.
        for (Component component : getParent().getComponents()) {
            if (component instanceof OzelDugme && component != this) {
                ((OzelDugme) component).pasifDurum();
            }
        }

    }



}