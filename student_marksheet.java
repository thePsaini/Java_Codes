class Student {
    int rollNo;
    String name;

    int sub1;
    int sub2;
    int sub3;

    int total;
    double average;
    char grade;

    // Constructor
    Student(int rollNo, String name, int sub1, int sub2, int sub3) {
        this.rollNo = rollNo;
        this.name = name;

        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;

        calculateResult();
    }

    // Method to calculate total, average and grade
    void calculateResult() {

        total = sub1 + sub2 + sub3;

        average = total / 3.0;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    // Display method
    void display() {
        System.out.println("-------------------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);

        System.out.println("Subject 1 : " + sub1);
        System.out.println("Subject 2 : " + sub2);
        System.out.println("Subject 3 : " + sub3);

        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);
        System.out.println("Grade     : " + grade);

        System.out.println("-------------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        Student s = new Student(101, "Rahul", 85, 90, 80);
        s.display();
    }
}