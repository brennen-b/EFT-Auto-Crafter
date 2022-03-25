
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.lang.Object;
import java.util.EventListener;

public class testerMain {

	public static void main(String[] args) throws Exception {

		

		Thread.sleep(1000);

		calibrate();

		// ARMY BANDAGE 16 MINS 25 SEC
		// BANDAGE 31 MIN 11 SEC
		// AI2 21 mins 30 sec
		// PILE O MEDS 46 min 55 sec

		int prev = 1;

		Robot robot = new Robot();
		while (1 == 1) {
			openHideout();
			startMedPile();
			if (prev == 1) {
				startBandage();

				Thread.sleep(465750);
				appearHuman();
				Thread.sleep(465750);//
				appearHuman();
				Thread.sleep(465750);
				appearHuman();
				Thread.sleep(465750);// 31.05 mins
				getBandage();
				prev = 2;
			} else {
				startArmyBandage();
				Thread.sleep(247500);
				appearHuman();
				Thread.sleep(247500);//
				appearHuman();
				Thread.sleep(247500);
				appearHuman();
				Thread.sleep(247500);// 16.5 mins
				getArmyBandage();
				prev = 1;
			}
			if (prev == 1) {
				startBandage();

				Thread.sleep(465750);
				appearHuman();
				Thread.sleep(465750);//
				appearHuman();
				Thread.sleep(465750);
				appearHuman();
				Thread.sleep(465750);// 31.05 mins
				getBandage();
				prev = 2;
			} else {
				startArmyBandage();
				Thread.sleep(247500);
				appearHuman();
				Thread.sleep(247500);//
				appearHuman();
				Thread.sleep(247500);
				appearHuman();
				Thread.sleep(247500);// 16.5 mins
				getArmyBandage();
				prev = 1;
			}

			Thread.sleep(60000); // 1 min
			getMedPile();
			robot.delay(2000);
			startAI2();
			robot.delay(2000);
			if (prev == 1) {
				startBandage();

				Thread.sleep(465750);
				appearHuman();
				Thread.sleep(465750);//
				appearHuman();
				Thread.sleep(465750);
				appearHuman();
				Thread.sleep(465750);// 31.05 mins
				getBandage();
				prev = 2;
			} else {
				startArmyBandage();
				Thread.sleep(660000);//
				appearHuman();
				Thread.sleep(660000);// 22 mins
				getArmyBandage();
				prev = 1;
			}
			getAI2();
			closeHideout();

		}

	}

	public static void calibrate() throws Exception {
		Robot robot = new Robot();
		System.out.println("Go to Hideout");
		Thread.sleep(2000);
		calibrateLav();
		calibrateMed();
		openLav();
		calibrateArmyBandage();
		calibrateBandage();
		escape();
		openMed();
		calibrateAI2();
		calibrateMedPile();
		escape();
	}

	public static void calibrateLav() throws Exception {
		String name = "Lavatory";
		
		menuReset();
		scrollCountdown(name);
		Lavatory.setScroll();
		Thread.sleep(2000);
		Lavatory.scroll();

		System.out.println(name + " scrolled " + Lavatory.getScroll() + " notches.");
		Thread.sleep(1000);
		coordCountdown(name);
		Lavatory.setX();
		Lavatory.setY();
		double x = Lavatory.getX();
		double y = Lavatory.getY();
		System.out.println(name + " coords: (x: " + x + ", y: " + y + ")");
		Thread.sleep(1000);

	}

	public static void calibrateArmyBandage() throws Exception {
		String name = "Army Bandage(Green)";

		menuResetCraft();
		scrollCountdown(name);
		ArmyBandage.setScroll();
		Thread.sleep(2000);
		ArmyBandage.scroll();

		System.out.println(name + " scrolled " + ArmyBandage.getScroll() + " notches.");
		Thread.sleep(1000);
		coordCountdown(name);
		ArmyBandage.setX();
		ArmyBandage.setY();
		double x = ArmyBandage.getX();
		double y = ArmyBandage.getY();
		System.out.println(name + " coords: (x: " + x + ", y: " + y + ")");
		Thread.sleep(1000);

	}

