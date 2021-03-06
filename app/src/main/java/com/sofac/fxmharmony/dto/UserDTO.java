package com.sofac.fxmharmony.dto;

import java.io.Serializable;

/**
 * Created by Maxim on 02.09.2017.
 */

public class UserDTO implements Serializable {

    private Long id;
    private String login;
    private String password;
    private String role;
    private Boolean visible;
    private String access;

    public UserDTO(Long id, String login, String password, String role, Boolean visible, String access) {

        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role; // manager;admin;staff,customer
        this.visible = visible;
        this.access = access;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccess() {
        if (access != null) return access;
        else return "";
    }

    public Boolean isAccessEstimations() {
        return getAccess().contains("estimations");
    }

    public Boolean isAccessProjects() {
        return getAccess().contains("projects");
    }

    public Boolean isAccessCases() {
        return getAccess().contains("cases");
    }

    public Boolean isAccessPages() {
        return getAccess().contains("pages");
    }

    public Boolean isAccessCustomers() {
        return getAccess().contains("customers");
    }

    public Boolean isAccessManagers() {
        return getAccess().contains("managers");
    }

    public Boolean isAccessNotices() {
        return getAccess().contains("notices");
    }

    public Boolean isAccessDashboard() {
        return getAccess().contains("dashboard");
    }

    public Boolean isAccessApplications() {
        return getAccess().contains("applications");
    }

    public Boolean isAccessLeaderGroup() {
        return getAccess().contains("leadergroup");
    }

    public Boolean isAccessMemberGroup() {
        return getAccess().contains("membergroup");
    }

    public Boolean isAccessStaffGroup() {
        return getAccess().contains("staffgroup");
    }

    public Boolean isAccessTranslate() {
        return getAccess().contains("translate");
    }

    public Boolean isAdmin() {
        return getRole().contains("admin");
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id(ORM)='" + id + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", visible=" + visible +
                ", access='" + access + '\'' +
                '}';
    }
}



