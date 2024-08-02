@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	boolean expected = true;
    assertEquals("Возвращаемое значение не соответствует заявленному",expected,isAdult);
   
}