	public static void calibrateBandage() throws Exception {
		String name = "Bandage(White)";

		menuResetCraft();
		scrollCountdown(name);
		Bandage.setScroll();
		Thread.sleep(2000);
		Bandage.scroll();

		System.out.println(name + " scrolled " + Bandage.getScroll() + " notches.");
		Thread.sleep(1000);
		coordCountdown(name);
		Bandage.setX();
		Bandage.setY();
		double x = Bandage.getX();
		double y = Bandage.getY();
		System.out.println(name + " coords: (x: " + x + ", y: " + y + ")");
		Thread.sleep(1000);

	}

	public static void calibrateMed() throws Exception {
		String name = "Med Station";

		menuReset();
		scrollCountdown(name);
		Med.setScroll();
		Thread.sleep(2000);
		Med.scroll();

		System.out.println(name + " scrolled " + Med.getScroll() + " notches.");
		Thread.sleep(1000);
		coordCountdown(name);
		Med.setX();
		Med.setY();
		double x = Med.getX();
		double y = Med.getY();
		System.out.println(name + " coords: (x: " + x + ", y: " + y + ")");
		Thread.sleep(1000);

	}

	public static void calibrateAI2() throws Exception {
		String name = "AI2";

		menuResetCraft();
		scrollCountdown(name);
		AI2.setScroll();
		Thread.sleep(2000);
		AI2.scroll();

		System.out.println(name + " scrolled " + AI2.getScroll() + " notches.");
		Thread.sleep(1000);
		coordCountdown(name);
		AI2.setX();
		AI2.setY();
		double x = AI2.getX();
		double y = AI2.getY();
		System.out.println(name + " coords: (x: " + x + ", y: " + y + ")");
		Thread.sleep(1000);

	}

	public static void calibrateMedPile() throws Exception {
		String name = "Med Pile";

		menuResetCraft();
		scrollCountdown(name);
		MedPile.setScroll();
		Thread.sleep(2000);
		MedPile.scroll();

		System.out.println(name + " scrolled " + MedPile.getScroll() + " notches.");
		Thread.sleep(1000);
		coordCountdown(name);
		MedPile.setX();
		MedPile.setY();
		double x = MedPile.getX();
		double y = MedPile.getY();
		System.out.println(name + " coords: (x: " + x + ", y: " + y + ")");
		Thread.sleep(1000);

	}

