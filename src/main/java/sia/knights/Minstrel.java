package sia.knights;

import java.io.PrintStream;

public class Minstrel {

  private PrintStream stream;
  
  public Minstrel(PrintStream stream) {
    this.stream = stream;
  }

  public void singBeforeQuest() {
    stream.println("我是前置通知");
  }

  public void singAfterQuest() {
    stream.println("我是后置通知");
  }

}
