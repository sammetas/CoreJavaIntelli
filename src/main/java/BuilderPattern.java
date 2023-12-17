public class BuilderPattern {
    public static void main(String[] args) {
        Student student = new Student.Builder().setAge(10).setId(83).setName("sharad").build();
        System.out.println(student.getAge());
    }
}



class Student{
    int id;
    int age;
    String name;

    public Student(Builder builder){
       this.age = builder.age;
       this.id = builder.id;
       this.name = builder.name;

    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static class Builder{
        int id;
        int age;
        String name;

        public  Builder setId(int id){
            this.id = id;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}
