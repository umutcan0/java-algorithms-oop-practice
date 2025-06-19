import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper { // Main Classından buraya taşındı çünkü bu sayede istenildiğinde çağırılabilir ve kullanılabilir.

    // Bağlantı oluştururken kullancıı bilgilerine ihtiyac vardır.
    private String userName="root"; // Kullanıcı adı
    private String password="12345";// Onun passwordu
    private String dbUrl="jdbc:mysql://localhost:3306/world"; // Bu urldeki world isimli veritabanına bağlanır.

    public Connection getConnection() throws SQLException { // Bu fonksiyon bağlantı oluşturmak için oluşturuldu. Bir sorun varsa hata vermesi sağlandı.

        return DriverManager.getConnection(dbUrl,userName,password);

    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Hata mesajı: "+exception.getMessage());
        System.out.println("Hata kodu: "+exception.getErrorCode());
    }
}
