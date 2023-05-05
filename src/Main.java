
public class Main {
    public static void main(String[] args) {
        University university= new University();
        university.setNameOfUniversity("KSLA");
        university.setNameofRector("Kanatbek Kerezbekovich");
        university.setDuration("4 yaer");
        university.setContract(45000);

        University university1= new University();
        university1.setNameOfUniversity("KNU");
        university1.setNameofRector("Asanov Uson");
        university1.setDuration("4 year 6 month");
        university1.setContract(40000);

        University university2 = new University();
        university2.setNameOfUniversity("BGU");
        university2.setNameofRector("Tashmatov Eldos");
        university2.setDuration("4 year");
        university2.setContract(35000);


        School school=new School();
        school.setName("Mambetaipov №37");
        school.setDirector("Sansyzbaev Nazirbek");
        school.setQuantityOfStudents(500);
        school.setClassrooms(20);

        School school1=new School();
        school1.setName("Abdyrahmonov №45");
        school1.setDirector("Asylbekov Asylbek");
        school1.setQuantityOfStudents(600);
        school1.setClassrooms(25);

        School school2=new School();
        school2.setName("Asnov №53");
        school2.setDirector("Asman kyzy Aigul");
        school2.setQuantityOfStudents(300);
        school2.setClassrooms(15);


        Car cars= new Car();
        cars.setBrand("HONDA");
        cars.setName("Accord");
        cars.setPrice(11000);
        cars.setYearOfMade(2008);

        Car cars1= new Car();
        cars1.setBrand("TOYOTA");
        cars1.setName("Highlander");
        cars1.setPrice(30000);
        cars1.setYearOfMade(2020);

        Car cars2= new Car();
        cars2.setBrand("BMW");
        cars2.setName("X5");
        cars2.setPrice(26000);
        cars2.setYearOfMade(2018);

        Person person= new Person();
        person.setName("Baktulan");
        person.setSurname("Nazirbek uulu");
        person.setAge(23);
        person.setGender("Male");

        Person person1=new Person();
        person1.setName("Zhanuzak");
        person1.setSurname("Zhanuzakov");
        person1.setAge(24);
        person1.setGender("Male");

        Person person2=new Person();
        person2.setName("Asylek");
        person2.setSurname("Asylbekov");
        person2.setAge(26);
        person2.setGender("Male");

        University[] universities={university,university1,university2};
        for (int i = 0; i < universities.length; i++) {
            System.out.println("Unversity: "+universities[i].getNameOfUniversity()+", Rector of University: "+ universities[i].getNameofRector()+", Duration: "+universities[i].getDuration()+", Contract:"+universities[i].getContract());

        }
        System.out.println("__________________________________________________");
        School[] schools={school,school1,school2};
        for (int i = 0; i < schools.length; i++) {
            System.out.println("School: "+schools[i].getName()+", Director: "+schools[i].getDirector()+", Quantity of Students: "+schools[i].getQuantityOfStudents()+", Quantity of Classrooms: "+schools[i].getClassrooms());

        }
        System.out.println("__________________________________________________");
        Car[] car={cars,cars1,cars2};
        for (int i = 0; i < car.length; i++) {
            System.out.println("Cars brand : "+ car[i].getBrand()+", Name: "+car[i].getName()+", Price: "+car[i].getPrice()+"$"+", Year of Made:"+car[i].getYearOfMade());

        }
        System.out.println("__________________________________________________");
        Person[] people={person,person1,person2};
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person Name :"+people[i].getName()+", Surname: "+people[i].getSurname()+", Age:"+people[i].getAge());

        }




        }
    }

