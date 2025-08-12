package com.sanjay.webapplicationdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.records.Program;
import com.sanjay.records.Greeting;
import com.sanjay.records.Palindrome;
import com.sanjay.records.ProgramReport;
import com.sanjay.utils.StringUtil;

@SpringBootApplication
@RestController
public class WebapplicationdemoApplication {
	private static final String template = "Hello, %s!";
	private static Object name;
	private final AtomicLong counter = new AtomicLong();

	public static void main(String[] args) {
		SpringApplication.run(WebapplicationdemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("hello method executed");
		return String.format("<h1>Hello %s!</h1>", name);
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/checkPalindrome")
	public String checkPalin(@RequestParam(value = "name", defaultValue = "World") String name) {
		StringUtil sU = new StringUtil(name);
		return sU.toString();

	}
	

	@GetMapping("/checkPalindromeRestService")
	public Palindrome checkPalinRest(@RequestParam(value = "name", defaultValue = "World") String name) {
		StringUtil sU = new StringUtil(name);
		return new Palindrome(name, sU.checkifPalindrome());
	}
	@GetMapping("/program-report")
	public ProgramReport getProgramReport() {
	    ProgramReport report = new ProgramReport();
	    report.program_name = "Digital Transformation Initiative";
	    report.report_date = "2025-03-31";
	    report.program_manager = "John Doe";

	    ProgramReport.StatusSummary summary = new ProgramReport.StatusSummary();
	    summary.overall_status = "On Track";
	    summary.key_highlights = "Completed phase 2 development, ahead of schedule by 2 weeks. Successfully integrated with legacy systems.";

	    summary.key_risks = List.of(
	        new ProgramReport.Risk() {{ risk = "Resource constraints in QA team"; mitigation_plan = "Hiring two additional testers; reallocating internal resources."; }},
	        new ProgramReport.Risk() {{ risk = "Potential vendor delays for API integration"; mitigation_plan = "Engaging secondary vendor as a contingency plan."; }}
	    );

	    summary.dependencies = List.of(
	        new ProgramReport.Dependency() {{ dependency = "Approval from compliance team for data handling procedures"; status = "Pending - Expected by April 5th"; }},
	        new ProgramReport.Dependency() {{ dependency = "Cloud infrastructure upgrade"; status = "Completed"; }}
	    );

	    report.status_summary = summary;

	    report.milestones = List.of(
	        new ProgramReport.Milestone() {{ name = "Phase 1 Completion"; target_date = "2025-02-15"; actual_date = "2025-02-10"; status = "Completed"; }},
	        new ProgramReport.Milestone() {{ name = "Phase 2 Development"; target_date = "2025-03-30"; actual_date = "2025-03-20"; status = "Completed"; }},
	        new ProgramReport.Milestone() {{ name = "User Testing Begins"; target_date = "2025-04-15"; status = "On Track"; }}
	    );

	    report.action_items = List.of(
	        new ProgramReport.ActionItem() {{ item = "Finalize compliance approval"; owner = "Compliance Team"; due_date = "2025-04-05"; status = "In Progress"; }},
	        new ProgramReport.ActionItem() {{ item = "Prepare training materials for end users"; owner = "Training Team"; due_date = "2025-04-10"; status = "Not Started"; }}
	    );

	    report.leadership_support_needed = List.of(
	        new ProgramReport.LeadershipSupport() {{ issue = "QA resource shortage"; requested_support = "Approval to onboard additional QA staff."; }}
	    );

	    return report;
	}
	
    @GetMapping("/api")
    public Program getProgramById() {
        Program report = new Program();
        report.id=1;
        report.name="Sanjay";
        report.description="WebApplicationDemo";
        return report;
       
    	   
       
    }
}
	