public class Book {
  String book;
   int age;


    public Book(String name, int age) {
        this.book = name;
        this.age = age;
    }

    public Book() {

    }

    public String getName() {
        return this.book;
    }
        public int getAge() {
            return this.age;
        }
        public void setAge(int age){
this.age = age;
        }
    }
