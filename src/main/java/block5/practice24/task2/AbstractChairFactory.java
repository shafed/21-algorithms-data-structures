package block5.practice24.task2;

public interface AbstractChairFactory {
  VictorianChair createVictorianChair(int age);

  FunctionalChair createFunctionalChair();

  MagicChair createMagicChair();
}
