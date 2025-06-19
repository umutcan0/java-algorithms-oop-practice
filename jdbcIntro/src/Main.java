import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {

        Connection connection = null; // İlk etapta connectionun değeri olmasın.

        DbHelper helper = new DbHelper();// DbHelper class nesnesi oluşturuldu.
        PreparedStatement statement = null; // insert ifadeleri gibi PreparedStatement denilen bir class ile yapılır.
        ResultSet resultSet; // Veritabanındaki sorgunun sonucunda gelen data ResultSetle javada karşılanır.
        try {

            connection = helper.getConnection(); // helper classı ile connection(bağlantı) sağlanıyor.
            String sql="delete from city where id ?"; // Silinmesi istenen alan idsi verilerek belirtilebilir veya insert
                                                      // işlemindeki gibi ? koyulursa id yi kullanıcının okuyor olması gerekir ve
                                                      // ona göre delete işlemi yapılır.

            statement = connection.prepareStatement(sql);//İnsert ifadelerindeki gibi sorgu buraya yazılır.
            statement.setInt(1,4082); // ? ile istendiğinden ötürü id ile okuma işlemi yapıldı. Yani 1. soru işaretinin değeri
                                                     // 4082 dir,denildi.
            int result = statement.executeUpdate(); //Statementı(veri tabanındaki sql ler) çalıştırır.
            System.out.println("Kayıt Silindi.");

        } catch (SQLException exception) { // Bağlantı kurulamama durumunda hata ver.
            helper.showErrorMessage(exception); // Bağlantı kurarken hata olursa hatayı ver.
        } finally {
            statement.close();
            connection.close(); // Bağlantı işlemi bittiyse bağlantıyı kapat.
        }


    }

    public static void selectDemo() throws SQLException { // Select işlemi
        Connection connection = null; // İlk etapta connectionun değeri olmasın.

        DbHelper helper = new DbHelper();// DbHelper class nesnesi oluşturuldu.
        Statement statement = null; // Veri tabanındaki sqllerle ilgili işlemleri yapar. Veritabanındaki sql
        // cümleciklerinin(sorgularının) karşılığıdır denebilir.
        ResultSet resultSet; // Veritabanındaki sorgunun sonucunda gelen data ResultSetle javada karşılanır.
        try {

            connection = helper.getConnection(); // helper classı ile connection(bağlantı) sağlanıyor.
            statement = connection.createStatement(); // statement nesnesi oluşturuldu.(createStatement denmesinin sebebi de bu bağlantı için demektir.
            // Çünkü farklı veritabanlarıyla çalışılması gerektiğinde bu şekilde belirtmek gerekir.)
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country"); // Çalıştırılmak istenen kod bu şekilde parantez
                                                                                                      // içine yazılır, sorgu çalıştırılır ve resultSeTe
                                                                                                      // aktarılır.
            ArrayList<Country> countries = new ArrayList<Country>();// resultSeti bağlamak için ArrayList tanımlandı.
            while (resultSet.next()) { // Sorgu sonuçlarını ekrana yazdırır. Parantez içine yazılan ifade ile neyi yazdırmak istediği sorulur ve ona göre
                // sonuç alınır. sorgular yazdırılmak istendğinde resultSete aktarılan sorgu sonuçları
                // .resultSet.next ile tek tek gezilir ve yazdırılır.
                countries.add(new Country( // Yeni bir country eklendi
                        resultSet.getString("Code"), // resultSet.getString diyerek önce kod alanı okunur. Sonrasında alanlar yazılır.
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) { // Bağlantı kurulamama durumunda hata ver.
            helper.showErrorMessage(exception); // Bağlantı kurarken hata olursa hatayı ver.
        } finally {
            connection.close(); // Bağlantı işlemi bittiyse bağlantıyı kapat.
        }


    }
    public static void insertData() throws SQLException { // insert işlemi

        Connection connection = null; // İlk etapta connectionun değeri olmasın.

        DbHelper helper = new DbHelper();// DbHelper class nesnesi oluşturuldu.
        PreparedStatement statement = null; // insert ifadeleri PreparedStatemnt denilen bir class ile yapılır.
        ResultSet resultSet; // Veritabanındaki sorgunun sonucunda gelen data ResultSetle javada karşılanır.
        try {

            connection = helper.getConnection(); // helper classı ile connection(bağlantı) sağlanıyor.
            String sql="\"insert into City(Name,CountryCode,District, Population) values(?,?,?,?)"; // İstenen alanları bu şekilde kişi kendisi
            // girebilir.
            statement = connection.prepareStatement(sql);//İnsert ifadelerinde sorgu buraya yazılır.
            statement.setString(1,"Düzce");
            statement.setString(2,"TUR");
            statement.setString(3,"Türkiye");
            statement.setInt(4,70000);
            int result = statement.executeUpdate(); //Statementı(veri tabanındaki sql ler) çalıştırır.
            System.out.println("Kayıt Eklendi.");

        } catch (SQLException exception) { // Bağlantı kurulamama durumunda hata ver.
            helper.showErrorMessage(exception); // Bağlantı kurarken hata olursa hatayı ver.
        } finally {
            statement.close();
            connection.close(); // Bağlantı işlemi bittiyse bağlantıyı kapat.
        }


    }
    public static void updateData() throws SQLException { // update işlemi
        Connection connection = null; // İlk etapta connectionun değeri olmasın.

        DbHelper helper = new DbHelper();// DbHelper class nesnesi oluşturuldu.
        PreparedStatement statement = null; // insert ifadeleri PreparedStatemnt denilen bir class ile yapılır.
        ResultSet resultSet; // Veritabanındaki sorgunun sonucunda gelen data ResultSetle javada karşılanır.
        try {

            connection = helper.getConnection(); // helper classı ile connection(bağlantı) sağlanıyor.
            String sql="update city set population 100000,distirict 'Düzce' where id ?"; // Güncellenmesi istenen alan idsi verilerek belirtilmiştir.
                                                                                         // Burada yapılan güncelleme: city tablosunda 4082 numaralı
                                                                                         // distirictini Düzce yap. İnsert işlemindeki gibi ? koyulursa
                                                                                         // id yi kullanıcının okuyor olması gerekir ve
                                                                                         // ona göre update işlemi yapılır.

            statement = connection.prepareStatement(sql);//İnsert ifadelerinde sorgu buraya yazılır.
            statement.setInt(1,4082); // ? ile istendiğinden ötürü id ile okuma işlemi yapıldı. Yani 1. soru işaretinin değeri
                                                     // 4082 dir,denildi.
            int result = statement.executeUpdate(); //Statementı(veri tabanındaki sql ler) çalıştırır.
            System.out.println("Kayıt Güncellendi.");

        } catch (SQLException exception) { // Bağlantı kurulamama durumunda hata ver.
            helper.showErrorMessage(exception); // Bağlantı kurarken hata olursa hatayı ver.
        } finally {
            statement.close();
            connection.close(); // Bağlantı işlemi bittiyse bağlantıyı kapat.
        }


    }

    }
    }


// Veritabanı bağlantısı kuruldu. Yeni bir DbHelper classı ile database kullanıcı bilgileri oradan alındı. Bunun sebebi bu bilgileri istenilen yerde
// kullanmaktır. showErrorMessage fonkksiyonu ile veritabanı bağlantısında bir sorun varsa hata mesajı ve hatanın hata kodunu vermesi sağlandı.