package com.example.restservice;

public record Employee(int employee_id, String first_name, String last_name, String email, String title) {

    public int getEmployee_id() {
        return employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return first_name + " " + last_name + "\n employee_id: " + employee_id + "\n email: " + email + "\n title: " + title;
    }
}
