package studyJava;

import java.time.LocalDate;

public class Announcement {
    private String institution;
    private String planningYear;
    private String title;
    private String managerName;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate announcementDate;
    private String form;

    public Announcement(String institution, String planningYear, String title, String managerName, LocalDate startDate, LocalDate endDate, LocalDate announcementDate, String form) {
        this.institution = institution;
        this.planningYear = planningYear;
        this.title = title;
        this.managerName = managerName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.announcementDate = announcementDate;
        this.form = form;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPlanningYear() {
        return planningYear;
    }

    public void setPlanningYear(String planningYear) {
        this.planningYear = planningYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(LocalDate announcementDate) {
        this.announcementDate = announcementDate;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "institution='" + institution + '\'' +
                ", planningYear=" + planningYear +
                ", title='" + title + '\'' +
                ", managerName='" + managerName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", announcementDate=" + announcementDate +
                ", form='" + form + '\'' +
                '}';
    }
}
