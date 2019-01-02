package com.webdriverutils.pages;

import com.automation.executionhelper.IdentifierCollection;
import com.automation.utils.ElementBy;

public class HomePage {

    public HomePage() {
        System.out.println("Loading home page");
        IdentifierCollection.put("HomePage Holder", ElementBy.id("welcome"));
        IdentifierCollection.put("Admin Menu",ElementBy.id("menu_admin_viewAdminModule"));
        IdentifierCollection.put("PIM Menu",ElementBy.id("menu_pim_viewPimModule"));
        IdentifierCollection.put("Leave Menu",ElementBy.id("menu_leave_viewLeaveModule"));
        IdentifierCollection.put("Time Menu",ElementBy.id("menu_time_viewTimeModule"));
        IdentifierCollection.put("Recruitment Menu",ElementBy.id("menu_recruitment_viewRecruitmentModule"));
        IdentifierCollection.put("Performance Menu",ElementBy.id("menu__Performance"));
        IdentifierCollection.put("Dashboard Menu",ElementBy.id("menu_dashboard_index"));
        IdentifierCollection.put("Directory Menu",ElementBy.id("menu_directory_viewDirectory"));
        IdentifierCollection.put("Admin Menu",ElementBy.id("menu_admin_viewAdminModule"));
        IdentifierCollection.put("Admin Menu",ElementBy.id("menu_admin_viewAdminModule"));
        IdentifierCollection.put("Quick Links", ElementBy.cssSelector(".quickLinkText"));
        IdentifierCollection.put("Assign Leave", ElementBy.cssSelector("#dashboard-quick-launch-panel-menu_holder [href*=assignLeave"));
        IdentifierCollection.put("Logout", ElementBy.AttributeContainsValue("href", "/index.php/auth/logout"));
    }
}
