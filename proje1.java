public class proje1 {
	public static void main(String args[]) {
		// System.out.println("----------TersToplam Durum Kontrolleri---------- ");
		// System.out.println("TersToplam Durum 1 Kontrolü: " + TersToplam(3,1));
		// System.out.println("TersToplam Durum 2.1 Kontrolü 1: " + TersToplam(-4,10));
		// System.out.println("TersToplam Durum 2.2 Kontrolü 1: " + TersToplam(-10,4));
		// System.out.println("TersToplam Durum 2.3 Kontrolü 1: " + TersToplam(0,4));
		// System.out.println("TersToplam Durum 2.1 Kontrolü 2: " + TersToplam(10,-4));
		// System.out.println("TersToplam Durum 2.2 Kontrolü 2: " + TersToplam(4,-10));
		// System.out.println("TersToplam Durum 2.3 Kontrolü 2: " + TersToplam(4,0));
		// System.out.println("------------------------------------------------ ");
		// System.out.println("-----------AsalFark Durum Kontrolleri----------- ");
		// System.out.println("AsalFark Durum 1 Kontrolü: " + AsalFark(2));
		// System.out.println("AsalFark Durum 4 Kontrolü: " + AsalFark(17));
		// System.out.println("------------------------------------------------ ");
		// System.out.println("-------ToplaPalindrome5 Durum Kontrolleri------- ");
		// System.out.println("ToplaPalindrome6 Durum Kontrolü: " + ToplaPalindrome5());
		// System.out.println("------------------------------------------------ ");
		// System.out.println("-------ToplaPalindrome6 Durum Kontrolleri------- ");
		// System.out.println("ToplaPalindrome6 Durum Kontrolü: " + ToplaPalindrome6());
		// System.out.println("------------------------------------------------ ");
		// System.out.println("----------PiKareBul Durum Kontrolleri----------- ");
		// System.out.println("PiKareBul Durum 1 Kontrolü: " + PiKareBul(0));
		// System.out.println("PiKareBul Durum 2 Kontrolü: " + PiKareBul(1));
		// System.out.println("------------------------------------------------ ");
		// System.out.println("-----------EulerBul Durum Kontrolleri----------- ");
		// System.out.println("EulerBul Durum 1 Kontrolü: " + EulerBul(0));
		// System.out.println("EulerBul Durum 2 Kontrolü: " + EulerBul(2));
		// System.out.println("------------------------------------------------ ");
		// System.out.println("--------KatalanSayısı Durum Kontrolleri--------- ");
		// System.out.println("Katalan Sayısı Durum 1 Kontrolü: " + KatalanSayisi(-3));
		// System.out.println("Katalan Sayısı Durum 2 Kontrolü: " + KatalanSayisi(1));
		// System.out.println("Katalan Sayısı Durum 3 Kontrolü: " + KatalanSayisi(5));
		// System.out.println("------------------------------------------------ ");
		System.out.println("---------PerrinSayısı Durum Kontrolleri--------- ");
		System.out.println("Perrin Sayısı Durum 1 Kontrolü: " + PerrinSayisi(-10));
		System.out.println("Perrin Sayısı Durum 2 Kontrolü 1: " + PerrinSayisi(0));
		System.out.println("Perrin Sayısı Durum 2 Kontrolü 2: " + PerrinSayisi(1));
		System.out.println("Perrin Sayısı Durum 4 Kontrolü: " + PerrinSayisi(15));
		System.out.println("------------------------------------------------ ");
		// System.out.println("---------CarpanToplam Durum Kontrolleri--------- ");
		// System.out.println("CarpanToplam Durum 1 Kontrolü: "+CarpanToplam(-1));
		// System.out.println("CarpanToplam Durum 2 Kontrolü: "+CarpanToplam(7));
		// System.out.println("------------------------------------------------ ");
		// System.out.println("-----------EkokBul Durum Kontrolleri------------ ");
		// System.out.println("EkokBul Durum Kontrolü: "+EkokBul(12,18));
		// System.out.println("------------------------------------------------ ");
	}

	public static double TersToplam(int m, int n) {
		double toplam = 0;

		// Durum 1: parametrelerin sıra kontrolü
		if (m > n) {
			// Durum 2: Daha az işlem optimizasyonu; bir sayı sıfırdan küçükse...
			if (m > 0 && n < 0 && ((n * -1) <= m)) {// Durum 2.1: Küçük sayının mutlak değeri büyük sayıdan küçükse
				n *= (-1);
				for (int i = (n + 1); i <= m; i++) {
					toplam += (1 / (double) i);
				}
				// Durum 2.1 sonu
			} else if (m > 0 && n < 0 && ((n * (-1)) > m)) {// Durum 2.2 Küçük sayının mutlak değeri büyük sayıdan
															// büyükse
				m *= (-1);
				for (int i = (m - 1); i >= n; i--) {
					toplam += (1 / (double) i);
				}
				// Durum 2.2 sonu
			} else { // Durum 2.3: İki sayı da aynı işaretliyse
				for (int i = n; i <= m; i++) {
					if (i == 0)
						continue;
					toplam += (1 / (double) i);
				}
				// Durum 2.3 sonu
			} // Durum 2 sonu
		} else {
			// Durum 2: Daha az işlem optimizasyonu; bir sayı sıfırdan küçükse...
			if (n > 0 && m < 0 && ((m * (-1)) <= n)) {// Durum 2.1: Küçük sayının mutlak değeri büyük sayıdan küçükse
				m *= (-1);
				for (int i = (m + 1); i <= n; i++) {
					toplam += (1 / (double) i);
				}
				// Durum 2.1 sonu
			} else if (n > 0 && m < 0 && ((m * (-1)) > n)) {// Durum 2.2 Küçük sayının mutlak değeri büyük sayıdan
															// büyükse
				n *= (-1);
				for (int i = (n - 1); i >= m; i--) {
					toplam += (1 / (double) i);
				}
				// Durum 2.2 sonu
			} else {// Durum 2.3: İki sayı da aynı işaretliyse
				for (int i = m; i <= n; i++) {
					if (i == 0)
						continue;
					toplam += (1 / (double) i);
				}
				// Durum 2.3 sonu
			} // Durum 2 sonu
		} // Durum 1 sonu
		return toplam;
	}

	public static int AsalFark(int n) {
		int sayac = 0;
		int kucukAsal = 0, buyukAsal = 0;

		// Durum 1: Sayının 2 ve 2 den küçük olması durumu
		if (n <= 2)
			return 0;
		else {
			// Durum 2: Sayıdan küçük en büyük asal sayının tayini
			for (int j = (n - 1); j > 2; j--) {
				sayac = 0;

				for (int i = 2; i < j; i++) {
					if (j % i == 0)
						break;
					else
						sayac++;
				}

				if (sayac == (j - 2)) {
					kucukAsal = j;
					break;
				}
			} // Durum 2 sonu

			// Durum 3: Sayıdan büyük en küçük asal sayının tayini
			for (int j = (n + 1);; j++) {
				sayac = 0;

				for (int i = 2; i < j; i++) {
					if (j % i == 0)
						break;
					else
						sayac++;
				}

				if (sayac == (j - 2)) {
					buyukAsal = j;
					break;
				}
			}
			// Durum 4 büyük asal sayı ile küçük asal sayı arasındaki farkın döndürülmesi
			return buyukAsal - kucukAsal;
		} // Durum 1 sonu
	}

	public static int ToplaPalindrome5() {
		int tersSayi = 0;
		int basamakDegeri = 10000;
		int araSayi = 0;
		int toplam = 0;

		for (int i = 10000; i < 100000; i++) {
			basamakDegeri = 10000;
			araSayi = i;
			tersSayi = 0;

			for (int j = 0; j < 5; j++) {
				tersSayi += ((araSayi % 10) * basamakDegeri);
				araSayi /= 10;
				basamakDegeri /= 10;
			}

			if (tersSayi == i) {
				toplam += i;
			}

		}

		return toplam;
	}

	public static int ToplaPalindrome6() {
		int tersSayi = 0;
		int basamakDegeri = 100000;
		int araSayi = 0;
		int toplam = 0;

		for (int i = 100000; i < 1000000; i++) {
			basamakDegeri = 100000;
			araSayi = i;
			tersSayi = 0;

			for (int j = 0; j < 6; j++) {

				tersSayi += ((araSayi % 10) * basamakDegeri);
				araSayi /= 10;
				basamakDegeri /= 10;
			}

			if (tersSayi == i) {
				toplam += i;
			}

		}

		return toplam;
	}

	public static double PiKareBul(int m) {
		double toplam = 0;

		// Durum 1: 1'den küçük sayı gönderilmesi durumu
		if (m < 1) {
			return (3.14) * (3.14);
		} else {
			// Durum 2: Pi Karenin bulunması
			for (int i = 1; i <= m; i++) {
				toplam += (1 / (double) (i * i * i * (i + 1) * (i + 1) * (i + 1)));
			}
			toplam *= (-1);
			toplam += 10;
			return toplam;
			// Durum 2 sonu
		} // Durum 1 sonu
	}

	public static double EulerBul(int m) {
		int faktoriyel = 1;
		double euler = 1;

		// Durum 1: 1'den küçük sayı gönderilmesi durumu
		if (m < 1) {
			return 2.718;
		} else {
			// Durum 2: Euler sayısının bulunması
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= i; j++) {
					faktoriyel *= j;
				}

				euler += (1 / (double) (faktoriyel));
			}
			return euler;
			// Durum 2 sonu
		} // Durum 1 sonu
	}

	public static int KatalanSayisi(int n) {

		// Durum 1: n>0
		if (n < 0) {
			return -1;
		} else {
			int[] c = new int[n + 2];
			c[0] = 1;
			c[1] = 1;
			for (int i = 2; i < c.length; i++) {
				for (int j = 0; j < i; j++) {
					c[i] += (c[j] * c[i - j - 1]);
				}
			}
			return c[n];
		} // Durum 1 sonu
	}

	public static int PerrinSayisi(int n) {

		// Durum 1: n in 0 dan küçük olması durumu
		if (n < 0) {
			return -1;
		} // Durum 1 sonu...
			// Durum 3: n'in 2 den büyük olması durumu
		else {
			int perrin[] = new int[n + 4];
			// Durum 2: nin 0 ve 2 arasıda olması durumu
			perrin[0] = 3;
			perrin[1] = 0;
			perrin[2] = 2;
			// Durum 2 sonu
			for (int i = 3; i < perrin.length; i++) {
				perrin[i] = perrin[i - 2] + perrin[i - 3];
			}
			return perrin[n];
		} // Durum 3 sonu..

	}
	// public static int PerrinSayisi(int n) {
	// if(n<0){
	// return -1;
	// }
	// else{
	// int p0=3;
	// int p1 = 0;
	// int p2 = 2;
	// int p3= 0;
	// for(int i=3; i<n; i++){
	// p3=p1+p0;
	// p0=p1;
	// p1=p2;
	// p2=p3;
	// }
	// return p3;
	// }

	// }

	public static int CarpanToplam(int sayi) {

		int toplam = 0;
		// Durum 1: sayının birden küçük olması durumu
		if (sayi < 1) {
			return -1;
		} // Durum 1 sonu
			// Durum 2: sayının birden büyük olma durumu
		else {
			for (int i = 1; i <= sayi; i++) {
				if (sayi % i == 0) {
					toplam += i;
				}
			}
			return toplam;
		} // Durum 2 son

	}

	public static int EkokBul(int m, int n) 
	{
		if (m < 1 || n < 1) 
		{
			return -1;
		} else 
		{
			int carpım = m * n;
			int ekok = 0;
			for (int i = carpım; i > 0; i--) 
			{
				if (i % m == 0 && i % n == 0) 
				{
					ekok = i;
				}
			}
			return ekok;
		}

	}
}
