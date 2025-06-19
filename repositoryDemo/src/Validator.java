public class Validator {// CustomerDal ve ProductDal veritabanı işlemi olduğundan veritabanı işlemleri harici işlemler için bu class oluşturuldu.

    public <T> void validate(T entity){ // Burada validatorın generic olduğunu belirtmek için <T> ifadesini vermek gerekiyor. Yani bunun
                                        // anlamı validator artık generic, buraya hangi nesne yollanırsa
                                        // ona göre validation algoritması çalıştırılacak. Ve yine aynı kuralla(extend)
                                        // generic kısıt oluşturulur

    }
}
