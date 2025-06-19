public class Main {

    public static void main(String[] args) {
        MarkManager markManager=new MarkManager();
        markManager.studentManager=new HighSchoolStudentManager();
        markManager.getMark();
    }
}

// Abstract sınıflarla ilgili örnek yapıldı. Farklı database sınıfları oluşturulup anadatabaseden
// inherit edildi. Ayrıca CustomerManager sınıfından bu databaseleri çağırabilme işlemi yapıldı.
