package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestKhachHang extends TestDriver{
	ChromeDriver driver = getDriver();

	@Test
	public void Test_Hien_Thi_Khach_Hang() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Theo_doi_danh_sach")).click();
		test = driver.getTitle();
		expected = "Theo dõi danh sách theo tháng đóng tiền thuế";
		assertEquals(test, expected);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		assertEquals(10, rows.size());
		
		driver.close();
	}
	@Test
	public void Test_Hien_Thi_Khach_Hang_1() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Theo_doi_danh_sach")).click();	
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		for(WebElement row : rows) {
			if (row.getText().contains("Trần Mạnh Đạt")) {
				System.out.println(row.getText());
				driver.findElement(By.id("1")).click();
				test = driver.getTitle();
				expected = "Chi tiết đóng thuế cá nhân";
				
				List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr/td[1]"));
				assertEquals(1, noRows.size());
				assertEquals(test, expected);
				break;
			}
			
			
		}	
		driver.close();
		
	}
	
	@Test
	public void Test_Hien_Thi_Khach_Hang_2() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Theo_doi_danh_sach")).click();	
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		for(WebElement row : rows) {
			if (row.getText().contains("Dương Tiến Thái")) {
				System.out.println(row.getText());
				driver.findElement(By.id("2")).click();
				test = driver.getTitle();
				expected = "Chi tiết đóng thuế cá nhân";
				
				List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr/td[2]"));
				assertEquals(2, noRows.size());
				assertEquals(test, expected);
				break;
			}
			
			
		}	
		driver.close();
		
	}
	
	@Test
	public void Test_Hien_Thi_Khach_Hang_3() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Theo_doi_danh_sach")).click();	
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		for(WebElement row : rows) {
			if (row.getText().contains("Trần Quốc Công")) {
				System.out.println(row.getText());
				driver.findElement(By.id("3")).click();
				test = driver.getTitle();
				expected = "Chi tiết đóng thuế cá nhân";
				
				List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr/td[3]"));
				assertEquals(1, noRows.size());
				assertEquals(test, expected);
				break;
			}
			
			
		}	
		driver.close();
		
	}
	@Test
	public void Test_Hien_Thi_Khach_Hang_4() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Theo_doi_danh_sach")).click();	
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		for(WebElement row : rows) {
			if (row.getText().contains("Phạm Minh Hiếu")) {
				System.out.println(row.getText());
				driver.findElement(By.id("4")).click();
				test = driver.getTitle();
				expected = "Chi tiết đóng thuế cá nhân";
				
				List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr/td[4]"));
				assertEquals(3, noRows.size());
				assertEquals(test, expected);
				break;
			}
			
			
		}	
		driver.close();
		
	}
	@Test
	public void Test_Hien_Thi_Khach_Hang_5() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Theo_doi_danh_sach")).click();	
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		for(WebElement row : rows) {
			if (row.getText().contains("Nguyễn Quang Huy")) {
				System.out.println(row.getText());
				driver.findElement(By.id("5")).click();
				test = driver.getTitle();
				expected = "Chi tiết đóng thuế cá nhân";
				
				List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr/td[5]"));
				assertEquals(1, noRows.size());
				assertEquals(test, expected);
				break;
			}
			
			
		}	
		driver.close();
		
	}
	@Test
	public void Test_Hien_Thi_Khach_Hang_7() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Theo_doi_danh_sach")).click();	
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		for(WebElement row : rows) {
			if (row.getText().contains("Nguyễn Hoàng Hải")) {
				System.out.println(row.getText());
				driver.findElement(By.id("7")).click();
				test = driver.getTitle();
				expected = "Chi tiết đóng thuế cá nhân";
				
				List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr/td[7]"));
				assertEquals(0, noRows.size());
				assertEquals(test, expected);
				break;
			}
			
			
		}	
		driver.close();
		
	}
	@Test
	public void Test_Hien_Thi_Khach_Hang_6() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Theo_doi_danh_sach")).click();	
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		for(WebElement row : rows) {
			if (row.getText().contains("Bùi Khôi Nguyên")) {
				System.out.println(row.getText());
				driver.findElement(By.id("6")).click();
				test = driver.getTitle();
				expected = "Chi tiết đóng thuế cá nhân";
				
				List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr/td[6]"));
				assertEquals(3, noRows.size());
				assertEquals(test, expected);
				break;
			}
			
			
		}	
		driver.close();
		
	}
	
	

}
