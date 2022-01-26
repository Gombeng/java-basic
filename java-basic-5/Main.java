class Main {
  public static void main(String[] args) {
    Hero hero = new Hero("Syahrizal", 20);

    hero.player();
    
    int a = 1, b = 1, c = 1, d = 1, e = 1, f = 1, g = 1;

    while( a <= 10){
      hero.walk();
      a++;
    }

    while( b <= 2){
      hero.run();
      b++;
    }

    while( c <= 3){
      hero.eat();
      c++;
    }

    while( a <= 30 ){
      hero.walk();
      a++;
    }
    
    while(d <= 5){
      hero.drink();
      d++;
    }

    while (e <= 3) {
      hero.jump();
      e++;
    }

    while (f <= 5) {
      hero.sit();
      f++;
    }

    while (g <= 6) {
      hero.attack();
      g++;
    }

    hero.player();
 
  }
}