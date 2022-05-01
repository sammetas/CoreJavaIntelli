/*
  COuld you please guess the pattern I used in this snippet
 */
public class GuessPattern {
    public static void main(String[] args) {

         PersonalDtls personalDtls=PersonalDtls.getInstance()
                                    .setId(10)
                                    .setSsn("BXNPS3")
                                    .setFName("First Name")
                                    .setMName("Middle Name")
                                    .setLName("Last Name");
        System.out.println(personalDtls.toString());

        PersonalDtls advantage=PersonalDtls.getInstance()
                                .setSsn("BXNPS3")
                                 .setLName("Last Name");
        System.out.println(advantage.toString());

    }

}

class PersonalDtls {
    int id;
    String ssn;
    String fName;
    String mName;
    String lName;
    public static PersonalDtls getInstance(){
        return new PersonalDtls();
    }
    public PersonalDtls setId(int id){this.id=id;return this;}
    public PersonalDtls setSsn(String ssn){this.ssn=ssn;return this;}
    public PersonalDtls setFName(String fName){this.fName=fName;return this;}
    public PersonalDtls setLName(String lName){this.lName=lName;return this;}
    public PersonalDtls setMName(String mName){this.mName=mName;return this;}

    @Override
    public String toString() {
        return "PersonalDtls{" +
                "id=" + id +       ", ssn='" + ssn + '\'' +              ", fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +                ", lName='" + lName + '\'' +
                '}';
    }
}
