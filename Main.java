class Main {
  public static void main(String[] args) {
    Animal a1 = new Cat();
    a1.sound();
    Cat c1 = new Cat();
    c1.sound();

    //multiple interfaces implementtions

    c1.move();
    Animal1 a2 = new Cat();
    a2.move();
  }
}