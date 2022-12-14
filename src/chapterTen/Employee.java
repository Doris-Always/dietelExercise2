package chapterTen;

public abstract class Employee {

        private final String firstName;
        private final String lastName;
        private final String socialSecurityNumber;
//        private final String birthDate;

        public Employee(String firstName, String lastName, String socialSecurityNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
//            this.birthDate = String.valueOf(birthDate);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSocialSecurityNumber() {
            return socialSecurityNumber;
        }

//        public String getBirthDate() {
//            return birthDate;
//        }

        @Override
        public String toString(){
            return String.format("FirstName: %s%nLastName: %s%nSocial Security Number: %s%n",
                    getFirstName(), getLastName(), getSocialSecurityNumber());
        }

        public abstract double earning();
    }


