package generic;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;

public class RobotClass {
	
	Robot re;
	


	/* To Press ENTER Key using Robot */
	public void hitEnter() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
	}


	/* To Press BACKSPACE Key using Robot */
	public void hitBackspace() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_BACK_SPACE);
		re.keyRelease(KeyEvent.VK_BACK_SPACE);
	}


	/* To Press DELETE Key using Robot */
	public void hitDelete() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_DELETE);
		re.keyRelease(KeyEvent.VK_DELETE);
	}


	/* To Select all the Text/Web Elements using ROBOT */
	public void selectAll() throws Exception
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_A);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_A);
	}


	/* To Copy all the Selected Text/Web Elements using ROBOT */
	public void copyAll() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_C);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_C);
	}


	/* To Paste all the Selected Text/Web Elements using ROBOT */
	public void pasteAll() throws Exception
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_V);
	}


	/* To Capture Screenshot(Replaces if already exists) */
	/*
	 * Also, Make sure that the automation in running in the foreground to
	 * capture the Image of the Browser. Else, It'll capture the open Window
	 */
	/*
	 * public void robotScreenCapture(String robotImageName) throws Exception { re =
	 * new Robot(); Rectangle area = new
	 * Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); BufferedImage
	 * bufferedImage = re.createScreenCapture(area); // Save as PNG File file = new
	 * File(robotImageName); if (file.exists()) { file.delete(); }
	 * ImageIO.write(bufferedImage, "png", file); }
	 */


	/* To ZoomOut */
	public void robotZoomOut() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_SUBTRACT);
		re.keyRelease(KeyEvent.VK_SUBTRACT);
		re.keyRelease(KeyEvent.VK_CONTROL);
	}


	/* To ZoomIn */
	public void robotZoomIn() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_ADD);
		re.keyRelease(KeyEvent.VK_ADD);
		re.keyRelease(KeyEvent.VK_CONTROL);
	}


	/* To ScrollUp using ROBOT */
	public void robotScrollUp() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_PAGE_UP);
		re.keyRelease(KeyEvent.VK_PAGE_UP);
	}


	/* To ScrollDown using ROBOT */
	public void robotScrollDown() throws Exception
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_PAGE_DOWN);
		re.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}


	/* To ScrollUp using JavaScript Executor */
	public void scrollUp() throws Exception 
	{
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, -100);");
	}


	private JavascriptExecutor getWebDriver() {
		// TODO Auto-generated method stub
		return null;
	}


	/* To ScrollDown using JavaScript Executor */
	public void scrollDown() throws Exception 
	{
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, 100);");
	}


	/* To Move cursor to the Desired Location */
	public void moveCursor(int X_Position, int Y_Position) throws Exception 
	{
		re.mouseMove(X_Position, Y_Position);
	}
	
	/* To Upload a File using JAVA AWT ROBOT */
	public void fileUpload(String FileToUpload) throws Exception 
	{
		Thread.sleep(5000);
		StringSelection filetocopy = new StringSelection(FileToUpload);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filetocopy, null);
		Thread.sleep(1000);
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
	}


}
