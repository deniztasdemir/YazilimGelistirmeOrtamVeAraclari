package tr.edu.medipol.yazilimaraclari.deniztasdemir;


import org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;


public class MuhasebeProgramiTest {
	
	@Test
	public void maasTest() {
			
		int calisilansaat = 20;
		int saatlikucret = 80;
		
		int ucrethesapla = MuhasebeProgrami.ucretHesapla(calisilansaat, saatlikucret);
		Assert.assertEquals(1600, ucrethesapla);
	}

}
