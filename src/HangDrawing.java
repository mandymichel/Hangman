public class HangDrawing {
	String drawing = null;

	public static void drawEmpty() {
		StringBuilder sb = getHeader();
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	private static StringBuilder getHeader() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------\n");
		sb.append("|     |\n");
		return sb;
	}

	public static void drawOne() {
		StringBuilder sb = getHeader();
		sb.append("|     O\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	public static void drawTwo() {
		StringBuilder sb = getHeader();
		sb.append("|     0\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	public static void drawThree() {
		StringBuilder sb = getHeader();
		sb.append("|     @\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	public static void drawFour() {
		StringBuilder sb = getHeader();
		sb.append("|     @\n");
		sb.append("|    /\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	public static void drawFive() {
		StringBuilder sb = getHeader();
		sb.append("|     @\n");
		sb.append("|    / \\\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	public static void drawSix() {
		StringBuilder sb = getHeader();
		sb.append("|     @\n");
		sb.append("|    /|\\\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	public static void drawSeven() {
		StringBuilder sb = getHeader();
		sb.append("|     @\n");
		sb.append("|    /|\\\n");
		sb.append("|     |\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	public static void drawEight() {
		StringBuilder sb = getHeader();
		sb.append("|     @\n");
		sb.append("|    /|\\\n");
		sb.append("|     |\n");
		sb.append("|    /\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

	public static void drawNine() {
		StringBuilder sb = getHeader();
		sb.append("|     @\n");
		sb.append("|    /|\\\n");
		sb.append("|     |\n");
		sb.append("|    / \\\n");
		sb.append("|\n");
		sb.append("|\n");
		sb.append("_______");
		System.out.println(sb.toString());
	}

}
