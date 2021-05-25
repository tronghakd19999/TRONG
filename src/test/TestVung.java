package test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dao.VungDAO;
import model.Vung;

public class TestVung extends TestDriver {
	
	ChromeDriver driver = getDriver();


	@Test
	public void testVungGiaoDien() {
		
		try {
			String test = "";
			String expected = "";
			driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
			
			//CHon Cau hinh Vung
			driver.findElement(By.id("Cau_hinh")).click();
//			Select vungCauHinh = new Select(driver.findElementByName(By.id.("bang_cau_hinh")));
//			vungCauHinh.selectByValue("1");
			test = driver.getTitle();
			expected = "Cấu hình vùng";
			assertEquals(test, expected);
			
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
			assertEquals(4, rows.size());
			
			driver.close();
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	@Test
	public void testCauHinhVung1RollBack()  throws SQLException{
		VungDAO vungDAO = new VungDAO();
		Connection connection = vungDAO.getDAOConnection();
		
		try {
			String test = "";
			String expected = "";
			driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
			
			//CHon Cau hinh Vung
			driver.findElement(By.id("Cau_hinh")).click();
//			Select vungCauHinh = new Select(driver.findElementByName(By.id.("bang_cau_hinh")));
//			vungCauHinh.selectByValue("1");
//			test = driver.getTitle();
//			expected = "Cấu hình vùng";
//			assertEquals(test, expected);
			driver.findElement(By.id("1")).click();
//			Select vungId = new Select(driver.findElement(By.id("id")));
//			vungId.selectByValue("1");
			connection.setAutoCommit(false);
			//Thay doi cau hinh Vung
			WebElement input = driver.findElement(By.xpath("(//input[@name='muctoithieu'])"));
			input.clear();
			input.sendKeys("4300000");
			
			driver.findElement(By.xpath("(//input[@type='submit'])")).click();
			driver.close();
			
			
			
			//Fake data
			ArrayList<Vung> vungTest = new ArrayList<>();
			vungTest.add(new Vung(0, 1, 4300000));
			
			ArrayList<Vung> vungData;
			vungData = vungDAO.getVung("1");
			
			assertEquals(vungTest, vungData);
			

				
		} finally {
			connection.rollback();
			connection.close();
		} 
	}
	@Test
	public void testCauHinhVung1KhongRollBack(){
		VungDAO vungDAO = new VungDAO();

		try {
			String test = "";
			String expected = "";
			driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
			
			//CHon Cau hinh Vung
			driver.findElement(By.id("Cau_hinh")).click();
//			Select vungCauHinh = new Select(driver.findElementByName(By.id.("bang_cau_hinh")));
//			vungCauHinh.selectByValue("1");
//			test = driver.getTitle();
//			expected = "Cấu hình vùng";
//			assertEquals(test, expected);
			driver.findElement(By.id("1")).click();
//			Select vungId = new Select(driver.findElement(By.id("id")));
//			vungId.selectByValue("1");
			
			//Thay doi cau hinh Vung
			WebElement input = driver.findElement(By.xpath("(//input[@name='muctoithieu'])"));
			input.clear();
			input.sendKeys("4400000");
			
			driver.findElement(By.xpath("(//input[@type='submit'])")).click();
			driver.findElement(By.id("Cau_hinh")).click();
			driver.findElement(By.id("1")).click();
			expected = "4400000";
			test = input.getAttribute("value");
			
			driver.close();
			assertEquals(expected,test);

				
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	
	@Test
	public void testCauHinhVung1KhongRollBackNegativeValue(){

		try {
			String test = "";
			String expected = "";
			driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
			
			//CHon Cau hinh Vung
			driver.findElement(By.id("Cau_hinh")).click();
//			Select vungCauHinh = new Select(driver.findElementByName(By.id.("bang_cau_hinh")));
//			vungCauHinh.selectByValue("1");
//			test = driver.getTitle();
//			expected = "Cấu hình vùng";
//			assertEquals(test, expected);
			driver.findElement(By.id("1")).click();
//			Select vungId = new Select(driver.findElement(By.id("id")));
//			vungId.selectByValue("1");
			
			//Thay doi cau hinh Vung
			WebElement input = driver.findElement(By.xpath("(//input[@name='muctoithieu'])"));
			input.clear();
			input.sendKeys("-4500000");
			
			driver.findElement(By.xpath("(//input[@type='submit'])")).click();
			driver.findElement(By.id("Cau_hinh")).click();
			driver.findElement(By.id("1")).click();
			expected = "-4500000";
			test = input.getAttribute("value");
			
			driver.close();
			assertEquals(expected,test);

				
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	@Test
	public void testCauHinhVung1KhongRollBackNegativeId(){
		VungDAO vungDAO = new VungDAO();

		try {
			String test = "";
			String expected = "";
			driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
			
			//CHon Cau hinh Vung
			driver.findElement(By.id("Cau_hinh")).click();
//			Select vungCauHinh = new Select(driver.findElementByName(By.id.("bang_cau_hinh")));
//			vungCauHinh.selectByValue("1");
//			test = driver.getTitle();
//			expected = "Cấu hình vùng";
//			assertEquals(test, expected);
			driver.findElement(By.id("1")).click();
//			Select vungId = new Select(driver.findElement(By.id("id")));
//			vungId.selectByValue("1");
			
			//Thay doi cau hinh Vung
			WebElement input = driver.findElement(By.xpath("(//input[@name='id'])"));
			input.clear();
			input.sendKeys("-1");
			
			driver.findElement(By.xpath("(//input[@type='submit'])")).click();
			driver.findElement(By.id("Cau_hinh")).click();
			driver.findElement(By.id("1")).click();
			expected = "1";
			test = input.getAttribute("value");
			
			driver.close();
			assertEquals(expected,test);

				
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	@Test
	public void testCauHinhVung1KhongRollBackBigValue(){
		try {
			String test = "";
			String expected = "";
			driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
			
			//CHon Cau hinh Vung
			driver.findElement(By.id("Cau_hinh")).click();
//			Select vungCauHinh = new Select(driver.findElementByName(By.id.("bang_cau_hinh")));
//			vungCauHinh.selectByValue("1");
//			test = driver.getTitle();
//			expected = "Cấu hình vùng";
//			assertEquals(test, expected);
			driver.findElement(By.id("1")).click();
//			Select vungId = new Select(driver.findElement(By.id("id")));
//			vungId.selectByValue("1");
			
			//Thay doi cau hinh Vung
			WebElement input = driver.findElement(By.xpath("(//input[@name='muctoithieu'])"));
			input.clear();
			input.sendKeys("4524234300000");
			
			driver.findElement(By.xpath("(//input[@type='submit'])")).click();
			driver.findElement(By.id("Cau_hinh")).click();
			driver.findElement(By.id("1")).click();
			expected = "4524234300000";
			test = input.getAttribute("value");
			
			driver.close();
			assertEquals(expected,test);

				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Test
	public void testCauHinhVung1KhongRollBackNegativeId2(){
		VungDAO vungDAO = new VungDAO();

		try {
			String test = "";
			String expected = "";
			driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
			
			//CHon Cau hinh Vung
			driver.findElement(By.id("Cau_hinh")).click();
//			Select vungCauHinh = new Select(driver.findElementByName(By.id.("bang_cau_hinh")));
//			vungCauHinh.selectByValue("1");
//			test = driver.getTitle();
//			expected = "Cấu hình vùng";
//			assertEquals(test, expected);
			driver.findElement(By.id("1")).click();
//			Select vungId = new Select(driver.findElement(By.id("id")));
//			vungId.selectByValue("1");
			
			//Thay doi cau hinh Vung
			WebElement input = driver.findElement(By.xpath("(//input[@name='id'])"));
			input.clear();
			input.sendKeys("-1");
			
			driver.findElement(By.xpath("(//input[@type='submit'])")).click();
			driver.findElement(By.id("Cau_hinh")).click();
			driver.findElement(By.id("1")).click();
			expected = "-1";
			test = input.getAttribute("value");
			
			driver.close();
			assertEquals(expected,test);

				
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
}
