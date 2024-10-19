package day01;

import javax.swing.*;

public class P04_kullanicidanVeriAlma {

 /*
        Kullanıcıdan aşağıdaki bilgileri alarak
        Adı: Murat
        Soyadı: Yiğit
        Mesleği: Intructor
        Yaşı: 44
        Kayıt başarıyla gerçekleştirildi!
        bu formatta yazdırın
  */
 public static void main(String[] args) {

     String isim= JOptionPane.showInputDialog("İsminizi giriniz:");
     String soyisim=JOptionPane.showInputDialog("Soyisiminizi Gimriniz: ");
     String meslek=JOptionPane.showInputDialog("Mesleğinizi Giriniz: ");
     String yas=JOptionPane.showInputDialog("Yaşınızı Giriniz: ");
     JOptionPane.showMessageDialog(null,"Adı: "+isim+"\nSoyadı: "+soyisim+"\nMesleği: "+meslek+"\nYaşı: "+yas+"\n\n\nKayıt başarıyla gerçekleştirildi!");

    System.out.println("Adı: "+isim+"\nSoyadı: "+soyisim+"\nMesleği: "+meslek+"\nYaşı: "+yas+"\n\nKayıt başarıyla gerçekleştirildi!");

 }
}
