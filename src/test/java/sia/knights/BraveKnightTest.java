package sia.knights;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class BraveKnightTest {

  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest mockQuest = mock(Quest.class);//mock一个接口的实现类对象
    BraveKnight knight = new BraveKnight(mockQuest);
    knight.embarkOnQuest();
    verify(mockQuest, times(1)).embark();
  }

}
