package kuyruk_dizi;

public class Main {
  public static void main(String[] args) {
      Kuyruk kuyruk = new Kuyruk(5);

      Ornek ornek = new Ornek(1);
      kuyruk.kuyrugaEkle(ornek);
      System.out.println(kuyruk.bas);
      System.out.println(kuyruk.son);

      Ornek ornek1 = new Ornek(2);
      kuyruk.kuyrugaEkle(ornek1);
      System.out.println(kuyruk.bas);
      System.out.println(kuyruk.son);

      Ornek ornek2 = new Ornek(3);
      kuyruk.kuyrugaEkle(ornek2);
      System.out.println(kuyruk.bas);
      System.out.println(kuyruk.son);

      Ornek ornek3 = new Ornek(4);
      kuyruk.kuyrugaEkle(ornek3);
      System.out.println(kuyruk.bas);
      System.out.println(kuyruk.son);

      
    System.out.println(kuyruk.kuyrukDolu());

      Ornek ornek4 = new Ornek(5);
      kuyruk.kuyrugaEkle(ornek4);
      System.out.println(kuyruk.bas);

    System.out.println(kuyruk.son);


      kuyruk.kuyrukYaz();

  }  
}
