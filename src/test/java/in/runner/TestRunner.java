package in.runner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import in.base.Base_class;
import in.page.Leave;
import in.page.Login;
import in.page.Pim;
import in.page.Recruitment;

public class TestRunner extends Base_class {

	public static void main(String[] args) throws InterruptedException {
		Login l;
		 Pim p;
		 Leave le;
		Recruitment rec;
		LaunchBrowser();
		l = new Login(driver);
		 p=new Pim(driver);
		 le=new Leave(driver);
		rec = new Recruitment(driver);
		iwait(25);
		send(l.getusername(), "Admin");
		send(l.getpassword(), "admin123");
		clk(l.getlogin());
		//PIM module
		  clk(p.getPim()); 
		  clk(p.getaddbutton()); 
		  send(p.EnterFirstName(), "Praveen");
		  send(p.EnterLastName(), "Kumar");
		   clk(p.clicksavebutton());
		 
		   send(p.EnterotherId(),"555");
		 

		// Leave Module
		  clk(le.getleave());
		  
		  clk(le.clickenterfromdate());
		   clk(le.selectenterfromdate());
		  clk(le.clickentertodate());
		   clk(le.selectentertodate());
		  radio(le.selpastempradio());
		   clk(le.selpastempradio());
		 
		
		  clk(le.clickapply());
		  le.selectleavetype().click();
		  le.selectoptioncan().click();
		  le.enterstartdate().clear();
		  send(le.enterstartdate(),"2024-10-05");
		  le.enterenddate().clear();
		  send(le.enterenddate(),"2024-18-05"); 
		  le.Partialdayoption().click();
		  p.configurationbutton().click();
		  p.optionalfield().click();
		 

		// Recruitment module candidate sub module element

		clk(rec.clickrecruitment());
		clk(rec.clickjobtitlebutton());
		clk(rec.candidateclickjobtitle());
		clk(rec.candidateclickvacbutton());
		clk(rec.candidateselectvacoption());
		clk(rec.clickcandidatehirebutton());
		clk(rec.selectcandidateHiringmanager());
		clk(rec.clickbuttonjobstatus());
		clk(rec.selectjobstatus());
		send(rec.EnterKeyword(), "Java,Selenium,TestNg");
		clk(rec.clickmethodofapplication());
		clk(rec.selectmethodofapplication());
		send(rec.entercandidatename(), "Peter  Smith");
		clk(rec.recclickfromdate());
		clk(rec.recEnterfromdate());
		clk(rec.recclicktodate());
		clk(rec.recEntertodate());
	
		// for Recruitment page in vacancies
		  clk(rec.clickvacancies()); clk(rec.clickjobtitle());
		  clk(rec.selectjobRole()); clk(rec.clickbuttonvac());
		  clk(rec.selectvacrole()); clk(rec.selecthiremanagerbutton());
		  clk(rec.selecthiremanager()); clk(rec.selstatusbutton());
		  clk(rec.selactive()); clk(rec.searinbuttoninvac());
		 

	}

}
