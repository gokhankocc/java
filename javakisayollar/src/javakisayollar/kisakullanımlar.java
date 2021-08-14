package javakisayollar;

public class kisakullanýmlar {

	public static void main(String[] args) {
		String mesaj = "Zehra tam bir mal";
		/*System.out.println(mesaj);
		
		System.out.println("eleman sayisi : "+mesaj.length());
		System.out.println("5. eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" o bir salak"));
		System.out.println(mesaj.startsWith("z"));
		System.out.println(mesaj.endsWith("l"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 1);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("ra"));
		System.out.println(mesaj.lastIndexOf("m"));
		System.out.println(mesaj);*/
		
		String yenimesaj = mesaj.replace(' ','+');
		System.out.println(yenimesaj);
		System.out.println(mesaj.substring(2,5));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // bastaki ve sondaki bosluklarý kaldýrýr
		
		
	}

}
