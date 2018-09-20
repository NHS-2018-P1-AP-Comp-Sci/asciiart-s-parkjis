/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt {
	
	public static void main(String[] args) {
		star();
		statue();
		clothe();
		clothe();
		clothe();
		clothe();
		clothe();
		clothe();
		stand();
		stand();
		standBig();
		stand();
		stand();
		stand();
		stand();
		stand();
		standBig();
		standBig();	
		System.out.println("_____________________________");
		water();
		water();
		System.out.println("   The Statue of Liberty");
		
	}
	public static void statue() {
		System.out.println("    &       *       *           *");
		System.out.println("   [_]  *               *");
		System.out.println("    B|       *");
		System.out.println(" *  U|            *          *");
		System.out.println("    ||     *");
		System.out.println("*   || *                *");
		System.out.println("    ||   _\\-|-|-/_           *");
		System.out.println("    |)  * (|||||) *");
		System.out.println("  * \\\\    | ^ ^ |   *              *");
		System.out.println("     \\\\_   \\ u / *            *");
		System.out.println("     L   \\__| |___      *");
		System.out.println(" *    \\     \\_/  | )");
		System.out.println("       \\    _/  /|/ _____");
		System.out.println("        \\  /   | |\\/July/      *");
		System.out.println("  *     |_/   /  |/ IV /            *");
		System.out.println("        |    |   | ~~ /B");
		System.out.println("      * |        |___/    *");
		
	} 
	public static void star() {
		System.out.println("  /\\       *                 *");
		System.out.println("<    >             /\\ ");
		System.out.println(" (/\\)      *     <    >           *");
		System.out.println("        *         (/\\)");
		System.out.println(" *            *        *");
		System.out.println("    *     /\\      *          *");
		System.out.println("        <    >   *");
		System.out.println(" *       (/\\)       *");
	}
	public static void clothe() {
		System.out.println("\t|        |");
	}
	public static void stand() {
		System.out.println("      [TTTTTTTTTTTT]");
	}
	public static void standBig() {
		System.out.println("    [iiiiiiiiiiiiiiii]");
	}
	public static void water() {
		System.out.println("~ ^ ~ ^ ~ ^ ~ ^ ~ ^ ~ ^ ~ ^");
		System.out.println(" \" ~ \" ~ \" ~ \" ~ \" ~ \" ~ \" ~");
	}
}