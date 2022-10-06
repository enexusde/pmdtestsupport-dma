package pmdtest;
import static test.SELECT.*;
public class ClassUnderTest {
	public static void main(String[] args) {
		FROM(囗Teacher.class).AS(T -> WHERE(T.name).ㅤᆖㅤ("abc").
		SELECT().ꁘ(T));
	}
}
