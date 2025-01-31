@RunWith(Parameterized.class) 
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters  // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
		   { 7, false},
           { 18, true},
           { 21,true},
        
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	... // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult();
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Передаваемый возраст не соответствует логике расчета",,isAdult);
	}
}