	public static void coordCountdown(String s) throws Exception {

		System.out.print("Place cursor over button for " + s + ". Calibrating in: ");
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
			Thread.sleep(1000);
		}
		System.out.println();
	}

	public static void scrollCountdown(String s) throws Exception {

		System.out.print("Scroll until " + s + " shows up in and type how many scrolls it took here: ");

		int scrolls = 0;
		Scanner scan = new Scanner(System.in);
		scrolls = scan.nextInt();
		ScrollSet.setScroll(scrolls);
		System.out.println("Return to hideout");
		Thread.sleep(2000);

	}

	public static void openHideout() throws Exception {
		Robot robot = new Robot();

		robot.mouseMove(1280, 870);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(3000);
		menuReset();

	}

	public static void closeHideout() throws Exception {
		Robot robot = new Robot();

		escape();
		escape();
		escape();

	}

	public static void openLav() throws Exception {
		Robot robot = new Robot();
		menuReset();
		robot.delay(200);
		robot.mouseMove(1280, 1000);///////////
		robot.delay(1500);
		mouseScroll(Lavatory.getScroll());
		robot.delay(1500);
		robot.mouseMove(Lavatory.getX(), Lavatory.getY());
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(2000);

	}

	public static void openMed() throws Exception {
		Robot robot = new Robot();
		menuReset();
		robot.delay(200);
		robot.mouseMove(1280, 1000);
		robot.delay(1500);
		mouseScroll(Med.getScroll());
		robot.delay(1500);
		robot.mouseMove(Med.getX(), Med.getY());
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(2000);

	}

	public static void menuReset() throws Exception {
		Robot robot = new Robot();

		robot.mouseMove(1280, 1000);
		robot.delay(1000);
		mouseScrollUp(80); // resets wheel
		robot.delay(3000);
	}
	
	public static void menuResetCraft() throws Exception {
		Robot robot = new Robot();

		robot.mouseMove(2000, 500);
		robot.delay(1000);
		mouseScrollUp(80); // resets wheel
		robot.delay(3000);
	}


	public static void startAI2() throws Exception {
		Robot robot = new Robot();
		openMed();

		robot.mouseMove(1890, 520);
		// mouseScroll(27);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1000);
		handover();
		System.out.println("AI2 Started");
		escape();

	}

	public static void getMedPile() throws Exception {
		Robot robot = new Robot();
		openMed();

		robot.mouseMove(1950, 780);
		mouseScroll(2);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1000);
		escape();
		System.out.println("Med Pile Received");
	}

	public static void getAI2() throws Exception {
		Robot robot = new Robot();
		openMed();

		robot.mouseMove(1890, 520);
		// mouseScroll(27);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1000);
		escape();
		System.out.println("AI2 Received");
	}

	public static void startMedPile() throws Exception {
		Robot robot = new Robot();
		openMed();

		robot.mouseMove(1950, 780);
		mouseScroll(2);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1000);
		handover();
		System.out.println("Med Pile Started");
		escape();

	}

	public static void startArmyBandage() throws Exception {
		Robot robot = new Robot();
		openLav();

		robot.mouseMove(1890, 600);
		mouseScroll(31);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1000);
		handover();
		System.out.println("Army Bandage Started");
		escape();

	}

	public static void getArmyBandage() throws Exception {
		Robot robot = new Robot();
		openLav();
		robot.mouseMove(1890, 600);
		mouseScroll(31);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		System.out.println("Army Bandage Received");
		robot.delay(1000);
		escape();
	}

	public static void startBandage() throws Exception {
		Robot robot = new Robot();
		openLav();
		robot.mouseMove(1890, 600); // BANDAGE
		mouseScroll(17);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1000);
		handover();
		System.out.println("Bandage Started");
		escape();

	}

	public static void getBandage() throws Exception {
		Robot robot = new Robot();
		openLav();
		robot.mouseMove(1890, 600); // BANDAGE
		mouseScroll(17);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		System.out.println("Bandage Received");
		robot.delay(1000);
		escape();

	}

	public static void handover() throws Exception {
		Robot robot = new Robot();
		robot.mouseMove(1280, 790);
		robot.delay(200);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(200);
	}

	public static void appearHuman() throws Exception {
		Robot robot = new Robot();

		robot.mouseMove(1280, 40);
		robot.delay(600);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		Random random = new Random();
		int q = 1 * random.nextInt(1000);
		int p = 1 * random.nextInt(5000);
		robot.keyPress(KeyEvent.VK_W);
		robot.delay(p);
		robot.keyRelease(KeyEvent.VK_W);
		robot.delay(q);
		robot.keyPress(KeyEvent.VK_S);
		robot.delay(p);
		robot.keyRelease(KeyEvent.VK_S);
		robot.delay(q);
		escape();

	}
	public static void escape() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.delay(1000);
	}

	public static void lavMenu() throws Exception {
		Robot robot = new Robot();

		for (int i = 0; i < 55; i++) {
			robot.mouseWheel(5);
		}

	}

	public static void mouseScrollUp(int i) throws Exception {
		Robot robot = new Robot();

		for (int j = 0; j < i; j++) {
			robot.mouseWheel(-5);
		}

	}

	public static void mouseScroll(int i) throws Exception {
		Robot robot = new Robot();

		for (int j = 0; j < i; j++) {
			robot.mouseWheel(5);
		}

	}

	public static class ScrollSet {

		static int mouseScroll;
		static int notches;

		public static void setScroll(int notches) throws Exception {

			mouseScroll = notches;

		}

		public static int getScroll() throws Exception {

			return mouseScroll;
		}

	}

	public static class Base {
		static Point coords = MouseInfo.getPointerInfo().getLocation();
		static double x, y;
		static int xx, yy, mouseScroll;

		public static void setX() {
			x = coords.getX();
		}

		public static void setY() {
			y = coords.getY();
		}

		public static int getX() {
			xx = (int) x;
			return xx;
		}

		public static int getY() {
			yy = (int) y;
			return yy;
		}
	}

	public static class Lavatory {

		static double x, y;
		static int xx, yy, mouseScroll;

		public static void setX() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			x = coords.getX();
		}

		public static void setY() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			y = coords.getY();
		}

		public static int getX() {
			xx = (int) x;
			return xx;
		}

		public static int getY() {
			yy = (int) y;
			return yy;
		}

		public static void setScroll() throws Exception {
			mouseScroll = ScrollSet.getScroll();
		}

		public static int getScroll() {
			return mouseScroll;
		}

		public static void scroll() throws Exception {
			System.out.println("Resetting menu");
			Thread.sleep(1000);
			menuReset();
			mouseScroll(mouseScroll);
		}

	}

	public static class ArmyBandage {

		static double x, y;
		static int xx, yy, mouseScroll;

		public static void setX() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			x = coords.getX();
		}

		public static void setY() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			y = coords.getY();
		}

		public static int getX() {
			xx = (int) x;
			return xx;
		}

		public static int getY() {
			yy = (int) y;
			return yy;
		}

		public static void setScroll() throws Exception {
			mouseScroll = ScrollSet.getScroll();
		}

		public static int getScroll() {
			return mouseScroll;
		}

		public static void scroll() throws Exception {
			System.out.println("Resetting menu");
			Thread.sleep(1000);
			menuResetCraft();
			mouseScroll(mouseScroll);
		}

	}

	public static class Bandage {

		static double x, y;
		static int xx, yy, mouseScroll;

		public static void setX() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			x = coords.getX();
		}

		public static void setY() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			y = coords.getY();
		}

		public static int getX() {
			xx = (int) x;
			return xx;
		}

		public static int getY() {
			yy = (int) y;
			return yy;
		}

		public static void setScroll() throws Exception {
			mouseScroll = ScrollSet.getScroll();
		}

		public static int getScroll() {
			return mouseScroll;
		}

		public static void scroll() throws Exception {
			System.out.println("Resetting menu");
			Thread.sleep(1000);
			menuResetCraft();
			mouseScroll(mouseScroll);
		}

	}

	public static class Med {
		static double x, y;
		static int xx, yy, mouseScroll;

		public static void setX() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			x = coords.getX();
		}

		public static void setY() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			y = coords.getY();
		}

		public static int getX() {
			xx = (int) x;
			return xx;
		}

		public static int getY() {
			yy = (int) y;
			return yy;
		}

		public static void setScroll() throws Exception {
			mouseScroll = ScrollSet.getScroll();
		}

		public static int getScroll() {
			return mouseScroll;
		}

		public static void scroll() throws Exception {
			System.out.println("Resetting menu");
			Thread.sleep(1000);
			menuReset();
			mouseScroll(mouseScroll);
		}

	}

	public static class AI2 {

		static double x, y;
		static int xx, yy, mouseScroll;

		public static void setX() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			x = coords.getX();
		}

		public static void setY() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			y = coords.getY();
		}

		public static int getX() {
			xx = (int) x;
			return xx;
		}

		public static int getY() {
			yy = (int) y;
			return yy;
		}

		public static void setScroll() throws Exception {
			mouseScroll = ScrollSet.getScroll();
		}

		public static int getScroll() {
			return mouseScroll;
		}

		public static void scroll() throws Exception {
			System.out.println("Resetting menu");
			Thread.sleep(1000);
			menuResetCraft();
			mouseScroll(mouseScroll);
		}

	}

	public static class MedPile {

		static double x, y;
		static int xx, yy, mouseScroll;

		public static void setX() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			x = coords.getX();
		}

		public static void setY() {
			Point coords = MouseInfo.getPointerInfo().getLocation();
			y = coords.getY();
		}

		public static int getX() {
			xx = (int) x;
			return xx;
		}

		public static int getY() {
			yy = (int) y;
			return yy;
		}

		public static void setScroll() throws Exception {
			mouseScroll = ScrollSet.getScroll();
		}

		public static int getScroll() {
			return mouseScroll;
		}

		public static void scroll() throws Exception {
			System.out.println("Resetting menu");
			Thread.sleep(1000);
			menuResetCraft();
			mouseScroll(mouseScroll);
		}

	}

}
