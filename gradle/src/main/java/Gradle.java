import com.google.common.base.Joiner;

public class Gradle {
	public String joinStrings(String s1, String s2, String s3) {
		Joiner joiner = Joiner.on("; ").skipNulls();
		return joiner.join(s1, s2, s3);
	}
	
	public static void main(String[] args) {
		Gradle gradle = new Gradle();
		System.out.println(gradle.joinStrings("abc", null, "def"));
	}
}