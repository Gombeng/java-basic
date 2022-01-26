public class Hero extends Human {

  private int energy = 100;

  public Hero(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void player() {
    System.out.println("========= Player ========");
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Energy: " + this.energy);
    System.out.println("=========================");
  }

  void checkEnergy() {
    if(energy <= 10) {
      System.out.println("Energy tersisa " + this.energy);
      energy += 100;
      System.out.println("Menambah "  + this.energy +  " energy!");
    }
  }


  void walk() {
    checkEnergy();
    System.out.println(this.name + " sedang berjalan....");
    energy -= 10;
  }
 
  void run() {
    checkEnergy();
    System.out.println(this.name + " sedang berlari....");
    energy -= 20;
  }

  void eat() {
    checkEnergy();
    System.out.println(this.name + " sedang makan....");
    energy += 20;
  }

  void drink() {
    checkEnergy();
    System.out.println(this.name + " sedang minum....");
    energy += 20;
  }

  void jump() {
    checkEnergy();
    System.out.println(this.name + " sedang melompat....");
    energy -= 20;
  }

  void sit() {
    checkEnergy();
    System.out.println(this.name + " sedang duduk....");
    energy += 10;
  }

  void attack() {
    checkEnergy();
    System.out.println(this.name + " sedang menyerang....");
    energy -= 30;
  }


  /* Buat method untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
   - pasang method checkHealth() di dalam method yang akan dibuat
   - Tampilkan pesan kegiatan yang sedang dilakukan, misal, jika lari: " sedang berlari..."
   - ubah energy sesuai kegiatan yang dilakukan:
    * run = -10
    * eat = +20
    * drink = +20
    * jump = -20
    * sit = +10
    * attack = -30

    Contoh method seperti method run() diatas.

  */

}