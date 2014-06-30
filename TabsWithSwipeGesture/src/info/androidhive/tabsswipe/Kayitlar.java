package info.androidhive.tabsswipe;

import java.util.ArrayList;
import java.util.Collections;

public class Kayitlar {

	private static Kayitlar kayitlar;
	ArrayList<String> liste;

	private Kayitlar() {
		liste = new ArrayList<String>();
	}

	public static Kayitlar getInstance() {

		if(kayitlar == null)
			kayitlar = new Kayitlar();
		
		return kayitlar;
	}

	public void yeniKayit(String string) {
		liste.add(string);
	}

	public ArrayList<String> kayitlariGetir() {
		Collections.reverse(liste);
		return liste;
	}

}
