package com.haris.week7.lab;

class UniversityPerson {
    private String name;
    private int birthYear;

    public UniversityPerson(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getRole() {
        return "University Person";
    }

    public int getAge(int currentYear) {
        return currentYear - this.getBirthYear();
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.birthYear + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof UniversityPerson) {
                UniversityPerson other = (UniversityPerson) obj;
                return (this.getName().equals(other.getName())) &&
                        (this.getBirthYear() == other.getBirthYear());
            }
        }
        return false;
    }
}

class Student extends UniversityPerson {
    private String studentId;
    private String major;

    public Student(String name, int birthYear, String studentId, String major) {
        super(name, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String getStudentInfo() {
        return this.getName() + " studies " + this.getMajor();
    }
}

class Professor extends UniversityPerson {
    private String employeeId;
    private String department;

    public Professor(String name, int birthYear, String employeeId, String department) {
        super(name, birthYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public String getProfessorInfo() {
        return "Prof. " + this.getName() + " teaches in " + this.getDepartment();
    }
}

class Staff extends UniversityPerson {
    private String staffId;
    private String role;

    public Staff(String name, int birthYear, String staffId, String role) {
        super(name, birthYear);
        this.staffId = staffId;
        this.role = role;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStaffInfo() {
        return this.getName() + " works as " + this.getRole();
    }
}

class UniversityPrinter {
    public void UniversityPrinter(UniversityPerson person, int currentYear) {
        System.out.println(person);
        System.out.println(person.getAge(currentYear));

        if (person instanceof Student) {
            System.out.println(((Student) person).getStudentInfo());
        } else if (person instanceof Professor) {
            System.out.println(((Professor) person).getProfessorInfo());
        } else if (person instanceof Staff) {
            System.out.println(((Staff) person).getStaffInfo());
        }
    }
}

class Task1 {
    public static void main(String[] args) {
        Professor becir = new Professor("Becir", 1999, "25671", "IT Department");

        Student haris = new Student("Haris", 2005, "25000880", "Information Technology");

        UniversityPrinter printer = new UniversityPrinter();
        printer.UniversityPrinter(becir, 2025);
        printer.UniversityPrinter(haris,2025);
    }
}
