package com.example.yeabkalwubshit.booksharing;

public class Book {

    private final String bookName;
    private final long id;
    private final boolean isNew;

    private String ownerName;
    private String departmentName;
    private String description;
    private String professor;

    public Book(long id, String bookName, String departmentName, String description, String professor,
                boolean isNew) {
        this.id = id;
        this.bookName = bookName;
        this.departmentName = departmentName;
        this.description = description;
        this.professor = professor;
        this.isNew = isNew;
    }

    public void setOwner (String OwnerName) {
        this.ownerName = ownerName;
    }
    public void setDepartment (String departmentName) {
        this.departmentName = departmentName;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public String getOwnerName() {return this.ownerName;}
    public long getId() {return this.id;}
    public String getDepartment() {return this.departmentName;}
    public String getBookName() {return this.bookName;}
    public String getDescription() { return this.description; }
    public String getProfessor() { return this.professor; }

}
