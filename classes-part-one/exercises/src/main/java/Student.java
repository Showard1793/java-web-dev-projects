public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.

        //SETTERS
        public void setName(String aName){
                this.name = aName;
        }

        public void setStudentID(int aStudentId){
                this.studentId = aStudentId;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        private void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        //GETTERS
        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        Student student = new Student("Stephen Howard", 12345, 1, 4.0);


}
