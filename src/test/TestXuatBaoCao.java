package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXuatBaoCao extends TestDriver{

	ChromeDriver driver = getDriver();
	@Test
	public void TestGiaoDien() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Xuat_bao_cao")).click();
		test = driver.getTitle();
		expected = "Xuất báo cáo thuế TNCN";
		assertEquals(test, expected);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		assertEquals(3, rows.size());
		
		driver.close();
	}
	@Test
	public void TestKhachHangDongThueDayDu() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Xuat_bao_cao")).click();
		test = driver.getTitle();
		expected = "Xuất báo cáo thuế TNCN";
		assertEquals(test, expected);
		
		driver.findElement(By.id("1")).click();
		test = driver.getTitle();
		expected = "Xuất báo cáo thuế cá nhân đóng đủ";
		assertEquals(test, expected);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		assertEquals(3, rows.size());

					
		driver.close();
	}
	@Test
	public void TestKhachHangDongThueMuon() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Xuat_bao_cao")).click();
		test = driver.getTitle();
		expected = "Xuất báo cáo thuế TNCN";
		assertEquals(test, expected);
		
		driver.findElement(By.id("2")).click();
		test = driver.getTitle();
		expected = "Xuất báo cáo thuế cá nhân nộp muộn";
		assertEquals(test, expected);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		assertEquals(2, rows.size());

					
		driver.close();
	}
	@Test
	public void TestKhachHangDongThueThieu() {
		String test = "";
		String expected = "";
		driver.get("http://localhost:8080/SQA_Thue_Nhom_6/view/quanly/GDChinhNVQuanly.jsp");
		
		driver.findElement(By.id("Xuat_bao_cao")).click();
		test = driver.getTitle();
		expected = "Xuất báo cáo thuế TNCN";
		assertEquals(test, expected);
		
		driver.findElement(By.id("3")).click();
		test = driver.getTitle();
		expected = "Xuất báo cáo thuế cá nhân nộp thiếu";
		assertEquals(test, expected);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/form/table/tbody/tr"));
		assertEquals(3, rows.size());

					
		driver.close();
	}
}
