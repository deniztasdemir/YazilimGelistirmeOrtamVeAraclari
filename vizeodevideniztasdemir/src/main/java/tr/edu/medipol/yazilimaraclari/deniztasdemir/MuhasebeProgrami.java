package tr.edu.medipol.yazilimaraclari.deniztasdemir;

import java.util.Scanner;

public class MuhasebeProgrami {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Calistiginiz saati  giriniz : ");
        int calisilansaat = scan.nextInt();

        System.out.println("Saatlik ucretinizi giriniz : ");
        int saatlikucret = scan.nextInt();
        
        System.out.println("Alacagýnýz toplam ucret : "+ ucretHesapla(calisilansaat,saatlikucret));
	
	}
	
	
	public static int ucretHesapla(int calisilansaat, int saatlikucret) {
		int ucretHesapla =  calisilansaat * saatlikucret;
		return ucretHesapla;
		
		}
	
	
	private static class Ucret {
		int calisilanSaat;
		int saatlikUcret;
		int ucret;
	}
	
	
}