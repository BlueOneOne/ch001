package sia.knights;

/**
 * 勇敢的骑士，可以接受各种任务,给传入一个接口就行
 */
public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
