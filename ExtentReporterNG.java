package rahulshettyacademy.resources;
//import com.aventstack.extentreports.ExtentReports;


public class ExtentReporterNG {
	
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir") + "\\reportes\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation result");
		reporter.config().setDocumentTitle{"Result");
		
		ExtentReports extent = new ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("Tester Name","Shraddha");
		return extend;
		}
		
	}

}
