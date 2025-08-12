package com.sanjay.records;
import java.util.List;



public class ProgramReport {
    public String program_name;
    public String report_date;
    public String program_manager;
    public StatusSummary status_summary;
    public List<Milestone> milestones;
    public List<ActionItem> action_items;
    public List<LeadershipSupport> leadership_support_needed;

    public static class StatusSummary {
        public String overall_status;
        public String key_highlights;
        public List<Risk> key_risks;
        public List<Dependency> dependencies;
    }

    public static class Risk {
        public String risk;
        public String mitigation_plan;
    }

    public static class Dependency {
        public String dependency;
        public String status;
    }

    public static class Milestone {
        public String name;
        public String target_date;
        public String actual_date;
        public String status;
    }

    public static class ActionItem {
        public String item;
        public String owner;
        public String due_date;
        public String status;
    }

    public static class LeadershipSupport {
        public String issue;
        public String requested_support;
    }
}




